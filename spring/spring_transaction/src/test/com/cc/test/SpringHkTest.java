package test.com.cc.test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cc.entity.impl.OrderDaoImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans-aop.xml")
public class SpringHkTest {
    //@Autowired//按类型注入
    //@Resource(name="orderDaoProxy")   //按名称注入
    @Autowired
    @Qualifier("orderDaoProxy")//按名称注入
     private OrderDaoImpl orderDao;
    @Test
    public void testHk() {
        System.out.println(orderDao.add(3,5));
    }
}
