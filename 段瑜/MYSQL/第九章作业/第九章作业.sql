use test1;
desc emp;
select * from emp;
#emp表未数据源，编写一个过程根据员工编号输出员工姓名和薪水。（要求将员工姓名和薪水作为输出参数）
delimiter;
drop PROCEDURE if exists emp;
create PROCEDURE emp(in name varchar(20))
BEGIN	
	select ename,sal+comm from emp where empno like name;
end
call emp('7521');

#emp表为数据源，编写一个函数根据员工编号返回员工的入职时间
delimiter;
drop PROCEDURE if exists ems;
create procedure ems(in name varchar(20))
BEGIN	
	select hiredate from emp where empno like name;
END
call ems('7521')

#定义一个过程用做添加员工，在定义一个过程用作根据员工编号判断员工是否存在
delimiter;
drop PROCEDURE if exists ep;
create procedure ep(in number varchar(20))
BEGIN
	insert emp(empno,ename,job) values (number,'光头强','CLERK');
END
call ep('7343');

delimiter;
drop PROCEDURE if exists es;
CREATE PROCEDURE es(in name varchar(20),out num int)
BEGIN
	select ifnull(empno,null) into num from emp where empno like name;
END
call es('7379',@num);
select @num;
