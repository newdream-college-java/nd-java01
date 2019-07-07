-- 1.创建一个过程，能向dept表中添加一个新记录,使用in类型参数；
CREATE PROCEDURE add_new(name VARCHAR2)
AS
BEGIN
	insert into dept values(50,name,'ChangSha');
END
BEGIN
	add_new(50);
end;

--2.从scott.emp表中查询给定职工姓名和工资。（要求：利用out模式的参数将值传给调用者，in模式传入员工编号。
create PROCEDURE SELECT_ns(num NUMBER,uname out VARCHAR2,sals out NUMBER)
AS
BEGIN
	uname:=SELECT ename from emp where empno=num;
	sals:=SELECT sal from emp where empno=num;
END;
BEGIN
	SELECT_ns(7788,uname,sals);
	dbms_output.put_line(uname);
	dbms_output.put_line(sals);
end;

--3.创建存储过程，根据员工编号删除scott.emp表中的相关记录。
create PROCEDURE DELETE_ns(num NUMBER)
AS
BEGIN
	DELETE FROM emp where empno=num;
END;
BEGIN
	DELETE_ns(7788);
end;

--4.编写一个过程，指定一个员工编号与一个工资增加的百分比，使emp表中将该员工的工资（sal）增加输入的百分比。
create PROCEDURE update_ns(num NUMBER,saladd NUMBER)
AS
BEGIN
	update emp set sal=sal*(1+saladd%) where empno=num;
END;

--5.创建存储过程，根据给定的部门编号(由调用语句提供)计算该部门所有职工的平均工资(使用out参数输出) 
create PROCEDURE count_avgsal(num NUMBER,avgsal out NUMBER)
AS
BEGIN
	SELECT avg(e.sal) into avgsal from dept d,emp e where d.DEPTNO=num and e.DEPTNO=num;
END;
BEGIN
	count_avgsal(20,avgsal);
	dbms_output.put_line(avgsal);
end;


