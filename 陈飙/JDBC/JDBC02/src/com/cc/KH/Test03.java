package com.KH;
/*:�������ѧ����¼���ﵽ�� 140 �У���׼������ҳ���Է�ҳ�� ��ʽ ��ѯѧ����Ϣ��ÿһҳ��ʾ 30 ��ѧ������Ϣ�����ҳ����ҳ��?��ʹ�� PreparedStatement �� ResultSet ��ѯ�������
 * ���÷�ҳԭ��������е�����
 * Ȼ�����ú������
 * 1.����math������ceil������
 * 2.Ϊʲô�õ�ceil��������Ϊ��3ҳ��һ��������˻���Ҫȡ��30ҳ������Ҫ����ȥ��
 * */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Test03 {
	public static void main(String[] args) {
		List list = new ArrayList();
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
			System.out.println(url);
			// 2.2������Ӷ���
			conn = DriverManager.getConnection(url, "root", "123456");

			String sql = "select count(*)pagesum from Student limit 0,30";
			pst = conn.prepareStatement(sql);

			rs = pst.executeQuery();
			int id = 0;
			while (rs.next()) {

				id = rs.getInt("pagesum");
				//String name = rs.getString("name");
				// new ʵ����� �ѻ�õ����ݷ������� 
				//Student stu = new Student(id, name);
				//list.add(stu);

			}
			System.out.println("��ҳ������Ϊ��"+Math.ceil(id)/30.0);

			pst.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
