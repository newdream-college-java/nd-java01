1、查询出每个员工的编号，姓名，职位
select * from emp
2、查询每个员工的岗位名称
SELECT ename,job from emp ;
3、计算出每个员工一年的基本工资，同时显示出姓名和编号
select sal*12 年基本工资,ename,empno from emp
4、计算出每个员工的年薪，每个月公司会补贴餐补200，交通300；
年薪=（工资+奖金）*12
select ((sal+500)*12+nvl(comm,0)*12) 年薪,ename from emp
5、查询出基本工资高于2000 的员工信息
select * from emp where sal>2000
6、查询出名字叫‘张三的所有信息
select * from emp where ENAME='张三';
7、查询出工资范围在1500—3000的全部员工信息（包括1500和3000）
select *from emp where sal between 1500 and 3000;
8、查询出所有员工姓名是以‘李’开的信息；
select * from emp where ename like '李%';
9、查询出员工姓名中第二个字是‘m’的信息
select * from emp where ename like '_M%';
10、查询出所有员工信息，要求按工资排序；
select * from emp order by sal desc;
11、查询出测试部工作的员工姓名、基本工资、入职日期，部门名称；
select e.ename,d.dname,e.sal,e.hiredate from emp e,dept d where e.deptno=d.deptno and d.dname='SALES';
12、查询出所有员工的姓名，部门名称及工资；
select e.ename,d.dname,e.sal from emp e,DEPT d where e.deptno=d.deptno
13、查出与“某某”员工在同一个部门工作的人员信息（前提不知道该员工在哪个部门）
select *from emp where deptno=(select deptno from emp where ename='SMITH');
14、查出薪资等于部门编号为3的员工的薪资的员工信息；
select * from emp where sal in(select sal from emp where deptno=30);



15、查出薪资高于部门编号为3的员工的薪资的员工信息；
select * from emp where sal>(select max(sal) from emp where deptno=30)
16、查出高于整个公司平均薪资的人员信息；
select * from emp e1 where e1.sal>(select avg(emp.sal) from emp)
17、查出每个部门有多少人；以及部门编号和部门ID
select deptno 部门编号,count(*) 各部门人数 from emp GROUP BY EMP.deptno
18、列出与 “某某1” 从事相同工作的所有员工及部门名称，部门人数。
select e.ename, from emp e,dept d where job=(select job from emp where ename='SMITH');
19、列出薪金比 “某某1” 或 “某某2” 多的所有员工的编号，姓名，部门名称，其领导姓名，部门人数。
select ename, from emp,dept where sal>(select min(sal) from emp where ename='SMITH' or ename='ALLEN')
20、列出受雇日期早于其直接上级的所有员工的编号，姓名，部门名称，部门位置，部门人数。

21、列出所有 “某某3” （不同的部门都有这个人）的姓名及其部门名称，部门人数，工资等级。



select ename,to_char(next_day(ADD_MONTHS(HIREDATE ,6) ,'Monday'),'yyyy-mm-dd' )from emp
select HIREDATE from emp

SELECT ltrim('hellowlloworldhello','hello'),
rtrim('helloworldhello','hellow'),
trim('h' from 'hhhhelloworldhellh') from dual;















