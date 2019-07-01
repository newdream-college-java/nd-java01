create table student(
Sno varchar(20) not null primary key,--ѧ��
Sname varchar(20)not null,--ѧ������
Ssex varchar(20) not null,--ѧ���Ա�
Sbirthday date,--ѧ����������
Class varchar(20)--ѧ�����ڰ༶
);

create table teacher(
Tno varchar2(20)not null primary key,--�̹����(����)
Tname varchar2(20)not null,--�̹�����
Tsex varchar2(20)not null,--�̹��Ա�
Tbirthday date,--�̹���������
Prof varchar2(20),--ְ��
Depart varchar2(20) not null--�̹����ڲ���
);

create table Course--�γ�
(
Cno varchar2(20) not null primary key,--�γ̺�
Cname varchar2(20)not null,--�γ�����
Tno varchar2(20)not null references teacher(Tno)--�̹����(����)
);

create table Score--����
(
Sno varchar2(20)not null references student(Sno),--ѧ��(����)
Cno varchar2(20)not null references Course(Cno),--�γ̺�(����)
primary key(Sno,Cno),
Degree Decimal(4,1)--�ɼ�
);


insert into student values('1','����','��','01-7�� -19','java1');
insert into teacher values('001','����','��','01-7�� -19','java����ʦ','J01');
insert into teacher values('002','����','��','01-7�� -19','java����ʦ','J01');
insert into teacher values('003','Ů��','Ů','01-7�� -19','java����ʦ','J01');

--4.��ѯstudnet���е����м�¼��Sname��Ssex��Class
select Sname,ssex,class from student;
--5.��ѯ��ʦ���еĵ�λ�����ظ���Depart��
select distinct depart from teacher;
--6.��ѯScore���гɼ���30��80֮������м�¼
select * from score where degree>30 and degree<80;
--7.��ѯScore���гɼ�Ϊ85��86����88�ļ�¼
select * from score where degree=85 or degree=86 or degree=88;
--8.��ѯStudent���С�95031������Ա�Ϊ��Ů����ͬѧ��¼
select * from student where Class='95031' and Ssex='Ů';
--9.��Cno����Degree�����ѯScore������м�¼
select * from score order by Degree desc,cno asc;
--10.��ѯ��95031�����ѧ������
select count(class) from student where class='95031'; 
--11.��ѯScore���е���߷ֵ�ѧ��ѧ�źͿγ̺š����Ӳ�ѯ��������
select Sno,Cno from score where degree=(select max(degree) from score);
--12.��ѯû�ſε�ƽ���ɼ�
select avg(degree) from score group by Cno;
--13.��ѯScore����������5��ѧ��ѡ�޵Ĳ���3��ͷ�Ŀγ̵�ƽ������
--������2��ѧ��
select cno,avg(degree) as avg from score 
where cno=(select cno from score where count(sno)>3 and cno like 'k%') group by cno;

select avg(degree),cno from score where cno in(
select DISTINCT cno from score where sno in(
select sno from score GROUP BY sno having count(*)>=5
) and cno like 'k%'
) GROUP BY cno; 

select cno,avg(degree) from score group by cno and count(*)>2;

select cno,avg(degree) from score group by cno having cno like 'k%' and count(*)>2;
select 
select avg(degree) from score where ;
--14.��ѯ��������70��С��90��Sno�С�
select * from score where degree>70 and degree<90;
--15.��ѯ����ѧ����Sname��Cno��Degree��
select Sname,Cno,Degree from student,score where student.sno=score.sno 
--16.��ѯ�͡������ͬ�Ա�ͬ���ͬѧSname
select * from student
select Ssex from student where sname='����';
select Class from student  where sname='����'
select Sname from student where Ssex=(select Ssex from student where sname='����') and 
Class=(select Class from student  where sname='����');
--17.��ѯ����ѡ�ޡ���������ۡ��γ̵ġ��С�ͬѧ�ĳɼ���
select * from score;
select * from course;
select score.degree from score,student,course 
where student.sno=score.sno and course.cno=score.cno and course.cname='java' and student.ssex='��';
--join-on
select score.degree from score 
join student on student.sno = score.sno 
join course on score.cno = course.cno 
where course.cname='java' and student.ssex='��'
--18.��ѯ�����ον�ʦ��Tname��Depart
select Tname,depart from teacher;
--19.��ѯ���������ϵ����ʦ���̿γ̵ĳɼ���
select * from teacher where depart='J01'

select degree from score 
join course on course.cno=score.cno
join teacher on teacher.Tno=course.Tno where depart='J01';
--20.��ѯscore��ѡѧ���ſγ̵�ͬѧ�з���Ϊ����߷ֳɼ��ļ�¼��
--��ѯ��ѡ�˶��ſγ̵�
select distinct sno from score;--��Ϊһ�����
select sno from score cno>1 and ; 
select sno from score group by sno having count(*)>1
select max(degree)from score b where a.cno=b.cno;
select * from score a where sno in(
  select sno from score group by sno having count(*)>1)
  and degree<(select max(degree)from score b where a.cno=b.cno)

