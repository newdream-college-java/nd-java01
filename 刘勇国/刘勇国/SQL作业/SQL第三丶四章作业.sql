1.查找部门30中员工的详细信息
select * from emp  where deptno=30
2.找出从事clerk工作的员工的编号、姓名、部门号
select empno,ename,empno from emp
3.检索出奖金多于基本工资的员工信息
select * from emp where sal>comm
4.检索出奖金多于基本工资60%的员工信息
select * from emp WHERE sal*0.6>comm 
5.找出10部门的经理、20部门的职工的员工信息
select * from emp where deptno=20 and job='clerk' or deptno=10 and job='MANAGER'
6.找出10部门的经理、20部门的职员或者既不是经理也不是职员但是工资高于2000元的员工信息
select * from emp where deptno=20 and job='clerk' or deptno=10 and job='MANAGER' or job!='clerk' and job!='MANAGER' and sal>2000
7.找出获得奖金的员工的工作
select * from emp where comm is not null
8.找出奖金少于100或者没有获得奖金的员工信息
select * from emp where comm>100 or comm is null
9.找出姓名以A、B、S开始的员工信息
select * from emp where ename REGEXP '^A' or ename REGEXP '^B' or ename REGEXP '^S' 
10.找到名字长度为6个字符的员工信息
select * from emp WHERE ename like '______'
11.名字中不包含R字符的员工信息
select * from emp where ename not like 'R'
12.返回员工的详细信息并按姓名排序
select * from emp ORDER BY ename
13.返回员工的信息并按工作降序工资升序排列
select * from emp order by sal desc
14.计算员工的日薪（按30天）
select sal/30 as '日薪' from emp
15.找出姓名中包含A的员工信息
select * from emp where ename like '%A%'
16.进行等值连接，查询全部员工的个人信息以及薪酬情况

17.查询工资水平在2500以上的员工号、姓名、收入
select * from emp where (comm+sal)>2500 or sal>2500 or comm>2500
18.查询所有员工的员工号，名字，薪酬
select empno,ename,sal+comm,sal from emp
19.查询所有部门的员工情况
select * from emp,dept
20.查询所有部门所有员工的名字
select ename from emp,dept