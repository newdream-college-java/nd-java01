alter user scott account unlock;--解锁scott账户
alter user scott identified by tiger;--给scott账户设置密码
select username,account_status from dba_users;--查看账户的状态
select * from v$tablespace;--查询系统存在的表空间
select * from dba_data_files;--查询表空间的描述信息
create tablespace newdream datafile 'D:\Work\oracle\file\ljc.dbf' size 10m autoextend on;--给表空间新增文件
--计算表空间的大小
select tablespace_name,sum(bytes)/1024/1024 total from dba_data_files  group by tablespace_name;
--创建用户
create user LJC identified by ljc123 default tablespace newdream;
--给新建用户授权
grant connect to lijiancong
grant resource to lijiancong
grant select on SCOTT.dept to lijiancong
--回收权限 
revoke select on scott.dept from lijiancong
revoke connect from lijiancong
--建表
create table student(
sno varchar(20) not null primary key ,--学号
sname varchar(20) not null ,--学生姓名
ssex varchar(10) not null,--学生性别
sbirthday date ,--学生出生年月
class varchar(20)--学生班级
)
15、查询所有学生的Sname、Cno和Degree列。
SELECT s.sname,c.cno,c.degree FROM student s,score c where s.sno=c.sno ;

16、查询和“李军”同性别并同班的同学Sname.
select sname from student where ssex=(select ssex from student where sname='江婷2') and class=(SELECT class from student where sname='江婷2');
select Sname from Student where Ssex = (select Ssex from Student where Sname='李军' ) and class=( select class from student where Sname='李军')

17、查询所有选修“计算机导论”课程的“男”同学的成绩表。
SELECT c.degree from student s,score c where s.class='java1' and s.ssex='男';

18、查询所有任课教师的Tname和Depart.
select tname,depart from teacher ;

19、查询出“计算机系“教师所教课程的成绩表。
select s.degree from course c,score s where c.cname='软件工程2' and c.cno=s.cno;

20、查询score中选学多门课程的同学中分数为非最高分成绩的记录。
select * from score a where sno in (
select sno from score group by sno having count(1)>1)
and a.degree<(select max(degree) from score b where a.cno=b.cno  )
select degree ;

--查询“95031”班的学生人数。
SELECT "COUNT"(*) from student WHERE class='java4';
SELECT Sname,Ssex,class from student;
INSERT into student values('1','江婷','女',"TO_DATE"('1998-06-30','yyyy-MM-dd'),'java1');
INSERT into student values('4','江婷','女',"TO_DATE"('1998-06-30','yyyy-MM-dd'),'java4');
INSERT into student values('5','江婷','女',"TO_DATE"('1998-06-30','yyyy-MM-dd'),'java4');

INSERT into student values('2','江婷2','女',"TO_DATE"('1998-06-30','yyyy-MM-dd'),'java2');
INSERT into student values('3','江婷3','女',"TO_DATE"('1998-06-30','yyyy-MM-dd'),'java3');
SELECT * from student where  ssex='女';--8、查询Student表中“95031”班或性别为“女”的同学记录。
--
drop table emp
create table teacher (
tno varchar(20) not null primary key,--教工编号
tname varchar(20) not null,--教工姓名
tsex varchar(20) not null, --教工性别
tbirthday date,--教工出生年月
prof varchar(20),--职称
depart varchar(20) not null--教工所在部门
)
SELECT * from teacher
SELECT  DISTINCT depart from teacher  -- 查询教师所有的单位即不重复的Depart列。
INSERT into teacher values('1','李健聪','男',"TO_DATE"('2019-07-30','YYYY-MM-dd'),'老师','软件');
INSERT into teacher values('2','李健聪','男',"TO_DATE"('2019-07-30','YYYY-MM-dd'),'老师','软件');
INSERT into teacher values('3','李健聪3','男',"TO_DATE"('2019-07-31','YYYY-MM-dd'),'老师1','测试');


--课程
create table course(
cno varchar(20)not null primary key,--课程号
cname varchar(20) not null,--课程名
tno varchar(20) not null references teacher(tno)--教工编号
)
select * from course
INSERT into course values('c1','软件工程','1');
INSERT into course values('c2','软件工程2','2');
INSERT into course values('c3','软件工程3','3');

--分数
create table score (
sno varchar(20) not null references student(sno),--学号（外码）
cno varchar(20) not null references course(cno) ,
primary key(sno,cno),
degree decimal(4,1)--成绩
)
14、查询分数大于70，小于90的Sno列。
SELECT sno,degree from score where degree>30 and degree<90;
查询Score表中的最高分的学生学号和课程号。（子查询或者排序）
SELECT * from score  where degree=(SELECT "MAX"(degree) from score);

查询每门课的平均成绩。
SELECT cno,AVG(degree) from score GROUP BY cno;

SELECT "MAX"(degree) from score;
SELECT * from score
SELECT * from score WHERE degree BETWEEN 60 AND 80;--查询Score表中成绩在60到80之间的所有记录。
--查询Score表中成绩为85，86或88的记录。
SELECT * from score where degree='85' or degree='89.8';
INSERT into score values('1','c1','89.75');
INSERT into score values('2','c2','69.75');
INSERT into score values('3','c3','49.75');
12、查询Score表中至少有5名学生选修的并以3开头的课程的平均分数。
substr — 返回字符串的子串 就是截取字符串cno，获取从第一位到倒数第二位
0是第一位，-1是倒数第二位 
select cno,count(cno),avg(degree) from score t group by cno having count(cno)>=5 and substr(cno,0,1)='3'



SELECT * from score ORDER BY cno asc,degree desc;


select * from SCORE t order by cno  asc,degree desc



CREATE database jt;
