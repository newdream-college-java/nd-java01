-- 练习一
  -- 用Scott 用户的emp 表为数据源，编写一个过程根据员工编号输出员工姓名和薪水。（要求将员工姓名和薪水作为输出参数）
  set serveroutput on;
  declare
    empno_e number:='&员工编号';
    ename_e emp.ename%type;
    sal_e emp.sal%type;
  begin
    select ename,sal into ename_e,sal_e from emp where empno=empno_e;
    dbms_output.put_line('员工姓名'||ename_e||'员工薪水'||sal_e);
  end;
  
--练习一，隐氏游标（游标属性）
  --现有如下PL/SQL块，根据用户输入的部门编号，更新员工工资。
  set serveroutput on;
  declare
   dno number;
  begin
    dno:='&dno';
    update emp set sal=sal+100 where deptno=dno;
    --请在此处补全代码实现所需功能
    --如果更新成功则显示用户成功更新了多少条记录，否则提示部门不存在。
    if sql%found then
      dbms_output.put_line('更新的记录条数为：'||sql%rowcount);
    else
      dbms_output.put_line('部门不存在');
    end if;
  end;
  
--练习二，显示游标
  --使用显示游标编写一个程序，以显示scott用户中emp表和dept表中的empno，ename，sal，deptno，dname五个字段值。
  set serveroutput on;
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
      dbms_output.put_line('员工编号'||emp_empno||'员工姓名'||emp_ename||'员工薪水'||emp_sal||'员工部门编号'||emp_deptno||'部门名'||dname_d);
    end loop;
    close select_e;
  end;
  
--练习三，循环游标 for
    --编写程序以显示各部门名称和该部门包含的员工姓名，要求使用显示的的循环游标实现。
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
        
--练习四，使用游标更新数据
  --将userInfo.dmp 文件中的数据导入到scott用户下，其中包含UserInfo表，由于UserInfo表中客户密码被加密了，现在请你编写PL/SQL语句，
  --重新生成所有用户的密码，要求密码必须为6位数。
  --提示：dbms_random程序包提供了生成随机数的方法。
  --实例：select dbms_random.value(0,100) from dual;产生0-100之间的随机数
  --imp scott/scott123456@scott file=E:\Oracle\userInfo.dmp full=y;
  
--练习五，REF游标
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
  
--练习五，现有账单表如下：
create table billInfo(
billID varchar2(14), --账单编号，格式为’ZD201005290001‘
billDate date        --开单时间
);
--要求编写过程实现开单功能，即生成账单编号并插入记录。
create or replace procedure insert_d(b_id in billinfo.billID%type,b_date in billinfo.billdate%type)
as
begin
  insert into billinfo values(b_id,b_date);
  if sql%found then
    dbms_output.put_line('添加账单成功');
    commit;
  else
    dbms_output.put_line('添加账单失败');
    rollback;
  end if;
end;
  
 set serveroutput on;
 begin
  insert_d('ZD201005290001',to_date('1900-01-01','yyyy-mm-dd'));
 end;

select * from billinfo;















