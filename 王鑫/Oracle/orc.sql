create user keren identified by keren123 default tablespace School;

--创建school表空间
--create tablespace school logging datafile 'C:\file\school.dbf' size 4M autoextend off;

--授权
grant connent to keren;
grant resource to keren;
grant create sequence to keren;

--创建学生表
create table student(--学生
  Sno varchar2(20) not null primary key,--学生学号
  Sname varchar2(20) not null, --学生姓名
  Ssex varchar2(20) not null, --学生性别
  Sbirthday date, --学生出生年月日
  Class varchar2(20) --学生所在班级
)


create table teacher(--老师
  Tno varchar2(20) not null primary key,--教工编号(主码)
  Tname varchar2(20) not null,--教工姓名
  Tsex varchar2(20) not null,--教工性别
  Tbirthday date,--教工出生年月日
  Prof varchar2(20),--职称
  Depart varchar2(20) not null  --教工所在部门
)

create table Course(--课程
  Cno varchar2(20) not null primary key,  --课程号
  Cname varchar2(20) not null,  --课程名称
  Tno varchar2(20) not null references teacher(Tno) --教工编号(外码)
)

create table Score(
Sno varchar2(20) not null references student(Sno),--学号(外码)
Cno varchar2(20) not null references Course(Cno), --课程号(外码)
primary key(Sno,Cno), 
Degree Decimal(4,1) --  成绩
)
insert into SYSTEM.Score(Sno,Cno,Degree) values('1','1',42.1);


--3.插入数据到相关的表中
--STUDENT表
Insert into SYSTEM.STUDENT (SNO,SNAME,SSEX,SBIRTHDAY,CLASS) values ('1','一号','男',to_date('1998-06-01','YYYY-MM-DD'),'1');
Insert into SYSTEM.STUDENT (SNO,SNAME,SSEX,SBIRTHDAY,CLASS) values ('2','二号','女',to_date('1998-06-01','YYYY-MM-DD'),'1');
Insert into SYSTEM.STUDENT (SNO,SNAME,SSEX,SBIRTHDAY,CLASS) values ('3','三号','女',to_date('1998-06-01','YYYY-MM-DD'),'1');
Insert into SYSTEM.STUDENT (SNO,SNAME,SSEX,SBIRTHDAY,CLASS) values ('4','四号','男',to_date('1998-02-01','YYYY-MM-DD'),'2');

--teacher表
Insert into SYSTEM.teacher (Tno,Tname,Tsex,Tbirthday,Prof,Depart) values ('1','教师01','男',to_date('1998-06-01','YYYY-MM-DD'),'教员','1');
Insert into SYSTEM.teacher (Tno,Tname,Tsex,Tbirthday,Prof,Depart) values ('2','教师02','女',to_date('1998-07-01','YYYY-MM-DD'),'教员','1');
Insert into SYSTEM.teacher (Tno,Tname,Tsex,Tbirthday,Prof,Depart) values ('3','教师03','男',to_date('1998-08-01','YYYY-MM-DD'),'教员','1');
Insert into SYSTEM.teacher (Tno,Tname,Tsex,Tbirthday,Prof,Depart) values ('4','教师04','女',to_date('1998-09-01','YYYY-MM-DD'),'教员','1');
Insert into SYSTEM.teacher (Tno,Tname,Tsex,Tbirthday,Prof,Depart) values ('5','教师05','男',to_date('1998-01-01','YYYY-MM-DD'),'组长','2');
Insert into SYSTEM.teacher (Tno,Tname,Tsex,Tbirthday,Prof,Depart) values ('6','教师06','男',to_date('1998-03-01','YYYY-MM-DD'),'校长','3');

--Course表
insert into SYSTEM.Course(Cno,Cname,Tno) values('1','JAVA','1');
insert into SYSTEM.Course(Cno,Cname,Tno) values('2','Html','1');
insert into SYSTEM.Course(Cno,Cname,Tno) values('3','JS','1');
insert into SYSTEM.Course(Cno,Cname,Tno) values('4','MySql','1');

--Score表
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



--4.查询Student表中的所有记录的Sname、Ssex和Class列
SELECT Sname,ssex,class FROM SYSTEM.STUDENT;

--5.查询教师所有的单位即不重复的Depart列
SELECT distinct Depart FROM teacher;

--6.查询Score表中成绩在60到80之间的所有记录
SELECT * FROM score where 60<degree and degree<80;

--7.查询Score表中成绩为85，86或88的记录。
SELECT * FROM score where degree=85 or degree between 86 and 88;

--8、查询Student表中“95031”班或性别为“女”的同学记录。
SELECT * FROM student where CLASS=95031 and Ssex='女';

--9、以Cno升序、Degree降序查询Score表的所有记录。
SELECT * FROM Score order by Degree desc;

--10.查询Score表中的最高分的学生学号和课程号。（子查询或者排序）
SELECT count(*) FROM student where CLASS=95031;

--12、查询每门课的平均成绩。
select avg(DEGREE) from Score;

--13、查询Score表中至少有5名学生选修的并以3开头的课程的平均分数。
select COUNT(sno),AVG(DEGREE) from score WHERE CNO LIKE '3%' GROUP BY cno HAVING COUNT(sno)>=5

--14、查询分数大于70，小于90的Sno列。
select Sno from Score where degree between 70 and 90 ;

--15、查询所有学生的Sname、Cno和Degree列。
select * from student st, Score sc where st.sno = sc.sno;

--16、查询和“李军”同性别并同班的同学Sname.
SELECT * FROM student where (select ssex from student where Sname = '李军') = ssex;

--17、查询所有选修“计算机导论”课程的“男”同学的成绩表。
select * from score where cno=(select cno from COURSE WHERE CNAME = 'java') and sno in (select sno from STUDENT where SSEX='男');

--18、查询所有任课教师的Tname和Depart.
select Tname,depart from teacher;

--19、查询出“计算机系“教师所教课程的成绩表。
select * from score where cno =(select cno from COURSE WHERE CNAME ='java')


--20、查询score中选学多门课程的同学中分数为非最高分成绩的记录。
select * from score a where sno in(select sno from score GROUP BY sno HAVING COUNT(cno)>1) and DEGREE<(select MAX(DEGREE) from 
SCORE b where a.cno=b.cno)




















