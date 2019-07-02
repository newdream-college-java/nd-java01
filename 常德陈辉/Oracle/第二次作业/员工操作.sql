select * from emp; --员工信息表
select * from dept; -- 部门表
select * from salgrade; --工资等级表

-- 1,查询出每个员工的编号，姓名，职位
select empno,ename,job from emp;

-- 2,查询每个员工的岗位名称
select ename || '的岗位为' || job from EMP;

-- 3,计算出每个员工一年的基本工资，同时显示出姓名和编号
select ename,empno,sal*12 from emp;

-- 4,计算出每个员工的年薪，每个月公司会补贴餐补200，交通300；年薪=（工资+奖金）*12
select (sal+nvl(comm,0)+200+300)*12 from emp;

-- 5,查询出基本工资高于2000 的员工信息
select * from emp where sal>2000;

-- 6,查询出名字叫‘张三的所有信息
select * from emp where ename='张三';

--7,查询出工资范围在1500—3000的全部员工信息（包括1500和3000）
select * from emp where sal between 1500 and 3000;

--8,查询出所有员工姓名是以‘李’开的信息；
select * from emp where ename like '李%';

--9,查询出员工姓名中第二个字是‘m’的信息
select * from emp where ename like '_m%';

--10,查询出所有员工信息，要求按工资排序；
select * from emp order by sal desc;

--11,查询出测试部工作的员工姓名、基本工资、入职日期，部门名称；
select ename,sal,hiredate,job from EMP where JOB='测试部';

--12,查询出所有员工的姓名，部门名称及工资
select ename,job,sal from emp;

--13,查出与“某某”员工在同一个部门工作的人员信息（前提不知道该员工在哪个部门）
select * from emp where job=(select job from emp where ename='某某');

--14,查出薪资等于部门编号为3的员工的薪资的员工信息
select * from emp,(select sal from emp where deptno=3) s where EMP.SAL=s.SAL;

--15,查出薪资高于部门编号为3的员工的薪资的员工信息
select * from emp where sal>(select max(sal) from emp where deptno=3);

--16,查出高于整个公司平均薪资的人员信息
select * from emp where sal>(select avg(sal) from emp);

--17,查出每个部门有多少人；以及部门编号和部门ID
select count(*),DEPTNO from emp GROUP BY deptno;

--18,列出与 “某某1” 从事相同工作的所有员工及部门名称，部门人数。
select count(*),DEPTNO from emp  where job=(select job from emp where ename='某某') group by deptno; 

--19,列出薪金比 “某某1” 或 “某某2” 多的所有员工的编号，姓名，部门名称，其领导姓名，部门人数
select * from emp where sal>(select sal from emp where ename='某某1') or sal>(select sal from emp where ename='某某2');

--20，列出受雇日期早于其直接上级的所有员工的编号，姓名，部门名称，部门位置，部门人数
select * from emp e,emp m where  e.员工上司名字=m.员工名 and e.就职日期<m.就职日期；

--21,列出所有 “某某3” （不同的部门都有这个人）的姓名及其部门名称，部门人数，工资等级
select e.ename,s.grade,d.dname from emp e ,salgrade s,dept d where e.sal between s.losal and s. hisal and ename='SMITH' and d.DEPTNO=e.DEPTNO;





select ltrim('hellohelloworldhello','hello'),rtrim('helloworldhello','hello'),trim('h' from 'hhhoraclehhh') from dual;


select ename,to_char(NEXT_DAY( ADD_MONTHS(hiredate,6),'monday'),'yyyy-mm-dd') from emp;
select * from  emp;


select * from emp where hiredate<(select hiredate from emp where ename='WARD');








