public class Pay{
	public static void main(String[] args){
		int a=245;
		int b=570;
		int c=320;
		System.out.println("������Ʒ\t����\t����\t���");
		System.out.println("T��\t��"+a+"\t2\t��"+(a*2));
		System.out.println("����Ь\t��"+b+"\t1\t��"+b);
		System.out.println("������\t��"+c+"\t1\t��"+c);
		System.out.println("�ۿۣ�\t8��");
		System.out.println("�����ܽ�\t��"+(a*2+b+c)*0.8);
		System.out.println("ʵ�ʽ���\t��1500");
		System.out.println("��Ǯ\t��"+(1500-(a*2+b+c)*0.8));
		System.out.println("���ι������Ϊ"+(int)((a*2+b+c)*0.8/100*3));
	}
}