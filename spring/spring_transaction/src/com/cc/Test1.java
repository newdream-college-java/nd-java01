package com.cc;
import java.lang.reflect.Proxy;

import com.cc.entity.UserDao;
import com.cc.entity.impl.UserDaoImpl;
import com.cc.proxy.JdkHk;

public class Test1 {
        public static void main(String[] args) {
            //非代理模式
            UserDao user = new UserDaoImpl();
            System.out.println(user.add(3, 5));
            System.out.println("============入侵后===========");
            //黑客入侵
            //1.目标对象
            UserDao target = new UserDaoImpl();//系统类加载器
            //2.黑客对象
            JdkHk jdkHk = new JdkHk(target);
            //3.伪装成目标对象(代理的过程) ,底层是使用字节码拼接技术  acm
            //代理对象(伪装对象)就是黑客对象与目标对象的合体
            /*.java------.classs------类加载器将字节码加载到jvm-----类的信息
             * loader:  目标类的类加载器
             * interfaces: 目标类实现的接口
             * h: 黑客对象
             */
            UserDao userDao = (UserDao) Proxy.newProxyInstance(target.getClass().getClassLoader(), 
                    new Class[] {UserDao.class}, jdkHk);
            
            System.out.println(userDao.add(3, 5));
            
        }
}
