

class Tset {
	public static void main(String[] args) {
		TuringTeacher teacher=new TuringDBTeacher();
		//�����sayHi������������ж�����û�еģ��������ò�����ֱ�ӷ������������
		//�������1�� ������Ū�ɳ����࣬Ȼ���ڸ��ഴ��sayHi�ĳ��󷽷�������������д��
		//�������2��ǿ��ת��Ϊ��������
		//�˴��÷���2
		TuringDBTeacher a=(TuringDBTeacher) teacher;
		a.sayHi();
		teacher.giveLesson();
	}
}
