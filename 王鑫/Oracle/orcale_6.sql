--��ϰһ����ʽ�α�(�α�����)
DECLARE
dno NUMBER;
BEGIN
dno:='&dno';
UPDATE emp SET sal= sal+100 WHERE deptno = dno;
IF SQL%rowcount>0 THEN
	dbms_output.put_line('�޸ĳɹ�...');
ELSE 
	dbms_output.put_line('�޸�ʧ��...');
END if;
END;
/

--��ϰ������ʾ�α�--ʹ����ʾ�α��дһ����������ʾscott�û���emp
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
		dbms_output.put_line('Ա�����:'||emp_empno||',  Ա������:'||emp_ename||',  Ա��нˮ:'||emp_sal||',  Ա�����ű��:'||emp_deptno||',  ������:'||dname_d);
	end loop;
	close select_e;
end;

--��ϰ����ѭ���α�for
--	��д���򰴲�����ʾ��Ա������0
declare 
user1 varchar2(10);
type java01 is ref cursor;
shiti java01;
empno1 emp.empno%type;
ename1 emp.ename%type;
deptno1 dept.deptno%type;
dname1 dept.dname%type;
begin
 user1:='&������һ������';
 if user1='E' then
  dbms_output.put_line('E');
  open shiti for select empno,ename from emp;
  loop
    fetch shiti into empno1,ename1;
    exit when shiti%notfound;
    dbms_output.put_line('ְԱ��ţ�'||empno1||'�����ƣ�'||ename1);
  end loop;
  close shiti;
elsif user1='D' then 
  dbms_output.put_line('D');
  open shiti for select deptno,dname from dept;
  loop
    fetch shiti into deptno1,dname1;
    exit when shiti%notfound;
    dbms_output.put_line('���ű�ţ�'||deptno1||'�����ƣ�'||dname1);
  end loop;
  close shiti;
else 
  dbms_output.put_line('��������');
end if;
end;
/



 --��ϰ��
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























