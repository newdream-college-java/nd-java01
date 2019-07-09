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

-- 第五题
set serveroutput on;
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

-- 第六题
create or replace procedure selectGetEnameAndMoneyByEmpno(empno1 number,ename1 out varchar2,money out number) 
as
begin
    -- select ename into ename1,sal+nvl(comm,0) into money from emp where empno=empno1;
    select ename into ename1 from emp where empno=empno1;
    select sal+nvl(comm,0) into money from emp where empno=empno1;
end;
/

set serveroutput on;
declare 
empno2 emp.empno%type;
ename2 emp.ename%type;
money2 number;
begin
empno2:=7369;
selectGetEnameAndMoneyByEmpno(empno2,ename2,money2);
dbms_output.put_line(empno2||'的工资为'||ename2);
end;


select * from emp;

--第七题
 
 --建表
create table billinfo(
billID varchar2(14),
billdate date);

--序列
CREATE SEQUENCE SEQ_DEMO 
INCREMENT BY 1 
START WITH 1 
NOMAXvalue 
NOCYCLE 
NOCACHE;

--存储过程
create or replace procedure bill is 
begin
insert into billinfo values('ZD'||TO_CHAR(SYSDATE,'yyyymmdd')||'000'||SEQ_DEMO.nextval,SYSDATE);
  if SQL%notfound THEN
	SYS.DBMS_OUTPUT.PUT_LINE('添加失败');
	ELSE
	SYS.DBMS_OUTPUT.PUT_LINE('添加成功');
	end if;
end;
/

begin
bill;
end;


