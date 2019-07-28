use test1
21、
select distinct d.deptno,d.dname from dept d,emp e where d.deptno=e.deptno
22、
select * from emp where sal>(select e.sal from emp e where e.ename='smith')
23、
select e.ename "姓名",d.ename "经理姓名" from emp e,emp d where e.mgr=d.empno
24、
select e.ename "姓名",d.ename "经理姓名" from emp e,emp d where e.mgr=d.empno and e.hiredate<d.hiredate
25、
select e.ename "姓名",d.dname "部门名称" from emp e,dept d where e.deptno=d.deptno
26、
select e.ename "姓名",d.dname "部门名称" from emp e,dept d where  e.deptno=d.deptno and e.job='clerk'
27、
select e.deptno,min(e.sal) from emp e group by e.deptno 
28、
select e.ename "销售部" from emp e,dept d where e.deptno=d.deptno and d.dname='sales'
29、
select * from emp e where e.sal>(select avg(e.sal) from emp e)
30、
select * from emp e where e.job=(select job from emp e where e.ename='scott')