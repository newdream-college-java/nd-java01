create table club(
id int PRIMARY key auto_increment comment'编号',
`name` varchar(10) not null comment'姓名',
sex VARCHAR(5) not null comment'性别',
age int(50) not null comment'年龄',
address varchar(50) not null comment'家庭住址',
email varchar(50) not null comment'邮箱'
)
drop table club
select * from club;
desc club;
insert into club values(null,'李健聪','男',21,'湖南','465557831');
insert into club values(null,'李健聪2','男',22,'湖南2','465557831');
insert into club values(null,'李健聪3','男',23,'湖南3','465557831');