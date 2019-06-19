package cn.song.dao;

import java.util.List;

import cn.song.entity.Inssure;
import cn.song.entity.QpTripPeople;
import cn.song.entity.TripOrder;
import cn.song.entity.TripPeople;
import cn.song.vo.OrderListVo;

public interface TripOrderDao {
	boolean bookTicket(Inssure inssure,QpTripPeople qt,List<TripPeople> tps,TripOrder to);
	boolean pay(String orderNo,String issureNo,int uid);
	List<OrderListVo> getTripOrder(String date,Integer status,String phone,String orderNo,Integer page,Integer pageSize);
	TripPeople getTripPeople(String tno);
}
