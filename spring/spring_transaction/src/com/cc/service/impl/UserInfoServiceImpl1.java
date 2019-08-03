package com.cc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.cc.mapper.UserInfoMapper;
import com.cc.model.UserInfo;
import com.cc.service.IUserInfoService;
/*
 *   xml 配置
 *   <bean id="userInfoServiceImpl" class="com.cc.service.impl.UserInfoServiceImpl">
        <property name="userInfoMapper" ref="userInfoMapper"></property>
      </bean>
      注解配置
      @Service
      @Autowired
      
 */
//业务层
@Service
public class UserInfoServiceImpl1 implements IUserInfoService {
    
    //事务模板
    private final TransactionTemplate transactionTemplate;
    @Autowired
    public UserInfoServiceImpl1(PlatformTransactionManager transactionManager) {
        this.transactionTemplate = new TransactionTemplate(transactionManager);
    }
    @Autowired
     private UserInfoMapper userInfoMapper;
    
    /**
     * 转账业务：二狗子（from）转账给付自强(to)，转money钱
     */
    @Override
    public void zz(int from, int to, int money) {
        
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {

            protected void doInTransactionWithoutResult(TransactionStatus status) {
                try {
                    //1,二狗子的钱减少300
                      //1.1查询二狗子有多少钱
                      UserInfo egz = new UserInfo() ;
                      egz.setId(from);
                      egz = userInfoMapper.selectByPrimaryKey(egz.getId());
                      System.out.println(egz);
                    //1.2扣二狗子有300
                      egz.setMoney(egz.getMoney()-money);
                      int result = userInfoMapper.updateByPrimaryKey(egz );
                     //2,付自强的钱增加300
                      //1.1查询二狗子有多少钱
                      UserInfo rzq = new UserInfo() ;
                      rzq.setId(to);
                      rzq = userInfoMapper.selectByPrimaryKey(rzq.getId());
                      System.out.println(rzq);
                    //1.2扣二狗子有300
                      rzq.setMoney(rzq.getMoney()+money);
                      int result2 = userInfoMapper.updateByPrimaryKey(rzq );
                      if(result>0&&result2>0) {
                          System.out.println("转账成功！！");
                      }else {
                        //int a = 10/0;//产生一个异常
                        throw new Exception("转账失败");//产生一个异常
                      }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage()+"\t 回滚！！");
                    status.setRollbackOnly();//回滚
                }
            }
        });
    }

}
