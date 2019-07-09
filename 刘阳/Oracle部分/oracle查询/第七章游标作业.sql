-- 第一题补全隐式游标 
--请在此处补全代码实现所需功能
--如果更新成功则显示用户成功更新了多少条记录，否则提示部门不存在
set serveroutput on;
DECLARE
dno NUMBER;
BEGIN
dno:='&dno';
UPDATE emp SET sal= sal+100 WHERE deptno = dno;
----------------------------------
IF SQL%rowcount>0 THEN
	dbms_output.put_line('成功更新了'||SQL%rowcount||'条数据');
ELSE 
	dbms_output.put_line('部门不存在！！！！');
END if;
END;
/

-- 第二题显式游标显示emp表和dept表的五个字段
-- 显示scott用户中emp表和dept表中的empno，ename，sal，deptno，dname五个字段值。
 set serveroutput on;
  declare
    cursor gugu is select e.empno,e.ename,e.sal,e.deptno,d.dname from emp e,dept d where e.deptno=d.deptno;
    e_empno emp.empno%type;
    e_ename emp.ename%type;
    e_sal emp.sal%type;
    e_deptno emp.deptno%type;
    dept_name dept.dname%type;
  begin
    open gugu;
    loop
      fetch gugu into e_empno,e_ename,e_sal,e_deptno,dept_name;
      exit when gugu%notfound;
      dbms_output.put_line('员工编号'||e_empno||'员工姓名'||e_ename||'薪酬'||e_sal||'部门编号'||e_deptno||'部门名字'||dept_name);
    end loop;
    close gugu;
  end;

  -- 第三题 循环输出
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
/

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