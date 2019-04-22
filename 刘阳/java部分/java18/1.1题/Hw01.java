import java.util.Scanner;


public class Hw01 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int choice;
		System.out.print("请输入课程代号（1~3之间的数字）");
		try{
			choice=in.nextInt();
			if(choice==1){
				System.out.println("C#编程");
			}else if(choice==2){
				System.out.println("JAVA编程");
			}else if(choice==3){
				System.out.println("SQL基础");
			}else{
				System.out.println("不好意思，选择失败，请正确输入1~3的数字编号来选择课程！");
			}
		}catch(Exception e){
			System.out.println("不好意思，选择失败，请正确输入1~3的数字编号来选择课程！");
		}finally{
			System.out.println("欢迎提出建议！");
		}
	}
}
