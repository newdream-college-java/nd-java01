select * from emp;
select * from dept;
select * from SALGRADE;
--1、查询出雇员表中所有员工的姓名；雇佣日期；和工资调整日期（工作6个月后的第一个星期一）。其格式要求是类似于：“1981-09-23”。
select ename,hiredate,TO_CHAR( NEXT_DAY(add_months(hiredate, 6), 'Monday'),'yyyy-mm-dd') from emp;
--2、查出每个员工的名字（ename）、雇佣日期到现在的日期间隔的月数（要求为整数），该列命名为MONTHS_WORKED，并以该列的降序排序
select ename,floor(months_between( sysdate,hiredate )/12) MONTHS_WORKED from emp order by MONTHS_WORKED desc;
--3、写一个查询，查询出雇员的姓名，以及姓名的长度。要求其姓名的第一个字母为大写，其它的字母为小写。
select initcap(ename) ,length(ename) from emp; 
--4、写一个查询来查询出雇员的名字，部门号，部门名称。
select e.ename,e.deptno,d.dname from emp e,dept d where e.deptno=d.deptno;
--5、查出每个雇员的编号、姓名、其管理者的编号和姓名。各个列分别命名为：Emp#,EmpName,EmpM#,EmpName.
select m.empno Emp#,m.ename EmpName,e.empno EmpM#,e.ename EmpName from emp e,emp m where e.empno=m.mgr ;
--6、修改第5题的查询，使得没有管理者的员工的信息也可以显示出来。
select m.empno Emp#,m.ename EmpName,e.empno EmpM#,e.ename EmpName from emp e  right join  emp m on e.empno=m.mgr ;

select m.empno Emp#,m.ename EmpName,e.empno EmpM#,e.ename EmpName from emp m  left join  emp e on e.empno=m.mgr ;

select m.empno Emp#,m.ename EmpName,e.empno EmpM#,e.ename EmpName from emp e,emp m where e.empno(+)=m.mgr ;

--7、查出所有员工的最高、最低、平均的工资,以及工资的总和，列名分别是maxSal,minSal,avgSal,sumSal。这些数值都用四舍五入进行处理。
select max(sal) maxSal,min(sal) minSal,round(avg(sal),0) avgSal,sum(sal) sumSal from emp;
--8、按照工作类型分类，查出每种工作的名称和其员工的最高、最低、平均的工资、工资的总和，这些数值都用四舍五入进行处理。
select job,max(sal) maxSal,min(sal) minSal,round(avg(sal),0) avgSal,sum(sal) sumSal from emp group by job;
--9、查出每种工作的名称和从事该工作的人数。
select job,count(job) from emp group by job;
--10、查出不当领导的职工姓名和编号。
select empno,ename from emp where empno not in(select p.mgr from emp e,emp p where e.empno=p.mgr);
--11、按照工作分类，查出最高工资和最低工资的差额,该列命名为difference。
select (max(sal)-min(sal)) difference from emp group by job;
--12、查出与FORD在同一个部门的所有雇员的姓名和雇佣日期。
select ename,hiredate from emp where deptno in (select deptno from emp where ename='FORD' );
--13、查出工资高于平均工资的所有员工的编号和姓名，其结果按照工资的降序排列。
select empno,ename from emp where sal>(select avg(sal) from emp) order by sal desc
--14、查出所有名字中包含一个"T"的员工所在的部门号，和这些部门所包含的所有员工编号和姓名
select deptno,empno,ename from emp where  ename like '%T%';
--15、查出所有工作在DALLAS地方的员工的姓名、部门编号、工作
select  ename,deptno,job from emp where deptno=(select deptno from dept where loc='DALLAS');
--16、查出由KING直接管辖的所有员工的姓名和工资
select ename,sal from emp where mgr=(select empno from emp where ename='KING');
--17、查询销售部（SALES)的编号，所有员工的名字和工作
select ename,job from emp where deptno = (select deptno from dept where dname='SALES');
--18、部门号、薪水相匹配的所有雇员的名字、部门号、薪水。
select e.ename,e.deptno,e.sal from emp e,emp p where e.deptno=p.deptno and e.sal=p.sal and e.ename!=p.ename;
--19、查询出与在DALLAS地方的任何一个雇员的薪水和佣金相匹配的所有雇员的姓名、部门名称和工资。
select e.ename,e.deptno,e.sal from emp e,emp m where e.ename!=m.ename and e.sal+NVL(e.comm,0)=m.sal+NVL(m.comm,0) and e.deptno
not in(select deptno from dept where loc='DALLAS');
--20、查询出所有工资和佣金与SCOTT相同的雇员的姓名、雇佣日期和工资。注意：结果中不包括SCOTT
select ename,sal+nvl(comm,0) from (select * from emp where ename!='SCOTT') where sal+nvl(comm,0)in (select sal+nvl(comm,0) from emp where ename='SCOTT'); 


Select round(199.256,-2) from dual;
--200
Select trunc(199.256,-2) from dual;
--100
Select sign(-30),sign(30),sign(0) from dual;
--  -1   1  0
Select mod(-10,-3),mod(10,-3),mod(10,3),mod(-10,3) from dual;
--  -1  1  1  -1
--判断员工的工资水平，如果工资低于1000，显示“工资偏低”，如果工资在1000-3000之间，显示“工资一般”，如果大于3000，显示“工资很高”
select ename,sal,decode(sign(sal-3000),1,'工资很高',0,'工资一般',1,decode(sign(sal-1000),1,'工资一般',-1,'工资偏低'),0,'工资很高') from emp;

select to_char(sysdate,'d') from dual; 
select to_char(sysdate,'ddd') from dual; 
select to_char(sysdate,'ww') from dual; 
select to_char(148.5,'999.999')  from dual; 
select to_char(148.5,'L999.999')  from dual; 
select to_char(1485,'9,999') from dual; 
select to_char(148.5,'999D999') from dual; 
to_char(148.5,'999.999') ' 148.500'   
to_char(1485,'9,999')    ' 1,485'   
to_char(148.5,'999D999') ' 148.500' 

--NVL 
SELECT ename, NVL(comm,0) FROM emp; 
--NVL2 (表达式,不为空设值,为空设值)	
SELECT ename, NVL2(comm,'有佣金','没有佣金')  FROM emp; 
--NULLIF 如果两个指定的表达式相等，则返回空值。 语法NULLIF ( exp1 , exp2 ) 
SELECT ename, NULLIF(2,2)  FROM emp; 
SELECT ename, NULLIF(3,2)  FROM emp; 


select d.dname,count(e.deptno) from emp e,dept d  where e.DEPTNO=d.DEPTNO GROUP BY d.dname;
