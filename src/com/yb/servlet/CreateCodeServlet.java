package com.yb.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CreateCodeServlet extends HttpServlet{
	/**
 * 
 */
private static final long serialVersionUID = -3076513923383935388L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1、验证内容：数字与字母
		char[] chs={'A','B','C','D','E','F','G','H','J','K','L','M','N','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','m','n','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'}; 
		 // 2.随机取4个字符
		Random rd=new Random();
		StringBuffer codeView =  new StringBuffer();
        StringBuffer code =  new  StringBuffer();
        for(int i = 0 ; i<4 ; i ++){
            int index = rd.nextInt(chs.length); // 0~数组长度-1
            code.append(chs[index]);
            codeView .append(chs [index] +" ");
        }
        HttpSession session = req .getSession();
        // 2.1将随机生成的验证码放入会话
        session.setAttribute("code",code.toString());
        // 3.将验证码绘制到网页中？
        int width =  100 ;
        int height =  30 ;
        // 3.1准备画布
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
     // 步骤二 图片绘制背景颜色 ---通过绘图对象
		Graphics graphics = bufferedImage.getGraphics();// 得到画图对象 --- 画笔
		graphics.setColor(Color.YELLOW);
		graphics.fillRect(0, 0, width, height);
		// 3.4画验证码
		graphics.setColor(Color.red);
		graphics.setFont(new Font("宋体", Font.BOLD, 20));
		graphics.drawString(String.valueOf(codeView),5,20);
		 // 3.5画干扰线
        for(int i = 0 ; i < 100 ; i ++){
        	graphics.fillOval(rd.nextInt(width),rd.nextInt(height),2,2);
        }
        graphics.drawLine(0,rd.nextInt(height),width,rd.nextInt(height));
        graphics.drawLine(rd.nextInt(width),0,rd.nextInt(width),height);
        graphics.drawLine(rd.nextInt(width),0,rd.nextInt(width),height);
        graphics.dispose();
        ServletOutputStream os = resp.getOutputStream();
        ImageIO.write(bufferedImage, "jpg", os);
	}
}
