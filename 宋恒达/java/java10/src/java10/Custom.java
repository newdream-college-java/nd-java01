package java10;

public class Custom {
		String style;
		double integral;
		public void show() {
			System.out.println("����:"+integral+",������:"+style);
			if((this.style.equals("��")&&(integral>1000))||(
					style.equals("�տ�")&&(integral>5000))) {
				System.out.println("��������500");
			}else {
				System.out.println("û�дﵽ��������Ҫ��");
			}
		}
}
