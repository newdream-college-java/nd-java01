--1.����һ������EMP_VU����ͼ�������зֱ�������EMP���empno,ename,deptno����ename�и���ΪEMPLOYEE������ͼ�ܹ���ȡEMP�����е���Ϣ��������Ӹ���ͼ�������ݡ�
create view EMP_VU as 
select 
	empno,ename EMPLOYEE,deptno 
from emp with read only;


--2.��ѯ��EMP_VU���������ݡ�����ͼ����SMITH������Ϊ��JHON����
select * from EMP_VU;
update EMP_VU set employee = 'JHON';
--3.�������ֵ�USER_VIEWS�У���ȡ��ͼ���ƣ�VIEW_NAME������ͼ�ı���TEXT������Ϣ��
create view USER_VU as 
select 
	VIEW_NAME,TEXT 
from USER_VIEWS ;

select * from USER_VU;
--4.����һ������DEPT20����ͼ������ͼ�а�����20�Ų��ŵĹ�Ա�ţ���Ա���֣��������ƣ��ֱ�����Ϊ��EMPLOYEE_ID, EMPLOYEE, �� DEPARTMENT_ID��
create view DEPT20 as 
select 
	e.deptno EMPLOYEE_ID,e.ename EMPLOYEE,d.dname DEPARTMENT_ID 
from emp e,dept d where e.deptno=20 and e.deptno=d.deptno;

select * from DEPT20;


--1.����һ��������������DEPARTMENT  (dept)������ֵ������������ΪDEPT_ID_SEQ�����ĳ�ʼֵΪ60�����ֵΪ200��ÿ�ε���10,���Ҳ���ѭ��ʹ����Щֵ��
create sequence DEPT_ID_SEQ
start with 60
increment by 10
maxvalue 200
NOCYCLE

--2.��user_sequences��ͼ�в���������ơ����ֵ������ֵ������һ��ֵ����Ϣ��
select sequence_name ��������,max_value ���ֵ,increment_by ����ֵ,last_number ��һ��ֵ from user_sequences;

select * from user_sequences;

--3.дһ���ű�����DEPARTMENT  (dept)���в���������Ϣ��Ҫ��ʹ�����洴�����������������źţ�����ʾ�û����벿�����ƺͲ��ŵ�ַ��ִ�иýű���

--4.��EMPLOYEE (EMP)���е�deptno���ϴ���һ����Ψһ����deptno_idx��
select * from EMP;
create index deptno_idx on emp(deptno);

--1������һ�����̣�����dept�������һ���¼�¼,ʹ��in���Ͳ�����
create or replace procedure insert_dept(ddeptno in DEPT.DEPTNO%type,ddname in DEPT.DNAME%type,dloc in DEPT.LOC%type)
as
BEGIN
	insert into dept values(ddeptno,ddname,dloc);
end;

BEGIN
	INSERT_DEPT('50','zz','china');
end;

-- 2����scott.emp���в�ѯ����ְ�������͹��ʡ���Ҫ������outģʽ�Ĳ�����ֵ���������ߣ�inģʽ����Ա����š�
drop procedure select_emp;
create or replace procedure select_emp(eempno in EMP.EMPNO%type,eename out EMP.ENAME%type,esal out EMP.sal%type)
as
BEGIN
	select ename,sal into eename,esal from emp where empno=eempno;
end;

DECLARE
	ename EMP.ENAME%type;
	sal EMP.sal%type;
BEGIN
	select_emp(7788,ename,sal);
	dbms_output.put_line(ename);
	dbms_output.put_line(sal);
end;

--3�������洢���̣�����Ա�����ɾ��scott.emp���е���ؼ�¼��
--����ʾ���ɵ�������ṩ��Ա�������ɾ����¼��
create or replace procedure delet_emp(eempno in EMP.EMPNO%type)
AS
BEGIN
	delete from emp where empno=eempno;
end; 

BEGIN
	delete_emp(4444);
end;

-- 4����дһ�����̣�ָ��һ��Ա�������һ���������ӵİٷֱȣ�ʹemp���н���Ա���Ĺ��ʣ�sal����������İٷֱȡ�
create or replace procedure update_emp(eempno in EMP.EMPNO%type,Percentage in number(2,1));
AS
BEGIN
	update emp set sal=(sal*percentage) where empno=eempno;
end;

-- 5�������洢���̣����ݸ����Ĳ��ű��(�ɵ�������ṩ)����ò�������ְ����ƽ������(ʹ��out�������)
create or replace procedure avg_emp(edeptno in EMP.DEPTNO%type,eavg out number(2,2))
AS
BEGIN
	select floor(avg(sal)) into eavg from emp where deptno=edeptno;
end;

DECLARE
	aavg number(2,2);
BEGIN
	avg_emp(30,aavg);
	dbms_output.put_line(aavg);
end;
