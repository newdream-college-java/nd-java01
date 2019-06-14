package com.cc.servlet.fore;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CreateCodeSvl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入Servlet");
        //1. 验证内容 ：字母和数字  4位
        char[] chs={'A','B','C','D','E','F','G','H','J','K','L','M',
                'N','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c',
                'd','e','f','g','h','i','j','k','m','n','p','q','r','s','t',
                'u','v','w','x','y','z','0','1','2','3','4','5','6','7','8',
                '9'};
        //2.随机取4个字符
        Random rd = new Random();
        StringBuffer codeView = new StringBuffer();
        StringBuffer code = new StringBuffer();
        for(int i=0;i<4;i++) {
            int index = rd.nextInt(chs.length);//0~数组长度-1
            code.append(chs[index]);
            codeView.append(chs[index]+"  ");
        }
        System.out.println("验证码为："+code.toString());
        //2.1将随机生成的验证码放入session
        HttpSession session = req.getSession();
        session.setAttribute("code", code.toString());
        //获取application
        //ServletContext application = req.getServletContext();
        //3.将验证码绘制到网页中？
        int width = 100 ;
        int height = 30; //画布的大小
        //3.1准备画布
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        
        //3.2得到画笔
        Graphics g = image.getGraphics();
        //3.3画背景
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, width, height);
        //3.4画验证码
        g.setColor(Color.RED);
        g.setFont(new Font("宋体", Font.ITALIC, 20));
       
        g.drawString(codeView.toString(), 5,20);
        
        //3.5画干扰线
        for(int i=0;i<100;i++){
            g.fillOval(rd.nextInt(width),rd.nextInt(height),2,2);
        }
        g.drawLine(0,rd.nextInt(height),width,rd.nextInt(height));
        g.drawLine(rd.nextInt(width),0,rd.nextInt(width),height);
        g.drawLine(rd.nextInt(width),0,rd.nextInt(width),height);
        
        g.dispose();//销毁画笔
        
        ServletOutputStream os = resp.getOutputStream();
        ImageIO.write(image, "JPEG", os);
        os.flush();
        os.close();
       
    }
}
