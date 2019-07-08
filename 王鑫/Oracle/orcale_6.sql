--练习一、隐式游标(游标属性)
DECLARE
dno NUMBER;
BEGIN
dno:='&dno';
UPDATE emp SET sal= sal+100 WHERE deptno = dno;
IF SQL%rowcount>0 THEN
	dbms_output.put_line('修改成功...');
ELSE 
	dbms_output.put_line('修改失败...');
END if;
END;
/

--练习二、显示游标--使用显示游标编写一个程序，以显示scott用户中emp
declare
	cursor select_e is select e.empno,e.ename,e.sal,e.deptno,d.dname from emp e,dept d where e.deptno=d.deptno;
	emp_empno emp.empno%type;
	emp_ename emp.ename%type;
	emp_sal emp.sal%type;
	emp_deptno emp.deptno%type;
	dname_d dept.dname%type;
begin
	open select_e;
	loop
		fetch select_e into emp_empno,emp_ename,emp_sal,emp_deptno,dname_d;
		exit when select_e%notfound;
		dbms_output.put_line('员工编号:'||emp_empno||',  员工姓名:'||emp_ename||',  员工薪水:'||emp_sal||',  员工部门编号:'||emp_deptno||',  部门名:'||dname_d);
	end loop;
	close select_e;
end;

--练习三、循环游标for
--	编写程序按部门显示其员工姓名0
declare 
user1 varchar2(10);
type java01 is ref cursor;
shiti java01;
empno1 emp.empno%type;
ename1 emp.ename%type;
deptno1 dept.deptno%type;
dname1 dept.dname%type;
begin
 user1:='&请输入一串中文';
 if user1='E' then
  dbms_output.put_line('E');
  open shiti for select empno,ename from emp;
  loop
    fetch shiti into empno1,ename1;
    exit when shiti%notfound;
    dbms_output.put_line('职员编号：'||empno1||'，名称：'||ename1);
  end loop;
  close shiti;
elsif user1='D' then 
  dbms_output.put_line('D');
  open shiti for select deptno,dname from dept;
  loop
    fetch shiti into deptno1,dname1;
    exit when shiti%notfound;
    dbms_output.put_line('部门编号：'||deptno1||'，名称：'||dname1);
  end loop;
  close shiti;
else 
  dbms_output.put_line('输入有误！');
end if;
end;
/



 --练习四
 declare
 cursor c1 is select * from USERINFO;
 sur USERINFO%rowtype;
 begin
 open c1;
 loop
 fetch c1 into sur;
 exit when c1%notfound;
 update USERINFO set PASSWORD=(select trunc(dbms_random.value(100000, 999999)) from dual) where CUSTOMERID=sur.CUSTOMERID; 
 end loop;
 end;























