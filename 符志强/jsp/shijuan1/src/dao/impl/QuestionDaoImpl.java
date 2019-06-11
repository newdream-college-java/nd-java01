package dao.impl;

import java.util.ArrayList;
import java.util.List;

import dao.BaseDao;
import dao.QuestionDao;

import entity.Question;

public class QuestionDaoImpl extends BaseDao implements QuestionDao {

	public List<Question> list(Integer subject) {
		List<Question> list=new ArrayList<Question>();
		try {
			getConn();
			StringBuffer sql=new StringBuffer("select * from question where 1=1");
			if(subject!=null){
				sql.append(" and subject=?");
				pst=conn.prepareStatement(sql.toString());
				pst.setInt(1, subject);
			}else{
				pst=conn.prepareStatement(sql.toString());
			}
			rs=pst.executeQuery();
			while(rs.next()){
				Question q=new Question();
				q.setqId(rs.getInt("q_id"));
				q.setQuestion(rs.getString("question"));
				q.setQuestionA(rs.getString("optionA"));
				q.setQuestionB(rs.getString("optionB"));
				q.setQuestionC(rs.getString("optionC"));
				q.setQuestionD(rs.getString("optionD"));
				q.setSubject(rs.getInt("subject"));
				q.setAnswer(rs.getString("answer"));
				list.add(q);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(rs, pst, conn);
		}
		return list;
	}

	public int add(Question question) {
		int rs=-1;
		try {
			getConn();
			String sql="insert into question values(null,?,?,?,?,?,?,?);";
			pst=conn.prepareStatement(sql);
			pst.setString(1, question.getQuestion());
			pst.setString(2, question.getQuestionA());
			pst.setString(3, question.getQuestionB());
			pst.setString(4, question.getQuestionC());
			pst.setString(5, question.getQuestionD());
			pst.setInt(6, question.getSubject());
			pst.setString(7, question.getAnswer());
			rs=pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(null, pst, conn);
		}
		return rs;
	}
//public static void main(String[] args) {
//	QuestionDaoImpl qd=new QuestionDaoImpl();
//	qd.tianjia(question);
//}
}
