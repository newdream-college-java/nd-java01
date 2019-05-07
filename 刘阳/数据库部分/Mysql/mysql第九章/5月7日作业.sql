-- 练习1：emp表为数据源，编写一个过程根据员工编号输出员工姓名和薪水。（要求将员工姓名和薪水作为输出参数）
delimiter //
CREATE PROCEDURE enamesalbyno(IN number int,OUT name1 VARCHAR(20),OUT xinshui INT)
BEGIN
SELECT ename,sal+IFNULL(comm,0) INTO name1,xinshui FROM emp where empno=number;
end //
drop PROCEDURE if EXISTS enamesalbyno;
delimiter ;
call enamesalbyno(7369,@name1,@xinshui);
SELECT @name1,@xinshui;

-- 练习2：emp表为数据源，编写一个函数根据员工号返回员工的入职时间
delimiter //
CREATE PROCEDURE jointimebyno(IN number int,OUT date1 date)
BEGIN
SELECT hiredate INTO date1 FROM emp where empno=number;
end //
drop PROCEDURE if EXISTS jointimebyno;
delimiter ;
call jointimebyno(7369,@date1);
SELECT @date1;

-- 练习3：定义一个过程用作添加员工，在定义一个过程用作根据员工编号判断员工是否存在
delimiter //
CREATE PROCEDURE addemp(IN number int)
BEGIN
INSERT into emp (empno,ename,job) VALUES(number,'ERGOU','CLERK');
end //

drop PROCEDURE if EXISTS addemp;
delimiter ;
call addemp(4567);

-- 第二个判断员工是否存在

delimiter //
CREATE PROCEDURE empexist(OUT number int,IN num int)
BEGIN
SELECT ifnull(empno,NULL) INTO number FROM emp where empno=num;
end //

drop PROCEDURE if EXISTS empexist;
delimiter ;
call empexist(@number,4458);
SELECT @number;