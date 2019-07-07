
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

