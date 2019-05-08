use test1;
delimiter $$
create trigger UPDATE_emp before UPDATE on emp for each ROW
BEGIN
	declare nowtime int default 0;
	DECLARE nowday varchar(20) default 'monday';
	select hour(current_time()) into nowtime;
	select DAYNAME(now()) into nowday;
		if ( nowtime<=16||nowtime>=6||nowday='Saturday'||nowday='Sunday') THEN
			signal sqlstate 'HY000' set MESSAGE_TEXT='手动抛出异常';
		end if;
END $$
drop procedure if exists UPDATE_emp;

delimiter $$
create trigger INSERT_emp before insert on emp for each ROW
BEGIN
	declare nowtime int default 0;
	DECLARE nowday varchar(20) default 'monday';
	select hour(current_time()) into nowtime;
	select DAYNAME(now()) into nowday;
		if ( nowtime<=16||nowtime>=6||nowday='Saturday'||nowday='Sunday') THEN
			signal sqlstate 'HY000' set MESSAGE_TEXT='手动抛出异常';
		end if;
END $$
drop procedure if exists INSERT_emp;

delimiter $$
create trigger DELETE_emp before DELETE on emp for each ROW
BEGIN
	declare nowtime int default 0;
	DECLARE nowday varchar(20) default 'monday';
	select hour(current_time()) into nowtime;
	select DAYNAME(now()) into nowday;
		if ( nowtime<=16||nowtime>=6||nowday='Saturday'||nowday='Sunday') THEN
			signal sqlstate 'HY000' set MESSAGE_TEXT='手动抛出异常';
		end if;
END $$
drop procedure if exists INSERT_emp;