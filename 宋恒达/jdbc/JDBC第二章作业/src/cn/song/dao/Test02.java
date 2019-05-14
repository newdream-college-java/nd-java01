package cn.song.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author mo
 * @version 2019年5月14日 下午7:11:07
 * @description
 */
public class Test02 {
	public static void main(String[] args) {
		System.out.println("======欢迎访问宠物商店=======");
		System.out.println("====1.添加宠物信息 2.修改宠物信息 3.查询宠物信息");
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入你的选择");
		int selectIndex = sc.nextInt();
		if (selectIndex == 3) {
			System.out.println("宠物商店>查询宠物");
			System.out.println("宠物信息表");
			System.out.println("编号   名字  健康值");
			Connection conn = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			try {
				conn = BaseDao.getConnection();
				String sql = "select id,name,health from dog";
				ps = conn.prepareStatement(sql);
				rs=ps.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt("id")+"  "+rs.getString("name")
					+"  "+rs.getInt("health"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				BaseDao.release(conn, ps, rs);
			}
		}
	}
}
