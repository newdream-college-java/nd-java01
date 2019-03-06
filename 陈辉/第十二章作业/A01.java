import java.util.Scanner;

public class Game {
    //����
    //1,�˶���
    Person person;
    //2�����Զ���
    Computer computer;
    //3,��ս����
    int count = 0;
    //����
    //1,��ʼ��----�����Ը�ֵ
    public void initial() {
        //1.�˶���
        person = new Person();
        //2.���Զ���
        computer = new Computer();
    }
    public void startGame() {//����
        Scanner input = new Scanner(System.in);
        System.out.println("*******************��ӭ��������Ϸ����********************\n");
        System.out.println("\t\t*******************");
        System.out.println("\t\t\t��ʼ");
        System.out.println("\t\t*******************");
        System.out.println("��ȭ����1��ʯͷ��2��������3����");
        System.out.print("��ѡ��Է���ɫ����1.������2.��Ȩ��3.�ܲ�)����");
        int role = input.nextInt();
        switch(role) {
            case 1:
                System.out.println("��ѡ����������ս");
                computer.name="����";
                break;
            case 2:
                System.out.println("��ѡ������Ȩ��ս");
                computer.name="��Ȩ";
                break;
            case 3:
                System.out.println("��ѡ���˲ܲٶ�ս");
                computer.name="�ܲ�";
                break;
             default:
                 System.out.println("�ף���ѡ�����󣡣���");
                    break;
        }
        System.out.print("Ҫ��ʼ�룿��y/n)����");
        String isStart = input.next();
        if(isStart.equals("y")) {
            //���ö�ս�ķ���
            player();
            //��ʾ���
            showResult();
            
        } 
    }
    //��ս�ķ���------һ��������һ����
    public void player() {
       // int count =0;ͳ�ƾ������ܶ���������ֲ�������
        Scanner input = new Scanner(System.in);
        String answer;
        do {
            //��ʼ�Ծ���
              //1,�˳�ȭ
              int ren = person.showFist();
              if(ren>=1&&ren<=3){
            	  
              }else{
            	  System.out.println("���������");
            	  System.exit(0);
              }
              //2,���Գ�ȭ
              int dn = computer.showFist();

              if(ren==dn) {
                  System.out.println("���˵��ƽ�֣�����");
              }else if((ren-dn)==-1||(ren-dn)==2) {
                  System.out.println("���˵����Ӯ��");
                  person.score+=1;
              }else {
                  System.out.println("���˵������Ӯ�ˣ����汿������");
                  computer.score+=1;
              }
              System.out.println("�Ƿ�ʼ��һ�ֱ���(y/n)");
              answer = input.next();
              count++;//ÿ��һ�� �Ծ���+1
          }while(answer.equals("y"));
    }
    //��ʾ���յĶ�ս���
    public void showResult(){
        System.out.println(computer.name+"\tVS\t"+person.name);
        System.out.println("��ս������"+count);
        if(computer.score>person.score) {
            System.out.println("������ף��������ͣ���");
        }else if(computer.score<person.score) {
            System.out.println("�����С���� ��������");
        }else {
            System.out.println("������ƽ�֣�������㣡����");
        }
        
    }
    

}
