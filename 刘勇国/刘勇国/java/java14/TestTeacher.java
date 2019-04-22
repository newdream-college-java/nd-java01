package 第14章封装作业;

public class TestTeacher {
	public static void main(String[] args){
		Teacher t1=new Teacher("陈超", 34);
		t1.show();
		String major;
		major=t1.major_TEST;
		Teacher t2 =new Teacher("左左", "女", 40);
		
		t2.show();
		
	}
}
