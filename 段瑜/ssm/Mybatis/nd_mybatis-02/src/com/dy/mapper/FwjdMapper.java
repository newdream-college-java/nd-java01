package com.dy.mapper;

import java.util.List;

import com.dy.entiy.Fwjd;

public interface FwjdMapper {
	List<Fwjd>findAll();
	int SaveFwjd(Fwjd fwjd);
	int UpdateFwjd(Fwjd fwjd);
	int DeleteFwjd(Fwjd fwjd);
}
