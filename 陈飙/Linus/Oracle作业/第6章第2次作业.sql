--1.隐式游标
DECLARE
dno number;
BEGIN
dno:='20';
update emp set sal=sal+100 where DEPTNO=dno;
if sql%rowcount>0 THEN
dbms_output.put_line('更改成功');
dbms_output.put_line('用户更新了'||sql%rowcount);
	end if;
end;
select * from emp
--2.显示游标
--2.1.定义一个游标
DECLARE
--声明
cursor empC is select empno,ename,sal from emp;
pempno EMP.EMPNO%TYPE;
pename EMP.ENAME%type;
esal EMP.SAL%TYPE;
BEGIN
if empC%isopen THEN
close empC;
end if;
open empC;
dbms_output.put_line('编号  姓名  工资');
loop --while循环
fetch empC into pempno,pename,esal; --取值
exit when empC%notfound;
dbms_output.put_line(pempno||' '||pename||' '||esal);
end loop;
end;




DECLARE
--声明
cursor empC is select e.empno,e.ename,e.sal,e.deptno,d.dname from emp e,dept d where e.deptno=d.deptno;
pempno EMP.EMPNO%TYPE;
pename EMP.ENAME%type;
esal EMP.SAL%TYPE;
pdeptno EMP.DEPTNO%type;
pdname DEPT.DNAME%type;
BEGIN
if empC%isopen THEN
close empC;
end if;
open empC;
dbms_output.put_line('编号  姓名  工资 部门号 部门名称');
loop --while循环
fetch empC into pempno,pename,esal,pdeptno,pdname; --取值
exit when empC%notfound;
dbms_output.put_line(pempno||' '||pename||' '||esal||' '||pdeptno||' '||pdname);
end loop;
end;
--2.2打开
--2.3使用
--2.4关闭
--练习3循环游标for
select * from emp;
select e.ename,e.deptno,d.dname from emp e,dept d  where e.DEPTNO=d.DEPTNO group by e.deptno,e.ename,d.DNAME;



declare
cursor empFor is select e.ename,e.deptno,d.dname from emp e,dept d  where e.DEPTNO=d.DEPTNO group by e.deptno,e.ename,d.DNAME;
BEGIN
dbms_output.put_line('行号 姓名 薪水');
for i in empFor
loop
if i.e.deptno=10 THEN
dbms_output.put_line('部门编号为：'||i.e.deptno||'名称为：'||i.d.dname);
--dbms_output.put_line('员工为：'||i.e.ename);
end if;
END loop;
end;


declare
cursor empSS is select es.ename,es.deptno,de.dname from emp es,dept de  where es.DEPTNO=de.DEPTNO group by es.deptno,es.ename,de.DNAME;
--pename EMP.ENAME%type;
BEGIN
--pename:=e.ename;
dbms_output.put_line('行号 姓名 薪水');
for i in empSS
loop
dbms_output.put_line(empSS%rowcount||i.es.ename); 
--dbms_output.put_line(); 
end loop;
end;

declare 
cursor emps1 is select * from emp;
cursor emps2 is select * from dept;
BEGIN
	for i in emps2 loop
dbms_output.put_line('部门编号为：'||i.deptno||'名称为：'||i.dname);
for j in emps1 loop
if j.deptno=i.deptno then
dbms_output.put_line('员工姓名：'||j.ename);
end if;
end loop;
end loop;
end;









fetch empFor into pename,pdeptno,pdname;
exit when empFor%notfound;
if pdeptno=10 THEN
dbms_output.put_line('部门编号为：10'||'名称为：'||pdname);
dbms_output.put_line('员工为：'||pename);

declare
cursor empS is select ename,sal from emp;
BEGIN
dbms_output.put_line('行号 姓名 薪水');

for i in empS
loop
if i.ename='SMITH' then
 dbms_output.put_line(i.ename||' '||i.sal); 
ELSE
dbms_output.put_line(i.ename||' '||i.sal); 
end if;
end loop;
end;

--1.声明
--2.判断关闭
--3.打开
--4.使用