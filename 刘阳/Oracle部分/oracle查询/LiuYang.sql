-- 4��ѯstudent���м�¼
select * from student;

-- 5��ѯ���ظ�depart��
select distinct depart from teacher;

-- 6��ѯ60��80�ļ�¼
SELECT * FROM score where degree>60 and degree<80;

-- 7��ѯ�ɼ�Ϊ85,86��88�ļ�¼
SELECT * FROM score where degree=85 or degree between 86 and 88;

-- 8����ѯStudent���С�95031������Ա�Ϊ��Ů����ͬѧ��¼��
SELECT * FROM STUDENT WHERE CLASS=1 OR SSEX='Ů';
-- 9����Cno����Degree�����ѯScore������м�¼��
select * from score ORDER BY CNO ASC,DEGREE DESC
-- 10.��ѯScore���е���߷ֵ�ѧ��ѧ�źͿγ̺š����Ӳ�ѯ��������
select COUNT(*) from STUDENT WHERE CLASS = 2;
-- 11����ѯScore���е���߷ֵ�ѧ��ѧ�źͿγ̺š�
select sno,cno from score WHERE DEGREE = (select max(DEGREE) from SCORE);
-- 12����ѯÿ�ſε�ƽ���ɼ���
select AVG(degree),cno from score GROUP BY cno
-- 13����ѯScore����������5��ѧ��ѡ�޵Ĳ���2��ͷ�Ŀγ̵�ƽ��������
select COUNT(sno),AVG(DEGREE) from score  WHERE CNO LIKE '2%' GROUP BY cno HAVING COUNT(sno)>=2
-- 14����ѯ��������70��С��90��Sno�С�
select sno from score where DEGREE BETWEEN 70 and 90
-- 15����ѯ����ѧ����Sname��Cno��Degree�С�
select sname,cno,degree from STUDENT,SCORE WHERE STUDENT.sno=SCORE.sno GROUP BY sname
-- 16����ѯ�͡�������ͬ�Ա�ͬ���ͬѧSname.
select sname from student WHERE SSEX=(select SSEX from STUDENT WHERE SNAME = '����') and CLASS=(select class from STUDENT WHERE SNAME = '����') and SNAME !='����';
--17����ѯ����ѡ�ޡ����ġ��γ̵ġ��С�ͬѧ�ĳɼ���
select * from score where cno=(select cno from COURSE WHERE CNAME = '����') and sno in (select sno from STUDENT where SSEX='��');
-- 18����ѯ�����ον�ʦ��Tname��Depart.
select TNAME,DEPART from TEACHER
-- 19����ѯ���������ϵ����ʦ���̿γ̵ĳɼ���
select * from score where cno =(select cno from COURSE WHERE CNAME ='java')
-- 20����ѯscore��ѡѧ���ſγ̵�ͬѧ�з���Ϊ����߷ֳɼ��ļ�¼��
select * from score a where sno in(select sno from score GROUP BY sno HAVING COUNT(cno)>1) and DEGREE<(select MAX(DEGREE) from 
SCORE b where a.cno=b.cno)