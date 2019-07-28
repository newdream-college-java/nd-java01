package com.cc.mapper;
import java.util.List;

import com.cc.entity.Fwlx;
public interface FwlxMapper {
	List<Fwlx> listAll();
	int addFwlx(Fwlx fw);
	int modifyFwlx(Fwlx fw);
	int removeFwlx(int id);
}
