package Test2019_3_5;

public class Main {
	public static void main(String[] args) {
		Manager man = new Manager();
		man.t=1;
		for (int i = 0; i < man.t; i++) {
			System.out.print("����Ա��Ϣ�û���Ϊ��"+man.showName(i));
			System.out.println("\t����Ϊ��"+man.showPassword(i));			
		}		
	}
}
