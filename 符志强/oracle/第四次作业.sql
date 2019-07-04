 --学生表
create table Student(
ID varchar(10),--学生id
Sname varchar(10),--学生姓名
Sage date,--学生出生年月
Ssex varchar(10)--学生性别
);

insert into student values('01','赵雷',to_date('1990-01-01','yyyy-mm-dd'),'男');
insert into student values('02','钱电',to_date('1990-12-21','yyyy-mm-dd'),'男');
insert into student values('03','孙风',to_date('1990-05-20','yyyy-mm-dd'),'男');
insert into student values('04','李云',to_date('1990-08-06','yyyy-mm-dd'),'女');
insert into student values('05','杨斌',to_date('1990-09-01','yyyy-mm-dd'),'男');
insert into student values('06','陈辉',to_date('1990-07-21','yyyy-mm-dd'),'男');
insert into student values('07','段瑜',to_date('1990-05-20','yyyy-mm-dd'),'男');
select * from Student;
--课程
create table Course(
Cid varchar(10),--课程编号
Cname varchar(10),--课程名称
Tid varchar(10)--教师编号
);
insert into course values('01','语文','02');
insert into course values('02','数学','01');
insert into course values('03','英语','03');
select * from Course;

--教师
create table Teacher(
Tid varchar(10),--教师编号
Tname varchar(10)--教师名称
);
insert into Teacher values('01','张三');
insert into Teacher values('02','李四');
insert into Teacher values('03','王五');
select * from Teacher;

--分数
create table SC(
ID varchar(10),--学生id
Cid varchar(10),--课程编号
score decimal(18,1)--分数
);
insert into SC values('01','01','80');
insert into SC values('01','02','90');
insert into SC values('01','03','99');
insert into SC values('02','01','70');
insert into SC values('02','02','60');
insert into SC values('02','03','80');
insert into SC values('03','01','80');
insert into SC values('03','02','80');
insert into SC values('03','03','80');
insert into SC values('04','01','50');
insert into SC values('04','02','30');
insert into SC values('04','03','20');
insert into SC values('05','01','76');
insert into SC values('05','02','87');
insert into SC values('06','01','31');
insert into SC values('06','03','34');
insert into SC values('07','02','89');
insert into SC values('07','03','98');
select * from sc;

--练习：

--1、查询"01"课程比"02"课程成绩高的学生的信息及课程分数
--1.1、查询同时存在"01"课程和"02"课程的情况
select t.*,s.score,s1.score from (select t.*,s.score from sc s,student t where cid=01 and s.id=t.id) s,
(select t.*,s.score from sc s,student t where cid=02 and s.id=t.id) s1,student t where s.id=s1.id and s.id=t.id and s.score>s1.score ;

select s1.*,sc1.score,sc2.score from SC sc1,Student s1,SC sc2 
where sc1.id=sc2.id and sc1.cid='01' 
and sc2.cid='02' and sc1.score>sc2.score 
and s1.id=sc1.id;
--1.2、查询同时存在"01"课程和"02"课程的情况和存在"01"课程但可能不存在"02"课程的情况(不存在时显示为null)(以下存在相同内容时不再解释)
select * from student t,(select s.id,s.score class1,s1.score class2 from (select * from sc where cid=01) s left join 
(select * from sc where cid=02 ) s1 on s.id=s1.id and s.score>s1.score ) x where t.id=x.id ;

select s1.*,sc1.score,sc2.score from SC sc1,Student s1,SC sc2 
left join sc1.id=sc2.id and sc1.cid='01' 
and sc2.cid='02' and sc1.score>sc2.score 
and s1.id=sc1.id;


 select * from STUDENT s,(select a.id,a.score class1,b.SCORE class2 from (select * from sc where cid='01') a 
left join(select * from sc where cid='02') b on a.id=b.id and a.score>b.score) d where s.id=d.id
--2、查询"01"课程比"02"课程成绩低的学生的信息及课程分数
--2.1、查询同时存在"01"课程和"02"课程的情况
select t.*,s.score,s1.score from (select t.*,s.score from sc s,student t where cid=01 and s.id=t.id) s,
(select t.*,s.score from sc s,student t where cid=02 and s.id=t.id) s1,student t where s.id=s1.id and s.id=t.id and s.score<s1.score ;

select s1.*,sc1.score,sc2.score from SC sc1,Student s1,SC sc2 
where sc1.id=sc2.id and sc1.cid='01' 
and sc2.cid='02' and sc1.score<sc2.score 
and s1.id=sc1.id;
--2.2、查询同时存在"01"课程和"02"课程的情况和不存在"01"课程但存在"02"课程的情况
select * from student t,(select s1.id,s.score class1,s1.score class2 from (select * from sc where cid=01) s right join 
(select * from sc where cid=02 ) s1 on s.id=s1.id and s.score<s1.score ) x where t.id=x.id ;
--3、查询平均成绩大于等于60分的同学的学生编号和学生姓名和平均成绩
select s.id,s.sname,c.p from student s,(select id,cast(avg(score) as decimal(18,2)) p from sc  group by id) c where c.p>60 and c.id=s.id;

select a.id , a.Sname , cast(avg(b.score) as decimal(18,2))avg_score
from Student a , sc b
where a.id = b.id
group by a.id , a.Sname
having cast(avg(b.score) as decimal(18,2)) >=60
order by a.id
--4、查询平均成绩小于60分的同学的学生编号和学生姓名和平均成绩
--4.1、查询在sc表存在成绩的学生信息的SQL语句。
select a.id , a.Sname , cast(avg(b.score) as decimal(18,2))avg_score
from Student a , sc b
where a.id = b.id
group by a.id, a.Sname
having cast(avg(b.score) as decimal(18,2)) <60
order by a.id
--5、查询所有同学的学生编号、学生姓名、选课总数、所有课程的总成绩
--5.1、查询所有有成绩的SQL。
select a.id "学生编号", a.Sname "学生姓名", count(b.Cid) "选课总数", sum(score)"所有课程的总成绩"
from Student a , SC b
where a.id = b.id
group by a.id,a.Sname
order by a.id

--5.2、查询所有(包括有成绩和无成绩)的SQL。
select a.id "学生编号", a.Sname "学生姓名", count(b.Cid) "选课总数", sum(score)"所有课程的总成绩"
from Student a left join SC b
on a.id = b.id
group by a.id,a.Sname
order by a.id
--6、查询"李"姓老师的数量 
SELECT COUNT(*) FROM TEACHER where TNAME LIKE '%李%';
--7、查询学过"张三"老师授课的同学的信息  
SELECT * FROM STUDENT WHERE id IN (SELECT id FROM SC WHERE (SELECT Tid FROM TEACHER WHERE Tname = '张三') = Cid);

--8、查询没学过"张三"老师授课的同学的信息  
SELECT * FROM STUDENT WHERE id not IN (SELECT Cid FROM SC WHERE (SELECT Tid FROM TEACHER WHERE Tname = '张三') = Cid);

--9、查询学过编号为"01"并且也学过编号为"02"的课程的同学的信息
SELECT * FROM STUDENT WHERE id in (SELECT S1.id FROM SC s1 ,SC s2 WHERE S1.Cid = '01' AND S2.Cid = '02' AND s1.id = s2.id)

--10、查询学过编号为"01"但是没有学过编号为"02"的课程的同学的信息
SELECT Student.* FROM Student , SC WHERE 
Student.id = SC.id and SC.Cid = '01' and Student.id 
not in (Select SC_2.id FROM SC SC_2 where SC_2.id = SC.id and SC_2.Cid = '02')
order by Student.id
--11、查询没有学全所有课程的同学的信息 
select Student.*
from Student , SC
where Student.id = SC.id
group by Student.id , Student.Sname , Student.Sage , Student.Ssex having count(Cid) < (select count(Cid) from Course)

--12、查询至少有一门课与学号为"01"的同学所学相同的同学的信息 
select distinct Student.* from Student , SC where Student.id =SC.id and SC.Cid in (select Cid from SC where id = '01') and Student.id <> '01' 

--13、查询和"01"号的同学学习的课程完全相同的其他同学的信息 
select Student.* from Student where id in
(select distinct SC.id from SC where id<> '01' and SC.Cid in (select distinct Cid from SC where id = '01')
group by SC.id having count(1) = (select count(1) from SC where id='01'))

--14、查询没学过"张三"老师讲授的任一门课程的学生姓名 
select student.* from student where student.id not in
(select distinct sc.id from sc , course , teacher where sc.Cid =course.Cid and course.Tid = teacher.Tid and teacher.tname ='张三')

--15、查询两门及其以上不及格课程的同学的学号，姓名及其平均成绩 
select student.id , student.sname , cast(avg(score) as decimal(18,2)) avg_score from student , sc
where student.id = SC.id and student.id in (select id from SC where score < 60 group by id having count(1)>= 2)
group by student.id , student.sname

--16、检索"01"课程分数小于60，按分数降序排列的学生信息
select student.* , sc.Cid , sc.score from student , sc
where student.id = SC.id and sc.score < 60 and sc.Cid= '01'
order by sc.score desc

--17、按平均成绩从高到低显示所有学生的所有课程的成绩以及平均成绩

--18、查询各科成绩最高分、最低分和平均分：以如下形式显示：课程ID，课程name，最高分，最低分，平均分

--19、按各科成绩进行排序，并显示排名

--20、查询下月过生日的学生


--21、求每门课程的学生人数 
select Course.Cid , Course.Cname , count(*) "学生人数"
from Course , SC
where Course.Cid = SC.Cid
group by  Course.Cid , Course.Cname
order by Course.Cid , Course.Cname

--22、查询平均成绩大于等于85的所有学生的学号、姓名和平均成绩
select a.id , a.Sname , cast(avg(b.score) as decimal(18,2))avg_score from Student a , sc b 
where a.id = b.id group by a.id , a.Sname having cast(avg(b.score) as decimal(18,2)) >=85 order by a.id



select empno,ename from emp where sal<(select avg(sal) from emp);

