package com.dy.mapper;

import java.util.List;

import com.dy.entiy.Fwxx;

public interface FwxxMapper {
	int SaveFwxx(Fwxx fwxx);
	List<Fwxx>findAll();
	int UpdateFwxx(Fwxx fwxx);
	int DeleteFwxx(Fwxx fwxx);
}
