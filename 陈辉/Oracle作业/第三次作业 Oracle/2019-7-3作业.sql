--1、查询出雇员表中所有员工的姓名；雇佣日期；和工资调整日期（工作6个月后的第一个星期一）
select ENAME,HIREDATE,TO_CHAR(NEXT_DAY(ADD_MONTHS(HIREDATE, 6), '星期一'),'yyyy-mm-dd') from emp
--2、查出每个员工的名字（ename）、雇佣日期到现在的日期间隔的月数（要求为整数），该列命名为MONTHS_WORKED，并以该列的降序排序
select ename,FLOOR(MONTHS_BETWEEN(SYSDATE, HIREDATE)) MONTHS_WORKED from emp ORDER BY MONTHS_WORKED DESC
--3、写一个查询，查询出雇员的姓名，以及姓名的长度。要求其姓名的第一个字母为大写，其它的字母为小写。
SELECT INITCAP(ENAME),LENGTH(ENAME) FROM EMP
--4、写一个查询来查询出雇员的名字，部门号，部门名称。
select e.ename,e.deptno,d.dname from emp e,dept d where e.deptno=d.deptno
--5、查出每个雇员的编号、姓名、其管理者的编号和姓名。各个列分别命名为：Emp#,EmpName,EmpM#,EmpName.
select e.empno EMP,e.ename EmpName,m.empno EmpM,m.ename EmpName from eselect emp.*,decode(SIGN(sal-3000),1,'工资偏高',-1,decode(SIGN(sal-1000),1,'工资一般',-1,'工资很低',0,'工资一般'),0,'工资很高') from empmp e,emp m where e.mgr=m.empno
--6、修改第5题的查询，使得没有管理者的员工的信息也可以显示出来。
select e.empno EMP,e.ename EmpName,m.empno EmpM,m.ename EmpName from emp e LEFT JOIN emp m on e.mgr=m.empno
--7、查出所有员工的最高、最低、平均的工资,以及工资的总和，列名分别是maxSal,minSal,avgSal,sumSal。这些数值都用四舍五入进行处理。
select ROUND(MAX(sal))maxSal,ROUND(MIN(sal)) minSal,ROUND(AVG(sal)) avgSal,ROUND(SUM(sal)) sumSal from emp
--8、按照工作类型分类，查出每种工作的名称和其员工的最高、最低、平均的工资、工资的总和，这些数值都用四舍五入进行处理。
select job,ROUND(MAX(sal))maxSal,ROUND(MIN(sal)) minSal,ROUND(AVG(sal)) avgSal,ROUND(SUM(sal)) sumSal from emp GROUP BY job
--9、查出每种工作的名称和从事该工作的人数。
select job,COUNT(ename) from emp GROUP BY job
--10、查出不当领导的职工姓名。
select ename from emp where empno not in(select m.empno from emp e,emp m where e.mgr =m.empno);
--11、按照工作分类，查出最高工资和最低工资的差额,该列命名为difference。
select job,MAX(sal)-MIN(sal) difference from emp group by job
--12、查出与BLACK在同一个部门的所有雇员的姓名和雇佣日期。
select ename,HIREDATE from emp where deptno=(select deptno from emp where ename='BLAKE');
--13、查出工资高于平均工资的所有员工的编号和姓名，其结果按照工资的降序排列。
select empno,ename from emp where sal>(select AVG(sal) from emp) ORDER BY sal desc
--14、查出所有名字中包含一个"T"的员工所在的部门号，和这些部门所包含的所有员工编号和姓名
select empno,ename from emp where deptno in(select deptno from emp where ename like '%T%')
--15、查出所有工作在Dallas的员工的姓名、部门编号、
select ename,deptno,job from emp where deptno=(select deptno from dept where loc='DALLAS')
--16、查出由King直接管辖的所有员工的姓名和工资
select ename,sal from emp where mgr=(select empno from emp where ename ='KING')
--17、查询销售部（Sales)的编号，所有员工的名字和工作
select deptno,ename,job from emp where deptno = (select deptno from dept where dname ='SALES')
--18、写门号、薪水相匹配的所有雇员的名字、部门号。
select e.ename,e.deptno from emp e,emp m where e.ename!=m.ename and e.deptno=m.deptno and e.sal=m.sal 
--19、查询出与在Dallas的任何一个雇员的薪水和佣金相匹配的所有雇员的姓名、部门名称和工资。
select e.ename,e.deptno,e.sal from emp e,emp m where e.ename!=m.ename and e.sal+NVL(e.comm,0)=m.sal+NVL(m.comm,0) and e.deptno
=(select deptno from dept where loc='DALLAS')
--20、查询出所有工资和佣金与Scott相同的雇员的姓名、雇佣日期和工资。注意：结果中不包括Scott
select e.ename,e.HIREDATE,e.sal from emp e,emp m where e.ename!=m.ename and NVL(e.comm,0)=NVL(m.comm,0) and e.sal=m.sal and e.ename!='SCOTT'