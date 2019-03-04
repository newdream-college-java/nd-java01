package java10;
/**
 * ²âÊÔmanagerÀà
 * @author mo
 *
 */
public class ManagerTest {
	public static void main(String[] args) {
			Manager manager1=new Manager();
			manager1.name="admin";
			manager1.password="111111";
			manager1.show();
			Manager manager2=new Manager();
			manager2.name="admin";
			manager2.password="222222";
			manager2.show();
			System.out.println();
			System.out.println();
			manager1.updatePassword();
			manager2.updatePassword();
	}
}
