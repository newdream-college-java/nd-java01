--1.创建一个叫做EMP_VU的视图，它的列分别来自于EMP表的empno,ename,deptno；将ename列改名为EMPLOYEE。该视图能够获取EMP所有行的信息。不允许从该视图更改数据。
create view EMP_VU as 
select 
	empno,ename EMPLOYEE,deptno 
from emp with read only;


--2.查询出EMP_VU的所有数据。并试图更改SMITH的名字为“JHON”。
select * from EMP_VU;
update EMP_VU set employee = 'JHON';
--3.从数据字典USER_VIEWS中，获取视图名称（VIEW_NAME）和视图文本（TEXT）的信息。
create view USER_VU as 
select 
	VIEW_NAME,TEXT 
from USER_VIEWS ;

select * from USER_VU;
--4.创建一个叫做DEPT20的视图，该视图中包括第20号部门的雇员号，雇员名字，部门名称；分别命名为：EMPLOYEE_ID, EMPLOYEE, 和 DEPARTMENT_ID。
create view DEPT20 as 
select 
	e.deptno EMPLOYEE_ID,e.ename EMPLOYEE,d.dname DEPARTMENT_ID 
from emp e,dept d where e.deptno=20 and e.deptno=d.deptno;

select * from DEPT20;


--1.创建一个序列来产生表DEPARTMENT  (dept)的主键值。该序列名字为DEPT_ID_SEQ，它的初始值为60，最大值为200，每次递增10,并且不能循环使用这些值。
create sequence DEPT_ID_SEQ
start with 60
increment by 10
maxvalue 200
NOCYCLE

--2.从user_sequences视图中查出序列名称、最大值、递增值、何下一个值的信息。
select sequence_name 序列名称,max_value 最大值,increment_by 递增值,last_number 下一个值 from user_sequences;

select * from user_sequences;

--3.写一个脚本，往DEPARTMENT  (dept)表中插入两行信息，要求使用上面创建的序列来产生部门号，并提示用户输入部门名称和部门地址。执行该脚本。

--4.在EMPLOYEE (EMP)表中的deptno列上创建一个非唯一索引deptno_idx。
select * from EMP;
create index deptno_idx on emp(deptno);




select * from dept;


--1、创建一个过程，能向dept表中添加一个新记录,使用in类型参数；
create or replace procedure insert_dept(ddeptno in DEPT.DEPTNO%type,ddname in DEPT.DNAME%type,dloc in DEPT.LOC%type)
as
BEGIN
	insert into dept values(ddeptno,ddname,dloc);
end;

BEGIN
	INSERT_DEPT('50','zz','china');
end;

-- 2、从scott.emp表中查询给定职工姓名和工资。（要求：利用out模式的参数将值传给调用者，in模式传入员工编号。
drop procedure select_emp;
create or replace procedure select_emp(eempno in EMP.EMPNO%type,eename out EMP.ENAME%type,esal out EMP.sal%type)
as
BEGIN
	select ename,sal into eename,esal from emp where empno=eempno;
end;

DECLARE
	ename EMP.ENAME%type;
	sal EMP.sal%type;
BEGIN
	select_emp(7788,ename,sal);
	dbms_output.put_line(ename);
	dbms_output.put_line(sal);
end;

--3、创建存储过程，根据员工编号删除scott.emp表中的相关记录。
--（提示：由调用语句提供的员工编号来删除记录）
create or replace procedure delet_emp(eempno in EMP.EMPNO%type)
AS
BEGIN
	delete from emp where empno=eempno;
end; 

BEGIN
	delete_emp(4444);
end;

-- 4、编写一个过程，指定一个员工编号与一个工资增加的百分比，使emp表中将该员工的工资（sal）增加输入的百分比。
create or replace procedure update_emp(eempno in EMP.EMPNO%type,Percentage in number(2,1));
AS
BEGIN
	update emp set sal=(sal*percentage) where empno=eempno;
end;

-- 5、创建存储过程，根据给定的部门编号(由调用语句提供)计算该部门所有职工的平均工资(使用out参数输出)
create or replace procedure avg_emp(edeptno in EMP.DEPTNO%type,eavg out number(2,2))
AS
BEGIN
	select floor(avg(sal)) into eavg from emp where deptno=edeptno;
end;

DECLARE
	aavg number(2,2);
BEGIN
	avg_emp(30,aavg);
	dbms_output.put_line(aavg);
end;

