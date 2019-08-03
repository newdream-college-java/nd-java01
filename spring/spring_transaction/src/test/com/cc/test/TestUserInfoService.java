package test.com.cc.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cc.service.IUserInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans-userinfo.xml")
public class TestUserInfoService {
    
    @Autowired
    @Qualifier("userInfoServiceImpl2")
    private IUserInfoService iUserInfoService;
    @Test
    public void testZZ() {
        System.out.println(iUserInfoService);
        iUserInfoService.zz(1, 2, 1);
    }
}
