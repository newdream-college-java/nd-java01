
USE homewok03;
##部门表#
CREATE TABLE DEPT( 
DEPTNO int PRIMARY KEY,##部门编号 
DNAME VARCHAR(14) , ##部门名称 
LOC VARCHAR(13) ##部门地址 
);
INSERT INTO DEPT VALUES (10,'ACCOUNTING','NEW YORK');
INSERT INTO DEPT VALUES (20,'RESEARCH','DALLAS');
INSERT INTO DEPT VALUES (30,'SALES','CHICAGO');
INSERT INTO DEPT VALUES (40,'OPERATIONS','BOSTON');

##员工表 #
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


-- 第一题：查找30中所有员工信息
SELECT * FROM EMP WHERE DEPTNO=30;

-- 第二题：找出从事clerk工作的员工的编号、姓名、部门号
SELECT EMPNO,ENAME,DEPTNO from EMP WHERE JOB='clerk';

-- 第三题：检索出奖金多于基本工资的员工信息
SELECT * FROM EMP WHERE COMM>SAL;

-- 第四题：检索出奖金多于基本工资60%的员工信息。
SELECT * FROM EMP WHERE COMM>(SAL*0.6);

-- 第五题：找出10部门的经理、20部门的职员的员工信息。
SELECT * FROM EMP WHERE DEPTNO=10 AND JOB='MANAGER' OR DEPTNO=20 AND JOB='clerk';

-- 第六题：找出10部门经理、20部门职员、或者既不是经理也不是职员但是工资高于2000元的员工信息。
SELECT * FROM EMP WHERE DEPTNO=10 AND JOB='MANAGER' OR DEPTNO=20 AND JOB='clerk' OR JOB!='MANAGER' AND JOB!='clerk' AND SAL>2000;

-- 第七题：找出获得奖金的员工的工作
SELECT DISTINCT JOB FROM EMP WHERE COMM IS NOT NULL;

-- 第八题：找出奖金少于100或者没有获得奖金的员工的信息
SELECT * FROM EMP WHERE COMM<100 OR COMM is NULL;

-- 第九题：找出奖金少于100或者没有获得奖金的员工的信息
SELECT * FROM EMP WHERE ENAME LIKE 'A%' OR ENAME LIKE 'B%' OR ENAME LIKE 'S%';

-- 第十题：找到名字长度为6个字符的员工信息
SELECT * FROM EMP WHERE ENAME LIKE '______';

-- 第十一题：名字中不包含R字符的员工信息
SELECT * FROM EMP WHERE ENAME NOT LIKE '%R%';

-- 第十二题：返回员工的详细信息并按姓名排序
SELECT * FROM EMP ORDER BY ENAME;

-- 第十三题：返回员工的详细信息并按工作降序工资升序排序
SELECT * FROM EMP ORDER BY JOB DESC,SAL ASC;

-- 第十四题：计算员工的日薪（按30天）
SELECT ENAME,SAL/30 AS'日薪' FROM EMP;

-- 第十五题：找出名字中包含A字符的员工信息
SELECT * FROM EMP WHERE ENAME LIKE '%A%';

-- 第十六题：进行等值连接，查询全部员工的个人信息以及薪酬情况
SELECT * FROM EMP;

-- 第十七题：查询所有工资水平在2500以上的员工号、姓名、收入
SELECT EMPNO,ENAME,SAL AS'收入' FROM EMP WHERE SAL>2500;

-- 第十八题：查询所有员工的工号、名字、薪酬
SELECT EMPNO,ENAME,SAL AS'收入' FROM EMP;

-- 第十九题：查询所有部门员工情况
SELECT * FROM EMP ORDER BY DEPTNO;

-- 第二十题：查询所有部门所有员工的名字
SELECT DEPTNO,ENAME FROM EMP ORDER BY DEPTNO;

-- 第二十一题：返回所有部门所有员工的部门名、部门号
select e.ENAME,d.DNAME from emp e,dept d where d.DEPTNO = e.DEPTNO;

-- 第二十二题：工资水平多于smith的员工信息
-- 先查出smith的工资水平
SELECT * from emp WHERE SAL>(SELECT SAL FROM emp WHERE ENAME='smith');

-- 第二十三题：返回员工和所属经理的姓名
SELECT e1.ENAME '员工姓名',e2.ENAME '经理姓名' FROM emp e1,emp e2 WHERE e1.MGR=e2.EMPNO ;

-- 第二十四题：返回雇员的雇佣日期早于其经理雇佣日期的员工及其经理姓名
SELECT e1.ENAME '员工姓名',e2.ENAME '经理姓名' FROM emp e1,emp e2 WHERE e1.MGR=e2.EMPNO AND e1.HIREDATE<e2.HIREDATE;

-- 第二十五题：返回员工姓名及其所在部门名称
select e.ENAME,d.DNAME from emp e,dept d where d.DEPTNO = e.DEPTNO;

-- 第二十六题：返回从事clerk工作的员工姓名和所在部门名称
select e.ENAME,d.DNAME from emp e,dept d where d.DEPTNO = e.DEPTNO AND e.JOB='clerk';

-- 第二十七题：返回部门号及其本部门的最低工资
select MIN(e.SAL),d.DEPTNO from emp e,dept d where d.DEPTNO = e.DEPTNO GROUP BY e.DEPTNO;

-- 第二十八题：返回销售部sales所有员工的姓名
select e.ENAME from emp e,dept d where d.DEPTNO = e.DEPTNO AND d.DNAME='sales';

-- 第二十九题：返回工资水平多于平均工资的员工
select ENAME from emp  WHERE SAL>(select AVG(SAL) from emp);

-- 第三十题：返回与scott从事相同工作的员工
select * from emp where JOB =(SELECT JOB FROM emp WHERE ENAME='scott');

-- 第31题：返回与30部门员工工资水平相同的员工姓名与工资。
SELECT ename,sal FROM emp WHERE SAL>(SELECT MIN(SAL)FROM emp WHERE DEPTNO=30) AND SAL<(SELECT MAX(SAL)FROM emp WHERE DEPTNO=30)

-- 第32题：返回工资高于30部门所有员工工资水平的员工信息。
SELECT * FROM emp WHERE SAL>(SELECT Max(SAL)FROM emp WHERE DEPTNO=30)

-- 第33题：返回部门号、部门名、部门所在位置及其每个部门的员工总数
SELECT d.DEPTNO '部门号',d.dname '部门名称',d.loc '部门地址',COUNT(EMPNO) FROM emp e,dept d WHERE d.DEPTNO=e.DEPTNO GROUP BY d.DEPTNO

-- 第34题：返回员工的姓名、所在部门名及其工资
select e.ename '员工姓名',d.dname '部门名称',e.sal '工资' FROM emp e,dept d WHERE d.DEPTNO=e.DEPTNO

-- 第35题：返回员工的详细信息。(包括部门名)
select e.*,d.dname '部门名称'FROM emp e,dept d WHERE d.DEPTNO=e.DEPTNO

-- 第36题：返回员工工作及其从事此工作的最低工资。
SELECT e1.JOB,(SELECT MIN(SAL) FROM emp e2 WHERE e2.job=e1.job) '本部门最低工资'FROM emp e1,emp e2 WHERE e1.job=e2.job GROUP BY e1.job;

-- 第37题：计算出员工的年薪，并且以年薪排序。
SELECT ENAME '员工姓名',sal*12  '年薪' FROM emp ORDER BY '年薪'

-- 第38题：返回工资处于第四级别的员工的姓名。
SELECT ename FROM emp WHERE sal<3001 AND sal>2000

-- 第39题：返回工资为二等级的职员名字、部门所在地、和二等级的最低工资和最高工资
SELECT e.ename '员工姓名',d.loc '部门名称',(SELECT) '' FROM emp WHERE sal<3001 AND sal>2000

-- 第40题：工资等级多于smith的员工信息。
SELECT * FROM emp WHERE sal>1200

-- 第41题：查看Employees列表所有数据
SELECT * FROM emp

-- 第42题：计算Employees中的行数
SELECT count(*) FROM emp

-- 第43题：查询工作年龄最大的员工姓名以及工作年限
SELECT ename FROM emp WHERE HIREDATE=(SELECT min(HIREDATE)FROM emp)

-- 第44题：查询薪酬在3000元以上的人数
SELECT count(*) FROM emp WHERE sal>3000

-- 第45题：查询Employees表中姓林且两个字名字的员工编号以及姓名 
纳尼？是不是还没学？


-- =============================================================================

-- 练习二第1题：查询所有学员从入学到今天，一共度过了多少天
select DATEDIFF('2019-04-28',stujointime) '度过的时间天数' FROM studentinfo;

-- 练习二第2题：查询你的出生日期到现在相隔的年数
SELECT FLOOR((SELECT  DATEDIFF(NOW(),'1991-12-16'))/365);

-- 练习二第3题：查询每月2号入学的学员信息
SELECT * from studentinfo e WHERE dayofmonth(e.stujointime)=2;

-- 练习二第4题：查询周末入学的学员信息
select * from studentinfo e where dayname(e.stujointime)='Sunday';

-- 练习二第5题：查询所有学员的毕业日期，假定按每个学员入学时间1年半之后将毕业
select *,date_add(e.stujointime,interval 18 month) "毕业日期" from studentinfo e

-- 练习二第6题：查询星期四入学的学员姓名，性别，年龄，班级编号
SELECT stuname,stuage,stusex,sclassId FROM studentinfo WHERE SELECT DAYNAME(SELECT stujointime FROM studentinfo)='Thursday'

-- 练习二第7题：查询‘2007-3-10’之前入学的学员信息
SELECT * FROM studentinfo WHERE stujointime<'2007-3-10'

-- 练习二第8题：查询所有学员姓名的长度
SELECT LENGTH(StuName)/3 '名字中文字数' FROM studentinfo

-- 练习二第9题：查询身份证中第9，10位为‘89’的学员信息（要求使用字符串函数）
SELECT * FROM studentinfo WHERE SELECT SUBstring(SELECT StuCard FROM studentinfo,8,2)='89'

-- 练习二第10题：修改班主任信息，将邮箱中的‘yahoo’替换为‘accp’
还不会替换修改字段内容

-- 练习二第11题：查询所有班主任的邮箱的用户名
SELECT teacheremail FROM teacherinfo

-- 练习二第12题：查询所有班主任的邮箱的所属网站
SELECT SUBSTRING(SELECT teacheremail FROM teacherinfo,4,5) FROM teacherinfo

-- 练习二第13题：编写查询语句去掉字符串‘   爱你  要你  我  爱  你   ’中的空格
SELECT TRIM('   爱你  要你  我  爱  你   ') -- 这个只能去除首部的空格

-- 练习二第14题：计算每个学员身份证中字符‘1’出现的次数
这个不会做

-- 练习二第15题：求小于-58.9的最大整数
SELECT FLOOR(-58.9)

-- 练习二第16题：求大于78.8的最小整数
SELECT CEILING(78.8)

-- =========================================================

-- 练习3第一题：查询所有学员平均成绩(保留两位小数)
SELECT ROUND((SELECT avg(examresult) FROM studentexam),2);

-- 练习3第二题：查询所有考试的总成绩
SELECT sum(examresult) FROM studentexam;

-- 练习3第三题：查询SQL考试的最低分数
SELECT min(examresult) FROM studentexam WHERE examsubject='SQL';

-- 练习3第四题：查询Java考试成绩最高的学员姓名
SELECT stuname FROM studentinfo WHERE stuID=(SELECT EStuID FROM studentexam WHERE examresult=(SELECT max(examresult) FROM studentexam WHERE examsubject='Java'));

-- 练习3第五题：查询火云邪神考了几次试
select count(s.estuid) from studentexam s,studentinfo i where s.estuid=i.stuid and i.stuname='火云邪神'

-- 练习3第6题：查询各科目的平均成绩
SELECT avg(ExamResult) FROM studentexam GROUP BY ExamSubject

-- 练习3第7题：查询每个班级学员的最小年龄
SELECT MIN(StuAge) FROM studentinfo GROUP BY SClassID

-- 练习3第8题：查询考试不及格的人数
SELECT COUNT(ExamID) FROM studentexam WHERE ExamResult<60

-- 练习3第9题：查询各学员的总成绩，要求筛选出总成绩在140分以上的
SELECT sum(ExamResult) '总成绩' FROM studentexam WHERE '总成绩'>140 GROUP BY EStuID-- 最后没有成功

-- 练习3第10题：查询男女学员的平均年龄
SELECT avg(StuAge) FROM studentinfo GROUP BY StuSex

-- 练习3第11题：查询每门功课的平均分，要求显示平均分在80分以上的(包括80分)
SELECT avg(ExamResult) FROM studentexam GROUP BY ExamSubject HAVING avg(ExamResult)>=80

-- 练习3第12题：按班主任姓名分组，查所带班级的总成绩分（假定每个班主任只带一个班级）
SELECT SUM(ExamResult) FROM studentexam GROUP BY teachername

-- 练习3第13题：统计每个月入学学员的平均成绩
这个不会做
