public class A{
	public static void main(String[] args){
		int year=2012;		
		double students=25*10000;//学生总人数
		while(students<=100*10000){		
			students=students*(1.25);
			year++;
		}
		System.out.println(year+"年学生人数为"+students);
	}
}