package com.yb.mapper;
import java.util.List;
import com.yb.entity.Fwlx;
public interface FwlxMapper {
	List<Fwlx> listAll();
	int addFwlx(Fwlx fw);
	int modifyFwlx(Fwlx fw);
	int removeFwlx(int id);
}
