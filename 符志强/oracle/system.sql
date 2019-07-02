--部门表
create table Dept(
Dept_id int,--部门编号
Dname varchar(20),--
loc varchar(20)--部门位置
)

insert into dept values(1,'人事部','一楼');
insert into dept values(2,'财务部','二楼');
insert into dept values(3,'科研部','三楼');
--员工信息表
create table emp(
emp_id int,--员工编号
ename varchar(20),--员工姓名
job varchar(20),--岗位名称
mgr int,--所在部门领导的编号
hiredate date,--入职日期
sal number(7,2),--基本工资
comm number(7,2),--奖金
Dept_id int--员工所在部门的编号，与部门表对应；
)
insert into emp values(1,'小辉','扫地',4,null,3000,0,1);
insert into emp values(2,'李小辉','扫地',4,null,3000,0,1);
insert into emp values(3,'李小小','扫地',4,null,3000,0,1);
insert into emp values(4,'陈辉','扫地队长',16,null,5000,200,1);
insert into emp values(5,'陈大辉','扫地',4,null,3000,0,1);

insert into emp values(6,'某某1','管钱的',9,null,8000,100,2);
insert into emp values(7,'某某2','管钱的',9,null,8000,0,2);
insert into emp values(8,'某某3','管钱的',9,null,8000,200,2);
insert into emp values(9,'某某4','管钱的老大',16,null,10000,1000,2);
insert into emp values(10,'某某4','管钱的',9,null,8000,0,2); 

insert into emp values(17,'某某5','管钱的',9,null,30000,0,2);

insert into emp values(11,'小斌','搞研究',14,null,30000,1000,3);
insert into emp values(12,'小鱼','搞研究',14,null,30000,1000,3);
insert into emp values(13,'小辉辉','搞研究',14,null,30000,0,3);
insert into emp values(14,'小斌斌','搞研究队长',16,null,40000,3000,3);
insert into emp values(15,'小鱼鱼','搞研究',14,null,30000,0,3);

insert into emp values(16,'我','老板',16,null,60000,0,3);
--工资等级表
create table  Salgrade(
Grade_id int,--等级编号
losal Decimal(7,2),--最低值
hisal Decimal(7,2)--最高值
)
insert into Salgrade values(1,3000,5000);
insert into Salgrade values(1,5001,10000);
insert into Salgrade values(1,10000,60001);
--练习题 ：
--1、查询出每个员工的编号，姓名，职位
select emp_id,ename,job from emp;
--2、查询每个员工的岗位名称
select ename,job from emp;
--3、计算出每个员工一年的基本工资，同时显示出姓名和编号
select ename,job,sal*12 from emp;
--4、计算出每个员工的年薪，每个月公司会补贴餐补200，交通300；年薪=（工资+奖金）*12
select ename,job,(sal+200+300+comm)*12 "年薪" from emp;
--5、查询出基本工资高于2000 的员工信息
select * from emp where sal>2000;
--6、查询出名字叫‘陈辉'的所有信息
select * from emp where ename='陈辉';
--7、查询出工资范围在1500—3000的全部员工信息（包括1500和3000）
select * from emp where sal between 1500 and 3000;
--8、查询出所有员工姓名是以‘李’开的信息；
select * from emp where ename like '李%';
--9、查询出员工姓名中第二个字是‘小’的信息
select * from emp where ename like '_小%';
--10、查询出所有员工信息，要求按工资排序；
select * from emp order by sal;
--11、查询出财务部工作的员工姓名、基本工资、入职日期，部门名称；
SELECT e.ename,e.sal,e.hiredate,d.dname FROM emp e,dept d where e.dept_id=d.dept_id and d.dept_id=2 ; 
--12、查询出所有员工的姓名，部门名称及工资；
select e.ename,d.dname,e.sal from emp e,dept d where e.dept_id=d.dept_id;
--13、查出与“某某1”员工在同一个部门工作的人员信息（前提不知道该员工在哪个部门）
select * from emp where dept_id=(select dept_id from emp where ename='某某1');
--14、查出薪资等于部门编号为3的员工的薪资的员工信息；
select * from emp where sal in (select sal from emp where dept_id=3);
--15、查出薪资高于部门编号为2的员工的薪资的员工信息；
select * from emp where sal > (select max(sal) from emp where dept_id=2);
--16、查出高于整个公司平均薪资的人员信息；
select * from emp where sal > (select avg(sal) from emp);
--17、查出每个部门有多少人；以及部门编号和部门名称
select c.c1,d.dept_id,d.dname from dept d,(select dept_id,count(dept_id ) c1 from emp  group by dept_id)c where  c.dept_id=d.dept_id ;
--java一班的同学 做  二班的同学先不做

--18、1、列出与 “某某1” 从事相同工作的所有员工及部门名称，部门人数。
select d.dname,c.c1 from (select dept_id,count(*) c1 from emp  group by dept_id) c,dept d where 
d.dept_id = (select dept_id from emp where ename='某某1') and c.dept_id = d.dept_id ;
--19、2、列出薪金比 “某某1” 或 “某某2” 多的所有员工的编号，姓名，部门名称，其领导姓名，部门人数。
select e.emp_id,e.ename,d.dname,m.ename,c.count from emp e,emp m,dept d,(select count(ename) count,dept_id from emp GROUP BY dept_id) c
WHERE e.mgr=m.emp_id and e.dept_id=d.dept_id and e.dept_id=c.dept_id and (e.sal >(select sal from emp where ename='某某1') or e.sal>(select sal from emp where ename='某某2'));
--20、3、列出受雇日期早于其直接上级的所有员工的编号，姓名，部门名称，部门位置，部门人数。
select e.emp_id,e.ename,d.dname,d.loc,c.count from emp e,emp m,dept d,(select count(ename) count,dept_id from emp GROUP BY dept_id) c
where e.mgr=m.emp_id and e.HIREDATE>m.HIREDATE and e.dept_id =d.dept_id and e.dept_id=c.dept_id;
--21、4、列出所有 “某某3” （不同的部门都有这个人）的姓名及其部门名称，部门人数，工资等级。
select e.ename,d.dname,c.count,s.Grade_id from emp e,dept d,(select count(ename) count,dept_id from emp GROUP BY dept_id) c,SALGRADE s
where e.ename='某某3' and e.dept_id=d.dept_id and e.dept_id=c.dept_id and e.sal BETWEEN s.losal and hisal;









select add_months(sysdate,6) from dual;
select add_months('01-1月-19',6) from dual;
select next_day(add_months('01-1月-19',6),'星期一') from dual;
select to_char(next_day(add_months('01-1月-19',6),'星期一'),'yyyy-mm-dd') from dual;

SELECT TRANSLATE('jacjk','j' ,'b')FROM DUAL;

Select trim('x'  from  'xyzadamsx') from dual;

Select substr('abcdefg',-3) from dual;

--CHR和ASCII 
SELECT CHR(65) FROM dual; 
--LPAD和RPAD 
SELECT LPAD('function',15,'=') FROM dual;
--TRIM(char FROM set)
SELECT LENGTH('frances') FROM dual;
