use test1
-- 一个了
select *from EMP where deptno=30;
-- 二个了 
select *from EMP WHERE JOB='CLERK';
SELECT  EMPNO,ENAME,deptno from emp where job='clerk';
-- 三个了
select *from EMP where comm>sal;
-- 四
select *from EMP where comm>sal*0.6;
-- 五
select *from EMP where deptno=10 and job='manager' and deptno=20 and job='clerk';
--  6
select *from EMP where deptno=10 and job='manager' and deptno=20 and job='clerk'or job='manager' and job='clerk' and sal>2000;
-- 7
SELECT job from emp WHERE comm is not null;
-- 8
SELECT job from emp where comm<100;
-- 9
SELECT *from emp where ENAME rlike'^A|b|c';
-- 10
SELECT *from emp where ENAME like '------';
-- 11
SELECT *from emp where ENAME not like '%r%';
-- 12
SELECT *from emp ORDER BY ename;
-- 13
SELECT *from emp ORDER BY SAL asc;
-- 14
SELECT ENAME,SAL/30 AS'日薪' FROM EMP;
-- 15
select * from emp where ename like '%a%';
-- 16
SELECT *from emp,dept where emp.DEPTNO=dept.deptno;
-- 17 
SELECT ENAME,SAL,EMPNO where  like sal>2500;
-- 18
SELECT empno,ename,sal from emp;
-- 19
select *from emp;
-- 20
SELECT  ename from DEPT;