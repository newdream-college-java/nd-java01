package ʮ������ҵ;

 class TuringTeacher {
	public void giveLesson(){
		System.out.println("֪ʶ�㽲��");
		System.out.println("�ܽ�����");
	}
 }
	class TuringDBTeacher extends TuringTeacher{
		public void giveLesson(){
			System.out.println("����SqlServer");
			super.giveLesson();
		}
		public void sayHi(){
			System.out.println("Hi");
		}
	}
	public class Test6{
		public	static void main(String[] args) {//static ȥ��
			TuringTeacher teacher=new TuringDBTeacher();
			TuringDBTeacher a=(TuringDBTeacher)teacher;//�Ѹ���������õ��������ǿ��ת�����������
		//	((TuringDBTeacher) teacher).sayHi();//����ͨ��teacherֱ�ӵ���
			a.giveLesson();
			a.sayHi();
			
		}
	}
	

