use test1;
select * from emp;
select * from dept;
select * from salgrade;
#31.	返回与30部门员工工资水平相同的员工姓名与工资。
SELECT ename,sal FROM emp WHERE SAL >(SELECT  MIN(SAL)FROM emp WHERE DEPTNO = 30) AND SAL <(SELECT  MAX(SAL)FROM emp WHERE DEPTNO = 30)
#32.	返回工资高于30部门所有员工工资水平的员工信息。
select * from emp where sal>(select max(sal) from emp where deptno=30);
#33.	返回部门号、部门名、部门所在位置及其每个部门的员工总数
select  e.deptno,d.dname '部门名',d.loc '部门所在位置',count(e.deptno) from emp e,dept d where e.deptno=d.deptno GROUP BY d.deptno;
#34.	返回员工的姓名、所在部门名及其工资
select ename '姓名',deptno '部门',sal '工资' from emp;
#35.	返回员工的详细信息。(包括部门名)
select e.*,d.dname from emp e,dept d where e.deptno=d.deptno;
#36.	返回员工工作及其从事此工作的最低工资。
SELECT e.JOB "工作",MIN(e.SAL) "最低工资" FROM emp e GROUP BY e.JOB;
#37.	计算出员工的年薪，并且以年薪排序。
select ename,12*sal+ifnull(comm,0) from emp;
#38.	返回工资处于第四级别的员工的姓名。
select e.ename from emp e,salgrade s where e.SAL BETWEEN s.LOSAL AND s.HISAL AND s.GRADE=4;
#39.	返回工资为二等级的职员名字、部门所在地、和二等级的最低工资和最高工资
SELECT e.ENAME, d.LOC, s.LOSAL,s.HISAL 
FROM emp e ,(SELECT LOSAL,HISAL FROM salgrade WHERE GRADE=2) s,dept d 
WHERE e.SAL BETWEEN s.LOSAL AND s.HISAL AND e.DEPTNO=d.DEPTNO;
#40.	工资等级多于smith的员工信息。
SELECT e.* FROM emp e,salgrade s 
WHERE e.SAL BETWEEN s.LOSAL AND s.HISAL 
AND s.GRADE>(SELECT s.GRADE FROM emp e,salgrade s WHERE e.SAL BETWEEN s.LOSAL AND s.HISAL AND e.ENAME='smith'); 
#41.	查看Employees列表所有数据
select * from emp;
#42.	计算Employees中的行数
select count(*) from emp;
#43.	查询工作年龄最大的员工姓名以及工作年限
select ename '姓名',max(DATEDIFF(NOW(),HIREDATE)/365) '工作时间' from emp;
#44.	查询薪酬在3000元以上的人数
select count(ename) from emp where sal>3000;
#45.	查询Employees表中姓林且两个字名字的员工编号以及姓名
select empno '员工编号',ename '员工姓名' from emp WHERE ENAME LIKE '林-';
#46.	查询Employee表中名字中有林字的员工的编号及姓名
select empno '员工编号',ename '员工姓名' from emp WHERE ENAME LIKE '%林%';
#47.	查询工资在2000到3000范围的员工编号以及收入 
SELECT ENAME,EMPNO,SAL FROM emp WHERE SAL >2000 AND SAL<3000;
#48 查找财务部的员工号以及员工姓名
SELECT e.ENAME,e.EMPNO FROM emp e WHERE e.DEPTNO IN(SELECT DEPTNO FROM dept WHERE DNAME ='ACCOUNTING');
#49 查找财务部以及研发部以外的员工号以及员工姓名
SELECT e.ENAME,e.EMPNO FROM emp e WHERE e.DEPTNO NOT IN(SELECT DEPTNO FROM dept WHERE DNAME IN ('ACCOUNTING','RESEARCH'));
use test;
select * from 
use test;
##4、查询星期四入学的学员姓名，性别，年龄，班级编号   =5?
select * from studentinfo where DAYOFWEEK(StuJoinTime)=5;
##查询‘2007-3-10’之前入学的学员信息
select * from studentinfo where StuJoinTime<'2007-03-10';
##查询所有学员姓名的长度
select length(stuname) from studentinfo GROUP BY stuname;
#7、查询身份证中第9，10位为‘89’的学员信息（要求使用字符串函数）
select * from studentinfo where substring(stucard,9,2)=89;
#8、修改班主任信息，将邮箱中的‘yahoo’替换为‘accp’
select REPLACE(teacherEmail,'yahoo','accp') from teacherinfo GROUP BY teacherid;
#9、查询所有班主任的邮箱的用户名
select teacherEmail from teacherinfo;
#10、查询所有班主任的邮箱的所属网站
select substring(teacherEmail,'5','5') from teacherinfo;
#11、编写查询语句去掉字符串‘   爱你  要你  我  爱  你   ’中的空格
select REPLACE('   爱你  要你  我  爱  你  ',' ','');
#12、计算每个学员身份证中字符‘1’出现的次数
select length(stucard)-length(REPLACE(stucard,'1','')) from studentinfo GROUP BY stuname;
#13、求小于-58.9的最大整数
select floor(-58.9);
#14、求大于78.8的最小整数
select CEILING(78.8);
#15、求64除以7的余数
select mod(64,7);
#16、查询所有学员入学时间，要求显示格式为‘2007年03月02日’
select DATE_FORMAT(stujointime,'%Y年%m月%d日') from studentinfo;
#17、查询当前时间，要求显示格式为‘22时57:37’
select DATE_FORMAT(now(),'%H时 %i:%s');
#18、查询2007年入学的学员信息
select * from studentinfo where YEAR(StuJoinTime)='2007';
select * from studentexam;
select * from classinfo;
select * from studentinfo;
select * from teacherinfo;
##6、查询各科目的平均成绩
select ExamSubject,avg(ExamResult) from studentexam group by ExamSubject;
##7、查询每个班级学员的最小年龄
select sclassid,min(stuage) from studentinfo GROUP BY SclassID;
##8、查询考试不及格的人数
select COUNT(estuid) from studentexam where ExamResult<60;
##9、查询各学员的总成绩，要求筛选出总成绩在140分以上的
select stuname,sum(ExamResult) from (select * from studentexam a,studentinfo b where a.estuid=b.StuID) as a GROUP BY stuname HAVING sum(ExamResult)>140;
##10、查询男女学员的平均年龄
select stusex,avg(stuage) from studentinfo GROUP BY stusex;
##11、查询每门功课的平均分，要求显示平均分在80分以上的(包括80分)
select ExamSubject,avg(ExamResult) from studentexam GROUP BY ExamSubject having avg(ExamResult)>=80;
##12、按班主任姓名分组，查所带班级的总成绩分（假定每个班主任只带一个班级）
select teachername,sum(examresult) from (select * from(select * from (select * from teacherinfo a,classinfo b where a.teacherid=b.cteacherid) as a,studentinfo b where a.classint=b.sclassid)as a,studentexam b where a.stuid=b.estuid) as a GROUP BY teachername;
##13.统计每个月入学学员的平均成绩
select avg(examresult) from (select * from studentexam a,studentinfo b where a.estuid=b.StuID) as a GROUP BY month(stujointime);

