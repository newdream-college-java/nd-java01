public class Person {
    // ����----���֣�����
    String name="�ۻ���";
    int score;

    // ����--��ȭ
    public int showFist() {
        Scanner input = new Scanner(System.in);
        System.out.print("���ȭ��1��ʯͷ��2��������3������");
        int choice = -1;
        //�����Ƿ����֣�
        if(input.hasNextInt()) {
            choice  = input.nextInt();
        }
        switch (choice) {
            case 1:
                System.out.println("���ȭ��ʯͷ");
                break;
            case 2:
                System.out.println("���ȭ������");
                break;
            case 3:
                System.out.println("���ȭ����");
                break;
             default:
                 System.out.println("�ף����������󣡣�");
                break;
        }
       return choice;
    }
}
