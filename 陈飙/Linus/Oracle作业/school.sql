create table student(
Sno varchar(20) not null primary key,--学号
Sname varchar(20)not null,--学生姓名
Ssex varchar(20) not null,--学生性别
Sbirthday date,--学生出生年月
Class varchar(20)--学生所在班级
);

create table teacher(
Tno varchar2(20)not null primary key,--教工编号(主码)
Tname varchar2(20)not null,--教工姓名
Tsex varchar2(20)not null,--教工性别
Tbirthday date,--教工出生年月
Prof varchar2(20),--职称
Depart varchar2(20) not null--教工所在部门
);

create table Course--课程
(
Cno varchar2(20) not null primary key,--课程号
Cname varchar2(20)not null,--课程名称
Tno varchar2(20)not null references teacher(Tno)--教工编号(外码)
);

create table Score--分数
(
Sno varchar2(20)not null references student(Sno),--学号(外码)
Cno varchar2(20)not null references Course(Cno),--课程号(外码)
primary key(Sno,Cno),
Degree Decimal(4,1)--成绩
);


insert into student values('1','二狗','男','01-7月 -19','java1');
insert into teacher values('001','好人','男','01-7月 -19','java工程师','J01');
insert into teacher values('002','坏人','男','01-7月 -19','java工程师','J01');
insert into teacher values('003','女人','女','01-7月 -19','java工程师','J01');

--4.查询studnet表中的所有记录的Sname、Ssex和Class
select Sname,ssex,class from student;
--5.查询教师所有的单位即不重复的Depart列
select distinct depart from teacher;
--6.查询Score表中成绩在30到80之间的所有记录
select * from score where degree>30 and degree<80;
--7.查询Score表中成绩为85，86，或88的记录
select * from score where degree=85 or degree=86 or degree=88;
--8.查询Student表中‘95031’班或性别为‘女’的同学记录
select * from student where Class='95031' and Ssex='女';
--9.以Cno升序、Degree降序查询Score表的所有记录
select * from score order by Degree desc,cno asc;
--10.查询‘95031’班的学生人数
select count(class) from student where class='95031'; 
--11.查询Score表中的最高分的学生学号和课程号。（子查询或者排序）
select Sno,Cno from score where degree=(select max(degree) from score);
--12.查询没门课的平均成绩
select avg(degree) from score group by Cno;
--13.查询Score表中至少有5名学生选修的并以3开头的课程的平均分数
--至少有2名学生
select cno,avg(degree) as avg from score 
where cno=(select cno from score where count(sno)>3 and cno like 'k%') group by cno;

select avg(degree),cno from score where cno in(
select DISTINCT cno from score where sno in(
select sno from score GROUP BY sno having count(*)>=5
) and cno like 'k%'
) GROUP BY cno; 

select cno,avg(degree) from score group by cno and count(*)>2;

select cno,avg(degree) from score group by cno having cno like 'k%' and count(*)>2;
select 
select avg(degree) from score where ;
--14.查询分数大于70，小于90的Sno列。
select * from score where degree>70 and degree<90;
--15.查询所有学生的Sname、Cno和Degree列
select Sname,Cno,Degree from student,score where student.sno=score.sno 
--16.查询和‘李军’同性别并同班的同学Sname
select * from student
select Ssex from student where sname='二狗';
select Class from student  where sname='二狗'
select Sname from student where Ssex=(select Ssex from student where sname='二狗') and 
Class=(select Class from student  where sname='二狗');
--17.查询所有选修‘计算机导论’课程的‘男’同学的成绩表
select * from score;
select * from course;
select score.degree from score,student,course 
where student.sno=score.sno and course.cno=score.cno and course.cname='java' and student.ssex='男';
--join-on
select score.degree from score 
join student on student.sno = score.sno 
join course on score.cno = course.cno 
where course.cname='java' and student.ssex='男'
--18.查询所有任课教师的Tname和Depart
select Tname,depart from teacher;
--19.查询出‘计算机系’教师所教课程的成绩表
select * from teacher where depart='J01'

select degree from score 
join course on course.cno=score.cno
join teacher on teacher.Tno=course.Tno where depart='J01';
--20.查询score中选学多门课程的同学中分数为非最高分成绩的记录。
--查询出选了多门课程的
select distinct sno from score;--做为一个虚表
select sno from score cno>1 and ; 
select sno from score group by sno having count(*)>1
select max(degree)from score b where a.cno=b.cno;
select * from score a where sno in(
  select sno from score group by sno having count(*)>1)
  and degree<(select max(degree)from score b where a.cno=b.cno)

