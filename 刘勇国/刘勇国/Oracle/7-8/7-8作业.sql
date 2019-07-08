set serveroutput on;
declare 
dno number; 
begin 
	dno:='&dno';
	update emp set sal=sal+100 where empno=dno;
	if SQL%rowcount>0 then 
		SYS.DBMS_OUTPUT.PUT_LINE('此次提薪的人数为：'||SQL%rowcount);
	else 
		SYS.DBMS_OUTPUT.PUT_LINE('编号不存在');
	end if;
end;
/

-- 第一题
select * from emp;

set serveroutput on;
declare
 dno number;
begin
 dno:='&dno';
 update emp set sal=sal+100 where deptno=dno;
 if sql%rowcount>0 then
 dbms_output.put_line('更新了'||sql%rowcount||'条记录');
 else
 dbms_output.put_line('部门不存在');
 end if;
end;
/

-- 第二题 empno ename sal deptno dname
set serveroutput on;
declare 
cursor empS is select e.empno,e.ename,e.sal,d.deptno,d.dname from emp e,dept d where e.deptno=d.deptno;
empno1 emp.empno%type;
ename1 emp.ename%type;
sal1 emp.sal%type;
deptno1 dept.deptno%type;
dname1 dept.dname%type;
BEGIN
open empS;
loop
	fetch empS into empno1,ename1,sal1,deptno1,dname1;
  exit when empS%notfound;
  dbms_output.put_line(empno1||ename1||sal1||deptno1||dname1);
end loop;
close empS;
end;
/


-- 第三题
set serveroutput on;
declare 
cursor dept1 is select deptno,dname from dept;
type java01 is ref cursor;
emp1 java01;
ename1 emp.ename%type;
deptno1 dept.deptno%type;
dname1 dept.dname%type;
count1 number;
BEGIN
open dept1;
loop
	fetch dept1 into deptno1,dname1;
  exit when dept1%notfound;
  dbms_output.put_line('部门编号：'||deptno1||'，名称：'||dname1);
  open emp1 for select ename from emp where deptno = deptno1;
  count1:=0;
  loop
    fetch emp1 into ename1;
    count1:=count1+1;
    exit when emp1%notfound;
    dbms_output.put_line('员工'||count1||':'||ename1);
  end loop;
  dbms_output.put_line(chr(13));
end loop;
close dept1;
end;
/


-- 第四题
imp SCOTT/123456@orcl file=D:\Work\Oracle\workspace\userInfo.dmp full=y
select * from userinfo;
