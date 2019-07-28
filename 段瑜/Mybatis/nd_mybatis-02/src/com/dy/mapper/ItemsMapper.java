package com.dy.mapper;

import java.util.List;

import com.dy.entiy.Items;

public interface ItemsMapper {
	List<Items>imtesAll();
	int saveItems(Items items);
	int modifyItems(Items items);
	int DeleteItems(Items items);
	Items ItemsfindDetail(int id);
}
