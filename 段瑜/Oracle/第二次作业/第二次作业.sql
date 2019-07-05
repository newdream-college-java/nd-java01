--1、	查询出每个员工的编号，姓名，职位
select empno,ename,job from emp;
--2、	查询每个员工的岗位名称
select job from emp;
--3、	计算出每个员工一年的基本工资，同时显示出姓名和编号
select EMPNO,ename,sal*12 from emp;
--4、	计算出每个员工的年薪，每个月公司会补贴餐补200，交通300；
SELECT EMPNO,ename,(sal+nvl(comm,0)+200+300)*12 "年薪" FROM emp;
--5、	查询出基本工资高于2000 的员工信息
select * from emp where sal>2000;
--6、	查询出名字叫‘张三的所有信息
select * from emp where ename='张三';
--7、	查询出工资范围在1500—3000的全部员工信息（包括1500和3000）
select * from emp where sal BETWEEN 1500 and 3000;
--8、	查询出所有员工姓名是以‘李’开的信息；
select * from  emp where ename like '李%';
--9、	查询出员工姓名中第二个字是‘m’的信息
select * from emp where ename like '_M%';
--10、	查询出所有员工信息，要求按工资排序；
select * from emp ORDER BY sal desc;
select * from emp ORDER BY sal asc;
--11、	查询出测试部工作的员工姓名、基本工资、入职日期，部门名称；
select * from emp where deptno=(select deptno from dept where dname='RESEARCH');
--12、	查询出所有员工的姓名，部门名称及工资；
select e.ename,d.dname "部门",e.sal "工资" from emp e,dept d where e.DEPTNO=d.DEPTNO;
--13、	查出与“某某”员工在同一个部门工作的人员信息（前提不知道该员工在哪个部门）
select * from emp where DEPTNO=(select deptno from emp where ename='张三');
--14、	查出薪资等于部门编号为3的员工的薪资的员工信息；
select * from  emp where sal between (select MIN(sal) from emp e,dept d where e.DEPTNO=d.DEPTNO and d.deptno=30) and (select Max(sal) from emp e,dept d where e.DEPTNO=d.DEPTNO and d.deptno=30); 
--15、	查出薪资高于部门编号为3的员工的薪资的员工信息；
select * from emp where sal>(select Max(sal) from emp e,dept d where e.DEPTNO=d.DEPTNO and d.deptno=30);
--16、	查出高于整个公司平均薪资的人员信息；
select * from emp where sal>(select avg(sal) from emp );
--17、	查出每个部门有多少人；以及部门编号和部门ID
select d.dname,e.* from dept d,(select count(*),deptno from emp GROUP BY DEPTNO) e where  d.DEPTNO=e.deptno;
--18、	1、列出与 “某某1” 从事相同工作的所有员工及部门名称，部门人数。
select e.ename,d.dname,s.ct  from dept d,emp e,
(select count(*) as ct from emp where job=(select job from emp where ename='某某1')) s where e.DEPTNO=d.DEPTNO and 
e.job=(select job from emp where ename='某某1');
--19、	2、列出薪金比 “某某1” 或 “某某2” 多的所有员工的编号，姓名，部门名称，其领导姓名，部门人数。
select e.empno,e.ename,d.dname,m.ename,c.count from emp e,emp m,dept d,(select count(ename) count,deptno from emp GROUP BY deptno) c
WHERE e.mgr=m.empno and e.deptno=d.deptno and e.deptno=c.deptno and (e.sal >(select sal from emp where ename='ADAMS') or e.sal>(select sal from emp where ename='SMITH'));

--20列出受雇日期早于其直接上级的所有员工的编号，姓名，部门名称，部门位置，部门人数。
select e.empno,e.ename,d.dname,d.loc,c.count from emp e,emp m,dept d,(select count(ename) count,deptno from emp GROUP BY deptno) c
where e.mgr=m.empno and e.HIREDATE>m.HIREDATE and e.deptno =d.deptno and e.deptno=c.deptno
--21列出所有 “某某3” （不同的部门都有这个人）的姓名及其部门名称，部门人数，工资等级。
select e.ename,d.dname,c.count,s.GRADE from emp e,dept d,(select count(ename) count,deptno from emp GROUP BY deptno) c,SALGRADE s
where e.ename='JAMES' and e.deptno=d.deptno and e.deptno=c.deptno and e.sal BETWEEN s.LOSAL and HISAL