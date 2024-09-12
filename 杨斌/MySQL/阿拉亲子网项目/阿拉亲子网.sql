use xm;
#用户
create table yonghu(
	user int primary key auto_increment comment '用户ID',
	yhname varchar(10) not null comment '用户名',
	password varchar(20) not null comment '密码',
	email varchar(20) not null comment '邮箱',
	number varchar(20) not null comment '手机号码',
	dizhi varchar(50) not null comment '地址',
	QQ varchar(20) not null comment 'QQ',
	bbsex varchar(10) not null comment '宝宝性别',
	bbname varchar(10) not null comment '宝宝姓名'
)engine=innodb auto_increment=1 default charset='utf8'

select * from yonghu;

#分类
create table fenlei(
	fenleiname varchar(10) not null comment '分类名称',
	sshd varchar(10) not null comment '所属活动'
)engine=innodb  default charset='utf8'

select * from fenlei;

#亲子活动
create table qinzi(
	hdid int primary key auto_increment comment '活动id',
	hdzhuti varchar(10) not null comment '活动主题',
	hdzhuangtai varchar(20) not null comment '活动状态',
	hdquyu varchar(20) not null comment '活动区域',
	hdshijian datetime not null comment '活动时间',
	sphuodong varchar(50) not null comment '商品活动',
	mpid int not null comment '门票ID'
)engine=innodb auto_increment=1 default charset='utf8'

alter table qinzi add  constraint  wj1 foreign key (hdid)  references yonghu (user);

select * from qinzi;

#亲子旅游
create table qinzily(
	lyid int primary key auto_increment comment '旅游id',
	lyzhuti varchar(10) not null comment '旅游主题',
	lydizhi varchar(20) not null comment '旅游地址',
	lyshijian datetime not null comment '旅游时长',
	menpiaoid int not null comment '门票ID'
)engine=innodb auto_increment=1 default charset='utf8'

alter table qinzily add  constraint  wj2 foreign key (lyid)  references yonghu (user);

select * from qinzily;

#订单详情
create table dingdan(
	ddid int primary key auto_increment comment '订单id',
	ddzhuti varchar(10) not null comment '订单主体',
	dingou varchar(20) not null comment '订购信息',
	lianxi datetime not null comment '联系人信息',
	ddyhid int not null comment '用户id'
)engine=innodb auto_increment=1 default charset='utf8'

alter table dingdan add  constraint  wj3 foreign key (ddid)  references yonghu (user);

select * from dingdan;








CREATE table Purchase_Order(
Order_id int PRIMARY key,
activity_id int,
Destination varchar(100),
Trip_mode varchar(50),
Adult_Project_Price int ,
Childrenis_Project_Price int,
Package_Price int
)ENGINE=innodb charset='utf8'


create table activity_Exhibition(
Theme_ID int PRIMARY key
)ENGINE=innodb charset='utf8'

create table Historical_order(
Order_number int PRIMARY key,
Order_Price int,
Order_id int,
Trading_status varchar(50)
)ENGINE=innodb charset='utf8'

create table Popularity_list(
product_id int PRIMARY key,
Degree_of_heat varchar(20),
entry_name varchar(100)
)ENGINE=innodb charset='utf8'
