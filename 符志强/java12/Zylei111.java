package zz;

import java.util.Scanner;


public class Zylei111 {
	Zylei1 wj1;
	Zylei11 wj2;
	int cs=0;
	public void bb() {
		wj1=new Zylei1();
		wj2=new Zylei11();
	}
	public void a() {
		Scanner input=new Scanner(System.in);
		System.out.println("-------------------------��ӭ������Ϸ����------------------------");
		System.out.println();
		System.out.println("\t\t************************************************");
		System.out.println("\t\t**\t\t��ȭ����ʼ\t\t\t**");
		System.out.println("\t\t************************************************");
		System.out.println();
		System.out.println("������������1Ϊ������������2Ϊ��ʯͷ������3Ϊ����");
		System.out.println("��ѡ��Է���ɫ��1.���� 2.��Ȩ 3.�ܲ٣�");
		int x=input.nextInt();
		switch (x) {
		case 1:
			System.out.println("��ѡ����������ս");
			wj2.xm="����";
			break;
		case 2:
			System.out.println("��ѡ������Ȩ��ս");
			wj2.xm="��Ȩ";
			break;
		case 3:
			System.out.println("��ѡ���˲ܲٶ�ս");
			wj2.xm="�ܲ�";
			break;
		default:
			System.out.println("���������");
			break;
		}
        System.out.print("Ҫ��ʼ�룿��y/n)����");
		String ss=input.next();
		if(ss.equals("y")){
		while(ss.equals("y")){
			
			int r1=wj1.quan();
			
			int j1=wj2.diannao();
			if (r1==j1) {
				System.out.println("ƽ��");
				cs++;
			}else if ((r1-j1==-1)||(r1-j1==2)) {
				System.out.println("������");
				wj2.jifen+=1;
			}else{
				System.out.println("��Ӯ��");
				wj1.jf+=1;
			}
			System.out.println("�Ƿ�Ҫ������y");
			ss=input.next();
			cs++;
			if (!ss.equals("y")){
				System.out.println("���������");
				break;
			}
		}
		}else{
			System.out.println("���������");
		}
		
	}
        public void jiguo(){
            System.out.println(wj2.xm+"\tVS\t"+wj1.name);
            System.out.println("��ս������"+cs);
            if(wj2.jifen>wj1.jf) {
                System.out.println("����������ˣ���");
            }else if(wj2.jifen<wj1.jf) {
                System.out.println("�������Ӯ�ˣ�����");
            }else {
                System.out.println("���������ƽ�֣�����");
            }
            
        }
}
