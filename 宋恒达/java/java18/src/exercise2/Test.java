package exercise2;
/**
 * 设计人类Person,含姓名、年龄、性别三个私有属性，封装为只写
 * 属性设计Person类的print方法，按其格式输出：姓名（性别，年龄）
 * 性别的set方法中设计性别只含男或者女，否则抛出异常信息，性别必须是男或者
 * 女，年龄的set方法设计年龄只能1-100岁，否则抛出异常信息，年龄必须
 * 在1到100之间
 * @author mo
 *
 */
public class Test {
	public static void main(String[] args) {
		try {
			Person p=new Person();
			p.setName("张三");
			p.setAge(10);
			p.setSex("男");
			p.print();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
