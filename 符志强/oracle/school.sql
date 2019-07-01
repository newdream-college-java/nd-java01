--学生表
create table student(
Sno varchar(20) not null primary key,--学号
Sname varchar(20) not null,--学生姓名
Ssex varchar(20) not null,--学生性别
Sbirthday date,--学生出生年月
Class varchar(20)--学生所在班级
)
insert into student values(1,'陈辉','男',to_date('1998-1-1','YYYY-MM-DD'),1);
insert into student values(2,'小强','男',to_date('1996-8-1','YYYY-MM-DD'),2);
insert into student values(3,'小鱼','女',to_date('1997-6-1','YYYY-MM-DD'),1);
insert into student values(4,'小辉','男',to_date('1999-8-1','YYYY-MM-DD'),2);
insert into student values(5,'小红','女',to_date('1997-6-1','YYYY-MM-DD'),95031);
insert into student values(6,'小花','女',to_date('1999-8-1','YYYY-MM-DD'),95031);
insert into student values(7,'小鱼1','女',to_date('1997-6-1','YYYY-MM-DD'),1);
insert into student values(8,'小辉1','男',to_date('1999-8-1','YYYY-MM-DD'),2);
insert into student values(9,'小红1','女',to_date('1997-6-1','YYYY-MM-DD'),95031);
insert into student values(10,'小花1','女',to_date('1999-8-1','YYYY-MM-DD'),95031);
--教师表
create table teacher(
Tno varchar(20) not null primary key,--老师编号
Tname varchar(20) not null,--老师姓名
Tsex varchar(20) not null,--老师性别
Tbirthday date,--老师出生年月
Prof varchar(20),--职称
Depart varchar(20) not null--老师所在部门
)
insert into teacher values(2019,'二强','男',to_date('1975-8-1','YYYY-MM-DD'),'教授','开发部');
insert into teacher values(2018,'二辉','女',to_date('1969-8-1','YYYY-MM-DD'),'副教授','研发部');
insert into teacher values(2017,'二鱼','女',to_date('1984-6-1','YYYY-MM-DD'),'讲师','测试部');
insert into teacher values(2016,'三石','男',to_date('1981-8-1','YYYY-MM-DD'),'主任','架构部');
insert into teacher values(2015,'三石','男',to_date('1981-8-1','YYYY-MM-DD'),'主任','架构部');
--课程表
create table Course(
Cno varchar(20) not null primary key,--课程号
Cname varchar(20) not null,--课程名称
Tno varchar(20) not null references teacher(Tno)--老师编号
)
insert into course values(121,'java',2019);
insert into course values(122,'html',2018);
insert into course values(123,'css',2017);
insert into course values(124,'mysql',2016);
insert into course values(324,'mysql',2016);
--分数
create table Score(
Sno varchar(20) not null references student(Sno),--学号
Cno varchar(20) not null references Course(Cno),--课程号
primary key(Sno,Cno),
Degree Decimal(4,1)--成绩
)
insert into score values(1,121,88);
insert into score values(1,122,59);
insert into score values(1,123,88);
insert into score values(1,124,66);
insert into score values(1,324,76);
insert into score values(2,121,96);
insert into score values(2,122,88);
insert into score values(2,123,89);
insert into score values(2,124,78);
insert into score values(2,324,76);
insert into score values(3,121,64);
insert into score values(3,122,43);
insert into score values(3,123,82);
insert into score values(3,124,88);
insert into score values(3,324,76);
insert into score values(4,121,88);
insert into score values(4,122,59);
insert into score values(4,123,88);
insert into score values(4,124,88);
insert into score values(4,324,76);
insert into score values(5,121,88);
insert into score values(5,122,59);
insert into score values(5,123,88);
insert into score values(5,124,88);
insert into score values(5,324,76);
insert into score values(6,121,88);
insert into score values(6,122,59);
insert into score values(6,123,88);
insert into score values(6,124,88);
insert into score values(6,324,76);
insert into score values(7,121,88);
insert into score values(7,122,59);
insert into score values(7,123,86);
insert into score values(7,124,88);
insert into score values(7,324,76);
insert into score values(8,121,85);
insert into score values(8,122,59);
insert into score values(8,123,88);
insert into score values(8,124,88);
insert into score values(8,324,76);
insert into score values(9,121,86);
insert into score values(9,122,59);
insert into score values(9,123,85);
insert into score values(9,124,88);
insert into score values(9,324,76);
insert into score values(10,121,86);
insert into score values(10,122,59);
insert into score values(10,123,85);
insert into score values(10,124,88);
insert into score values(10,324,76);
--4、查询Student表中的所有记录的Sname、Ssex和Class列。
select Sname,Ssex,Class from Student;
--5、查询教师所有的单位即不重复的Depart列。
select distinct Depart from teacher;
--6、查询Score表中成绩在60到80之间的所有记录。
select * from Score where Degree>61 and Degree<81;
--7、查询Score表中成绩为85，86或88的记录。
select * from Score where Degree=86 or Degree=86 or degree=88;
--8、查询Student表中“95031”班或性别为“女”的同学记录。
select * from Student where Class=95031 and ssex='女' ;
--9、以Cno升序、Degree降序查询Score表的所有记录。
select * from Score order by cno ;
select * from Score order by  Degree desc;
--10、查询“95031”班的学生人数。
select count(*) from Student where Class=95031;
--11、查询Score表中的最高分的学生学号和课程号。（子查询或者排序）
select sno,cno from Score where Degree=(select max(Degree) from Score);
--12、查询每门课的平均成绩。
select cno,avg(Degree) from Score group by cno;
--13、查询Score表中至少有5名学生选修的并以3开头的课程的平均分数。
select COUNT(sno),AVG(DEGREE) from score  WHERE cno LIKE '3%' GROUP BY cno HAVING COUNT(sno)>=5;
--14、查询分数大于70，小于90的Sno列。
select Sno from score where Degree>70 and Degree<90;
--15、查询所有学生的Sname、Cno和Degree列。
select Sname,Cno,Degree from Student s,score c where s.Sno=c.Sno;
--16、查询和“小鱼”同性别并同班的同学Sname.
select sname from Student where Class=(select Class from Student where sname='小鱼');
--17、查询所有选修“mysql”课程的“男”同学的成绩表。
select * from score ;
select * from Course,Student where cname='mysql' and ssex='男'; 
--18、查询所有任课教师的Tname和Depart.
  select Tname,Depart from teacher ;
--19、查询出“mysql“教师所教课程的成绩表。
select * from score where cno =(select cno from COURSE WHERE CNAME ='mysql');
--20、查询score中选学多门课程的同学中分数为非最高分成绩的记录。
select * from score a where sno in(select sno from score GROUP BY sno HAVING COUNT(cno)>1) and DEGREE<(select MAX(DEGREE) from 
SCORE b where a.cno=b.cno);
