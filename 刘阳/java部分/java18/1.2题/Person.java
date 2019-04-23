
public class Person {
	private String name="匿名";
	private int age;
	private String sex;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(1<=age&&age<=100){
			this.age = age;
		}else{
			try {
				throw new Exception("年龄必须在1到100之间！");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
	}
	public void setSex(String sex) {
		if(sex.equals("男")||sex.equals("女")){
			this.sex = sex;
		}else{
			try {
				throw new Exception("性别必须是男或者女！");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	}
	public void print(){
		System.out.println(name+"("+sex+","+age+"岁)");
	}
}
