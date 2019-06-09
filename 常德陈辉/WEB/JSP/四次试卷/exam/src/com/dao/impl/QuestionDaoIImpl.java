package com.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.dao.BaseDao;
import com.dao.QuestionDao;
import com.entity.Question;

public class QuestionDaoIImpl extends BaseDao implements QuestionDao {

	public List<Question> list(Integer subject) {
		List<Question> list=new ArrayList<Question>();
		try {
			getConn();
			StringBuffer sql=new StringBuffer("select * from question");
			if(subject!=null){
				sql.append(" where subject=?");
				pst=conn.prepareStatement(sql.toString());
				pst.setInt(1, subject);
			}else{
				pst=conn.prepareStatement(sql.toString());
			}
			rs=pst.executeQuery();
			while(rs.next()){
				Question que=new Question();
				que.setqId(rs.getInt("Q_ID"));
				que.setAnswer(rs.getString("answer"));
				que.setQuestionA(rs.getString("option_A"));
				que.setQuestionB(rs.getString("option_B"));
				que.setQuestionC(rs.getString("option_C"));
				que.setQuestionD(rs.getString("option_D"));
				que.setQuestion(rs.getString("question"));
				que.setSubject(rs.getInt("subject"));
				list.add(que);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(rs, pst, conn);
		}
		return list;
	}

	public int result(Question question) {
		int result=-1;
		try {
			getConn();
			String sql="insert into question values(null,?,?,?,?,?,?,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1, question.getQuestion());
			pst.setString(2, question.getQuestionA());
			pst.setString(3, question.getQuestionB());
			pst.setString(4, question.getQuestionC());
			pst.setString(5, question.getQuestionD());
			pst.setInt(6, question.getSubject());
			pst.setString(7, question.getAnswer());
			result=pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(null, pst, conn);
		}
		return result;
	}

}
