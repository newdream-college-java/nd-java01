use test1;
DROP DATABASE IF EXISTS test1;
CREATE DATABASE test1;
USE test1;
##部门表#
DROP IF EXISTS TABLE DEPT;
CREATE TABLE DEPT( 
DEPTNO int PRIMARY KEY,##部门编号 
DNAME VARCHAR(14) , ##部门名称 
LOC VARCHAR(13) ##部门地址 
) ;
INSERT INTO DEPT VALUES (10,'ACCOUNTING','NEW YORK');
INSERT INTO DEPT VALUES (20,'RESEARCH','DALLAS');
INSERT INTO DEPT VALUES (30,'SALES','CHICAGO');
INSERT INTO DEPT VALUES (40,'OPERATIONS','BOSTON');

##员工表 #
DROP IF EXISTS TABLE EMP;
CREATE TABLE EMP( 
EMPNO int PRIMARY KEY, #员工编号 
ENAME VARCHAR(10), #员工姓名 
JOB VARCHAR(9), #员工工作 
MGR int, #员工直属领导编号 
HIREDATE DATE, #入职时间 
SAL double, #工资 
COMM double, #奖金 
DEPTNO int #对应dept表的外键
); 
## 添加 部门 和 员工 之间的主外键关系
ALTER TABLE EMP ADD CONSTRAINT FOREIGN KEY EMP(DEPTNO) REFERENCES DEPT (DEPTNO);
INSERT INTO EMP VALUES(7369,'SMITH','CLERK',7902,"1980-12-17",800,NULL,20);
INSERT INTO EMP VALUES(7499,'ALLEN','SALESMAN',7698,'1981-02-20',1600,300,30);
INSERT INTO EMP VALUES(7521,'WARD','SALESMAN',7698,'1981-02-22',1250,500,30);
INSERT INTO EMP VALUES(7566,'JONES','MANAGER',7839,'1981-04-02',2975,NULL,20);
INSERT INTO EMP VALUES(7654,'MARTIN','SALESMAN',7698,'1981-09-28',1250,1400,30);
INSERT INTO EMP VALUES(7698,'BLAKE','MANAGER',7839,'1981-05-01',2850,NULL,30);
INSERT INTO EMP VALUES(7782,'CLARK','MANAGER',7839,'1981-06-09',2450,NULL,10);
INSERT INTO EMP VALUES(7788,'SCOTT','ANALYST',7566,'1987-07-03',3000,NULL,20);
INSERT INTO EMP VALUES(7839,'KING','PRESIDENT',NULL,'1981-11-17',5000,NULL,10);
INSERT INTO EMP VALUES(7844,'TURNER','SALESMAN',7698,'1981-09-08',1500,0,30);
INSERT INTO EMP VALUES(7876,'ADAMS','CLERK',7788,'1987-07-13',1100,NULL,20);
INSERT INTO EMP VALUES(7900,'JAMES','CLERK',7698,'1981-12-03',950,NULL,30);
INSERT INTO EMP VALUES(7902,'FORD','ANALYST',7566,'1981-12-03',3000,NULL,20);
INSERT INTO EMP VALUES(7934,'MILLER','CLERK',7782,'1981-01-23',1300,NULL,10);
#工资等级表#
DROP IF EXISTS TABLE SALGRADE;
CREATE TABLE SALGRADE( 
GRADE int, #等级 
LOSAL double, #最低工资 
HISAL double #最高工资
); 
INSERT INTO SALGRADE VALUES (1,700,1200);
INSERT INTO SALGRADE VALUES (2,1201,1400);
INSERT INTO SALGRADE VALUES (3,1401,2000);
INSERT INTO SALGRADE VALUES (4,2001,3000);
INSERT INTO SALGRADE VALUES (5,3001,9999);


use j01;
select * from studeninfo;
select * from teacherinfo;
4.查询星期四入学的学员姓名，性别，年龄，班级编号
select * from studeninfo s where dayname(s.StuJoinTime)='thursday';
5.查询‘2007-3-10’之前入学的学员信息
select * from studeninfo s where s.StuJoinTime<'2007-03-10';
6.查询所有学员姓名的长度
select s.stuname,length(s.stuname) '长度' from  studeninfo s;
7.查询身份证中第9，10位为‘89’的学员信息（要求使用字符串函数）
select * from studeninfo s where substring(s.stugard,9,2)=89;
8.修改班主任信息，将邮箱中的‘yahoo’替换为‘accp’
select  replace(t.teacheremail,'yahoo','accp') from teacherinfo t ;

select * from studeninfo;
select * from teacherinfo;
select * from studentexam;
6.查询各科目的平均成绩
select examsubject,avg(examresult) from studentexam group by examsubject;
7.查询每个班级学员的最小年龄
select sclassid,min(stuage) from studeninfo group by sclassid;
8.查询考试不及格的人数
select count(examresult) '考试不及格的人数' from studentexam where examresult<60;
9.查询各学员的总成绩，要求筛选出总成绩在140分以上的
select EStuID'学员',sum(ExamResult)'总成绩' from studentexam  group by EStuID having sum(ExamResult)>140 ;
10.查询男女学员的平均年龄
select stusex,avg(stuage) from studeninfo group by stusex;

use test1; 
select * from emp;
select * from dept;
select * from salgrade;
31.返回与30部门员工工资水平相同的员工姓名与工资
select ename,sal from emp where sal in (select sal from emp where deptno = 30) and deptno!='30';
32.返回工资高于30部门所有员工工资水平的员工信息
select * from emp where sal>(select max(sal) from emp where deptno = 30);
33.返回部门号、部门名、部门所在位置及其每个部门的员工总数
select d.deptno,d.dname,d.loc,count(e.deptno) from dept d,emp e where e.deptno=d.deptno GROUP BY deptno;
34.返回员工的姓名、所在部门名及其工资
select e.ename '员工的姓名',d.dname '所在部门名',sal '工资' from dept d,emp e  where e.deptno=d.deptno;
35.返回员工的详细信息
select e.* , d.dname,d.loc from emp e, dept d where e.deptno = d.deptno;