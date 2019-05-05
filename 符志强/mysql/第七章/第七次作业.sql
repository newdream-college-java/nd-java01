use j01;
select * from studeninfo;
select * from teacherinfo;

use test1;
select * from emp;
INSERT INTO EMP VALUES(7910,'林1','CLERK',7782,'1981-01-23',1300,NULL,10);
INSERT INTO EMP VALUES(7912,'依林','CLERK',7782,'1981-01-23',1300,NULL,10);

select * from emp;
select * from dept;
select * from salgrade;
36、返回员工工作及其从事此工作的最低工资。
select job,min(sal) from emp group by job;
37、计算出员工的年薪，并且以年薪排序。
select ename,12*sal+ifnull(comm,0) from emp order by 12*sal+ifnull(comm,0);
38、返回工资处于第四级别的员工的姓名。
select ename,sal from emp e,salgrade s where e.sal>=s.losal and e.sal<=s.hisal and s.grade = 4;
39、返回工资为二等级的职员名字、部门所在地、和二等级的最低工资和最高工资
select ename,loc,sal,losal,hisal from  emp e,dept d,salgrade s where e.sal>=s.losal and e.sal<=s.hisal and s.grade = 2 and e.deptno=d.deptno ;
40、工资等级多于smith的员工信息。
select * from emp e,emp s,salgrade d where e.sal>s.sal and  s.ename='smith' and d.losal <= e.sal and d.hisal >= e.sal and grade!=1;

41、查看Employees列表所有数据
select * from employees
42、计算Employees中的行数
SELECT COUNT(*) FROM Employees
43、查询工作年龄最大的员工姓名以及工作年限
SELECT eName, min(hiredate)FROM Employees
44、查询薪酬在3000元以上的人数
SELECT COUNT(*) AS '收入大于3000的人数' FROM emp WHERE sal+ifnull(comm,0)> 3000
45、查询Employees表中姓林且两个字名字的员工编号以及姓名
select empno,ename from emp where ename like '林_';
46、查询Employee表中名字中有林字的员工的编号及姓名
select empno,ename from emp where ename like '%林%';
47、查询工资在2000到3000范围的员工编号以及收入
select empno,sal+ifnull(comm,0) from emp where sal+ifnull(comm,0)>2000 and sal+ifnull(comm,0)<3000;
48、查找财务部的员工号以及员工姓名
select empno,ename,deptno from emp where deptno=(select deptno from dept where dname='ACCOUNTING');
49、查找财务部以及研发部以外的员工号以及员工姓名
select empno,ename,deptno from emp where deptno in (select deptno from dept where DNAME not in('ACCOUNTING','RESEARCH'));

use j01;
select * from studeninfo;
select * from teacherinfo;
select * from studentexam;
9、查询所有班主任的邮箱的用户名
select left(teacheremail,3) '班主任的邮箱的用户名' from teacherinfo;
10、查询所有班主任的邮箱的所属网站
提示：如果邮箱为qtz@yahoo.com，用户名即qtz，所属网站即yahoo。可先查找出‘@’和‘.’的下标，再截取
select substring(teacheremail,5,5) '班主任的邮箱的所属网站' from teacherinfo;
11、编写查询语句去掉字符串‘   爱你  要你  我  爱  你   ’中的空格
select replace('   爱你  要你  我  爱  你   ',' ','');
12、计算每个学员身份证中字符‘1’出现的次数
select length(Stugard)-length(replace(Stugard,'1','')) from studeninfo;
13、求小于-58.9的最大整数
select ceiling(-58.9);
14、求大于78.8的最小整数
select floor(78.8);
15、求64除以7的余数
select mod(64,7);
16、查询所有学员入学时间，要求显示格式为‘2007年03月02日’
select stuname,DATE_FORMAT(StuJoinTime,'%Y年%m月%d日') as '入学时间' from studeninfo;
17、查询当前时间，要求显示格式为‘22时57:37’
select DATE_FORMAT(now(),'%H时 %i:%s') as '当前时间';

18、查询2007年入学的学员信息
select * from studeninfo where left(stujointime,4)=2007;

use j01;
select * from classinfo;
select * from studeninfo;
select * from teacherinfo;
select * from studentexam;
11、查询每门功课的平均分，要求显示平均分在80分以上的(包括80分)
select examsubject,avg(examresult) '平均分' from studentexam group by  examsubject having avg(examresult)>=80;
12、按班主任姓名分组，查所带班级的总成绩分（假定每个班主任只带一个班级）
 (提示：4表连接)
select teachername,sum(examresult) from studeninfo s,classinfo c,studentexam f,teacherinfo t
where s.sclassid=c.classid and c.classcherid=t.teacherid and s.stuid=f.estuid group by t.teacherid;
13.统计每个月入学学员的平均成绩
select monthname(stujointime) '月',avg(examresult)'平均成绩' from studeninfo,studentexam group by  estuid;