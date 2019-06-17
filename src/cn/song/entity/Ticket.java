package cn.song.entity;

/*车票信息表*/
public class Ticket {
	private int tId;// 车票信息表主键
	private String tName;// 车次名称
	private int tStartStationId;// 起始站，车站信息表id
	private int tEndStationId;// 到达站，车站信息系表id
	private String tStartTime;// 开车时间
	private int tDistance;// 距离
	private int tFormerPrice;// 原票价
	private int tNowPrice;// 现在的票价
	private int tTicketNumber;// 总票数
	private String tStartStationName;//起始站名称;
	private String tEndStationName; //终点站名称
	private int tTicketBookNumber;//已经预定的票数
	private String goCarTypeName; //车的类型
	private Station startStation;
	private Station endStation;
	
	public Station getEndStation() {
		return endStation;
	}
	public void setEndStation(Station endStation) {
		this.endStation = endStation;
	}
	public Station getstartStation() {
		return startStation;
	}
	public void setStartStation(Station startStation) {
		this.startStation = startStation;
	}
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public int gettStartStationId() {
		return tStartStationId;
	}
	public void settStartStationId(int tStartStationId) {
		this.tStartStationId = tStartStationId;
	}
	public int gettEndStationId() {
		return tEndStationId;
	}
	public void settEndStationId(int tEndStationId) {
		this.tEndStationId = tEndStationId;
	}
	public String gettStartTime() {
		return tStartTime;
	}
	public void settStartTime(String tStartTime) {
		this.tStartTime = tStartTime;
	}
	public int gettDistance() {
		return tDistance;
	}
	public void settDistance(int tDistance) {
		this.tDistance = tDistance;
	}
	public int gettFormerPrice() {
		return tFormerPrice;
	}
	public void settFormerPrice(int tFormerPrice) {
		this.tFormerPrice = tFormerPrice;
	}
	public int gettNowPrice() {
		return tNowPrice;
	}
	public void settNowPrice(int tNowPrice) {
		this.tNowPrice = tNowPrice;
	}
	public int gettTicketNumber() {
		return tTicketNumber;
	}
	public void settTicketNumber(int tTicketNumber) {
		this.tTicketNumber = tTicketNumber;
	}
	public String gettStartStationName() {
		return tStartStationName;
	}
	public void settStartStationName(String tStartStationName) {
		this.tStartStationName = tStartStationName;
	}
	public String gettEndStationName() {
		return tEndStationName;
	}
	public void settEndStationName(String tEndStationName) {
		this.tEndStationName = tEndStationName;
	}
	@Override
	public String toString() {
		return "Ticket [tId=" + tId + ", tName=" + tName + ", tStartStationId=" + tStartStationId + ", tEndStationId="
				+ tEndStationId + ", tStartTime=" + tStartTime + ", tDistance=" + tDistance + ", tFormerPrice="
				+ tFormerPrice + ", tNowPrice=" + tNowPrice + ", tTicketNumber=" + tTicketNumber
				+ ", tStartStationName=" + tStartStationName + ", tEndStationName=" + tEndStationName + "]\n";
	}
	public int gettTicketBookNumber() {
		return tTicketBookNumber;
	}
	public void settTicketBookNumber(int tTicketBookNumber) {
		this.tTicketBookNumber = tTicketBookNumber;
	}
	public String getGoCarTypeName() {
		return goCarTypeName;
	}
	public void setGoCarTypeName(String goCarTypeName) {
		this.goCarTypeName = goCarTypeName;
	}
	

}
