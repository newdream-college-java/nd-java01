package cn.song.dao;

import java.util.List;

import cn.song.vo.ChepiaoProblem;

public interface ChepiaoProblemDao {
	ChepiaoProblem getChepiaoProblem(int pId);

	List<ChepiaoProblem> getChepiaoProblem(int page, int pageSize);

	List<ChepiaoProblem> getChepiaoProblem(int page, int pageSize, int uid);

	List<ChepiaoProblem> getChepiaoProblem(int page, int pageSize, int pStatu, int uid);

	int getAllCountByProblem(int uId);

	int getCountByProblem(int pStatu, int uId);
}
