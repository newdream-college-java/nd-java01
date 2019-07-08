
select * from dept;


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
OUTLNAS
BEGIN
	select floor(avg(sal)) into eavg from emp where deptno=edeptno;
end;

DECLARE
	aavg number(2,2);
BEGIN
	avg_emp(30,aavg);
	dbms_output.put_line(aavg);
end;

