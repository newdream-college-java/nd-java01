--1、查询出雇员表中所有员工的姓名；雇佣日期；和工资调整日期（工作6个月后的第一个星期一）。其格式要求是类似于：“1981-09-23”。
select ename,hiredate,NEXT_DAY((add_months(hiredate,6)), 'Monday') as "6个月后星期一" from emp dual;
--2、查出每个员工的名字（ename）、雇佣日期到现在的日期间隔的月数（要求为整数），该列命名为MONTHS_WORKED，并以该列的降序排序
select ename,months_between(sysdate,hiredate) from emp dual;
--3、写一个查询，查询出雇员的姓名，以及姓名的长度。要求其姓名的第一个字母为大写，其它的字母为小写。
select empno,Initcap(ename),LENGTH(ename) from emp;
--4、写一个查询来查询出雇员的名字，部门号，部门名称。
select e.ename,d.DEPTNO,d.dname from emp e,dept d where e.DEPTNO=d.DEPTNO;
--5、查出每个雇员的编号、姓名、其管理者的编号和姓名。各个列分别命名为：Emp#,EmpName,EmpM#,EmpName.
select e.empno  "Emp#",e.ename  "EmpName",E1.EMPNO  "EmpM#",E1.ename  "EmpName" from emp e,emp e1 where e.MGr=e1.empno;
--6、修改第5题的查询，使得没有管理者的员工的信息也可以显示出来。
select e.empno  "Emp#",e.ename  "EmpName",E1.EMPNO  "EmpM#",E1.ename  "EmpName" from emp e left join emp e1 on e.MGr=e1.empno;
--7、查出所有员工的最高、最低、平均的工资,以及工资的总和，列名分别是maxSal,minSal,avgSal,sumSal。这些数值都用四舍五入进行处理。
select ROUND(max(sal),0) "maxSal",round(min(sal),0)  "minSal",round(avg(sal),0) "avgSal",round(sum(sal),0) "sumSal" from emp;
--8、按照工作类型分类，查出每种工作的名称和其员工的最高、最低、平均的工资、工资的总和，这些数值都用四舍五入进行处理。
select  job,round(MAX(sal),0) "maxSa",round(min(sal),0)"minSal",round(avg(sal),0) "avgSal",round(sum(sal),0) "sumSal" FROM emp GROUP BY job;
--9、查出每种工作的名称和从事该工作的人数。
select job,count(job) from emp group by job;
--10、查出不当领导的职工姓名。
SELECT e.ename from emp e where e.empno not in(SELECT MGR from emp where MGR is not null);
--11、按照工作分类，查出最高工资和最低工资的差额,该列命名为difference。
select job,(max(sal)-min(sal)) "difference" from emp group by job;
--12、查出与BLACK在同一个部门的所有雇员的姓名和雇佣日期。
select ename,HIREDATE from emp where deptno=(select DEPTNO from emp where ename='BLAKE');
--13、查出工资高于平均工资的所有员工的编号和姓名，其结果按照工资的降序排列。
select empno,ename from emp where sal>(select avg(sal) from emp) ORDER BY sal desc;
--14、查出所有名字中包含一个"T"的员工所在的部门号，和这些部门所包含的所有员工编号和姓名
select empno,ename from emp where deptno in(select deptno from emp where ename like '%T%');
--15、查出所有工作在Dallas的员工的姓名、部门编号、工作
SELECT ename,deptno,job from emp where DEPTNO=(select deptno from dept where loc='DALLAS');
--16、查出由King直接管辖的所有员工的姓名和工资
SELECT ename,sal from emp where MGR=(SELECT EMPNO from emp where ename='KING');
--17、查询销售部（Sales)的编号，所有员工的名字和工作
SELECT deptno,ename,job FROM emp where DEPTNO=(SELECT DEPTNO from DEPT where dname='SALES');
--18、写门号、薪水相匹配的所有雇员的名字、部门号。
SELECT E1.ename,d.dname,e1.sal from emp e1,emp e2 ,dept d where E1.DEPTNO=d.DEPTNO and e1.sal=E2.sal and E1.ename!=E2.ENAME;
--19、查询出与在Dallas的任何一个雇员的薪水和佣金相匹配的所有雇员的姓名、部门名称和工资。
SELECT  s.ename,s.sal from (SELECT * from emp where DEPTNO!=(SELECT DEPTNO from DEPT where loc='DALLAS')) s where (s.sal+nvl(s.COMM,0)) not in (SELECT DISTINCT (sal+nvl(COMM,0)) from EMP where DEPTNO=(SELECT DEPTNO from DEPT where loc='DALLAS'));
select e
select (e.sal+nvl(e.comm,0)) as sum from emp e,dept d where d.DEPTNO=e.DEPTNO and d.loc='DALLAS'
--20、查询出所有工资和佣金与Scott相同的雇员的姓名、雇佣日期和工资。注意：结果中不包括Scott
SELECT ename,hiredate,sal from emp where (sal+nvl(COMM,0))=(SELECT sal+nvl(COMM,0) from emp where ename='SCOTT');



select decode(sign(sal-1000),-1,'工资过低',0,'工资正常',
1,decode(sign(sal-3000),-1,'工资正常',0,'工资过高',1,'工资过高')) from emp;
select to_char(13456789123,'999,999,999,999') from dual;
select to_char(45,'L99.99') from dual;
select d.dname,count(*) from emp e,DEPT d where e.DEPTNO=d.DEPTNO GROUP BY d.dname;