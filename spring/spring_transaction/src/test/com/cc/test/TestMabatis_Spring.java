package test.com.cc.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.support.TransactionTemplate;

import com.cc.mapper.UserInfoMapper;
import com.cc.model.UserInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans-datasoource.xml")
public class TestMabatis_Spring {
        @Autowired
        ApplicationContext context;//工厂
        @Test
        public void SelectOne() {
           UserInfoMapper  userInfoMapper = (UserInfoMapper) context.getBean("userInfoMapper");
           UserInfo userInfo = userInfoMapper.selectByPrimaryKey(1);
           System.out.println(userInfo);
        }
        @Autowired
        private  TransactionTemplate transactionTemplate;
        @Test
        public void zz() {
            UserInfoMapper  userInfoMapper = (UserInfoMapper) context.getBean("userInfoMapper");
            //1,二狗子的钱减少300
            //1.1查询二狗子有多少钱
            UserInfo egz = new UserInfo() ;
            egz.setId(1);
            egz = userInfoMapper.selectByPrimaryKey(egz.getId());
            System.out.println(egz);
          //1.2扣二狗子有300
            egz.setMoney(egz.getMoney()-300);
            int result = userInfoMapper.updateByPrimaryKey(egz );
           //2,付自强的钱增加300
            //1.1查询二狗子有多少钱
            UserInfo rzq = new UserInfo() ;
            rzq.setId(200);
            rzq = userInfoMapper.selectByPrimaryKey(rzq.getId());
            System.out.println(rzq);
          //1.2扣二狗子有300
            rzq.setMoney(rzq.getMoney()+300);
            int result2 = userInfoMapper.updateByPrimaryKey(rzq );
        }
}
