1.emp表为数据源，编写一个过程根据员工编号输出员工姓名和薪水
(要求员工姓名和薪水作为输出参数)
desc salgrade
select * from salgrade
select * from emp
delimiter $$
create procedure cst(out cnt int)
BEGIN	
	select count(*) into cnt from studentinfo;
end $$
use test1
delimiter ;
call cst(@cnt);

select @cnt;

sal+ifnull(comm,0) as '薪水' from emp
1.emp表为数据源，编写一个过程根据员工编号输出员工姓名和薪水
(要求员工姓名和薪水作为输出参数)
drop procedure nameAndSal
delimiter //
create PROCEDURE nameAndSal(in no int,out name varchar(20),out money int)
BEGIN
select ename,sal+ifnull(comm,0) into name,money from emp where empno=no;
end //
set @no=7369;
call nameAndSal(@no,@name,@money);
select @name,@money


2.emp表为数据源，编写一个函数根据员工编号返回员工的入职时间
drop PROCEDURE time
delimiter //
create procedure time(in no int,out date1 varchar(20))
begin 
select hiredate into date1 from emp where emp.empno=no;
end //
set @no=7369;
call time(7369,@time1);
select @no,@time1
3.定义一个过程用做添加员工，再定义一个过程根据员工编号判断员工是否存在。
select * from emp
desc emp
delete from emp where empno='1234'

delimiter //
create procedure ifex(in eno int)
begin 
insert into emp(empno,ename) value(eno,'lyg');
end //
set @eno=1234;
call ifex(@eno)

delimiter //
create PROCEDURE enoexist(out empno int ,in num int)
begin 
select ifnull(empno,null) into empno from emp where empno=num;
end //

call enoexist(@empno,1234);
select @empno
