package com.wx.dao.mapper;
import java.util.List;

import com.wx.dao.entity.Fwlx;
public interface FwlxMapper {
	List<Fwlx> listAll();
	int addFwlx(Fwlx fw);
	int modifyFwlx(Fwlx fw);
	int removeFwlx(int id);
}
