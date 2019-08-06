package com.dy.mapper;

import java.util.List;

import com.dy.entiy.Fwlx;

public interface FwlxMapper {
	List<Fwlx>findAll();
	int SaveFwlx(Fwlx fwlx);
	int UpdateFwlx(Fwlx fwlx);
	int DeleteFwlx(Fwlx fwlx);
}
