package dao.impl;

import java.util.List;

import entity.GoodList;

public interface GoodListImpl {
	//��Ʒ��ҳ��ѯ����
	List<GoodList>  listGood(int curPage ,int pageSize);
}
