--���ű�
create table Dept(
Dept_id int,--���ű��
Dname varchar(20),--
loc varchar(20)--����λ��
)

insert into dept values(1,'���²�','һ¥');
insert into dept values(2,'����','��¥');
insert into dept values(3,'���в�','��¥');
--Ա����Ϣ��
create table emp(
emp_id int,--Ա�����
ename varchar(20),--Ա������
job varchar(20),--��λ����
mgr int,--���ڲ����쵼�ı��
hiredate date,--��ְ����
sal number(7,2),--��������
comm number(7,2),--����
Dept_id int--Ա�����ڲ��ŵı�ţ��벿�ű��Ӧ��
)
insert into emp values(1,'С��','ɨ��',4,null,3000,0,1);
insert into emp values(2,'��С��','ɨ��',4,null,3000,0,1);
insert into emp values(3,'��СС','ɨ��',4,null,3000,0,1);
insert into emp values(4,'�»�','ɨ�ضӳ�',16,null,5000,200,1);
insert into emp values(5,'�´��','ɨ��',4,null,3000,0,1);

insert into emp values(6,'ĳĳ1','��Ǯ��',9,null,8000,100,2);
insert into emp values(7,'ĳĳ2','��Ǯ��',9,null,8000,0,2);
insert into emp values(8,'ĳĳ3','��Ǯ��',9,null,8000,200,2);
insert into emp values(9,'ĳĳ4','��Ǯ���ϴ�',16,null,10000,1000,2);
insert into emp values(10,'ĳĳ4','��Ǯ��',9,null,8000,0,2); 

insert into emp values(17,'ĳĳ5','��Ǯ��',9,null,30000,0,2);

insert into emp values(11,'С��','���о�',14,null,30000,1000,3);
insert into emp values(12,'С��','���о�',14,null,30000,1000,3);
insert into emp values(13,'С�Ի�','���о�',14,null,30000,0,3);
insert into emp values(14,'С���','���о��ӳ�',16,null,40000,3000,3);
insert into emp values(15,'С����','���о�',14,null,30000,0,3);

insert into emp values(16,'��','�ϰ�',16,null,60000,0,3);
--���ʵȼ���
create table  Salgrade(
Grade_id int,--�ȼ����
losal Decimal(7,2),--���ֵ
hisal Decimal(7,2)--���ֵ
)
insert into Salgrade values(1,3000,5000);
insert into Salgrade values(1,5001,10000);
insert into Salgrade values(1,10000,60001);
--��ϰ�� ��
--1����ѯ��ÿ��Ա���ı�ţ�������ְλ
select emp_id,ename,job from emp;
--2����ѯÿ��Ա���ĸ�λ����
select ename,job from emp;
--3�������ÿ��Ա��һ��Ļ������ʣ�ͬʱ��ʾ�������ͱ��
select ename,job,sal*12 from emp;
--4�������ÿ��Ա������н��ÿ���¹�˾�Ჹ���Ͳ�200����ͨ300����н=������+����*12
select ename,job,(sal+200+300+comm)*12 "��н" from emp;
--5����ѯ���������ʸ���2000 ��Ա����Ϣ
select * from emp where sal>2000;
--6����ѯ�����ֽС��»�'��������Ϣ
select * from emp where ename='�»�';
--7����ѯ�����ʷ�Χ��1500��3000��ȫ��Ա����Ϣ������1500��3000��
select * from emp where sal between 1500 and 3000;
--8����ѯ������Ա���������ԡ��������Ϣ��
select * from emp where ename like '��%';
--9����ѯ��Ա�������еڶ������ǡ�С������Ϣ
select * from emp where ename like '_С%';
--10����ѯ������Ա����Ϣ��Ҫ�󰴹�������
select * from emp order by sal;
--11����ѯ�����񲿹�����Ա���������������ʡ���ְ���ڣ��������ƣ�
SELECT e.ename,e.sal,e.hiredate,d.dname FROM emp e,dept d where e.dept_id=d.dept_id and d.dept_id=2 ; 
--12����ѯ������Ա�����������������Ƽ����ʣ�
select e.ename,d.dname,e.sal from emp e,dept d where e.dept_id=d.dept_id;
--13������롰ĳĳ1��Ա����ͬһ�����Ź�������Ա��Ϣ��ǰ�᲻֪����Ա�����ĸ����ţ�
select * from emp where dept_id=(select dept_id from emp where ename='ĳĳ1');
--14�����н�ʵ��ڲ��ű��Ϊ3��Ա����н�ʵ�Ա����Ϣ��
select * from emp where sal in (select sal from emp where dept_id=3);
--15�����н�ʸ��ڲ��ű��Ϊ2��Ա����н�ʵ�Ա����Ϣ��
select * from emp where sal > (select max(sal) from emp where dept_id=2);
--16���������������˾ƽ��н�ʵ���Ա��Ϣ��
select * from emp where sal > (select avg(sal) from emp);
--17�����ÿ�������ж����ˣ��Լ����ű�źͲ�������
select c.c1,d.dept_id,d.dname from dept d,(select dept_id,count(dept_id ) c1 from emp  group by dept_id)c where  c.dept_id=d.dept_id ;
--javaһ���ͬѧ ��  �����ͬѧ�Ȳ���

--18��1���г��� ��ĳĳ1�� ������ͬ����������Ա�����������ƣ�����������
select d.dname,c.c1 from (select dept_id,count(*) c1 from emp  group by dept_id) c,dept d where 
d.dept_id = (select dept_id from emp where ename='ĳĳ1') and c.dept_id = d.dept_id ;
--19��2���г�н��� ��ĳĳ1�� �� ��ĳĳ2�� �������Ա���ı�ţ��������������ƣ����쵼����������������
select e.emp_id,e.ename,d.dname,m.ename,c.count from emp e,emp m,dept d,(select count(ename) count,dept_id from emp GROUP BY dept_id) c
WHERE e.mgr=m.emp_id and e.dept_id=d.dept_id and e.dept_id=c.dept_id and (e.sal >(select sal from emp where ename='ĳĳ1') or e.sal>(select sal from emp where ename='ĳĳ2'));
--20��3���г��ܹ�����������ֱ���ϼ�������Ա���ı�ţ��������������ƣ�����λ�ã�����������
select e.emp_id,e.ename,d.dname,d.loc,c.count from emp e,emp m,dept d,(select count(ename) count,dept_id from emp GROUP BY dept_id) c
where e.mgr=m.emp_id and e.HIREDATE>m.HIREDATE and e.dept_id =d.dept_id and e.dept_id=c.dept_id;
--21��4���г����� ��ĳĳ3�� ����ͬ�Ĳ��Ŷ�������ˣ����������䲿�����ƣ��������������ʵȼ���
select e.ename,d.dname,c.count,s.Grade_id from emp e,dept d,(select count(ename) count,dept_id from emp GROUP BY dept_id) c,SALGRADE s
where e.ename='ĳĳ3' and e.dept_id=d.dept_id and e.dept_id=c.dept_id and e.sal BETWEEN s.losal and hisal;









select add_months(sysdate,6) from dual;
select add_months('01-1��-19',6) from dual;
select next_day(add_months('01-1��-19',6),'����һ') from dual;
select to_char(next_day(add_months('01-1��-19',6),'����һ'),'yyyy-mm-dd') from dual;

SELECT TRANSLATE('jacjk','j' ,'b')FROM DUAL;

Select trim('x'  from  'xyzadamsx') from dual;

Select substr('abcdefg',-3) from dual;

--CHR��ASCII 
SELECT CHR(65) FROM dual; 
--LPAD��RPAD 
SELECT LPAD('function',15,'=') FROM dual;
--TRIM(char FROM set)
SELECT LENGTH('frances') FROM dual;
