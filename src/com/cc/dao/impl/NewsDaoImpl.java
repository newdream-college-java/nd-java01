package com.cc.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.cc.dao.BaseDao;
import com.cc.dao.NewsDao;
import com.cc.entity.News;

public class NewsDaoImpl extends BaseDao implements NewsDao{
    @Override
    public List<News> listNewsByPage(int page, int pageSize) {
        List<News> list =new ArrayList<News>();
        try {
            getConn();
            String sql  = "select * from eb_news limit ?,?";
            pst =conn.prepareStatement(sql);
            pst.setInt(1,(page-1)*pageSize);
            pst.setInt(2, pageSize);
           rs =  pst.executeQuery();
           while(rs.next()) {
               News news = new News();
               news.setEnId(rs.getInt("en_id"));
               news.setEnTitle(rs.getString("en_title"));
               news.setEnContent(rs.getString("en_content"));
               news.setEnCreateTime(rs.getString("en_create_time"));
               list.add(news);
           }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            closeConn(rs, pst, conn);
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(new NewsDaoImpl().listNewsByPage(2, 2));
    }
}
