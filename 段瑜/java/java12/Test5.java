package �˻���ȭ;

import java.util.Scanner;

public class Test5 {
	Test1 com = new Test1();
	Test2 ren=new Test2();
	int count=0;
	public void show1(){
		Scanner input=new Scanner(System.in);
		String xuanze;
		System.out.print("���ȭ��");
		do{			
			int r=ren.renC();			
			int j=com.jqr();
			if(r==j){
				 System.out.println("���˵��ƽ�֣�����");
			}else if((r-j)==-1||(r-j)==2){
				System.out.println("���˵��"+ren.name1+"Ӯ��");
				ren.score+=1;
			}else if((j-r)==2||(j-r)==-1){
				System.out.println("���˵��"+com.name+"Ӯ��");
				com.score+=1;
			}else{
				System.out.println("���������Ϸ����");
				System.exit(-1);
			}
			System.out.print("�Ƿ�ʼ��һ�ֱ�����y/n����");
			xuanze=input.next();
			count+=1;
		}while(xuanze.equals("y"));
	}
	public void show2(){
		System.out.println(com.name+"\tVS\t"+ren.name1);
        System.out.println("��ս������"+count);
        if(com.score>ren.score) {
            System.out.println("�����"+com.name+"�ף��������ͣ���");
        }else if(com.score<ren.score) {
            System.out.println("�����"+ren.name1+"С���� ��������");
        }else {
            System.out.println("��������������򿹵�Ҳ�ǵ��ԣ�����");
        }
	}
	public void show(){
		System.out.println("\t\t\t--------��ӭ������Ϸ����--------");
		System.out.println("\t\t\t***********************");
		System.out.println("\t\t\t**\t��ȭ����ʼ\t**");
		System.out.println("\t\t\t***********************\n\n\n");
		System.out.println("��ȭ����1.ʯͷ 2.���� 3.��");
		System.out.print("��ѡ��Է���ɫ��1������ 2����Ȩ 3���ܲ٣���");
		Scanner input=new Scanner(System.in);
		int sum=input.nextInt();
		switch(sum){
			case 1:
				System.out.println("��ѡ����1.������ս");
				com.name="����";
				break;
			case 2:
				System.out.println("��ѡ����2.��Ȩ��ս");
				com.name="��Ȩ";
				break;
			case 3:
				System.out.println("��ѡ����3.�ܲٶ�ս");
				com.name="�ܲ�";
				break;
		}
		System.out.print("�Ƿ�ʼ�Ծ֣�y/n����");
		String isStart = input.next();
		if(isStart.equals("y")){
			show1();
			show2();
		}
	}
}
