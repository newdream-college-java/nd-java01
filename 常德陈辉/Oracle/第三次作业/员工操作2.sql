select * from emp; --员工信息表
select * from dept; -- 部门表
select * from salgrade; --工资等级表



-- 1、查询出雇员表中所有员工的姓名；雇佣日期；和工资调整日期（工作6个月后的第一个星期一）。其格式要求是类似于：“1981-09-23”。
select ename,to_char(next_day(add_months(hiredate,6),'monday'),'yyyy-mm-dd') 工资调整日期 from emp;

-- 2、查出每个员工的名字（ename）、雇佣日期到现在的日期间隔的月数（要求为整数），该列命名为MONTHS_WORKED，并以该列的降序排序
select ename,MONTHS_BETWEEN(sysdate,hiredate) MONTHS_WORKED from emp order by MONTHS_WORKED desc;

-- 3、写一个查询，查询出雇员的姓名，以及姓名的长度。要求其姓名的第一个字母为大写，其它的字母为小写。
select ename,length(ename),initcap(ename) from emp;

-- 4、写一个查询来查询出雇员的名字，部门号，部门名称。
select e.ename,e.deptno,d.dname from emp e,dept d where e.deptno=d.deptno;

-- 5、查出每个雇员的编号、姓名、其管理者的编号和姓名。各个列分别命名为：Emp#,EmpName,EmpM#,EmpName.
select e.empno Emp#,e.ename EmpName,m.empno EmpM#,m.ename EmpName from emp e,emp m where e.mgr=m.empno;

-- 6、修改第5题的查询，使得没有管理者的员工的信息也可以显示出来。
select e.empno Emp#,e.ename EmpName,m.empno EmpM#,m.ename EmpName from emp e left join emp m on e.mgr=m.empno;

-- 7、查出所有员工的最高、最低、平均的工资,以及工资的总和，列名分别是maxSal,minSal,avgSal,sumSal。这些数值都用四舍五入进行处理。
select round(max(sal)) "maxSal",round(min(sal)) "minSal",round(avg(sal)) "avgSal",round(sum(sal)) "sumSal" from emp;

-- 8、按照工作类型分类，查出每种工作的名称和其员工的最高、最低、平均的工资、工资的总和，这些数值都用四舍五入进行处理。
select job,round(max(sal)),round(min(sal)),round(avg(sal)),round(sum(sal)) from emp group by job;

-- 9、查出每种工作的名称和从事该工作的人数。
select job,count(*) from emp group by job;

-- 10、查出不当领导的职工姓名。
select ename from emp where empno not in (select mgr from emp where mgr is not null);

-- 11、按照工作分类，查出最高工资和最低工资的差额,该列命名为difference。
select JOB,max(sal)-min(sal) "difference" from emp group by job;

-- 12、查出与BLACK在同一个部门的所有雇员的姓名和雇佣日期。
select ename,hiredate from emp where deptno=(select deptno from emp where ename='BLACK');

-- 13、查出工资高于平均工资的所有员工的编号和姓名，其结果按照工资的降序排列。
select empno,ename from emp where  sal>(select avg(sal) from emp)ORDER BY sal desc;

-- 14、查出所有名字中包含一个"T"的员工所在的部门号，和这些部门所包含的所有员工编号和姓名
select ename,deptno from emp where ename like '%T%';
select empno,ename from emp where deptno in (select deptno from emp where ename like '%T%');

-- 15、查出所有工作在Dallas的员工的姓名、部门编号、工作
select e.ename,e.deptno,e.job from emp e join dept d on e.deptno=d.DEPTNO where d.loc='DALLAS';

-- 16、查出由King直接管辖的所有员工的姓名和工资
select e.ename,e.sal from emp e join emp m on e.MGR=m.EMPNO where m.ename='KING';

-- 17、查询销售部（Sales)的编号，所有员工的名字和工作
select deptno from dept where dname='SALES';
select ename,job from emp where deptno=(select deptno from dept where dname='SALES');

-- 18、写部门号、薪水相匹配的所有雇员的名字、部门号。
select deptno,sal from emp group by deptno,sal having count(*)>1;
select ename,sal from emp where (deptno,sal) in (select deptno,sal from emp group by deptno,sal having count(*)>1);
 
-- 19、查询出与在Dallas的任何一个雇员的水薪和佣金相匹配的所有雇员的姓名、部门名称和工资。
select e.ename,d.dname,e.sal from emp e,dept d where e.DEPTNO=d.Deptno and d.loc='DALLAS' and (e.sal,nvl(e.comm,0)) in 
(select e.sal,nvl(e.comm,0) from emp e,dept d where d.loc='DALLAS' group by e.sal,e.comm having count(*)>1);

-- 20、查询出所有工资和佣金与Scott相同的雇员的姓名、雇佣日期和工资。注意：结果中不包括Scott
select ename,hiredate,sal from emp where (sal,nvl(comm,0)) in (select sal,nvl(comm,0) from emp where ename='SCOTT') and  ename!='SCOTT';




-- 判断员工工资水平，如果工资低于1000，显示工资很低，如果工资在1000-3000之间，显示工资一般，如果大于3000，显示工资很高
select ename,decode(sign(sal-3000),1,'工资很高',0,'工资很高',-1,(decode(sign(sal-1000),1,'工资一般',0,'工资一般',-1,'工资很低'))) from emp;

select to_char(45,'L99.99') from dual;
















