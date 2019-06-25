package com.yb.dao;

import java.util.List;

import com.yb.entity.GoodsSpuValue;

public interface GoodsSpuValueDao {
	//查询主题价格
	List<GoodsSpuValue> PcnGoodsSpuSpecPrice(Integer themeType);
	//查询单个主题价格
	GoodsSpuValue goodsSpuPrice(Integer pctid);
}
