package test;

public class T1 {
	String name;
	int jifen;
	String jinka;
	public void show(){
		if(name.equals("��")){
			if(jifen>1000){
				System.out.println("����500����");
			}else{
				System.out.println("û�л��ֻ���");
			}
		}
		if(name.equals("��ͨ��")){
			if(jifen>5000){
				System.out.println("���500��������");
			}else{
				System.out.println("û�л�������");
			}
		}
	}
	

}
