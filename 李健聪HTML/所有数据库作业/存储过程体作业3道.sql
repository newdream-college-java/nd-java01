存储过程体：
局部变量：
在存储过程体中可以声明局部变量，用来存储存储过程体中临时结果。
declare var_name[....] type[DEFAULT VALUE] 
例子：     declare 名字  类型;  DECLARE name varchar(20);
drop procedure if exists myproc;
create procedure myproc()
begin
DECLARE cid int;
set cid=10;-- 通过set对局部变量cid进行复制
select cid;
end;
-- 除了可以使用set语句为局部变量赋值，还可以使用select...into语句为局部变量赋值：	


SELECT * from emp1;
SELECT * from dept1;
SELECT * from salgrade1;

DROP PROCEDURE if EXISTS emp_ns;
CREATE PROCEDURE emp_ns(in name VARCHAR(20) CHARSET'utf8',in nsal int)
BEGIN
SELECT ename 

流程控制语句
条件语句—if语句
       case语句

循环语句—while
 repeat
 loop

条件语句-if语句
if 条件 then
执行语句
[elseif 条件 then 执行语句]
 else
执行语句
 end if;
SELECT * FROM studentexam;
列子：输入姓名显示对应姓名的学生成绩
DROP PROCEDURE if EXISTS sp_level;
create procedure  sp_level(in p_level char(1))
BEGIN
if p_level='A' THEN
SELECT * FROM studentexam WHERE  examid>6;
ELSEIF p_level='B' THEN
SELECT * FROM studentexam WHERE  examid>4;
ELSEIF p_level='C' THEN
SELECT * FROM studentexam WHERE  examid>2;
ELSE
SELECT estuid from studentexam;
end IF;
end

CALL sp_level(@p_level);
SELECT sp_level(@p_level);


desc emp1;
SELECT * from emp1;
emp表为数据源，编写一个过程根据员工编号输出员工姓名和薪水(要求将员工姓名和薪水作为输出参数)
DROP PROCEDURE emp_ns;
create PROCEDURE emp_ns(in number int(11) ,out Aename VARCHAR(10) ,out sa double)
BEGIN
SELECT ename,sal+IFNULL(comm,0) into Aename,sa from emp1 WHERE empno=number;
END

CALL emp_ns(7369,@Aename,@sa);
SELECT @Aename,@sa;

emp表为数据库，编写一个函数根据员工能编号返回员工的入职时间

CREATE PROCEDURE emp_hiredate(in number int(11),out _hiredate date)
BEGIN
SELECT hiredate into _hiredate from emp1 where empno=number;
end

call emp_hiredate(7369,@_hiredate);
SELECT @_hiredate;


desc emp1;
SELECT * from emp1;
定义一个过程用作添加员工，再定义一个过程用作根据员工编号判断员工是否存在
DROP PROCEDURE add_job;
DELIMITER //
create procedure add_job(in number int(11)) 
BEGIN
INSERT into emp1(empno,ename,job) VALUES(number,'CLE','CLERK');
END
//
CALL add_job(5065);
SELECT * from emp1 WHERE empno=5065;

删除show——show方法过程


delimiter $$
create PROCEDURE show_show(in number int(11),out anumber int(11))
BEGIN
SELECT ifnull(empno,null) into anumber FROM emp1 where empno=number;
END
$$
DROP PROCEDURE if exists show_show;
delimiter ;
CALL show_show(5065,@anumber);

SELECT @anumber;









