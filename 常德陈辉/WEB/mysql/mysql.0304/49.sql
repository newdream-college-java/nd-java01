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
select ENAME,SAL+IFNULL(comm,0) from EMP;

17,查询工资水平在2500以上的的员工，姓名，收入
select ENAME,SAL from EMP where SAL>2500;

18,查询所有员工的员工号，名字，薪酬
select EMPNO,ENAME,SAL from EMP;

19,查询所有部门员工的情况
select * from EMP;

20,查询所有部门所有员工的名字
select ENAME from EMP;

21,返回拥有员工的部门名，部门号
select distinct d.dname as "部门名",d.deptno as "部门号" from emp e join dept d on e.deptno=d.deptno;

22,工资水平多余smith的员工信息
select * from emp where sal>(select sal from emp where ename like'smith');

23,返回员工和所属经理的姓名
select e.ename as "员工",m.ename as "经理" from emp e JOIN emp m on e.mgr=m.empno;

24,返回雇员的雇佣日期早于其经理雇佣日期的员工及其经理姓名
select e.ename "员工",m.ename "经理" from emp e join emp m on  e.mgr=m.empno where e.HIREDATE<m.HIREDATE;

25,返回员工姓名及其所在的部门名称。
select e.ename,d.dname from emp e join dept d on e.deptno=d.deptno; 

26,返回从事clerk工作的员工姓名和所在部门名称。
select e.ename,d.dname from  emp e join dept d on e.deptno=d.deptno where e.job like'clerk';

27,返回部门号及其本部门的最低工资。
select d.dname,min(e.sal) from emp e join dept d on e.deptno=d.deptno group by e.deptno;

28,返回销售部（sales）所有员工的姓名。
select e.ename from emp e join dept d on e.deptno=d.deptno where d.dname='sales';

29,返回工资水平多余平均工资的员工。
select ename from emp where sal>(select (select sum(sal) from emp)/(select count(*) from emp));
select (select sum(sal) from emp)/(select count(*) from emp);
30,返回与scott从事相同工作的员工。
select * from emp e where e.job like(select m.job from emp m where m.ename like 'scott');

31,返回与30部门员工工资水平相同的员工姓名与工资。
select ename,sal from emp where deptno=30;
select ename,sal from emp where deptno!=30;

32,返回工资高于30部门所有员工工资水平的员工信息
select * from emp where sal>(select avg(sal) from emp where deptno=30);

33,返回部门号,部门名，部门所在位置及其每个部门的员工总数
select d.*,count(e.deptno) from dept d join emp e on  d.deptno=e.deptno group by e.deptno;

34,返回员工的姓名，所在部门名及其工资
select e.ename,d.dname,e.sal from emp e join dept d on e.deptno=d.deptno;

35,返回员工详细信息。（包括部门名）
select e.*,d.dname "部门名" from emp e join dept d on e.deptno=d.deptno;

36,返回员工工作及其从事此工作的最低工资
select job,MIN(sal) from emp group by job;

37,计算出员工的年薪，并且以年薪排序，
select *,sal*12+ifnull(comm,0) "年薪" from emp order by sal*12+ifnull(comm,0) desc;
select *,sal*12+ifnull(comm,0) "年薪" from emp order by sal*12+ifnull(comm,0) asc;

38,返回工资处于第四级别的员工的姓名
select e.ename,e.sal from emp e,salgrade s where e.sal between s.losal and s.hisal and s.grade=4;

39,返回工资为二等级的职员姓名，部门所在地，和二等级的最低工资和最高工资
select e.ename,d.loc,MIN(e.sal),MAX(e.sal) from emp e,dept d,(select losal,hisal from salgrade where grade=2) s where e.deptno=d.deptno and e.sal between s.losal and s.hisal;

40,工资等级多于smith的员工信息。
select e.* from emp e,salgrade s where e.sal between s.losal and s.hisal and s.grade>(select s.grade from emp e,salgrade s where e.sal between s.losal and s.hisal and e.ename='smith');

41,查看Employees列表所有数据
select * from Employees;

42,计算Employees中的行数
select COUNT(*) from Employees;

43,查询工作年龄最大的员工姓名以及工作年限
select ename,min(hiredate)  from emp;

44,查询薪酬在3000元以上的人数
select count(*) from emp where (sal+ifnull(comm,0))>3000;

45,查询Emp表中姓林且两个字名字的员工编号以及姓名
select empno,ename from emp where ename like '林_';

46,查询Emp表中名字中有林字的员工的编号及姓名
select empno,ename from emp where ename like '%林%';

47,查询工资在2000到3000范围的员工编号及姓名
select empno,ename from emp where sal between 2000 and 3000;

48,查询财务部的员工号以及员工姓名
select e.empno,e.ename from emp e,dept d where e.deptno=d.deptno and d.dname='accounting';

49,查找财务部以及研发部以外的员工号以及员工姓名
select e.empno,e.ename from emp e,dept d where e.deptno=d.deptno and d.dname!='accounting' and d.dname!='research';
select e.empno,e.ename from emp e,dept d where e.deptno=d.deptno and d.dname not in('accounting','research');