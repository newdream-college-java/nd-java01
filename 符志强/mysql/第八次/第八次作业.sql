use test1;

select * from course;
select * from dept;
select * from emp;
select * from salgrade;
练习一：
emp表为数据源，编写一个过程根据员工编号输出员工姓名和薪水。
（要求将员工姓名和薪水作为输出参数）
delimiter //
drop procedure if exists y;
create PROCEDURE y(in name varchar(10) CHARSET 'utf8')
BEGIN
select ename,sal from emp where empno like name;
end
 //
call y(7369);	

练习二：
emp表为数据源，编写一个函数根据员工编号返回员工的入职时间。
delimiter //
drop procedure if exists e;
create PROCEDURE e(in name varchar(10) CHARSET 'utf8')
BEGIN
select HIREDATE from emp where empno like name;
end
 //
call e(7369);

练习三：
定义一个过程用作添加员工，在定义一个过程用作根据员工编号判断员工是否存在。
delimiter //
drop procedure if exists s;
create PROCEDURE s(in name varchar(10) CHARSET 'utf8')
BEGIN
INSERT INTO EMP VALUES(7599,'WARD1','SALESMAN',7698,'1981-02-22',1250,500,30);

select * from emp where empno like name;
end
 //
call s(7369);
