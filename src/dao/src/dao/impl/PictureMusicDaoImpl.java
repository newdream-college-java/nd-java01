package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.BaseDao;
import entity.PictureMusic;

public class PictureMusicDaoImpl extends BaseDao implements PictureMusicImp{
	Connection conn = null;
	PreparedStatement pst = null;
	List<PictureMusic> list = null;
	ResultSet rs=null;
	//图书音乐二级分类 
	public List<PictureMusic> pictureMusic() {
		list =new ArrayList<PictureMusic>();
		try {
			conn=getConn();
			String sql = "select Select_Goods_type from picture_music";
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			
			while(rs.next()){
				
				PictureMusic spm =new PictureMusic();
				spm.setName(rs.getString("Select_Goods_type"));
				
				list.add(spm);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

}
