--1����ѯ��ÿ��Ա���ı�ţ�������ְλ
SELECT EMPNO,ENAME,JOB FROM SCOTT.emp
--2����ѯÿ��Ա���ĸ�λ����
SELECT ENAME,JOB FROM SCOTT.emp
--3�������ÿ��Ա��һ��Ļ������ʣ�ͬʱ��ʾ�������ͱ��
SELECT EMPNO,ENAME,SAL*12 "��������" FROM SCOTT.emp
--4�������ÿ��Ա������н��ÿ���¹�˾�Ჹ���Ͳ�200����ͨ300����н=������+����*12
SELECT EMPNO,ENAME,(SAL+200+300)*12+NVL(comm*12,0) "��н" FROM SCOTT.emp;
--5����ѯ���������ʸ���2000 ��Ա����Ϣ
SELECT * FROM SCOTT.EMP WHERE SAL>2000;
--6����ѯ�����ֽС�������������Ϣ
SELECT * FROM SCOTT.EMP WHERE ENAME = '����';
--7����ѯ�����ʷ�Χ��1500��3000��ȫ��Ա����Ϣ������1500��3000��
SELECT * FROM SCOTT.EMP WHERE SAL BETWEEN 1500 AND 3000
--8����ѯ������Ա���������ԡ��������Ϣ��
SELECT * FROM SCOTT.EMP WHERE ENAME LIKE '��%';
--9����ѯ��Ա�������еڶ������ǡ�m������Ϣ
SELECT * FROM SCOTT.EMP WHERE ENAME LIKE '_M%';
--10����ѯ������Ա����Ϣ��Ҫ�󰴹�������
SELECT * FROM SCOTT.EMP ORDER BY SAL DESC;
--11����ѯ�����Բ�������Ա���������������ʡ���ְ���ڣ��������ƣ�
SELECT ENAME,SAL,HIREDATE,JOB FROM SCOTT.EMP WHERE JOB = 'ANALYST';
--12����ѯ������Ա�����������������Ƽ����ʣ�
SELECT ENAME,JOB,SAL from SCOTT.EMP;
--13������롰ĳĳ��Ա����ͬһ�����Ź�������Ա��Ϣ��ǰ�᲻֪����Ա�����ĸ����ţ�
SELECT * FROM SCOTT.EMP WHERE (SELECT JOB FROM SCOTT.EMP WHERE ENAME = 'SMITH') = JOB;
--14�����н�ʵ��ڲ��ű��Ϊ30��Ա����н�ʵ�Ա����Ϣ��
SELECT * FROM SCOTT.EMP WHERE DEPTNO = 30;
--15�����н�ʸ��ڲ��ű��Ϊ30��Ա����н�ʵ�Ա����Ϣ��
SELECT * FROM SCOTT.EMP WHERE (SELECT MAX(SAL) FROM SCOTT.EMP WHERE DEPTNO=30)<SAL;
--16���������������˾ƽ��н�ʵ���Ա��Ϣ��
SELECT * FROM SCOTT.EMP WHERE (SELECT AVG(SAL) FROM SCOTT.EMP)<SAL;
--17�����ÿ�������ж����ˣ��Լ����ű�źͲ���ID
--SELECT COUNT(DEPTNO) FROM SCOTT.EMP WHERE (SELECT DISTINCT DEPTNO FROM SCOTT.EMP)=DEPTNO;
SELECT DEPTNO "���ű��",COUNT(ENAME) FROM SCOTT.EMP GROUP BY DEPTNO;
--javaһ���ͬѧ ��  �����ͬѧ�Ȳ���
--18��1���г��� ��ĳĳ1�� ������ͬ����������Ա�����������ƣ�����������
select e.*,d.dname,c.count from emp e,dept d,(select count(ename) count,deptno from
 emp GROUP BY deptno) c where e.job=(select job from emp where ename='TURNER') and e.deptno =d.deptno and e.deptno=c.deptno
--19��2���г�н��� ��ĳĳ1�� �� ��ĳĳ2�� �������Ա���ı�ţ��������������ƣ����쵼����������������
select e.empno,e.ename,d.dname,m.ename,c.count from emp e,emp m,dept d,(select count(ename) count,deptno from emp 
GROUP BY deptno) c WHERE e.mgr=m.empno and e.deptno=d.deptno and e.deptno=c.deptno and (e.sal >(select sal from emp 
where ename='ADAMS') or e.sal>(select sal from emp where ename='SMITH'))
--20��3���г��ܹ�����������ֱ���ϼ�������Ա���ı�ţ��������������ƣ�����λ�ã�����������
select e.empno,e.ename,d.dname,d.loc,c.count from emp e,emp m,dept d,(select count(ename) count,deptno from emp GROUP BY deptno) c
where e.mgr=m.empno and e.HIREDATE>m.HIREDATE and e.deptno =d.deptno and e.deptno=c.deptno
--21��4���г����� ��ĳĳ3�� ����ͬ�Ĳ��Ŷ�������ˣ����������䲿�����ƣ��������������ʵȼ���
select e.ename,d.dname,c.count,s.GRADE from emp e,dept d,(select count(ename) count,deptno from emp GROUP BY deptno) c,SALGRADE s
where e.ename='JAMES' and e.deptno=d.deptno and e.deptno=c.deptno and e.sal BETWEEN s.LOSAL and HISAL