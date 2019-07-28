package com.wx.dao.mapper;

import java.util.List;

import com.wx.dao.entity.Fwqx;

public interface FwqxMapper {
	List<Fwqx> listAll();
	int addFwqx(Fwqx fw);
	int modifyFwqx(Fwqx fw);
	int removeFwqx(Fwqx fw);
}
