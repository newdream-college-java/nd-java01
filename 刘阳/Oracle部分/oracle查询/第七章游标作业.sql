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