--1、根据输入的部门编号更新员工工资
set serveroutput on;
DECLARE
	dno number;
BEGIN	
	dno:='20';
	update emp set sal=sal+100 where DEPTNO=dno;
	if sql%rowcount>0 THEN
		dbms_output.put_line('更新成功：'||sql%rowcount);
	ELSE	
		dbms_output.put_line('更新失败');
	end if;
end;
/


--显示emp表和dept表中的empno,ename,sal,deptno,dname五个字段值
set serveroutput on;
DECLARE
cursor sefor is select e1.empno,e1.ename,e1.sal,d1.deptno,d1.dname from emp e1,dept d1 where e1.DEPTNO=d1.DEPTNO;
pempno EMP.empno%type;
pename EMP.ename%type;
psal EMP.sal%type;
pdeptno DEPT.deptno%type;
pdname dept.dname%type;
BEGIN	
  open sefor;
	dbms_output.put_line('员工编号'||'员工姓名'||'员工工资'||'部门编号'||'部门名称');
		loop 
			fetch sefor into pempno,pename,psal,pdeptno,pdname;
				exit when sefor%notfound;
				dbms_output.put_line(pempno||pename||psal||pdeptno||pdname);
		end loop;
	close seFor;
end;
/

--循环显示该部门的员工姓名。要求显示的循环游标显示
set serveroutput on;
DECLARE
	cursor deptfor is select * from dept;
	cursor em is select * from emp;
begin 
	for dp in deptfor loop
		dbms_output.put_line('员工编号'||dp.deptno||'员工姓名'||dp.dname);
		for es in em loop
				dbms_output.put_line('员工姓名'||em%rowcount||es.ename);
				end loop;
		dbms_output.put_line(chr(13));
	end loop;
end;
/

--4、修改密码，密码为随机数产生
set serveroutput on;
declare
  cursor us is select customerid from userinfo;
  pid userinfo.customerid%type;
begin
  open us;
    loop
      fetch us into pid;
      exit when us%notfound;
      update userinfo set PASSWORD=(select round(dbms_random.value(100000,999999)) from dual) where CUSTOMERID= pid;
      if sql%ROWCOUNT>0 then 
        dbms_output.put_line('修改成功');
        commit;
      else
         dbms_output.put_line('修改失败');
         rollback;
     end if; 
    end loop;
end;
/

练习五，REF游标
  --以scott用户登入，编写一段代码，提示用户要查看哪个的记录，如果用户输入'E'则显示emp表中的empno，ename列的值；如果用户输入'D'则显示dept表
  --中的deptno，dname列的值。
  set serveroutput on;
  declare
    tips char:='&您要查看表（E为emp表，D为dept表）';
    type table1 is ref cursor;
    test1 table1;
    emp_row emp%rowtype;
    dept_row dept%rowtype;
  begin
    if tips='E' then
      open test1 for select * from emp;
        loop
          fetch test1 into emp_row;
          exit when test1%notfound;
          dbms_output.put_line('员工编号'||emp_row.empno||'员工姓名'||emp_row.ename);
        end loop;
      close test1;
    elsif tips='D' then
      open test1 for select * from dept;
       loop
          fetch test1 into dept_row;
          exit when test1%notfound;
          dbms_output.put_line('员工编号'||dept_row.deptno||'部门名'||dept_row.dname);
          
       end loop;
      close test1;
    else
      dbms_output.put_line('您输入有误');
    end if;
  end;
/
--6、存储过程
set serveroutput on;
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

