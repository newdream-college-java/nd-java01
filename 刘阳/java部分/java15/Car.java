
public class Car extends MotoVehicle{
	//����
	private String type;
	public Car(final String no,final String type,final String brand){
		//this.no=no;
		//��ʽһ��setNo(no);
		//��ʽ����
		super(no);
		this.type=type;
		setBrand(brand);
	}
	public void calcRent(int days){
		if(this.type.equals("GL8")){
			System.out.println("����ĳ�Ϊ��GL8������Ϊ��"+days+"�죬����Ϊ��"+(days*600));
		}else if(this.type.equals("X6")){
			System.out.println("����ĳ�Ϊ��X6������Ϊ��"+days+"�죬����Ϊ��"+(days*500));
		}else if(this.type.equals("������")){
			System.out.println("����ĳ�Ϊ��������������Ϊ��"+days+"�죬����Ϊ��"+(days*300));
		}
	}
}
