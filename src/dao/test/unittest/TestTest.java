package unittest;

import dao.impl.GoodListDaoImpl;
import dao.impl.NewsInformationDaoImpl;
import dao.impl.NewsViewDaoImpl;
import dao.impl.PictureMusicDaoImpl;
import dao.impl.PictureMusicImp;
import dao.impl.ProductViewDaoImpl;
import dao.impl.UserDaoImpl;
import entity.User;

public class TestTest {
	public static void main(String[] args) {
////		GoodListDaoImpl gdi=new GoodListDaoImpl();
////		System.out.println(gdi.listGood(1, 2));
//		UserDaoImpl udi=new UserDaoImpl();
//		User user =new User();
//		user.setUserEmail("916390120@qq.com");
//		user.setUserAccount("lyg1996");
//		user.setUserBirthday("1996-11-13");
//		user.setUserIdCard("201517020213");
//		user.setUserName("lyg1996");
//		user.setUserPassword("123456");
//		udi.addUser(user);
		
		
		
//		PictureMusicDaoImpl pmdi=new PictureMusicDaoImpl();
//		System.out.println(pmdi.pictureMusic());
		
		
		
//		ProductViewDaoImpl pvdi=new ProductViewDaoImpl();
//		System.out.println(pvdi.showProductVew(1));
		
		
		NewsViewDaoImpl nvdi =new NewsViewDaoImpl();
		System.out.println(nvdi.LookUpNewsView(1));
	}
	
}	
