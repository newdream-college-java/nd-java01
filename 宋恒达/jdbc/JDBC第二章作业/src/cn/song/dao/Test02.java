package cn.song.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author mo
 * @version 2019��5��14�� ����7:11:07
 * @description
 */
public class Test02 {
	public static void main(String[] args) {
		System.out.println("======��ӭ���ʳ����̵�=======");
		System.out.println("====1.��ӳ�����Ϣ 2.�޸ĳ�����Ϣ 3.��ѯ������Ϣ");
		Scanner sc = new Scanner(System.in);
		System.out.print("���������ѡ��");
		int selectIndex = sc.nextInt();
		if (selectIndex == 3) {
			System.out.println("�����̵�>��ѯ����");
			System.out.println("������Ϣ��");
			System.out.println("���   ����  ����ֵ");
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
