-- ��ϰһ
  -- ��Scott �û���emp ��Ϊ����Դ����дһ�����̸���Ա��������Ա��������нˮ����Ҫ��Ա��������нˮ��Ϊ���������
  set serveroutput on;
  declare
    empno_e number:='&Ա�����';
    ename_e emp.ename%type;
    sal_e emp.sal%type;
  begin
    select ename,sal into ename_e,sal_e from emp where empno=empno_e;
    dbms_output.put_line('Ա������'||ename_e||'Ա��нˮ'||sal_e);
  end;
  
--��ϰһ�������α꣨�α����ԣ�
  --��������PL/SQL�飬�����û�����Ĳ��ű�ţ�����Ա�����ʡ�
  set serveroutput on;
  declare
   dno number;
  begin
    dno:='&dno';
    update emp set sal=sal+100 where deptno=dno;
    --���ڴ˴���ȫ����ʵ�����蹦��
    --������³ɹ�����ʾ�û��ɹ������˶�������¼��������ʾ���Ų����ڡ�
    if sql%found then
      dbms_output.put_line('���µļ�¼����Ϊ��'||sql%rowcount);
    else
      dbms_output.put_line('���Ų�����');
    end if;
  end;
  
--��ϰ������ʾ�α�
  --ʹ����ʾ�α��дһ����������ʾscott�û���emp���dept���е�empno��ename��sal��deptno��dname����ֶ�ֵ��
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
      dbms_output.put_line('Ա�����'||emp_empno||'Ա������'||emp_ename||'Ա��нˮ'||emp_sal||'Ա�����ű��'||emp_deptno||'������'||dname_d);
    end loop;
    close select_e;
  end;
  
--��ϰ����ѭ���α� for
    --��д��������ʾ���������ƺ͸ò��Ű�����Ա��������Ҫ��ʹ����ʾ�ĵ�ѭ���α�ʵ�֡�
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
        dbms_output.put_line('���ű�ţ�'||deptno1||'�����ƣ�'||dname1);
        open emp1 for select ename from emp where deptno = deptno1;
        count1:=0;
      loop
        fetch emp1 into ename1;
        count1:=count1+1;
        exit when emp1%notfound;
        dbms_output.put_line('Ա��'||count1||':'||ename1);
      end loop;
        dbms_output.put_line(chr(13));
      end loop;
    close dept1;
  end;
  /
        
--��ϰ�ģ�ʹ���α��������
  --��userInfo.dmp �ļ��е����ݵ��뵽scott�û��£����а���UserInfo������UserInfo���пͻ����뱻�����ˣ����������дPL/SQL��䣬
  --�������������û������룬Ҫ���������Ϊ6λ����
  --��ʾ��dbms_random������ṩ������������ķ�����
  --ʵ����select dbms_random.value(0,100) from dual;����0-100֮��������
  --imp scott/scott123456@scott file=E:\Oracle\userInfo.dmp full=y;
  
--��ϰ�壬REF�α�
  --��scott�û����룬��дһ�δ��룬��ʾ�û�Ҫ�鿴�ĸ��ļ�¼������û�����'E'����ʾemp���е�empno��ename�е�ֵ������û�����'D'����ʾdept��
  --�е�deptno��dname�е�ֵ��
  set serveroutput on;
  declare
    tips char:='&��Ҫ�鿴��EΪemp��DΪdept��';
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
          dbms_output.put_line('Ա�����'||emp_row.empno||'Ա������'||emp_row.ename);
        end loop;
      close test1;
    elsif tips='D' then
      open test1 for select * from dept;
       loop
          fetch test1 into dept_row;
          exit when test1%notfound;
          dbms_output.put_line('Ա�����'||dept_row.deptno||'������'||dept_row.dname);
       end loop;
      close test1;
    else
      dbms_output.put_line('����������');
    end if;
  end;
  
--��ϰ�壬�����˵������£�
create table billInfo(
billID varchar2(14), --�˵���ţ���ʽΪ��ZD201005290001��
billDate date        --����ʱ��
);
--Ҫ���д����ʵ�ֿ������ܣ��������˵���Ų������¼��
create or replace procedure insert_d(b_id in billinfo.billID%type,b_date in billinfo.billdate%type)
as
begin
  insert into billinfo values(b_id,b_date);
  if sql%found then
    dbms_output.put_line('����˵��ɹ�');
    commit;
  else
    dbms_output.put_line('����˵�ʧ��');
    rollback;
  end if;
end;
  
 set serveroutput on;
 begin
  insert_d('ZD201005290001',to_date('1900-01-01','yyyy-mm-dd'));
 end;

select * from billinfo;















