select * from emp;
select * from dept;
select deptno from dept where loc='DALLAS'
select sal from emp where deptno=(select deptno from dept where loc='DALLAS')
select comm from emp where deptno=(select deptno from dept where loc='DALLAS')


select Hiredate from emp;
select add_months(SYSDATE,6)from dual;
select next_day((add_months(Hiredate,6)),'Sunday')from emp
--
select TO_char(45,'L99.99')from dual;
--
select ename,nvl(comm,0)from emp
--
select dname from dept group by dname;
select count(*),e.deptno from emp e group by e.deptno
--查询出不同部门的人数和名称
--方法一
select d.dname,d.deptno,s.s from dept d,(select count(*) s,e.deptno from emp e group by e.deptno) s where d.DEPTNO=s.deptno

--查询出不同部门的人数和名称
--方法二
select d.dname,count(*) from emp e,dept d where e.DEPTNO=d.DEPTNO group by d.dname
--e,p
select nullif(empno,mgr)from emp
select decode(sign(sal-1000),-1,'工资偏低',1,'工资正常') from emp;
select EMP.*,decode(sign(sal-3000),1,'工资偏高',0,'工资偏高',-1,decode(sign(sal-1000),-1,'工资偏低',1,'工资正常',0,'工资正常'))from emp
--2.查出每个员工的名字（ename）、雇佣日期到现在的日期间隔的月数（要求为整数），该列命名为MONTHS_WORKED，并以该列的降序排序
--montsh_between去相差月数，ceil()去整数
select ename,ceil(months_between(sysdate,hiredate)) as MONTHS_WORKED from emp
--3.写一个查询，查询出雇员的姓名，以及姓名的长度。要求其姓名的第一个字母为大写，其它的字母为小写。
select initcap(ename),length(ename) from emp
--4.写一个查询来查询出雇员的名字，部门号，部门名称。
select e.ename,e.deptno,d.dname from emp e,dept d where e.deptno=d.deptno
--5.查出每个雇员的编号、姓名、其管理者的编号和姓名。各个列分别命名为：Emp#,EmpName,EmpM#,EmpName.
select deptno as Emp#,ename as EmpName,
select  e.empno as Emp#,e.ename as EmpName,p.ename as EmpName,p.empno as EmpM# from emp e ,emp p where e.mgr=p.empno 
--6.修改第5题的查询，使得没有管理者的员工的信息也可以显示出来。
--使用left join  --on 去查询
select  e.empno  as Emp#,e.ename as EmpName,p.ename as EmpName,p.empno as EmpM# from emp e left join emp p on e.mgr=p.empno 

--7.查出所有员工的最高、最低、平均的工资,以及工资的总和，列名分别是maxSal,minSal,avgSal,sumSal。这些数值都用四舍五入进行处理
select round(max(sal))as maxSAL,round(min(sal)) as minSAL,round(avg(sal)) as avgSAL,round(sum(sal)) as sumSAL from emp ;
--8.按照工作类型分类，查出每种工作的名称和其员工的最高、最低、平均的工资、工资的总和，这些数值都用四舍五入进行处理。
select job,round(max(sal))as maxSAL,round(min(sal)) as minSAL,round(avg(sal)) as avgSAL,round(sum(sal)) as sumSAL from emp group by job;
--9.查出每种工作的名称和从事该工作的人数
select job,count(*) from emp group by job;
--10.查出不当领导的职工姓名
--用到not in
select ename from emp where ename not in(select distinct(p.ename) from emp e ,emp p where e.mgr=p.empno)
--11.按照工作分类，查出最高工资和最低工资的差额,该列命名为difference。
select job,max(sal)-min(sal) as difference from emp group by job;
--12.查出与BLACK在同一个部门的所有雇员的姓名和雇佣日期
select deptno from emp where ename='BLAKE'
select ename,hiredate from emp where deptno=(select deptno from emp where ename='BLAKE')
--13.查出工资高于平均工资的所有员工的编号和姓名，其结果按照工资的降序排列
select avg(sal) from emp
select sal,empno,ename from emp  where sal>(select avg(sal) from emp) order by sal desc
--14查出所有名字中包含一个"T"的员工所在的部门号，和这些部门所包含的所有员工编号和姓名
select ename from emp where ename like '%T%';
select deptno from emp where ename in(select ename from emp where ename like '%T%')
select deptno,empno,ename from emp where deptno in(select deptno from emp where ename in(select ename from emp where ename like '%T%'))

--15.查出所有工作在SALESMAN的员工的姓名、部门编号、工作
select ENAME,DEPTNO from emp where job='SALESMAN'
--16.查出由King直接管辖的所有员工的姓名和工资
select e.ename,e.sal from emp e,emp p where p.EMPNO=e.mgr and p.ename='KING'
--17.查询销售部（Sales)的编号，所有员工的名字和工作
select distinct(deptno) from emp where job='SALESMAN'
select ename,job from emp where deptno=(select distinct(deptno) from emp where job='SALESMAN')
--18.写部门号、薪水相匹配的所有雇员的名字、部门号。
--嵌套表
--相关子查询：外表起别名传递给子查询。
select ename,job from emp e where(select count(1) from emp where sal=e.sal and deptno=e.deptno)>1
select ename,job from emp e where(select count(1) from emp where sal=e.sal and deptno=e.deptno)>1
--19.查询出与在King的任何一个雇员的薪水和佣金相匹配的所有雇员的姓名、部门名称和工资。
select e.comm from emp e,emp p where p.EMPNO=e.mgr and p.ename='FORD'
--
select ename,sal,dname from emp,dept 
where sal in(select e.sal from emp e,emp p where p.EMPNO=e.mgr and p.ename='KING') 
and EMP.DEPTNO=DEPT.DEPTNO
and ename not in(select e.ename from emp e,emp p where p.EMPNO=e.mgr and p.ename='KING')

--有2个想匹配的时候
select e.sal,e.ename,dname from emp e ,dept
where(select count(1) from emp 
where sal in (select e.sal from emp e,emp p where p.EMPNO=e.mgr and p.ename='KING')
and comm in (select e.comm from emp e,emp p where p.EMPNO=e.mgr and p.ename='KING'
))>1
and e.DEPTNO=DEPT.DEPTNO


--19.正确答案
select e.sal,e.ename,dname from emp e ,dept
where(select count(1) from emp 
where sal in (select sal from emp where deptno=(select deptno from dept where loc='DALLAS'))
and comm in (select comm from emp where deptno=(select deptno from dept where loc='DALLAS')
))>1
and e.DEPTNO=DEPT.DEPTNO






--20查询出所有工资和佣金与WARD相同的雇员的姓名、雇佣日期和工资。注意：结果中不包括Scott
select * from emp e where (select count(1) from emp where sal=e.sal)>1
select * from emp e,emp p where e.sal=p.sal and e.deptno=p.deptno 
select * from emp where sal=(select sal from emp where ename='WARD') and ename!='WARD'
select * from emp e where e.sal=1250 
select ename,deptno from emp where sal
select avg(comm) from emp;
select avg(sal)from emp
select comm from emp
select * from emp