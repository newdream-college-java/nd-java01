import java.util.Scanner;

public class Game{
	Com com;
	Player player;
	int count=0;
	//��ʼ��
    public void initial() {
        //1.�˶���
    	player = new Player();
    	player.name="����";
        //2.���Զ���
        com = new Com();
    }
    
	public void startGame(){
		System.out.println("----------------�� ӭ �� �� �� Ϸ �� ��----------------\n\n");
		System.out.println("                ***************                \n");
		System.out.println("                *** ��ȭ ����ʼ ***                \n");
		System.out.println("                ***************                \n\n");
		System.out.println("��ȭ����1.ʯͷ 2.���� 3.��");
		System.out.println("��ѡ��Է���ɫ��1������ 2����Ȩ 3.�ܲ٣�");
	}
	public int choiceHero(){
		Scanner input=new Scanner(System.in);
		int juese=0;
		if(input.hasNextInt()){
			juese=input.nextInt();
			switch(juese){
				case 1:
					System.out.println("������������ս\n"+"������������ǰ����������������һ���ϣ�");
					com.name="����";
					break;
				case 2:
					System.out.println("��������Ȩ��ս\n"+"��Ȩ����������褴󶼶���");
					com.name="��Ȩ";
					break;
				case 3:
					System.out.println("������ܲٶ�ս\n"+"�ܲ٣������Ҹ������ˣ����������˸��ң�");
					com.name="�ܲ�";
					break;
				default:
					System.out.println("ѡ����Ч��������ѡ����ȷ�Ķ��ֺ��룺");
					System.out.println("��ѡ��Է���ɫ��1������ 2����Ȩ 3.�ܲ٣�");
					choiceHero();
			}
		}else{
			System.out.println("ѡ����Ч��������ѡ����ȷ�Ķ��ֺ��룺");
			System.out.println("��ѡ��Է���ɫ��1������ 2����Ȩ 3.�ܲ٣�");
			choiceHero();
		}
		
		System.out.print("Ҫ��ʼ�룿��y/n)����");
        String gameStart = input.next();
        if("y".equals(gameStart)){
        	duiZhan();
        	showResult();
        }
        return juese;
	}
	//��ս�ķ���
	public void duiZhan(){
		Scanner input=new Scanner(System.in);
		String nextround;
		//��ΪҪ��ִ��һ�������Ƿ���������������õ���do-while��䡣
		do{
			//��ʼ�Ծ�
			//���ȳ�ȭ
			int wanjia=player.chuquan();
			//���Գ�ȭ
			int diannao=com.chuquan();
			if(wanjia-diannao==0){
				System.out.println("����������֣��������ţ�����ƽ�֣�����");
			}else if(wanjia-diannao==-1||wanjia-diannao==2){
				System.out.println("��������������ˣ���ϲ��Ӯ�ˣ�");
                player.score+=1;
			}else{
				System.out.println("��������㲻�����㣬�ٽ������ɣ�����");
                com.score+=1;
			}
			System.out.println("�Ƿ�ʼ��һ�ֱ���(y/n)");
            nextround = input.next();
            count++;//ÿ��һ�� �Ծ���+1
		}while("y".equals(nextround));
	}
	//��ʾ���յĶ�ս�Ľ��������������
	public void showResult(){
		System.out.println(com.name+"\tVS\t"+player.name);
        System.out.println("��ս������"+count);
        System.out.println(com.score+"\tVS\t"+player.score);
        if(com.score>player.score) {
            System.out.println("�������������Ϊū�������������ɺã�����");
        }else if(com.score<player.score) {
            System.out.println("�������ϲ���ٵǱ�����һͳ��ԭ������");
        }else {
            System.out.println("���������ɵ�ӣ�����");
        }
	}
}
