import java.util.Scanner;


public class Yx {
	Yh yh;
	Jsj jsj;
	int a=0;
	public void cqbs(){
		 yh=new Yh();
		 jsj=new Jsj();
	}
	public void showKs(){
		Scanner input= new Scanner(System.in);
		System.out.println("\t\t******************");
		System.out.println("\t\t**  ��ȭ����ʼ  **");
		System.out.println("\t\t******************");
		System.out.println("��ȭ����1.����2��ʯͷ3����");
		System.out.print("��ѡ��Է���ɫ��1������2����Ȩ3���ܲ٣���");
		int dlm=input.nextInt();
		switch(dlm){
				case 1:
					System.out.println("��ѡ����������ս");
					jsj.name="����";
					break;
				case 2:
					System.out.println("��ѡ������Ȩ��ս");
					jsj.name="��Ȩ";
					break;
				case 3:
					System.out.println("��ѡ���˲ܲٶ�ս");
					jsj.name="�ܲ�";
					break;
				default:
					System.out.println("��ѡ�����󣡣���");
					break;
		}
		System.out.print("Ҫ��ʼ�𣿣�y/n)");
		String ok=input.next();
		if(ok.equals("y")){
			pk();
			jg();
		}
	}
	public void pk(){
		Scanner input=new Scanner(System.in);
		String yok;
		do{
			int ren=yh.showRg();
			int dn=jsj.showDl();
			if(ren==dn){
				System.out.println("���˵��ƽ��");
			}else if(ren-dn==1||ren-dn==-2){
				System.out.println("���˵����Ӯ��");
				yh.jf++;//��Ӯ�ľ���
			}else{
				System.out.println("���˵��������");
				jsj.jf++;//����Ӯ�ľ���
			}
			System.out.println("�Ƿ�ʼ��һ�֣�y/n��");
			yok=input.next();
			a++;//�Ծ���
		}while(yok.equals("y"));
	}
	public void jg(){
		System.out.println(jsj.name+"\tvs\t"+yh.name);
		System.out.println("�Ծִ���Ϊ��"+a);
		System.out.println("��ĵ÷�Ϊ��"+yh.jf);
		System.out.println(jsj.name+"�ĵ÷�Ϊ��"+jsj.jf);
		if(yh.jf>jsj.jf){
			System.out.println("��֣���ϲ���ʤ��");
		}else if(yh.jf<jsj.jf){
			System.out.println("��֣������ˣ�");
		}else{
			System.out.println("��֣�ƽ�֡�����");
		}
	}
}
