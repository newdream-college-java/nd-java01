-- 1查询出每个员工的编号，姓名，职位
SELECT empno,ename,job from emp;

-- 2查询每个员工的岗位名称
SELECT ename,job from emp;

-- 3计算出每个员工一年的基本工资，同时显示出姓名和编号
SELECT empno,ename,sal*12 from emp;

-- 4计算出每个员工的年薪，每个月公司会补贴餐补200，交通300；年薪=（工资+奖金）*12
SELECT ename,(sal+200+300)*12+nvl(comm*12,0) "年薪" FROM emp;

-- 5查询出基本工资高于2000 的员工信息
SELECT * from emp where sal>2000;

-- 6查询出名字叫smith的所有信息
select * from emp where ename='SMITH';

-- 7查询出工资范围在1500—3000的全部员工信息（包括1500和3000）
SELECT * FROM emp where sal BETWEEN 1500 and 3000;

-- 8查询出所有员工姓名是以‘S’开的信息；
SELECT * from emp where ename like 'S%';

-- 9查询出员工姓名中第二个字是‘m’的信息
SELECT * from emp where ename like '_M%';

-- 10查询出所有员工信息，要求按工资排序；
SELECT * from emp order by sal;

-- 11查询出测试部工作的员工姓名、基本工资、入职日期，部门名称；
SELECT ename,sal,hiredate,dname from emp,DEPT where EMP.DEPTNO=DEPT.DEPTNO and dname='RESEARCH';

-- 12查询出所有员工的姓名，部门名称及工资；
SELECT ename,sal,dname from emp,DEPT where EMP.DEPTNO=DEPT.DEPTNO;

-- 13查出与“某某”员工在同一个部门工作的人员信息（前提不知道该员工在哪个部门）
SELECT * from emp where DEPTNO=(SELECT DEPTNO from emp where ename='SMITH');

-- 14查出薪资等于部门编号为30的员工的薪资的员工信息；
SELECT * from emp where sal IN(SELECT sal from emp where DEPTNO='30');

-- 15查出薪资高于部门编号为30的员工的薪资的员工信息；
SELECT * from emp where sal>(SELECT sal from(SELECT sal from emp where DEPTNO='30' ORDER BY sal DESC) where ROWNUM<2);

-- 16查出高于整个公司平均薪资的人员信息；
SELECT * from emp where sal>(SELECT avg(sal) FROM EMP);

-- 17查出每个部门有多少人；以及部门编号和部门ID
SELECT DEPTNO "部门编号",count(ename) from emp GROUP BY DEPTNO;

-- java一班的同学 做  二班的同学先不做
-- 1、列出与 “某某1” 从事相同工作的所有员工及部门名称，部门人数。
SELECT e.ENAME,d.dname,(SELECT count(*) from EMP GROUP BY EMPNO) from emp e,DEPT d where e.DEPTNO=d.DEPTNO and e.ENAME='SMITH';
-- 2、列出薪金比 “某某1” 或 “某某2” 多的所有员工的编号，姓名，部门名称，其领导姓名，部门人数。
SELECT EMP.DEPTNO,ename,DEPT.DNAME,EMP2.empno,count(*) from emp as e1,emp as e2,dept where 

-- 3、列出受雇日期早于其直接上级的所有员工的编号，姓名，部门名称，部门位置，部门人数。
select * from (select a.counts,a.deptno,e.empno,e.ename,d.dname,d.loc,months_between(sysdate,p.hiredate) ptime,months_between(sysdate,e.hiredate) etime  
from emp e ,emp p,dept d,(select count(*) counts,deptno from emp e  group by e.deptno) a where e.mgr=p.empno and d.DEPTNO=e.DEPTNO and a.deptno=e.deptno
) s where s.PTIME<s.ETIME

-- 4、列出所有 “某某3” （不同的部门都有这个人）的姓名及其部门名称，部门人数，工资等级。
SELECT ENAME,DNAME,count(*),SALGRADE.GRADE from emp,DEPT,SALGRADE where EMP.DEPTNO=DEPT.DEPTNO GROUP BY DEPTNO HAVING sal BETWEEN SALGRADE.LOSAL AND SALGRADE.HISAL;


SELECT ENAME,HIREDATE "入职时间",TO_CHAR(NEXT_DAY(ADD_MONTHS(HIREDATE, 6),'Monday'),'yyyy-mm-dd') "涨工资时间" FROM EMP

SELECT RTRIM('xyzadams','ams')from dual;















