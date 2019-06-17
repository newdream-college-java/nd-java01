package cn.song.dao;

import java.util.List;

import cn.song.vo.ChepiaoProblem;

public interface ChepiaoProblemDao {
	List<ChepiaoProblem> getChepiaoProblem(int page, int pageSize);

	List<ChepiaoProblem> getChepiaoProblem(int page, int pageSize, int uid, int pStatus);
}
