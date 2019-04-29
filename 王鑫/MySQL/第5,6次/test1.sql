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

==================第二次作业==================

练习一：
21.返回拥有员工的部门名,部门号
SELECT dname"部门名" , deptno "部门号" from dept ; 

22.工资水平对于smith的员工信息
SELECT * from emp WHERE emp.sal>800;

23.返回员工和所属经理的名字
SELECT e1.ename "员工名字" , e2.ename "经理名字" FROM emp e1 , emp e2  where e1.mgr=e2.empno; 

24.返回雇员日期早于其经理雇佣日期的员工及其经理姓名
SELECT e1.ename "员工名字" ,  e1.hiredate "员工雇佣日期" , e2.ename "经理名字", e2.hiredate "经理雇佣日期" FROM emp e1 , emp e2  where e1.mgr=e2.empno; 

25.返回员工姓名发及其所在的部门名称。
SELECT e.ename "员工姓名" , d.dname"部门名称" from emp e , dept d  where e.deptno = d.deptno; 

26.返回从事clerk工作的员工姓名和所在部门名称。
SELECT e.ename"员工姓名" , d.dname"部门名称" from emp e,dept d where e.job = "CLERK" and e.deptno = d.deptno;

27.返回部门号及其部门的最低工资。
SELECT d.deptno"部门号",MIN(e.sal)"最低工资" FROM emp e , dept d WHERE e.deptno = d.deptno  GROUP BY d.deptno;

28.返回销售部(sales)所有员工的姓名。
select e.ename"销售人员" from emp e , dept d  WHERE e.deptno=d.deptno AND d.dname="sales";

29.返回 工资水平多于平均工资的员工。
SELECT * FROM emp where SAL>(SELECT AVG(SAL)FROM emp);

30.返回与SCOTT 从事相同工作的员工。
SELECT * FROM emp WHERE deptno = (SELECT deptno FROM emp WHERE ename = 'SCOTT');

练习二：MySQL函数练习
1.查询所有学员从入学到今天,一共度过了多少天
select DATEDIFF(CURDATE(),'1998-6-01'); 
2.查询你的生日日期到现在像个的年数(月数12)
select FLOOR(DATEDIFF(CURDATE(),'1998-6-01')/365); 
2.查询每月2号入学学员的信息
SELECT * FROM emp hiredate(MONTH(date))
SELECT * from student_info e WHERE dayofmonth(e.stujointime)=2;
2.查询周末入学的学员
SELECT MONTH(CURDATE())=6 or MONTH(CURDATE())=0;
3.查询所有学员的毕业日期,假定按每个学员入学时间1年半之后毕业

4.查询星期四入学的学员姓名,性别,年龄,班级编号 =5？

5.查询‘2007-3-10’之前入学的学员信息。

6.查询所有的学员姓名长度

7.查询身份证中第9,10位为‘89’的学员信息(要求使用字符串函数)


练习三：分组聚合函数练习
1.查询所有学员的平均年龄(要求保留两位小数)

2.查询所有考试的总成绩

3.查询SQL考试的最低分数

4.查询java考试成绩最高的学员姓名

5.查询学员‘火云邪神’一共参加了几次考试

6.查询各科的平均成绩




