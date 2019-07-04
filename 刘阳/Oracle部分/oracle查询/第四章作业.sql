create table STUDENT(
	S# VARCHAR2(10) primary key,
	sname VARCHAR2(10) not null,
	sage date,
	ssex VARCHAR2(10)
)

create table COURSE(
C# VARCHAR2(10) primary key,
CNAME VARCHAR2(10) not null,
T# VARCHAR2(10) not null
)

create table TEACHER(
T# VARCHAR2(10) primary key,
TNAME VARCHAR2(10) not null
)

create table SC(
S# VARCHAR2(10) not null,
C# VARCHAR2(10) not null,
score DECIMAL(5,1)
)

--1、查询"01"课程比"02"课程成绩高的学生的信息及课程分数
--1.1、查询同时存在"01"课程和"02"课程的情况
select s1.*,sc1.score,sc2.score from SC sc1,Student s1,SC sc2 
where sc1.S#=sc2.S# and sc1.C#='01' 
and sc2.C#='02' and sc1.score>sc2.score 
and s1.S#=sc1.S#;

--1.2、查询同时存在"01"课程和"02"课程的情况和存在"01"课程但可能不存在"02"课程的情况(不存在时显示为null)(以下存在相同内容时不再解释)
select a.*,b.score,c.score from Student a
left join SC b on a.S# = b.S# and b.C# = '01'
left join SC c on a.S# = c.S# and c.C# = '02'
where b.score > nvl(c.score,0)

--2、查询"01"课程比"02"课程成绩低的学生的信息及课程分数
SELECT A.*,B.C#,B.score from (SELECT * from SC where C#='01') A
left join (SELECT * from SC where C#='02') B
on A.S#=B.S#
where A.score<B.score

--2.1、查询同时存在"01"课程和"02"课程的情况
SELECT * from (SELECT * from SC where C#='01') A
LEFT JOIN (SELECT * from SC where C#='02') B
on A.S#=B.S#
where B.S# is not null;

--2.2、查询同时存在"01"课程和"02"课程的情况和不存在"01"课程但存在"02"课程的情况
SELECT * from (SELECT * from (SELECT * from SC where C#='01') A
JOIN (SELECT * from SC where C#='02') B
on A.S#=B.S#
where B.S# is not null) k,(SELECT * from SC where C#='02' and S# not in (SELECT S# from SC where C#='01')) l 

--3、查询平均成绩大于等于60分的同学的学生编号和学生姓名和平均成绩
select a.S# , a.Sname , cast(avg(b.score) as decimal(18,2))avg_score
from Student a , sc b
where a.S# = b.S#
group by a.S# , a.Sname
having cast(avg(b.score) as decimal(18,2)) >=60
order by a.S#

--4、查询平均成绩小于60分的同学的学生编号和学生姓名和平均成绩
--4.1、查询在sc表存在成绩的学生信息的SQL语句。
select a.S# , a.Sname , cast(avg(b.score) as decimal(18,2))avg_score
from Student a , sc b
where a.S# = b.S#
group by a.S# , a.Sname
having cast(avg(b.score) as decimal(18,2)) <60
order by a.S#

--5、查询所有同学的学生编号、学生姓名、选课总数、所有课程的总成绩
--5.1、查询所有有成绩的SQL。
select a.S#,a.Sname,count(b.C#) "选课总数",sum(score)"所有课程的总成绩"
from Student a,SC b
where a.S# = b.S#
group by a.S#,a.SNAME
order by a.S#

--5.2、查询所有(包括有成绩和无成绩)的SQL。
select a.S# "学生编号", a.Sname "学生姓名", count(b.C#) "选课总数", sum(score)"所有课程的总成绩"
from Student a left join SC b
on a.S# = b.S#
group by a.S#,a.Sname
order by a.S#

--6、查询"李"姓老师的数量 
--方法1
select count(Tname) "李姓老师的数量" from Teacher where Tname like '李%'

--7、查询学过"张三丰"老师授课的同学的信息  
select distinct Student.* from Student , SC , Course ,Teacher
where Student.S# = SC.S# and SC.C# = Course.C# and Course.T# =Teacher.T# and Teacher.Tname = N'张三'
order by Student.S#

--8、查询没学过"张三丰"老师授课的同学的信息  
select m.* from Student m where S# not in (select distinct SC.S# from SC , Course , Teacher where SC.C# = Course.C# and Course.T# =Teacher.T# and Teacher.Tname = '张三丰') order by m.S#

--9、查询学过编号为"01"并且也学过编号为"02"的课程的同学的信息
select Student.* from Student , SC where Student.S# = SC.S# and SC.C# = '01' and exists (Select 1 from SC SC_2 where SC_2.S# =SC.S# and SC_2.C# = '02') order by Student.S#

--10、查询学过编号为"01"但是没有学过编号为"02"的课程的同学的信息
select Student.* from Student , SC where Student.S# = SC.S# and SC.C# = '01' and not exists (Select 1 from SC SC_2 where SC_2.S# =SC.S# and SC_2.C# = '02') order by Student.S#

--11、查询没有学全所有课程的同学的信息 
select Student.*
from Student , SC
where Student.S# = SC.S#
group by Student.S# , Student.Sname , Student.Sage , Student.Ssex having count(C#)<(select count(C#) from Course)

--12、查询至少有一门课与学号为"01"的同学所学相同的同学的信息 
select distinct Student.* from Student , SC where Student.S# =SC.S# and SC.C# in (select C# from SC where S# = '01') and Student.S# <> '01'

--13、查询和"01"号的同学学习的课程完全相同的其他同学的信息 
select Student.* from Student where S# in
(select distinct SC.S# from SC where S#<> '01' and SC.C# in (select distinct C# from SC where S# = '01')
group by SC.S# having count(1) = (select count(1) from SC where S#='01'))

--14、查询没学过"张三"老师讲授的任一门课程的学生姓名 
select student.* from student where student.S# not in
(select distinct sc.S# from sc , course , teacher where sc.C# =course.C# and course.T# = teacher.T# and teacher.tname ='张三丰')
order by student.S#

--15、查询两门及其以上不及格课程的同学的学号，姓名及其平均成绩 
select student.S# , student.sname , cast(avg(score) as decimal(18,2)) avg_score from student , sc
where student.S# = SC.S# and student.S# in (select S# from SC where score < 60 group by S# having count(1)>= 2)
group by student.S# , student.sname

--16、检索"01"课程分数小于60，按分数降序排列的学生信息
select student.* , sc.C# , sc.score from student,sc
where student.S# = SC.S# and sc.score < 60 and sc.C#= '01'
order by sc.score desc

--17、按平均成绩从高到低显示所有学生的所有课程的成绩以及平均成绩
select a.S# 学生编号 , a.Sname 学生姓名 ,
      max(case c.Cname when '语文' then b.score else null end) "语文",
      max(case c.Cname when '数学' then b.score else null end) "数学",
      max(case c.Cname when '英语' then b.score else null end) "英语",
      cast(avg(b.score) as decimal(18,2)) "平均分"
from Student a
left join SC b on a.S# = b.S#
left join Course c on b.C# = c.C#
group by a.S#,a.Sname
order by "平均分" desc;

--18、查询各科成绩最高分、最低分和平均分：以如下形式显示：课程ID，课程name，最高分，最低分，平均分
select
    a.C#,
    b.CNAME,
    max(SCORE),
    min(SCORE),
    round(avg(SCORE), 2),
    round(100 *(sum(case when a.SCORE >= 60 then 1 else 0 end)/ sum(case when a.SCORE then 1 else 0 end)), 2) as 及格率,
    round(100 *(sum(case when a.SCORE >= 70 and a.SCORE <= 80 then 1 else 0 end)/ sum(case when a.SCORE then 1 else 0 end)), 2) as 中等率,
    round(100 *(sum(case when a.SCORE >= 80 and a.SCORE <= 90 then 1 else 0 end)/ sum(case when a.SCORE then 1 else 0 end)), 2) as 优良率,
    round(100 *(sum(case when a.SCORE >= 90 then 1 else 0 end)/ sum(case when a.SCORE then 1 else 0 end)), 2) as 优秀率
from
    SC a
left join course b on
    a.C# = b.C#
group by
    a.C#,
    b.CNAME

--19、按各科成绩进行排序，并显示排名


--20、查询下月过生日的学生
select * from student where datediff(mm,datename(yy,getdate()) +right(convert(varchar(10),sage,120),6),getdate()) = -1;

--21、求每门课程的学生人数 
select Course.C# , Course.Cname , count(*) "学生人数"
from Course , SC
where Course.C# = SC.C#
group by  Course.C# , Course.Cname
order by Course.C# , Course.Cname;

--22、查询平均成绩大于等于85的所有学生的学号、姓名和平均成绩
SELECT * from STUDENT where S# in(SELECT S# from SC GROUP BY S# HAVING avg(score)>=85);

