package com.yb.dao;

import java.util.List;

import com.yb.entity.GoodsSpuValue;

public interface GoodsSpuValueDao {
	//��ѯ����۸�
	List<GoodsSpuValue> PcnGoodsSpuSpecPrice(Integer themeType);
	//��ѯ��������۸�
	GoodsSpuValue goodsSpuPrice(Integer pctid);
}
