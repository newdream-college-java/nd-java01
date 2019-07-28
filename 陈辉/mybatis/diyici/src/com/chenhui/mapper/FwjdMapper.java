package com.yb.mapper;
import java.util.List;
import com.yb.entity.Fwjd;
public interface FwjdMapper {
	List<Fwjd> listAll();
	int addFwid(Fwjd fw);
	int modifyFwjd(Fwjd fw);
	int removeFwjd(int id);
}
