--1����������Ĳ��ű�Ÿ���Ա������
set serveroutput on;
DECLARE
	dno number;
BEGIN	
	dno:='20';
	update emp set sal=sal+100 where DEPTNO=dno;
	if sql%rowcount>0 THEN
		dbms_output.put_line('���³ɹ���'||sql%rowcount);
	ELSE	
		dbms_output.put_line('����ʧ��');
	end if;
end;
/


--��ʾemp���dept���е�empno,ename,sal,deptno,dname����ֶ�ֵ
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
	dbms_output.put_line('Ա�����'||'Ա������'||'Ա������'||'���ű��'||'��������');
		loop 
			fetch sefor into pempno,pename,psal,pdeptno,pdname;
				exit when sefor%notfound;
				dbms_output.put_line(pempno||pename||psal||pdeptno||pdname);
		end loop;
	close seFor;
end;
/

--ѭ����ʾ�ò��ŵ�Ա��������Ҫ����ʾ��ѭ���α���ʾ
set serveroutput on;
DECLARE
	cursor deptfor is select * from dept;
	cursor em is select * from emp;
begin 
	for dp in deptfor loop
		dbms_output.put_line('Ա�����'||dp.deptno||'Ա������'||dp.dname);
		for es in em loop
				dbms_output.put_line('Ա������'||em%rowcount||es.ename);
				end loop;
		dbms_output.put_line(chr(13));
	end loop;
end;
/

--4���޸����룬����Ϊ���������
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
        dbms_output.put_line('�޸ĳɹ�');
        commit;
      else
         dbms_output.put_line('�޸�ʧ��');
         rollback;
     end if; 
    end loop;
end;
/

��ϰ�壬REF�α�
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
/
--6���洢����
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
dbms_output.put_line(empno2||'�Ĺ���Ϊ'||ename2);
end;

--������
 
 --����
create table billinfo(
billID varchar2(14),
billdate date);

--����
CREATE SEQUENCE SEQ_DEMO 
INCREMENT BY 1 
START WITH 1 
NOMAXvalue 
NOCYCLE 
NOCACHE;

--�洢����
create or replace procedure bill is 
begin
insert into billinfo values('ZD'||TO_CHAR(SYSDATE,'yyyymmdd')||'000'||SEQ_DEMO.nextval,SYSDATE);
if SQL%notfound THEN
	SYS.DBMS_OUTPUT.PUT_LINE('���ʧ��');
	ELSE
	SYS.DBMS_OUTPUT.PUT_LINE('��ӳɹ�');
	end if;

end;

begin
bill;
end;

