package cn.song.entity;

public class TripPeople extends QpTripPeople{
	private int tpId;
	private int isAdult;
	private int status;
	public int getTpId() {
		return tpId;
	}
	public void setTpId(int tpId) {
		this.tpId = tpId;
	}
	public int getIsAdult() {
		return isAdult;
	}
	public void setIsAdult(int isAdult) {
		this.isAdult = isAdult;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
