package com.shawn.tomcat;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BootApplication {

    private int port = 8080;
    private String contextPath = "";
    private static Logger logger = LoggerFactory.getLogger(BootApplication.class);

    public void start() throws Exception {

        try {
            logger.info("tomcat开始启动");
            // 设置端口
            Tomcat tomcat = new Tomcat();
            tomcat.setPort(port);

            String baseDir = Thread.currentThread().getContextClassLoader().getResource("").getPath();
            tomcat.setBaseDir(baseDir);
            Context ctx = tomcat.addWebapp("", baseDir);
            ctx.setParentClassLoader(Thread.currentThread().getContextClassLoader());
            //ctx.setLoader(new WebappLoader(Thread.currentThread().getContextClassLoader()));
            ctx.setRequestCharacterEncoding("UTF-8");

            tomcat.start();
            logger.info("tomcat启动成功，端口:{}", port);
            tomcat.getServer().await();

        } catch (Exception e) {
            logger.error("tomcat启动失败，", e);
        }


    }

    public static void main(String[] args) throws Exception {
        BootApplication application = new BootApplication();
        application.start();
    }
}
