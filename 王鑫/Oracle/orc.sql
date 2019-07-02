create user keren identified by keren123 default tablespace School;

--����school��ռ�
--create tablespace school logging datafile 'C:\file\school.dbf' size 4M autoextend off;

--��Ȩ
grant connent to keren;
grant resource to keren;
grant create sequence to keren;

--����ѧ����
create table student(--ѧ��
  Sno varchar2(20) not null primary key,--ѧ��ѧ��
  Sname varchar2(20) not null, --ѧ������
  Ssex varchar2(20) not null, --ѧ���Ա�
  Sbirthday date, --ѧ������������
  Class varchar2(20) --ѧ�����ڰ༶
)


create table teacher(--��ʦ
  Tno varchar2(20) not null primary key,--�̹����(����)
  Tname varchar2(20) not null,--�̹�����
  Tsex varchar2(20) not null,--�̹��Ա�
  Tbirthday date,--�̹�����������
  Prof varchar2(20),--ְ��
  Depart varchar2(20) not null  --�̹����ڲ���
)

create table Course(--�γ�
  Cno varchar2(20) not null primary key,  --�γ̺�
  Cname varchar2(20) not null,  --�γ�����
  Tno varchar2(20) not null references teacher(Tno) --�̹����(����)
)

create table Score(
Sno varchar2(20) not null references student(Sno),--ѧ��(����)
Cno varchar2(20) not null references Course(Cno), --�γ̺�(����)
primary key(Sno,Cno), 
Degree Decimal(4,1) --  �ɼ�
)
insert into SYSTEM.Score(Sno,Cno,Degree) values('1','1',42.1);


--3.�������ݵ���صı���
--STUDENT��
Insert into SYSTEM.STUDENT (SNO,SNAME,SSEX,SBIRTHDAY,CLASS) values ('1','һ��','��',to_date('1998-06-01','YYYY-MM-DD'),'1');
Insert into SYSTEM.STUDENT (SNO,SNAME,SSEX,SBIRTHDAY,CLASS) values ('2','����','Ů',to_date('1998-06-01','YYYY-MM-DD'),'1');
Insert into SYSTEM.STUDENT (SNO,SNAME,SSEX,SBIRTHDAY,CLASS) values ('3','����','Ů',to_date('1998-06-01','YYYY-MM-DD'),'1');
Insert into SYSTEM.STUDENT (SNO,SNAME,SSEX,SBIRTHDAY,CLASS) values ('4','�ĺ�','��',to_date('1998-02-01','YYYY-MM-DD'),'2');

--teacher��
Insert into SYSTEM.teacher (Tno,Tname,Tsex,Tbirthday,Prof,Depart) values ('1','��ʦ01','��',to_date('1998-06-01','YYYY-MM-DD'),'��Ա','1');
Insert into SYSTEM.teacher (Tno,Tname,Tsex,Tbirthday,Prof,Depart) values ('2','��ʦ02','Ů',to_date('1998-07-01','YYYY-MM-DD'),'��Ա','1');
Insert into SYSTEM.teacher (Tno,Tname,Tsex,Tbirthday,Prof,Depart) values ('3','��ʦ03','��',to_date('1998-08-01','YYYY-MM-DD'),'��Ա','1');
Insert into SYSTEM.teacher (Tno,Tname,Tsex,Tbirthday,Prof,Depart) values ('4','��ʦ04','Ů',to_date('1998-09-01','YYYY-MM-DD'),'��Ա','1');
Insert into SYSTEM.teacher (Tno,Tname,Tsex,Tbirthday,Prof,Depart) values ('5','��ʦ05','��',to_date('1998-01-01','YYYY-MM-DD'),'�鳤','2');
Insert into SYSTEM.teacher (Tno,Tname,Tsex,Tbirthday,Prof,Depart) values ('6','��ʦ06','��',to_date('1998-03-01','YYYY-MM-DD'),'У��','3');

--Course��
insert into SYSTEM.Course(Cno,Cname,Tno) values('1','JAVA','1');
insert into SYSTEM.Course(Cno,Cname,Tno) values('2','Html','1');
insert into SYSTEM.Course(Cno,Cname,Tno) values('3','JS','1');
insert into SYSTEM.Course(Cno,Cname,Tno) values('4','MySql','1');

--Score��
--����
insert into score values(1,121,88);
insert into score values(1,122,59);
insert into score values(1,123,88);
insert into score values(1,124,66);
insert into score values(2,121,96);
insert into score values(2,122,88);
insert into score values(2,123,89);
insert into score values(2,124,78);
insert into score values(3,121,64);
insert into score values(3,122,43);
insert into score values(3,123,82);
insert into score values(3,124,88);
insert into score values(4,121,88);
insert into score values(4,122,59);
insert into score values(4,123,88);
insert into score values(4,124,88);



--4.��ѯStudent���е����м�¼��Sname��Ssex��Class��
SELECT Sname,ssex,class FROM SYSTEM.STUDENT;

--5.��ѯ��ʦ���еĵ�λ�����ظ���Depart��
SELECT distinct Depart FROM teacher;

--6.��ѯScore���гɼ���60��80֮������м�¼
SELECT * FROM score where 60<degree and degree<80;

--7.��ѯScore���гɼ�Ϊ85��86��88�ļ�¼��
SELECT * FROM score where degree=85 or degree between 86 and 88;

--8����ѯStudent���С�95031������Ա�Ϊ��Ů����ͬѧ��¼��
SELECT * FROM student where CLASS=95031 and Ssex='Ů';

--9����Cno����Degree�����ѯScore������м�¼��
SELECT * FROM Score order by Degree desc;

--10.��ѯScore���е���߷ֵ�ѧ��ѧ�źͿγ̺š����Ӳ�ѯ��������
SELECT count(*) FROM student where CLASS=95031;

--12����ѯÿ�ſε�ƽ���ɼ���
select avg(DEGREE) from Score;

--13����ѯScore����������5��ѧ��ѡ�޵Ĳ���3��ͷ�Ŀγ̵�ƽ��������
select COUNT(sno),AVG(DEGREE) from score WHERE CNO LIKE '3%' GROUP BY cno HAVING COUNT(sno)>=5

--14����ѯ��������70��С��90��Sno�С�
select Sno from Score where degree between 70 and 90 ;

--15����ѯ����ѧ����Sname��Cno��Degree�С�
select * from student st, Score sc where st.sno = sc.sno;

--16����ѯ�͡������ͬ�Ա�ͬ���ͬѧSname.
SELECT * FROM student where (select ssex from student where Sname = '���') = ssex;

--17����ѯ����ѡ�ޡ���������ۡ��γ̵ġ��С�ͬѧ�ĳɼ���
select * from score where cno=(select cno from COURSE WHERE CNAME = 'java') and sno in (select sno from STUDENT where SSEX='��');

--18����ѯ�����ον�ʦ��Tname��Depart.
select Tname,depart from teacher;

--19����ѯ���������ϵ����ʦ���̿γ̵ĳɼ���
select * from score where cno =(select cno from COURSE WHERE CNAME ='java')


--20����ѯscore��ѡѧ���ſγ̵�ͬѧ�з���Ϊ����߷ֳɼ��ļ�¼��
select * from score a where sno in(select sno from score GROUP BY sno HAVING COUNT(cno)>1) and DEGREE<(select MAX(DEGREE) from 
SCORE b where a.cno=b.cno)





--18
select TNAME,DEPART from TEACHER
--19
--20
select * from score a where sno in(select sno from score GROUP BY sno HAVING COUNT(cno)>1) and DEGREE<(select MAX(DEGREE) from 
SCORE b where a.cno=b.cno)















