--第一题
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
--第二题
 set serveroutput on;
  declare
    cursor ed_cur is select e.empno,e.ename,e.sal,e.deptno,d.dname from emp e,dept d where e.deptno=d.deptno;
    edEmpno emp.empno%type;
    edEname emp.ename%type;
    edSal emp.sal%type;
    edEptno emp.deptno%type;
    edDname dept.dname%type;
  begin
    open ed_cur;
    loop
      fetch ed_cur into edEmpno,edEname,edSal,edEptno,edDname;
      exit when ed_cur%notfound;
      dbms_output.put_line('员工编号'||edEmpno||'员工姓名'||edEname||'员工薪水'||edSal||'员工部门编号'||edEptno||'部门名'||edDname);
    end loop; 
    close ed_cur;
 end; 
 --第三题
set serveroutput on;
 declare
 cursor c1 is select * from emp;
 cursor c2 is select * from dept;
 begin
 for depts in c2 loop
  dbms_output.put_line('部门名称'||depts.dname||'部门编号'||depts.deptno);
 for emps in c1 loop
 if emps.deptno=depts.deptno then
 dbms_output.put_line('员工姓名'||emps.ename);
 end if;
 end loop;
 end loop;
 end;
 --第四题
 declare
 cursor c1 is select * from USERINFO;
 sur USERINFO%rowtype;
 begin
 open c1;
 loop
 fetch c1 into sur;
 exit when c1%notfound;
 update USERINFO set PASSWORD=(select trunc(dbms_random.value(100000, 999999)) from dual) where  CUSTOMERID=sur.CUSTOMERID; 
 end loop;
 end;
--第五题
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
--第六题
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
begin
bill;
end;