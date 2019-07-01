--ѧ����
create table student(
Sno varchar(20) not null primary key,--ѧ��
Sname varchar(20) not null,--ѧ������
Ssex varchar(20) not null,--ѧ���Ա�
Sbirthday date,--ѧ����������
Class varchar(20)--ѧ�����ڰ༶
)
insert into student values(1,'�»�','��',to_date('1998-1-1','YYYY-MM-DD'),1);
insert into student values(2,'Сǿ','��',to_date('1996-8-1','YYYY-MM-DD'),2);
insert into student values(3,'С��','Ů',to_date('1997-6-1','YYYY-MM-DD'),1);
insert into student values(4,'С��','��',to_date('1999-8-1','YYYY-MM-DD'),2);
insert into student values(5,'С��','Ů',to_date('1997-6-1','YYYY-MM-DD'),95031);
insert into student values(6,'С��','Ů',to_date('1999-8-1','YYYY-MM-DD'),95031);
insert into student values(7,'С��1','Ů',to_date('1997-6-1','YYYY-MM-DD'),1);
insert into student values(8,'С��1','��',to_date('1999-8-1','YYYY-MM-DD'),2);
insert into student values(9,'С��1','Ů',to_date('1997-6-1','YYYY-MM-DD'),95031);
insert into student values(10,'С��1','Ů',to_date('1999-8-1','YYYY-MM-DD'),95031);
--��ʦ��
create table teacher(
Tno varchar(20) not null primary key,--��ʦ���
Tname varchar(20) not null,--��ʦ����
Tsex varchar(20) not null,--��ʦ�Ա�
Tbirthday date,--��ʦ��������
Prof varchar(20),--ְ��
Depart varchar(20) not null--��ʦ���ڲ���
)
insert into teacher values(2019,'��ǿ','��',to_date('1975-8-1','YYYY-MM-DD'),'����','������');
insert into teacher values(2018,'����','Ů',to_date('1969-8-1','YYYY-MM-DD'),'������','�з���');
insert into teacher values(2017,'����','Ů',to_date('1984-6-1','YYYY-MM-DD'),'��ʦ','���Բ�');
insert into teacher values(2016,'��ʯ','��',to_date('1981-8-1','YYYY-MM-DD'),'����','�ܹ���');
insert into teacher values(2015,'��ʯ','��',to_date('1981-8-1','YYYY-MM-DD'),'����','�ܹ���');
--�γ̱�
create table Course(
Cno varchar(20) not null primary key,--�γ̺�
Cname varchar(20) not null,--�γ�����
Tno varchar(20) not null references teacher(Tno)--��ʦ���
)
insert into course values(121,'java',2019);
insert into course values(122,'html',2018);
insert into course values(123,'css',2017);
insert into course values(124,'mysql',2016);
insert into course values(324,'mysql',2016);
--����
create table Score(
Sno varchar(20) not null references student(Sno),--ѧ��
Cno varchar(20) not null references Course(Cno),--�γ̺�
primary key(Sno,Cno),
Degree Decimal(4,1)--�ɼ�
)
insert into score values(1,121,88);
insert into score values(1,122,59);
insert into score values(1,123,88);
insert into score values(1,124,66);
insert into score values(1,324,76);
insert into score values(2,121,96);
insert into score values(2,122,88);
insert into score values(2,123,89);
insert into score values(2,124,78);
insert into score values(2,324,76);
insert into score values(3,121,64);
insert into score values(3,122,43);
insert into score values(3,123,82);
insert into score values(3,124,88);
insert into score values(3,324,76);
insert into score values(4,121,88);
insert into score values(4,122,59);
insert into score values(4,123,88);
insert into score values(4,124,88);
insert into score values(4,324,76);
insert into score values(5,121,88);
insert into score values(5,122,59);
insert into score values(5,123,88);
insert into score values(5,124,88);
insert into score values(5,324,76);
insert into score values(6,121,88);
insert into score values(6,122,59);
insert into score values(6,123,88);
insert into score values(6,124,88);
insert into score values(6,324,76);
insert into score values(7,121,88);
insert into score values(7,122,59);
insert into score values(7,123,86);
insert into score values(7,124,88);
insert into score values(7,324,76);
insert into score values(8,121,85);
insert into score values(8,122,59);
insert into score values(8,123,88);
insert into score values(8,124,88);
insert into score values(8,324,76);
insert into score values(9,121,86);
insert into score values(9,122,59);
insert into score values(9,123,85);
insert into score values(9,124,88);
insert into score values(9,324,76);
insert into score values(10,121,86);
insert into score values(10,122,59);
insert into score values(10,123,85);
insert into score values(10,124,88);
insert into score values(10,324,76);
--4����ѯStudent���е����м�¼��Sname��Ssex��Class�С�
select Sname,Ssex,Class from Student;
--5����ѯ��ʦ���еĵ�λ�����ظ���Depart�С�
select distinct Depart from teacher;
--6����ѯScore���гɼ���60��80֮������м�¼��
select * from Score where Degree>61 and Degree<81;
--7����ѯScore���гɼ�Ϊ85��86��88�ļ�¼��
select * from Score where Degree=86 or Degree=86 or degree=88;
--8����ѯStudent���С�95031������Ա�Ϊ��Ů����ͬѧ��¼��
select * from Student where Class=95031 and ssex='Ů' ;
--9����Cno����Degree�����ѯScore������м�¼��
select * from Score order by cno ;
select * from Score order by  Degree desc;
--10����ѯ��95031�����ѧ��������
select count(*) from Student where Class=95031;
--11����ѯScore���е���߷ֵ�ѧ��ѧ�źͿγ̺š����Ӳ�ѯ��������
select sno,cno from Score where Degree=(select max(Degree) from Score);
--12����ѯÿ�ſε�ƽ���ɼ���
select cno,avg(Degree) from Score group by cno;
--13����ѯScore����������5��ѧ��ѡ�޵Ĳ���3��ͷ�Ŀγ̵�ƽ��������
select COUNT(sno),AVG(DEGREE) from score  WHERE cno LIKE '3%' GROUP BY cno HAVING COUNT(sno)>=5;
--14����ѯ��������70��С��90��Sno�С�
select Sno from score where Degree>70 and Degree<90;
--15����ѯ����ѧ����Sname��Cno��Degree�С�
select Sname,Cno,Degree from Student s,score c where s.Sno=c.Sno;
--16����ѯ�͡�С�㡱ͬ�Ա�ͬ���ͬѧSname.
select sname from Student where Class=(select Class from Student where sname='С��');
--17����ѯ����ѡ�ޡ�mysql���γ̵ġ��С�ͬѧ�ĳɼ���
select * from score ;
select * from Course,Student where cname='mysql' and ssex='��'; 
--18����ѯ�����ον�ʦ��Tname��Depart.
  select Tname,Depart from teacher ;
--19����ѯ����mysql����ʦ���̿γ̵ĳɼ���
select * from score where cno =(select cno from COURSE WHERE CNAME ='mysql');
--20����ѯscore��ѡѧ���ſγ̵�ͬѧ�з���Ϊ����߷ֳɼ��ļ�¼��
select * from score a where sno in(select sno from score GROUP BY sno HAVING COUNT(cno)>1) and DEGREE<(select MAX(DEGREE) from 
SCORE b where a.cno=b.cno);
