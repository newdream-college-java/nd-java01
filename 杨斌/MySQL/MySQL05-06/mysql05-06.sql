31、
select e.ename,e.sal from emp e where e.sal in(select m.sal from emp m where m.deptno=30)
32、
select * from emp e where e.sal>(select max(m.sal) from emp m where m.deptno=30)
33、
select d.*,count(e.ename) from emp e right outer join dept d on e.deptno=d.deptno GROUP BY e.deptno
34、
select e.ename,d.dname,e.sal from emp e,dept d where e.deptno=d.deptno 
35、
select e.*,d.dname from emp e,dept d where e.deptno=d.deptno
36、
select e.job,min(d.sal) from emp e,emp d where e.job=d.job group by e.job
37、
select 12*sal+ifnull(comm,0) from emp;
38、
select e.ename from emp e,salgrade s where s.grade=4 and e.sal BETWEEN s.losal and hisal
39、
select e.ename,d.loc,s.losal,s.hisal from emp e,dept d,salgrade s where e.deptno=d.deptno and s.grade=2 and e.sal BETWEEN s.losal and hisal
40、
select e.*,s.grade from emp e,salgrade s where e.sal BETWEEN s.losal and hisal and s.grade>(select s.grade from  salgrade s,emp e where e.ename='smith' and e.sal BETWEEN s.losal and hisal)
41、
select * from emp
42、
select count(ename) from emp
43、
select e.ename,max(DATEDIFF(CURDATE(),e.HIREDATE))/365 '工作年限' from emp e
44、
select count(e.ename) from emp e  where e.sal>3000 
45、
select * from emp where ename like '林_'
46、
select * from emp where ename like '%林%'
47、
select e.empno,e.sal from emp e where e.sal between 2000 and 3000
48、
select e.empno,e.ename from emp e where e.deptno=(select d.deptno from dept d where d.dname='ACCOUNTING')
49、
select e.empno,e.ename from emp e where e.deptno not in(select d.deptno from dept d where d.dname in ('ACCOUNTING','RESEARCH'))
