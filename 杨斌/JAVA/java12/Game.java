import java.util.Scanner;
public class Game {
	Person person;
	Computer computer;
	int conunt;
	public void initial(){
		person=new Person();
		computer=new Computer();
	//	person.name="����";
		person.score=0;
		computer.score=0;
		conunt=0;
	}
	public void show(){
		Scanner input= new Scanner(System.in);
		System.out.println("-----------��ӭ������Ϸ����-----------");
		System.out.println("\t**********");
		System.out.println("\t**��ȭ����ʼ**");
		System.out.println("\t**********");
		System.out.println("��ȭ����:1.����2.ʯͷ3.��");
		System.out.print("��ѡ��Է���ɫ��1������2����Ȩ3���ܲ٣�");
		int js=0;
		if(input.hasNextInt()){
			 js=input.nextInt();
		}
		switch(js){
			case 1:
				computer.name="����";
				break;
			case 2:
				computer.name="��Ȩ";
				break;
			case 3:
				computer.name="�ܲ�";
				break;
			default:
				System.out.println("�������");
				break;
		
		}
		System.out.println("�������������:");
		person.name=input.next();
		System.out.println(person.name+"VS"+computer.name);
		System.out.println("Ҫ��ʼ��y/n����");
		String a=input.next();
		if(a.equals("y")){
			start();
		}else{
			System.exit(-1);
		}
	}
	public void start(){
		Scanner q=new Scanner(System.in);
		String c=null;
		do{
			int a=person.showFist();
			int b=computer.jsj();
			if(a==b){
				System.out.println("���˵���;֣���˥���ٺ٣������ưɣ�");
			}else if(a-b==1||a-b==-2){
				System.out.println("���˵����ϲ�㣬��Ӯ�ˣ�");
				person.score++;
			}else{
				System.out.println("���˵�������ˣ��汿��");
				computer.score++;
			}
			conunt++;
			System.out.println("�Ƿ�ʼ��һ�֣�y/n����");
			c=q.next();
			System.out.println("-------------------------------------------------------");
		}while(c.equals("y"));
	}
	public void jg(){
		System.out.println(computer.name+"VS"+person.name);
		System.out.println("��ս����"+conunt+"\n");
		System.out.println("����\t�÷�");
		System.out.println(person.name+"\t"+person.score);
		System.out.println(computer.name+"\t"+computer.score+"\n");
		if(person.score>computer.score){
			System.out.println("���:��ϲ����ϲ");
		}else{
			System.out.println("���:���ź����㱻��̭��");
		}
	}
}
