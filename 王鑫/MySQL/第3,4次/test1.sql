USE test1;
##部门表#

CREATE TABLE DEPT( 
DEPTNO int PRIMARY KEY,##部门编号 
DNAME VARCHAR(14), ##部门名称 
LOC VARCHAR(13) ##部门地址 
);
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

1.查找部门编号为30的员工

SELECT * FROM emp where deptno=30;

2.找出从事clerk工作的员工的编号,姓名,部门号。
SELECT empno,ename,deptno FROM emp where JOB='clerk';

3.检索出将近多余基本工资的员工信息.
select * FROM emp WHERE sal<COMM;

4.检索出奖金多余基本工资60%的员工信息.
select * from emp where (sal*0.6)<comm;

5.找出10部门的经理,20部门的职员的员工信息。
select * from emp where deptno=10 or deptno = 20;

6.找出10部门的经理,20部门的职员或者挤不上经理也不是职员但是工资高于2000元的员工信息
select * from emp where deptno=10 or deptno = 20 or (deptno!=10 and deptno!=20 and sal>2000);

7.找出获得奖金的员工的工作
SELECT * from emp WHERE comm is not null;

8.找出获得奖金少于100或者没有获得奖金的员工的工作
select *from emp where comm<100 OR comm is NULL;

9.找出姓名以A,B,C开始的员工信息.
select * from emp where ename LIKE 'A%'or ename LIKE 'B%' or ename LIKE 'S%';

10.找到姓名长度为6的字符员工信息.
select * from emp where LENGTH(ename)=6;

11.名字中不包含R字符的员工信息.
select * from emp WHERE	ename LIKE '%R%';

12.返回员工的详细信息并按姓名排序。
select * from emp ORDER BY ename DESC;

13.返回员工的信息并按工作降序工资升序
select * from emp ORDER BY Job DESC,sal ASC;

14.计算员工的日薪(按30天)
SELECT ENAME,SAL/30 AS'日薪' FROM EMP;

15.找出姓名包含A的员工信息。
select * from emp where ename LIKE '%a%';

16.进行等值连接,查询全部员工的个人信息以及薪酬情况。
SELECT * from emp INNER JOIN class no dept.dname = emp.ename;

17.查询工资水平在2500以上的员工号,姓名,收入。
SELECT empno,ename,comm FROM emp WHERE sal>2500;

18.查询所有员工的员工号,姓名,收入
select empno,ename,sal from emp;

19.查询所有部门的员工情况
select * from emp;

20.查询所有部门所有员工的姓名
select ename from emp;
