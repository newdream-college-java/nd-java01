package cn.song.entity;

/*车票信息表*/
public class Ticket {
	private int tId;// 车票信息表主键
	private String tName;// 车次名称
	private int tStartStation_id;// 起始站，车站信息表id
	private int tEndStation_id;// 到达站，车站信息系表id
	private String tStartTime;// 开车时间
	private int tDistance;// 距离
	private int tFormerPrice;// 原票价
	private int tNowPrice;// 现在的票价
	private int tTicketNumber;// 总票数

}
