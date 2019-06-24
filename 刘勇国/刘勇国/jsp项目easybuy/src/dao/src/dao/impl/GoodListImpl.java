package dao.impl;

import java.util.List;

import entity.GoodList;

public interface GoodListImpl {
	//商品分页查询功能
	List<GoodList>  listGood(int curPage ,int pageSize);
}
