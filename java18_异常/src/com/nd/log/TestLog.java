package com.nd.log;

import org.apache.log4j.Logger;

public class TestLog {
    //得到日志对象
    //
    static Logger logger = Logger.getLogger(TestLog.class);
    public static void main(String[] args) {
        //输出
        
       logger.fatal("我是致命错误");
       logger.error("我是错误");
      logger.info("我是普通信息");
      logger.warn("我是警告信息");
      logger.debug("我是调试信息");
    }
}
