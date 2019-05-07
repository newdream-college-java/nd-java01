习题1：emp表为数据源,编写一个过程根据员工编号输出员工姓名和薪水。(要求将员工和薪水作为输出参数)
DELIMITER //
  CREATE PROCEDURE se(in nub int ,out nm varchar(20),out sa int)
    BEGIN
      SELECT ename,SAL+IFNULL(COMM,0) into nm,sa FROM emp WHERE empno = nub;
    END
    //
	CALL se(7499,@n,@x)
SELECT @n,@x;
习题2：emp表为数据源,编写一个函数根据员工编号返回员工入职时间。
delimiter // 
	CREATE PROCEDURE emp_hiredate_date(in bh int,OUT dt date)
		BEGIN 
			SELECT hiredate INTO dt FROM  emp WHERE empno = bh;
		END 
	//
CALL emp_hiredate_date(7844,@dt)
SELECT @dt;
习题3：定义一个过程用作添加员工,再定义一个过程用作根据员工编号判断员工是否存在。
delimiter // 
 CREATE PROCEDURE createinfo(in eno int,in en VARCHAR(20))
		BEGIN 
			INSERT INTO emp(empno) VALUES (eno);
			INSERT INTO emp(ename) VALUES (en);
		END
		//
CALL createinfo(7938,'林');
SELECT @eno,@en;
