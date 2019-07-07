--创建约束
--创建一个过程，能向dept表中添加一个新记录,使用in类型参数
create or replace procedure p_int(v1 in VARCHAR2 )
as 
v2 DEPT.dname%type;
BEGIN
v2:=v1;
insert into dept values(60,v2,'CHANGSHA');
end;

BEGIN
p_int('SB');
end;

select * from dept;
select * from emp;
select ename,sal from emp where empno=7369
--2.从scott.emp表中查询给定职工姓名和工资。（要求：利用out模式的参数将值传给调用者，in模式传入员工编号。
create or replace procedure p_out(v1 in NUMBER,e_name out VARCHAR2,e_sal out NUMBER)
AS
e_ot1 EMP.ENAME%type;
e_ot2 EMP.SAL%type;
BEGIN
select ENAME into e_ot1 from emp where EMPNO=v1;
select SAL into e_ot2 from emp where EMPNO=v1;
--放的顺序在执行语句后面，而且必须是查询放入本地变量，本地变量再赋值给输出参数
e_name:=e_ot1;
e_sal:=e_ot2;
end;

DECLARE
eot1 EMP.ENAME%type;
eot2 EMP.SAL%type;
begin 
p_out(7369,eot1,eot2); 
dbms_output.put_line('姓名是'||eot1);
dbms_output.put_line('工资是'||eot2);
end;

--3.创建存储过程，根据员工编号删除scott.emp表中的相关记录。
create or replace procedure e_delete(v1 in number)
AS
begin
delete from emp where empno=v1;
end;

BEGIN
e_delete(7934);
end;
--4.编写一个过程，指定一个员工编号与一个工资增加的百分比，使emp表中将该员工的工资（sal）增加输入的百分比
create or replace procedure e_sal(v1 in number,b2 in number,e_sal2 out NUMBER)
AS
e_sal EMP.SAL%type;
begin
select sal*b2 into e_sal from emp where empno=v1;
e_sal2:=e_sal;
end;
DECLARE
esal EMP.SAL%type;
BEGIN
e_sal(7788,0.3,esal);
dbms_output.put_line('工资是'||esal);
end;
--5.创建存储过程，根据给定的部门编号(由调用语句提供)计算该部门所有职工的平均工资(使用out参数输出)
create or replace procedure e_avg(v1 in number,e_sal out number)
AS
e_avgsal number;
BEGIN
select avg(sal) into e_avgsal from emp where DEPTNO=v1;
e_sal:=e_avgsal;
end;

DECLARE
eavg number;
v1 number:=20;
BEGIN
e_avg(v1,eavg);
dbms_output.put_line(v1||'部门的平均工资是'||eavg);
end;