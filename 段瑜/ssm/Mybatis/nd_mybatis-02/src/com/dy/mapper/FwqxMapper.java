package com.dy.mapper;

import java.util.List;

import com.dy.entiy.Fwqx;

public interface FwqxMapper {
	int SaveFwqx(Fwqx fwqx);
	List<Fwqx>findAll();
	int UpdateFwqx(Fwqx fwqx);
	int DeleteFwqx(Fwqx fwqx);
}
