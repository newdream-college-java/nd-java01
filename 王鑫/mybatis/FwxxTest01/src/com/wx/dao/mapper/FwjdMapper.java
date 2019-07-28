package com.wx.dao.mapper;

import com.wx.dao.entity.Fwjd;

public interface FwjdMapper {
	List<Fwjd> listAll();

	int addFwid(Fwjd fw);

	int modifyFwjd(Fwjd fw);

	int removeFwjd(int id);
}
