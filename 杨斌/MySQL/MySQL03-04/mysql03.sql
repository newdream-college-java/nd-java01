use test1
select * from emp where deptno=30;
select EMPNO,ename,deptno from emp where job='clerk';
select * from emp where comm>sal;
select * from emp where comm>sal*0.6;
select * from emp where deptno =10 and job='manager' or deptno=20 and job='clerk'
select * from emp where deptno =10 and job='manager' or deptno=20 and job='clerk' or job!='manager' and job!='clerk' and sal>2000
select * from emp where comm is not null
select * from emp where comm<100 or comm is null
select * from emp where ename rlike '^A|^B|^C'
select * from emp where ename like '______'
select * from emp where ename not like '%r%'
select * from emp order by ename
select * from emp order by job desc
select * from emp order by job desc,sal asc
SELECT ENAME,SAL/30 AS'日薪' FROM EMP;
select * from emp where ename like '%A%'
select * from dept,emp where dept.DEPTNO=emp.DEPTNO
select empno,ename,sal, from emp where sal>2500
select empno,ename,sal,comm from emp
select * from emp where deptno in(10,20,30)
select ename from emp where deptno in(10,20,30)