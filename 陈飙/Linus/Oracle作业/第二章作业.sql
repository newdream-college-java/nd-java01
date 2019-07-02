--1.查询出每个员工的编号，姓名，职位
select EMPNO,ename,job from emp
--2.查询出每个员工的岗位名称
select job from emp
--3.计算出每个员工一年的基本工资，同时显示出姓名和编号
select ename,empno,sal*12 from emp
--4.计算出每个员工的年薪，每个月公司会补贴餐补200，交通300；年薪=（工资+奖金）*12
--nvl（x1,x2）函数表示x1字段中为空值的用x2代替
select (sal+nvl(Comm,0)+500)*12 from emp;
--5.查询出基本工资高于2000的员工信息
select * from emp where sal>2000
--6.查询出名字叫'张三'的所有信息
select * from emp where ename='JONES'
--7.查询出工资范围在1500—3000的全部员工信息（包括1500和3000）
select * from emp where sal between 1500 and 3000
--8.查询出所有员工姓名是以‘李’开的信息
select * from emp where ename like 'M%'
--9.查询出员工姓名中第二个子是‘m‘的信息
--模式查询注意区分大小写
select * from emp where ename like '_M%'
--10.查询出所有员工信息，要求按工作排序
--降序
select * from emp  order by sal desc; 
--升序
select * from emp  order by sal asc;
--11.查询出测试部工作的员工姓名、基本工资、入职日期，部门名称；
--加单引号的值区分带小写
select ename,sal,hiredate,d.dname from emp,dept d where EMP.DEPTNO=d.DEPTNO and d.DNAME='SALES';
--12.查询出所有员工的姓名，部门名称及工资
select ename,sal,d.dname from emp,dept d where EMP.DEPTNO=d.DEPTNO
--13.13、查出与“某某”员工在同一个部门工作的人员信息（前提不知道该员工在哪个部门）
select DEPTNO from emp where ename='ADAMS'
select * from emp where DEPTNO=(select DEPTNO from emp where ename='ADAMS')
--14.查出薪资等于部门编号为3的员工的薪资的员工信息

select * from emp where sal in(select sal from emp where DEPTNO=30)//需要查下
--15.查出薪资高于部门编号为3的员工的薪资的员工信息
select * from emp where sal>(select sal from emp where DEPTNO=30)
--16.查出高于整个公司平均薪资的人员信息
select * from emp where sal>(select avg(sal) from emp)
--17.查出每个部门有多少人；以及部门编号和部门ID
--查询不能为* 必须带具体的
select count(*),DEPTNO from emp group by DEPTNO

--查询出每个部门有多少人；以及部门编号和部门名称
select DEPT.DNAME,s.* from dept,(select count(*),DEPTNO from emp group by DEPTNO) s where s.deptno=DEPT.DEPTNO;
--18.列出与 “某某1” 从事相同工作的所有员工及部门名称，部门人数。
select job from emp where ename='ALLEN';
select deptno from emp where ename='ALLEN'
select e.ename,d.dname from emp e,dept d where job=(select job from emp where ename='ALLEN') 

select e.ename,d.DEPTNO,d.DNAME from emp e,dept d where job=(select job from emp where ename='ALLEN') and e.DEPTNO=d.DEPTNO

select count(*) from emp where deptno=(select deptno from emp where ename='ALLEN')
--18.答案
select f.ct,e.ename,d.DEPTNO,d.DNAME from emp e,dept d ,(select count(*) as ct from emp where deptno=(select deptno from emp where ename='ALLEN')) f
where job=(select job from emp where ename='ALLEN') and e.DEPTNO=d.DEPTNO
--19.列出薪金比 “某某1” 或 “某某2” 多的所有员工的编号，姓名，部门名称，其领导姓
--草稿
SELECT e.empno,e.ename,e.sal,d.dname,m.ename leader FROM emp e,emp m,dept d 
WHERE e.sal>ANY(SELECT sal FROM emp WHERE ename='SMITH' OR ename='ALLEN') 
AND e.deptno=d.deptno AND e.mgr=m.empno(+);


--草稿
select sal from emp where ename='WARD' or ename='ALLEN';
select min(sal) from (select sal from emp where ename='WARD' or ename='ALLEN') a

--得到每个人的领导姓名
--z中文打双引号
select f.ename,e.ename from emp e,emp f where e.mgr=f.empno;
select * from emp
--草稿
select count(*),DEPTNO from emp group by DEPTNO
select count(*) ,DEPTNOfrom emp order by deptno
--草稿
SELECT e.empno,e.ename,e.sal,d.dname,m.ename leader FROM emp e,emp m,dept d 
WHERE e.sal>(select min(sal) from (select sal from emp where ename='WARD' or ename='ALLEN')) 
AND e.deptno=d.deptno AND e.mgr=m.empno;

--草稿
select count(*),deptno from emp e  group by e.deptno 
--19.答案
select h.counts,h.deptno,f.ename,e.empno,e.sal,e.ename,d.dname from emp e,dept d,emp f,
(select count(*) counts,deptno from emp e  group by e.deptno) h
where e.sal>(select min(sal) from (select sal from emp where ename='WARD' or ename='ALLEN'))
and  e.mgr=f.empno 
and e.ename not in('WARD','ALLEN')
and e.deptno=d.deptno
and h.deptno=e.deptno

--草稿
select e.empno,e.ename,d.dname from emp e,dept d
where sal>(select min(sal) from (select sal from emp where ename='WARD' or ename='ALLEN'))
and ename not in('WARD','ALLEN')
and e.deptno=d.deptno



--20.列出受雇日期早于其直接上级的所有员工的编号，姓名，部门名称，部门位置，部门人数。
--草稿
select count(*),deptno from emp e  group by e.deptno 
select d.dname,d.loc from dept d 
select months_between(sysdate,date'2015-01-01')from dual;
select f.ename,e.ename from emp e,emp f where e.mgr=f.empno;
--草稿
select a.counts,a.deptno,e.empno,e.ename,d.dname,d.loc,months_between(sysdate,p.hiredate) ptime,months_between(sysdate,e.hiredate) etime  
from emp e ,emp p,dept d,(select count(*) counts,deptno from emp e  group by e.deptno) a where e.mgr=p.empno and d.DEPTNO=e.DEPTNO and a.deptno=e.deptno;
--草稿
select * from (select months_between(sysdate,p.hiredate) ptime,months_between(sysdate,e.hiredate)etime from emp e,emp p where e.mgr=p.empno
) s where s.PTIME<s.ETIME

--20题答案
select * from (select a.counts,a.deptno,e.empno,e.ename,d.dname,d.loc,months_between(sysdate,p.hiredate) ptime,months_between(sysdate,e.hiredate) etime  
from emp e ,emp p,dept d,(select count(*) counts,deptno from emp e  group by e.deptno) a where e.mgr=p.empno and d.DEPTNO=e.DEPTNO and a.deptno=e.deptno
) s where s.PTIME<s.ETIME

--21.列出所有 “SMITH” （不同的部门都有这个人）的姓名及其部门名称，部门人数，工资等级
select deptno from emp where deptno>10 group by deptno
select datediff("SYSDATE",e.hiredate) from emp e,emp p where e.mgr=p.empno;
 select sal from emp;
select comm from emp;
select * from emp;
select * from dept;
select * from salgrade