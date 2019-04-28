use test1;
select * from dept;
select * from emp;
21、返回拥有员工的部门名、部门号
select  e.deptno,d.DNAME from emp e,dept d where e.DEPTNO=d.deptno;
22、工资水平多于smith的员工信息
select  * from emp where sal>(select sal from emp where ename='smith');
23、返回员工和所属经理的姓名
select  e1.ename '员工姓名',e2.ename '经理姓名' from emp e1,emp e2 where e1.mgr=e2.empno;
24、返回雇员的雇员日期早于其经理共用日期的员工及其经理姓名
select  e1.ename '员工姓名',e2.ename '经理姓名' where e1.mgr=e2.empno and e1.HIREDATE>e2.HIREDATE;
25、返回员工姓名及其所在的部门名称
select  e.ename '员工姓名',d.dname '部门名称' from emp e,dept d where e.DEPTNO=d.deptno;
26、返回从事clerk工作的员工姓名和所在部门名称
select e.ename '员工姓名',d.dname '部门名称' from emp e,dept d where e.job='clerk' and e.DEPTNO=d.DEPTNO;
27、返回部门号及其部门对的最低工资
select deptno,min(sal) from emp GROUP BY deptno;
28、返回销售部门（sales）所有员工的姓名
select e.ename from emp e,dept d where d.dname='sales' and d.deptno=e.deptno;
29、返回工资水平多与平均工资的员工
select ename from emp where sal>(select avg(sal) from emp); 
30、返回与SCOTT从事相同工作的员工
select e2.ename from emp e1,emp e2 where e1.ename='SCOTT' and e1.job=e2.job;