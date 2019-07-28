package com.yb.mapper;

import java.util.List;
import com.yb.entity.Fwxx;

public interface FwxxMapper {
	List<Fwxx> listAll();
	int addFwxx(Fwxx fw);
	int modifyFwxx(Fwxx fw);
	int removeFwxx(Fwxx fw);
}
