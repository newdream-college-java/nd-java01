

public class CustomerBiz {
	String[] names=new String[100];
	public void show(String name){
		for(int i=0;i<names.length;i++){
			if(names[i]==null){
				names[i]=name;
				break;
			}
		}
	}
	public void showNames(){
		System.out.println("******************************");
		System.out.println("\t�ͻ������б�");
		System.out.println("******************************");
		for(int i=0;i<names.length;i++){
			if(names[i]!=null){
				System.out.print(names[i]+"\t");
			}
		}
	}
}
