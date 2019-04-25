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

1,查找部门30 中员工的详细信息。
select * from DEPT where DEPTNO=30;

2,找出从事clerk工作的员工的编号，姓名，部门号。
select EMPNO,ENAME,DEPTNO from EMP where JOB='clerk';

3,检索出奖金多余基本工资的员工信息。
select * from EMP where COMM>SAL;

4,检索出奖金多余基本工资60%的员工信息。
select * from EMP where COMM>SAL*0.6;

5,找出10部门的经理，20部门的职员的员工信息。
select * from EMP where DEPTNO=10 and JOB='MANAGER' or DEPTNO=20 and JOB='CLERK';

6,找出10部门的经理，20部门的职员或着既不是经理也不是职员但是工资高于2000元员工信息。
select * from EMP where DEPTNO=10 and JOB='MANAGER' or DEPTNO=20 and JOB='CLERK' or JOB!='MANAGER' and JOB!='CLERK' and SAL>2000;

7,找出获得奖金的员工的工作。
select * from EMP where COMM is not null and COMM!=0;

8,找出奖金少于100或者没有获得奖金的员工信息
select * from EMP where COMM<100 or COMM is null;

9,找出姓名以A、B、C开始的员工信息。
select * from EMP where ENAME like 'A%' or ENAME like 'B%' or ENAME like 'C%';

10,找到名字长度为6个字符的员工信息。
select * from EMP where ENAME rlike '.{6}'; 

11,名字中不包含R字符的员工信息。
select * from EMP where ENAME not like'%R%';

12,返回员工的详细信息并按姓名排序。
select * from EMP order by ENAME;

13,返回员工的信息并按工作降序排列。
select * from EMP order by SAL desc;

14,计算员工的日薪（按30天）。
select ENAME,SAL/30 from EMP;

15,找出姓名包含A的员工信息。
select * from EMP where ENAME like '%A%';

16,经行等值连接，查询全部员工的个人信息以及薪酬情况。
select ENAME,SAL from EMP;

17,查询工资水平在2500以上的的员工，姓名，收入
select ENAME,SAL from EMP where SAL>2500;

18,查询所有员工的员工号，名字，薪酬
select EMPNO,ENAME,SAL from EMP;

19,查询所有部门员工的情况
select * from EMP;

20,查询所有部门所有员工的名字
select ENAME from EMP;

21,返回拥有员工的部门名，部门号


22,工资水平多余多余smith的员工信息


23,返回员工和所属经理的姓名


24,返回雇员的雇佣日期早于其经理雇佣日期的员工及其经理姓名


25,返回员工姓名及其所在的部门名称。


26,返回从事clerk工作的员工姓名和所在部门名称。


27,


28,


29,


30,


31,


32,


33,


34,


35,


36,


37,


38,


39,


40,


41,


42,


43,


44,


45,


46,


47,


48,


49,

