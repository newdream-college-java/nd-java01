-- 课程表
create table course(
cno VARCHAR2(20) not null primary key,
cname VARCHAR2(20) not null,
tno VARCHAR2(20) not null references teacher(ton)
);

-- 分数表
create table score(
sno VARCHAR2(20) not null references STUDENT(sno),
cno VARCHAR2(20) not null references course(cno),
primary key(sno,cno),
degree number(4,1)
)

--学生表
insert into student values(1,'陈辉','男',to_date('1998-1-1','YYYY-MM-DD'),1);
insert into student values(2,'小强','男',to_date('1996-8-1','YYYY-MM-DD'),2);
insert into student values(3,'小鱼','女',to_date('1997-6-1','YYYY-MM-DD'),1);
insert into student values(4,'小辉','男',to_date('1999-8-1','YYYY-MM-DD'),2);

--教师表
insert into teacher values(2019,'二强','男',to_date('1975-8-1','YYYY-MM-DD'),'教授','开发部');
insert into teacher values(2018,'二辉','女',to_date('1969-8-1','YYYY-MM-DD'),'副教授','研发部');
insert into teacher values(2017,'二鱼','女',to_date('1984-6-1','YYYY-MM-DD'),'讲师','测试部');
insert into teacher values(2016,'三石','男',to_date('1981-8-1','YYYY-MM-DD'),'主任','架构部');

--课程表
insert into course values(121,'java',2019);
insert into course values(122,'html',2018);
insert into course values(123,'css',2017);
insert into course values(124,'mysql',2016);

--分数
insert into score values(1,121,88);
insert into score values(1,122,59);
insert into score values(1,123,88);
insert into score values(1,124,66);
insert into score values(2,121,96);
insert into score values(2,122,88);
insert into score values(2,123,89);
insert into score values(2,124,78);
insert into score values(3,121,64);
insert into score values(3,122,43);
insert into score values(3,123,82);
insert into score values(3,124,88);
insert into score values(4,121,88);
insert into score values(4,122,59);
insert into score values(4,123,88);
insert into score values(4,124,88);


select * from student; -- 学生表
select * from TEACHER; -- 教工表
select * from course; -- 课程表
select * from score;  -- 分数表

-- 4、查询Student表中的所有记录的Sname、Ssex和Class列。
select sname,ssex,class from student;

-- 5、查询教师所有的单位即不重复的Depart列。
select distinct depert from teacher;

-- 6、查询Score表中成绩在60到80之间的所有记录。
select * from score where degree>=60 and degree<=80;

-- 7、查询Score表中成绩为85，86或88的记录。
select * from score where degree=85 and degree=86 and degree=88;

-- 8、查询Student表中“95031”班或性别为“女”的同学记录。
select * from student where class='95031' and ssex='女';

-- 9、以Cno升序、Degree降序查询Score表的所有记录。
select * from score order by cno desc,degree asc; 

-- 10、查询“95031”班的学生人数。
select count(*) from student where class='95031';

-- 11、查询Score表中的最高分的学生学号和课程号。（子查询或者排序）
select * from student where sno=(select sno from score where degree=(select max(degree) from score));

-- 12、查询每门课的平均成绩。
select AVG(degree),cno from score GROUP BY cno;

-- 13、查询Score表中至少有5名学生选修的并以3开头的课程的平均分数。
select COUNT(sno),AVG(DEGREE) from score  WHERE CNO LIKE '3%' GROUP BY cno HAVING COUNT(sno)>=5;

-- 14、查询分数大于70，小于90的Sno列。
select sno from score where DEGREE BETWEEN 70 and 90;

-- 15、查询所有学生的Sname、Cno和Degree列。
select sname,cno,degree from STUDENT,SCORE WHERE STUDENT.sno=SCORE.sno GROUP BY sname;

-- 16、查询和“李军”同性别并同班的同学Sname.
select sname from student WHERE SSEX=(select SSEX from STUDENT WHERE SNAME = '小辉') and CLASS=(select class from STUDENT WHERE SNAME = '小辉') and SNAME !='小辉';

-- 17、查询所有选修“计算机导论”课程的“男”同学的成绩表。
select * from score where cno=(select cno from COURSE WHERE CNAME = 'java') and sno in (select sno from STUDENT where SSEX='男');

-- 18、查询所有任课教师的Tname和Depart.
select TNAME,DEPART from TEACHER;

-- 19、查询出“计算机系“教师所教课程的成绩表
select * from score where cno =(select cno from COURSE WHERE CNAME ='java');

-- 20、查询score中选学多门课程的同学中分数为非最高分成绩的记录。
select * from score a where sno in(select sno from score GROUP BY sno HAVING COUNT(cno)>1) and DEGREE<(select MAX(DEGREE) from 
SCORE b where a.cno=b.cno) ;





