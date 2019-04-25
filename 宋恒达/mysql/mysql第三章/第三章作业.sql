desc dept;
desc emp;
desc salgrade;
select * from dept;
select * from emp;
select * from salgrade;
-- 查找部门30中员工的详细信息
select * from dept where deptno=30;
-- 找出从事clerk工作的员工的编号、姓名、部门号
select empno,ename,deptno from emp where job='clerk';
-- 检索出奖金多于基本工资的员工信息
select * from emp where comm>0;
-- 检索出奖金多于基本工资60%的员工信息
select * from emp where comm>sal*0.6;
-- 找出10部分的经理、20部门的职工的员工信息
select * from emp where ((deptno=10 and job='manage') or (deptno=20 and job='clerk'));
-- 找出10部门的经理、20部门的职员或者既不是经理也不是职员但是工资高于2000元的员工信息
select * from emp where (deptno=10 and job='manage') or (deptno=20 and job='clerk') or(sal>2000);
-- 找出获得奖金的员工的工作
select job from emp where comm>0;
-- 找出奖金少于100或者没有获得奖金的员工的信息
select * from emp where (comm<100 or ISNULL(comm));
-- 找出姓名以A、B、S开始的员工信息
select * from emp where ename rlike '^(A|B|S)';
-- 找出名字长度为6个字符的员工信息
select * from emp where ename like '______';
-- 名字中不包含R字符的员工信息
select * from emp where ename not like '%R%';
-- 返回员工的详细信息并且按照姓名排序
select * from emp order by ename;
-- 返回员工的信息并按工作降序工资升序排列
select * from emp order by job desc,sal asc;
-- 计算员工的日薪（按30天）
select sal/30 日薪 from emp;
-- 查询员工中包含A的员工信息
select * from emp where ename like '%A%';
-- 进行等值连接，查询全部员工的个人信息以及薪酬情况
select * from emp;
-- 查询工资水平在2500以上的员工号、姓名、收入
select empno,ename,sal from emp where sal>2500;
-- 查询所有员工的员工号、名字、薪酬
select empno,ename,sal from emp;
-- 查询所有部门的员工情况
select * from emp where job='clerk';
-- 查询所有部门所有员工的姓名
select ename from emp where job='clerk';