
public class Hw02 {
	String type;
	int score;
	public void huikui(){
		if(type.equals("��")){
			if(score>1000){
				System.out.println("���֣�"+score+", �����ͣ�"+type);
				System.out.println("��������500�֣�");
			}
		}else if(type.equals("�տ�")){
			if(score>5000){
				System.out.println("���֣�"+score+", �����ͣ�"+type);
				System.out.println("��������500�֣�");
			}
		}
	}
}
