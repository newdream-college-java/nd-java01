package com.wx.dao.mapper;

import java.util.List;

import com.wx.dao.entity.Fwxx;

public interface FwxxMapper {
	List<Fwxx> listAll();
	int addFwxx(Fwxx fw);
	int modifyFwxx(Fwxx fw);
	int removeFwxx(Fwxx fw);
}
