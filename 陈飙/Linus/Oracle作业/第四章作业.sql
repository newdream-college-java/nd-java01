create table STUDENT(
	ID VARCHAR2(10),
	SNAME VARCHAR2(10),
	SAGE date,
	SSEX varchar(10)
)

create table COURSE(
	C# VARCHAR2(10),
	CNAME VARCHAR2(10),
	T# VARCHAR2(10)
)

create table TEACHER(
	T# VARCHAR2(10),
	TNAME VARCHAR2(10)
)

create table SC(
	S# VARCHAR2(10),
	C# VARCHAR2(10),
	SCORE DECIMAL(18,1)
)

select * from student
select * from course
select * from Teacher
select * from SC
--1.查询"01"课程比"02"课程成绩高的学生的信息及课程分数
select * from sc where (select SCORE from SC where sc)
select * from sc where c#='01';
select * from sc where c#='02'
select s.*,t.SCORE,h.SCORE from student s,(select SCORE,S# from sc where c#='01') t, (select SCORE,S# from sc where c#='02') h
where t.score>h.score and t.S#=s.S# and h.s#=s.S#
--1.1、查询同时存在"01"课程和"02"课程的情况
select * from sc where C#='01';

select * from sc where C#='02'
select h.* from (select * from sc where C#='01') s,(select * from sc where C#='02') h 
where s.c#='01' and h.C#='02' and s.s#=h.S#
--1.2查询同时存在"01"课程和"02"课程的情况和存在"01"课程但可能不存在"02"课程的情况(不存在时显示为null)(以下存在相同内容时不再解释)
select * from sc where C#='01';
select * from sc where C#='02'
select * from sc where S# not in(select S# from sc where C#='02')

select h.* from (select * from sc where C#='01') s,(select * from sc where S# not in(select S# from sc where C#='02')) h
where s.C#='01' and h.c#!='02' and s.s#=h.s#

(select * from (select * from sc where C#='01') s,(select * from sc where C#='02') h 
where s.c#='01' and h.C#='02' and s.s#=h.S#) union
(select * from (select * from sc where C#='01') s,(select * from sc where S# not in(select S# from sc where C#='02')) h
where s.C#='01' and h.c#!='02' and s.s#=h.s#) 
--2.查询"01"课程比"02"课程成绩低的学生的信息及课程分数
select s#,SCORE from sc where c#='01';
select s#,SCORE from sc where c#='02'
select s.*,t.SCORE,h.SCORE from student s,(select s#,SCORE from sc where c#='01') t, (select s#,SCORE from sc where c#='02') h
where t.score<h.score and t.S#=s.S# and h.s#=s.S#
--2.1查询同时存在"01"课程和"02"课程的情况
--2.2查询同时存在"01"课程和"02"课程的情况和不存在"01"课程但存在"02"课程的情况
select * from sc where C#='01';
select * from sc where C#='02'
select * from sc where S# not in(select S# from sc where C#='01')


select h.* from (select * from sc where C#='02') s,(select * from sc where S# not in(select S# from sc where C#='01')) h
where s.C#='02' and h.c#!='01' and s.s#=h.s#


(select * from (select * from sc where C#='01') s,(select * from sc where C#='02') h 
where s.c#='01' and h.C#='02' and s.s#=h.S#) union
(select * from (select * from sc where C#='02') s,(select * from sc where S# not in(select S# from sc where C#='01')) h
where s.C#='02' and h.c#!='01' and s.s#=h.s#)

--3.查询平均成绩大于等于60分的同学的学生编号和学生姓名和平均成绩
--有带优化
select * from student;
select * from teacher;
select * from sc;
select * from course;
select avg(score),S# from sc group by s# having avg(score)>60

select sname,ag,h.s# from student s,(select avg(score) ag,S# from sc group by s# having avg(score)>60) h where s.s#=h.s#
--group by 要差询另一个表的字段，必须，也加入到分组，不然不会显示
select avg(sc.score),sc.S#,s.sname from sc,student s where s.s#=sc.s# group by sc.s#,s.sname having avg(sc.score)>60

--4.查询平均成绩小于60分的同学的学生编号和学生姓名和平均成绩
select avg(sc.score),sc.S#,s.sname from sc,student s where s.s#=sc.s# group by sc.s#,s.sname having avg(sc.score)<60
--5.查询所有同学的学生编号、学生姓名、选课总数、所有课程的总成绩
select s.S#,s.sname,count(C#),sum(score) from student s,sc where s.s#=SC.s# group by s.s#,s.sname 
--6.查询"李"姓老师的数量
select count(*) from teacher where tname like '李%'
--7.查询学过"张三"老师授课的同学的信息
select s.* from teacher t 
join course c on t.t#=c.T#
join sc on c.C#=sc.C#
join student s on s.s#=SC.s#
where t.tname='张三'

--8.查询没学过"张三"老师授课的同学的信息
select s.* from teacher t 
join course c on t.t#=c.T#
join sc on c.C#=sc.C#
join student s on s.s#=SC.s#
where t.tname='张三'
MINUS
select * from student

--9.查询学过编号为"01"并且也学过编号为"02"的课程的同学的信息
--可以用子查询
select * from student;
select * from teacher;
select * from sc;
select * from course
select s.* from student s,sc sc1,sc sc2 where
sc1. c#='01' 
and sc2.c#='02'
and sc1.s#=s.s#
and sc2.s#=s.s#
--10.查询学过编号为"01"但是没有学过编号为"02"的课程的同学的信息
select s.* from student s,sc sc1,sc sc2 where
sc1.c#='01' 
and sc2.c#='01'
and sc1.s#=s.s#
and sc2.s#=s.s#
--11.查询没有学全所有课程的同学的信息
select s.* from student s,sc sc1,sc sc2,sc sc3 where sc1.c#='01' and sc2.c#='02' and sc3.c#='03'
and sc1.s#=s.s#
and sc2.s#=s.s#
and sc3.s#=s.s#
MINUS
select * from student 