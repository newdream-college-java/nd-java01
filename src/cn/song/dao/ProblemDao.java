package cn.song.dao;

import java.util.List;

import cn.song.vo.ChepiaoProblem;

public interface ProblemDao {
	ChepiaoProblem getChepiaoProblem(int pId);

	List<ChepiaoProblem> getChepiaoProblem(int page, int pageSize);

	List<ChepiaoProblem> getChepiaoProblem(int page, int pageSize, int uid);

	List<ChepiaoProblem> getChepiaoProblem(int page, int pageSize, int pStatu, int uid);

	int getAllCountByProblem(int uId);

	int getCountByProblem(int pStatu, int uId);

	boolean deleteProblem(int pId, int status);

	boolean addProblem(String pContent, String pSupply, int pTypeId, int uId);

	int modifyAsk(String question, String supply, int pid);
}
