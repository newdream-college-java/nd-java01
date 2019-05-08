delimiter $$
	create trigger UPDATE_emp before UPDATE on emp for each row 
	begin
		DECLARE nowtime int DEFAULT 0;
		DECLARE nowdate VARCHAR(20) DEFAULT 'monday';
		SELECT HOUR(CURRENT_TIME()) INTO nowtime;
		select DAYNAME(now())INTO nowdate;
			if(nowtime>=17||nowtime<=6||nowdate='Saturday'||nowdate='Sunday') THEN
				SIGNAL SQLSTATE 'HY000' SET message_text='手动抛出异常';
		end if;
	end $$
	
drop TRIGGER IF EXISTS UPDATE_emp;

delimiter $$
	create trigger INSERT_emp before INSERT on emp for each row 
	begin
		DECLARE nowtime int DEFAULT 0;
		DECLARE nowdate VARCHAR(20) DEFAULT 'monday';
		SELECT HOUR(CURRENT_TIME()) INTO nowtime;
		select DAYNAME(now())INTO nowdate;
			if(nowtime>=17||nowtime<=6||nowdate='Saturday'||nowdate='Sunday') THEN
				SIGNAL SQLSTATE 'HY000' SET message_text='手动抛出异常';
		end if;
	end $$
	
drop TRIGGER IF EXISTS INSERT_emp;

delimiter $$
	create trigger DELETE_emp before DELETE on emp for each row 
	begin
		DECLARE nowtime int DEFAULT 0;
		DECLARE nowdate VARCHAR(20) DEFAULT 'monday';
		SELECT HOUR(CURRENT_TIME()) INTO nowtime;
		select DAYNAME(now())INTO nowdate;
			if(nowtime>=17||nowtime<=6||nowdate='Saturday'||nowdate='Sunday') THEN
				SIGNAL SQLSTATE 'HY000' SET message_text='手动抛出异常';
		end if;
	end $$
	
drop TRIGGER IF EXISTS DELETE_emp;