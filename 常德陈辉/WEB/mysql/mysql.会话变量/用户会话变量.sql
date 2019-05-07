#1，emp表为数据源，编写一个过程根据员工编号输出员工姓名和薪水。（要求将员工姓名和薪水作为输出参数）
delimiter //
create procedure emp_name_sal(in id int,out g VARCHAR(20),out x int)
begin
	select ename,sal+IFNULL(comm,0) into g,x from emp where empno=id;
END //
delimiter ;
call emp_name_sal(7499,@a,@b);
select @a,@b;

#2，emp表为数据源，编写一个函数根据员工编号返回员工入职时间。
delimiter //
create procedure emp_date(in id int,out t date)
BEGIN
	select hiredate into t from emp where empno=id;
end //
delimiter ;
call emp_date(7844,@d);
select @d;

#3，定义一个过程用作添加员工，再定义一个过程用作根据员工编号判断员工是否存在。
delimiter //
create procedure emp_yuanGong(in id int)
BEGIN
	insert into emp(empno) values (id);
end //
delimiter ;
call emp_yuanGong(1234);

delimiter //
create procedure emp_select(in id int)
begin
	select * from emp where EMPNO=id;
end //
delimiter ;
call emp_select(1234);








