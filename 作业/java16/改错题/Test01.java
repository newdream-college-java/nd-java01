package ��15�¼̳���ҵ____3��д�����Ҵ�����;

class TuringTeacher{
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
	public class Test01 {
		public static void main(String[] args) {
			TuringTeacher teacher = new TuringDBTeacher();
			//����ԭ��������ʹ���˶�̬��teacher�Ǹ������õ���sayHi������TuringDBTeacher�еĶ��еķ�������������TuringDBTeacher��д����ķ���
			//���Բ���ֱ�ӵ���Ҫ�����������͵�ת��
			//�޸�
			if(teacher instanceof TuringDBTeacher ){
				//���ʵ��������teacher��TuringDBTeacher�����еĶ���
				//��ô����TuringDBTeacher  teacherǿתΪ�������teacher1(TuringDBTeacher)
				//�������ܵ�����������ж��еķ�����teacher1.sayHi();
				TuringDBTeacher teacher1 = (TuringDBTeacher)teacher;
				teacher1.sayHi();
				teacher1.giveLesson();
			}
			
		}
}	
