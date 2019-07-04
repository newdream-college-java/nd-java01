--1����ѯ"01"�γ̱�"02"�γ̳ɼ��ߵ�ѧ������Ϣ���γ̷���
	--1.1����ѯͬʱ����"01"�γ̺�"02"�γ̵����
select s1.*,sc1.score,sc2.score from SC sc1,Student s1,SC sc2 
where sc1.S#=sc2.S# and sc1.C#='01' 
and sc2.C#='02' and sc1.score>sc2.score 
and s1.S#=sc1.S#;
	--1.2����ѯͬʱ����"01"�γ̺�"02"�γ̵�����ʹ���"01"�γ̵����ܲ�����"02"�γ̵����(������ʱ��ʾΪnull)(���´�����ͬ����ʱ���ٽ���)
select a.* , b.score "�γ�01�ķ���",c.score "�γ�02�ķ���" from Studenta
left join SC b on a.S# = b.S# and b.C# = '01'
left join SC c on a.S# = c.S# and c.C# = '02'
where b.score > is null(c.score,0)

--2����ѯ"01"�γ̱�"02"�γ̳ɼ��͵�ѧ������Ϣ���γ̷���
	--2.1����ѯͬʱ����"01"�γ̺�"02"�γ̵����
select a.* , b.score "�γ�'01'�ķ���",c.score "�γ�'02'�ķ���" from Student a, SC b , SC c
where a.S# = b.S# and a.S# = c.S# and b.C# = '01' and c.C# = '02'and b.score < c.score
	--2.2����ѯͬʱ����"01"�γ̺�"02"�γ̵�����Ͳ�����"01"�γ̵�����"02"�γ̵����
SELECT * from (SELECT * from (SELECT * from SC where C#='01') A
JOIN (SELECT * from SC where C#='02') B
on A.S#=B.S#
where B.S# is not null) k,(SELECT * from SC where C#='02' and S# not in (SELECT S# from SC where C#='01')) l

--3����ѯƽ���ɼ����ڵ���60�ֵ�ͬѧ��ѧ����ź�ѧ��������ƽ���ɼ�
select a.S# , a.Sname , cast(avg(b.score) as decimal(18,2))avg_score
from Student a , sc b
where a.S# = b.S#
group by a.S# , a.Sname
having cast(avg(b.score) as decimal(18,2)) >=60
order by a.S#

--4����ѯƽ���ɼ�С��60�ֵ�ͬѧ��ѧ����ź�ѧ��������ƽ���ɼ�
	--4.1����ѯ��sc����ڳɼ���ѧ����Ϣ��SQL��䡣
select a.S# , a.Sname , cast(avg(b.score) as decimal(18,2))avg_score
from Student a , sc b
where a.S# = b.S#
group by a.S# , a.Sname
having cast(avg(b.score) as decimal(18,2)) <60
order by a.S#

--5����ѯ����ͬѧ��ѧ����š�ѧ��������ѡ�����������пγ̵��ܳɼ�
	--5.1����ѯ�����гɼ���SQL��
select a.S# "ѧ�����", a.Sname "ѧ������", count(b.C#) "ѡ������", sum(score)"���пγ̵��ܳɼ�"
from Student a , SC b
where a.S# = b.S#
group by a.S#,a.Sname
order by a.S#
	--5.2����ѯ����(�����гɼ����޳ɼ�)��SQL��
select a.S# "ѧ�����", a.Sname "ѧ������", count(b.C#) "ѡ������", sum(score)"���пγ̵��ܳɼ�"
from Student a left join SC b
on a.S# = b.S#
group by a.S#,a.Sname
order by a.S#

--6����ѯ"��"����ʦ������?
SELECT COUNT(*) FROM TEACHER where TNAME LIKE '%��%';

--7����ѯѧ��"����"��ʦ�ڿε�ͬѧ����Ϣ??
SELECT * FROM STUDENT WHERE S# IN (SELECT S# FROM SC WHERE (SELECT T# FROM TEACHER WHERE Tname = '������') = C#);

--8����ѯûѧ��"����"��ʦ�ڿε�ͬѧ����Ϣ??
SELECT * FROM STUDENT WHERE S# not IN (SELECT C# FROM SC WHERE (SELECT T# FROM TEACHER WHERE Tname = '������') = C#);

--9����ѯѧ�����Ϊ"01"����Ҳѧ�����Ϊ"02"�Ŀγ̵�ͬѧ����Ϣ
SELECT * FROM STUDENT WHERE s# in (SELECT S1.S# FROM SC s1 ,SC s2 WHERE S1.C# = '01' AND S2.C# = '02' AND s1.s# = s2.S#)
 
--10����ѯѧ�����Ϊ"01"����û��ѧ�����Ϊ"02"�Ŀγ̵�ͬѧ����
SELECT Student.* FROM Student , SC WHERE 
Student.S# = SC.S# and SC.C# = '01' and Student.S# 
not in (Select SC_2.S# FROM SC SC_2 where SC_2.S# = SC.S# and SC_2.C# = '02')
order by Student.S#

--11����ѯû��ѧȫ���пγ̵�ͬѧ����Ϣ?
select Student.*
from Student , SC
where Student.S# = SC.S#
group by Student.S# , Student.Sname , Student.Sage , Student.Ssex having count(C#) < (select count(C#) from Course)

--12����ѯ������һ�ſ���ѧ��Ϊ"01"��ͬѧ��ѧ��ͬ��ͬѧ����Ϣ?
select distinct Student.* from Student , SC where Student.S# =SC.S# and SC.C# in (select C# from SC where S# = '01') and Student.S# <> '01' 

--13����ѯ��"01"�ŵ�ͬѧѧϰ�Ŀγ���ȫ��ͬ������ͬѧ����Ϣ?
select Student.* from Student where S# in
(select distinct SC.S# from SC where S#<> '01' and SC.C# in (select distinct C# from SC where S# = '01')
group by SC.S# having count(1) = (select count(1) from SC where S#='01'))

--14����ѯûѧ��"����"��ʦ���ڵ���һ�ſγ̵�ѧ������?
select student.* from student where student.S# not in
(select distinct sc.S# from sc , course , teacher where sc.C# =course.C# and course.T# = teacher.T# and teacher.tname ='����')

--15����ѯ���ż������ϲ�����γ̵�ͬѧ��ѧ�ţ���������ƽ���ɼ�?
select student.S# , student.sname , cast(avg(score) as decimal(18,2)) avg_score from student , sc
where student.S# = SC.S# and student.S# in (select S# from SC where score < 60 group by S# having count(1)>= 2)
group by student.S# , student.sname

--16������"01"�γ̷���С��60���������������е�ѧ����Ϣ
select student.* , sc.C# , sc.score from student , sc
where student.S# = SC.S# and sc.score < 60 and sc.C#= '01'
order by sc.score desc

--17����ƽ���ɼ��Ӹߵ�����ʾ����ѧ�������пγ̵ĳɼ��Լ�ƽ���ɼ�


--18����ѯ���Ƴɼ���߷֡���ͷֺ�ƽ���֣���������ʽ��ʾ���γ�ID���γ�name����߷֣���ͷ֣�ƽ����


--19�������Ƴɼ��������򣬲���ʾ����


--20����ѯ���¹����յ�ѧ��
select Course.C# , Course.Cname , count(*) "ѧ������"
from Course , SC
where Course.C# = SC.C#
group by  Course.C# , Course.Cname
order by Course.C# , Course.Cname

--21����ÿ�ſγ̵�ѧ������?
select Course.C# , Course.Cname , count(*) "ѧ������"
from Course , SC
where Course.C# = SC.C#
group by  Course.C# , Course.Cname
order by Course.C# , Course.Cname

--22����ѯƽ���ɼ����ڵ���85������ѧ����ѧ�š�������ƽ���ɼ�
select a.S# , a.Sname , cast(avg(b.score) as decimal(18,2))avg_score from Student a , sc b 
where a.S# = b.S# group by a.S# , a.Sname having cast(avg(b.score) as decimal(18,2)) >=85 order by a.S#
