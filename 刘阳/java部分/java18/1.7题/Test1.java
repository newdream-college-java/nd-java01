
public class Test1 {
	public void test(){
		try{
			System.out.println("try");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("catch 1");
		}catch(NullPointerException e){
			System.out.println("catch 3");
		}catch(Exception e){
			System.out.println("catch 2");
		}
		//�ڶ��ص�catch�ṹ���棬Ҫ��Exception���쳣���ͷ����������У�����֮��Ĳ��ᱻִ��
//		}catch(NullPointerException e){
//			System.out.println("catch 3");
//		}
	}
}
