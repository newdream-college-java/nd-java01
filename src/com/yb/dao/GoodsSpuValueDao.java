package com.yb.dao;

import java.util.List;

import com.yb.entity.GoodsSpuValue;

public interface GoodsSpuValueDao {
	List<GoodsSpuValue> PcnGoodsSpuSpecPrice(Integer themeType);
}
