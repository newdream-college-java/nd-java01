--1、查询出每个员工的编号，姓名，职位
SELECT EMPNO,ENAME,JOB FROM SCOTT.emp
--2、查询每个员工的岗位名称
SELECT ENAME,JOB FROM SCOTT.emp
--3、计算出每个员工一年的基本工资，同时显示出姓名和编号
SELECT EMPNO,ENAME,SAL*12 "基本工资" FROM SCOTT.emp
--4、计算出每个员工的年薪，每个月公司会补贴餐补200，交通300；年薪=（工资+奖金）*12
SELECT EMPNO,ENAME,(SAL+200+300)*12+NVL(comm*12,0) "年薪" FROM SCOTT.emp;
--5、查询出基本工资高于2000 的员工信息
SELECT * FROM SCOTT.EMP WHERE SAL>2000;
--6、查询出名字叫‘张三的所有信息
SELECT * FROM SCOTT.EMP WHERE ENAME = '张三';
--7、查询出工资范围在1500—3000的全部员工信息（包括1500和3000）
SELECT * FROM SCOTT.EMP WHERE SAL BETWEEN 1500 AND 3000
--8、查询出所有员工姓名是以‘李’开的信息；
SELECT * FROM SCOTT.EMP WHERE ENAME LIKE '李%';
--9、查询出员工姓名中第二个字是‘m’的信息
SELECT * FROM SCOTT.EMP WHERE ENAME LIKE '_M%';
--10、查询出所有员工信息，要求按工资排序；
SELECT * FROM SCOTT.EMP ORDER BY SAL DESC;
--11、查询出测试部工作的员工姓名、基本工资、入职日期，部门名称；
SELECT ENAME,SAL,HIREDATE,JOB FROM SCOTT.EMP WHERE JOB = 'ANALYST';
--12、查询出所有员工的姓名，部门名称及工资；
SELECT ENAME,JOB,SAL from SCOTT.EMP;
--13、查出与“某某”员工在同一个部门工作的人员信息（前提不知道该员工在哪个部门）
SELECT * FROM SCOTT.EMP WHERE (SELECT JOB FROM SCOTT.EMP WHERE ENAME = 'SMITH') = JOB;
--14、查出薪资等于部门编号为30的员工的薪资的员工信息；
SELECT * FROM SCOTT.EMP WHERE DEPTNO = 30;
--15、查出薪资高于部门编号为30的员工的薪资的员工信息；
SELECT * FROM SCOTT.EMP WHERE (SELECT MAX(SAL) FROM SCOTT.EMP WHERE DEPTNO=30)<SAL;
--16、查出高于整个公司平均薪资的人员信息；
SELECT * FROM SCOTT.EMP WHERE (SELECT AVG(SAL) FROM SCOTT.EMP)<SAL;
--17、查出每个部门有多少人；以及部门编号和部门ID
--SELECT COUNT(DEPTNO) FROM SCOTT.EMP WHERE (SELECT DISTINCT DEPTNO FROM SCOTT.EMP)=DEPTNO;
SELECT DEPTNO "部门编号",COUNT(ENAME) FROM SCOTT.EMP GROUP BY DEPTNO;
--java一班的同学 做  二班的同学先不做
--18、1、列出与 “某某1” 从事相同工作的所有员工及部门名称，部门人数。
select e.*,d.dname,c.count from emp e,dept d,(select count(ename) count,deptno from
 emp GROUP BY deptno) c where e.job=(select job from emp where ename='TURNER') and e.deptno =d.deptno and e.deptno=c.deptno
--19、2、列出薪金比 “某某1” 或 “某某2” 多的所有员工的编号，姓名，部门名称，其领导姓名，部门人数。
select e.empno,e.ename,d.dname,m.ename,c.count from emp e,emp m,dept d,(select count(ename) count,deptno from emp 
GROUP BY deptno) c WHERE e.mgr=m.empno and e.deptno=d.deptno and e.deptno=c.deptno and (e.sal >(select sal from emp 
where ename='ADAMS') or e.sal>(select sal from emp where ename='SMITH'))
--20、3、列出受雇日期早于其直接上级的所有员工的编号，姓名，部门名称，部门位置，部门人数。
select e.empno,e.ename,d.dname,d.loc,c.count from emp e,emp m,dept d,(select count(ename) count,deptno from emp GROUP BY deptno) c
where e.mgr=m.empno and e.HIREDATE>m.HIREDATE and e.deptno =d.deptno and e.deptno=c.deptno
--21、4、列出所有 “某某3” （不同的部门都有这个人）的姓名及其部门名称，部门人数，工资等级。
select e.ename,d.dname,c.count,s.GRADE from emp e,dept d,(select count(ename) count,deptno from emp GROUP BY deptno) c,SALGRADE s
where e.ename='JAMES' and e.deptno=d.deptno and e.deptno=c.deptno and e.sal BETWEEN s.LOSAL and HISAL