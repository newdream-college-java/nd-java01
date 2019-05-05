select * from studentexam;
select * from studentinfo;
select * from classinfo;
select * from teacherinfo;
-- 查询所有学生从入学到今天一共度过了多少天
select stuname as '学员姓名',DATEDIFF(now(),stujointime) as '从入学到今天的天数' from studentinfo;
-- 查询你的出生日期到现在相隔的年数
select PERIOD_DIFF(DATE_FORMAT(now(),"%Y%m"),'199611')/12 as '出生日期到现在相隔的年数';
-- 查询每月2月入学的学员信息
select * from studentinfo where MONTH(StuJoinTime)=2;
-- 查询周末入学的学员
select * from studentinfo where DAYOFWEEK(StuJoinTime)=7;
-- 查询所有学员的毕业日期，假定按每个学员入学时间1年半之后将毕业。
select StuName as '学员姓名',DATE_ADD(StuJoinTime,INTERVAL 18 MONTH) as '毕业日期' from studentinfo;
-- 查询星期四入学的学员姓名，性别，年龄，班级编号   =5?
select stuname,stuname,stuage,sclassid from studentinfo where DAYOFWEEK(StuJoinTime)=4;
-- 查询‘2007-3-10’之前入学的学员信息
select * from studentinfo where StuJoinTime<'2007-3-10';
-- 查询所有学员姓名的长度
select stuname,CHARACTER_LENGTH(stuname) from studentinfo;
-- 查询身份证中第9，10位为‘89’的学员信息（要求使用字符串函数）
select * from studentinfo where SUBSTRING(StuCard,9,2)='89';
-- 修改班主任信息，将邮箱中的‘yahoo’替换为‘accp’
select replace(teacheremail,'yahoo','accp') from teacherinfo;
-- 查询所有班主任的邮箱的用户名
select SUBSTRING_INDEX(teacheremail,"@",1) as '班主任邮箱的用户名' from teacherinfo;
-- 查询所有班主任的邮箱的所属网站
-- 提示：如果邮箱为qtz@yahoo.com，用户名即qtz，所属网站即yahoo。可先查找出‘@’和‘.’的下标，再截取
select SUBSTRING_INDEX('qtz@yahoo.com',"@",1),SUBSTRING_INDEX('qtz@yahoo.com',"@",-1);
-- 编写查询语句去掉字符串‘   爱你  要你  我  爱  你   ’中的空格
select replace('   爱你  要你  我  爱  你   ',' ','');
-- 计算每个学员身份证中字符‘1’出现的次数
select (CHAR_LENGTH(StuCard)-CHAR_LENGTH(REPLACE(StuCard,'1',''))) as '身份证中字符1出现的次数' from studentinfo;
-- 求小于-58.9的最大整数
select FLOOR(-58.9);
-- 求大于78.8的最小整数
select CEIL(78.8);
select CEILING(78.8);
-- 求64除以7的余数
select MOD(64,7);
-- 查询所有学员入学时间，要求显示格式为‘2007年03月02日’
select stuname,DATE_FORMAT(StuJoinTime,'%Y年%m月%d日') as '入学时间' from studentinfo;
-- 查询当前时间，要求显示格式为‘22时 57:37’
select DATE_FORMAT(now(),'%H时 %i:%s') as '当前时间';
-- 查询2007年入学的学员信息
select * from studentinfo where YEAR(StuJoinTime)='2007';
-- 查询所有学生的平均年龄
select floor(avg(stuage)) as '所有学生的平均年龄' from studentinfo;
-- 查询所有考试的总成绩
select a.StuName,sum(a.ExamResult) as '所有考试总成绩' from 
(select studentinfo.StuName,studentexam.ExamResult from studentinfo,studentexam where studentinfo.StuID=studentexam.EStuID) 
as a group by a.StuName;
-- 查询SQL考试的最低分数
select min(examresult) as 'SQL考试最低分数' from studentexam where ExamSubject='SQL';
-- 查询java考试成绩最高的学生姓名
select a.stuname as '学生姓名',max(a.examresult) as 'java最高成绩' from 
(select * from studentinfo,studentexam where studentinfo.StuID=studentexam.EStuID and studentexam.ExamSubject='java') as a;
-- 查询学员‘火云邪神’一共参加了几次考试
select stuname as '学生姓名',count(*) as '参加考试次数' from 
(select * from studentinfo,studentexam where studentinfo.StuID=studentexam.EStuID and studentinfo.StuName='火云邪神') as a;
-- 查询各科目的平均成绩
select examsubject as '考试科目',floor(avg(examresult)) as '平均成绩' from studentexam group by ExamSubject;
-- 查询每个班级学员的最小年龄
select stuname,min(stuage),SClassID from studentinfo group by SClassID;
-- 查询考试不及格的人数
select count(*) as '不及格人数' from studentexam where ExamResult<60;
-- 查询各学员的总成绩，要求筛选出总成绩在140分以上的
select stuname,sum(examresult) from	(select * from studentexam,studentinfo where studentexam.estuid=studentinfo.stuid)  as a group by estuid 
having (sum(ExamResult)>140);
-- 查询每门功课的平均分，要求平均分在80分以上的（包括80分）
select Examsubject,avg(ExamResult) from studentexam group by Examsubject having avg(ExamResult)>80;
-- 查询男女学员的平均年龄
select *,floor(avg(stuage)) as "平均年龄" from studentinfo group by stusex;
-- 按班主任姓名分组，查所带班级的总成绩分（假定每个班主任只带一个班）（提示4表连接）
select teacherName,sum(examresult) from (select * from studentexam,(select * from studentinfo,(select * from teacherinfo,classinfo where teacherinfo.teacherid=classinfo.CTeacherID) as a 
where studentinfo.SClassID=a.classid) as b where studentexam.EStuID=b.stuid) as c group by teachername;
-- 统计每个月入学学员的平均成绩
select sum(examresult),avg(examresult) from (select * from studentinfo,studentexam where studentinfo.stuid=studentexam.EStuID) 
as a group by month(stujointime);




-- mysql部门员工sql练习
use company;
select * from emp;
select * from dept;
select * from salgrade;
-- 查找部门30中员工的详细信息
select * from emp where deptno=30;
-- 找出从事clerk工作的员工的编号、姓名、部门号
select empno as '编号',ename as '姓名',deptno as '部门号' from emp where job='clerk';
-- 检索出奖金多于基本工资60%的员工信息
select * from emp where comm>sal*0.6;
-- 找出10部门的经理、20部门职员的员工信息
select * from emp where (job='clerk' and deptno=20) or (job='manager' and deptno=10);
-- 找出10部门的经理、20部门的职员或者既不是经理也不是员工但是工资高于2000
select * from emp where (job='manager' and deptno=10) or (job='clerk' and deptno=20) 
or(job!='manager' and job!='clerk' and sal>2000);
-- 找出获得奖金的员工的工作
select ename as '员工姓名',job as '员工工作' from emp where comm is not null and comm!=0;
-- 找出奖金少于100或者没有获得奖金的员工的信息
select * from emp where comm<100 or comm is null or comm=0;
-- 找出姓名以A、B、S开始的员工信息
select * from emp where ename rlike '^[ABS]{1}';
-- 找出名字长度为6个字符的员工信息
select * from emp where CHAR_LENGTH(ename)=6;
-- 找出名字中不包含R字符的员工信息
select * from emp where ename not like '%R%';
-- 返回员工的详细信息并按名字排序
select * from emp order by ename;
-- 返回员工信息并按工作降序工资升序排列
select * from emp order by job desc,sal asc;
-- 计算员工的日薪（按30天）
select ename as '员工名字',sal/30 as '日薪' from emp;
-- 找出姓名中包含A的员工信息
select * from emp where ename like '%A%';
-- 进行等值连接，查询全部员工的个人信息以及薪酬情况
SELECT * FROM EMP;

-- 查询所有工资水平在2500以上的员工号、姓名、收入
SELECT EMPNO,ENAME,SAL AS'收入' FROM EMP WHERE SAL>2500;

-- 查询所有员工的工号、名字、薪酬
SELECT EMPNO,ENAME,SAL AS'收入' FROM EMP;

-- 查询所有部门员工情况
SELECT * FROM EMP ORDER BY DEPTNO;

-- 查询所有部门所有员工的名字
SELECT DEPTNO,ENAME FROM EMP ORDER BY DEPTNO;

-- 返回所有部门所有员工的部门名、部门号
select e.ENAME,d.DNAME from emp e,dept d where d.DEPTNO = e.DEPTNO;

-- 工资水平多于smith的员工信息
-- 先查出smith的工资水平
SELECT * from emp WHERE SAL>(SELECT SAL FROM emp WHERE ENAME='smith');

-- 返回员工和所属经理的姓名
SELECT e1.ENAME '员工姓名',e2.ENAME '经理姓名' FROM emp e1,emp e2 WHERE e1.MGR=e2.EMPNO ;

-- 返回雇员的雇佣日期早于其经理雇佣日期的员工及其经理姓名
SELECT e1.ENAME '员工姓名',e2.ENAME '经理姓名' FROM emp e1,emp e2 WHERE e1.MGR=e2.EMPNO AND e1.HIREDATE<e2.HIREDATE;

-- 返回员工姓名及其所在部门名称
select e.ENAME,d.DNAME from emp e,dept d where d.DEPTNO = e.DEPTNO;

-- 返回从事clerk工作的员工姓名和所在部门名称
select e.ENAME,d.DNAME from emp e,dept d where d.DEPTNO = e.DEPTNO AND e.JOB='clerk';

-- 返回部门号及其本部门的最低工资
select MIN(e.SAL),d.DEPTNO from emp e,dept d where d.DEPTNO = e.DEPTNO GROUP BY e.DEPTNO;

-- 返回销售部sales所有员工的姓名
select e.ENAME from emp e,dept d where d.DEPTNO = e.DEPTNO AND d.DNAME='sales';

-- 返回工资水平多于平均工资的员工
select ENAME from emp  WHERE SAL>(select AVG(SAL) from emp);

-- 返回与scott从事相同工作的员工
select * from emp where JOB =(SELECT JOB FROM emp WHERE ENAME='scott');

-- 返回与30部门员工工资水平相同的员工姓名与工资。
SELECT ename,sal FROM emp WHERE SAL>(SELECT MIN(SAL)FROM emp WHERE DEPTNO=30) AND SAL<(SELECT MAX(SAL)FROM emp WHERE DEPTNO=30)

-- 返回工资高于30部门所有员工工资水平的员工信息。
SELECT * FROM emp WHERE SAL>(SELECT Max(SAL)FROM emp WHERE DEPTNO=30)

-- 返回部门号、部门名、部门所在位置及其每个部门的员工总数
SELECT d.DEPTNO '部门号',d.dname '部门名称',d.loc '部门地址',COUNT(EMPNO) FROM emp e,dept d WHERE d.DEPTNO=e.DEPTNO GROUP BY d.DEPTNO

-- 返回员工的姓名、所在部门名及其工资
select e.ename '员工姓名',d.dname '部门名称',e.sal '工资' FROM emp e,dept d WHERE d.DEPTNO=e.DEPTNO

-- 返回员工的详细信息。(包括部门名)
select e.*,d.dname '部门名称'FROM emp e,dept d WHERE d.DEPTNO=e.DEPTNO

-- 返回员工工作及其从事此工作的最低工资。
SELECT e1.JOB,(SELECT MIN(SAL) FROM emp e2 WHERE e2.job=e1.job) '本部门最低工资'FROM emp e1,emp e2 WHERE e1.job=e2.job GROUP BY e1.job;

-- 计算出员工的年薪，并且以年薪排序。
SELECT ENAME '员工姓名',(sal+IFNULL(comm,0))*12  '年薪' FROM emp ORDER BY '年薪'

-- 返回工资处于第四级别的员工的姓名。
SELECT ename FROM emp WHERE sal<3001 AND sal>2000

-- 返回工资为二等级的职员名字、部门所在地、和二等级的最低工资和最高工资
SELECT e.ename '员工姓名',d.loc '部门名称',(SELECT) '' FROM emp WHERE sal<3001 AND sal>2000

-- 工资等级多于smith的员工信息。
SELECT * FROM emp WHERE sal>1200

-- 查看Employees列表所有数据
SELECT * FROM emp

-- 计算Employees中的行数
SELECT count(*) FROM emp

-- 查询工作年龄最大的员工姓名以及工作年限
SELECT ename FROM emp WHERE HIREDATE=(SELECT min(HIREDATE)FROM emp)

-- 第44题：查询薪酬在3000元以上的人数
SELECT count(*) FROM emp WHERE sal>3000

-- 查询Employees表中姓林且两个字名字的员工编号以及姓名 
select empno,ename where ename like '林_';

-- 查询Employee表中名字中有林字的员工的编号及姓名
select empno,ename where ename like '%林%';

-- 查询工资在2000到3000范围的员工编号以及收入
SELECT empno '员工编号',sal+ifnull(comm,0) '收入' from emp WHERE sal>2000 AND sal<3000

-- 查找财务部的员工号以及员工姓名 
SELECT empno '员工编号',ename '员工姓名' FROM emp WHERE deptno=10

-- 查找财务部以及研发部以外的员工号以及员工姓名
SELECT empno '员工编号',ename '员工姓名' FROM emp WHERE deptno!=10 AND deptno!=20
