package com.entity;

public class Tour {
	private int tourid;
	private String tourCity; //国家，城市
	private String tourPlace; //景区
	private String tourTime; // 旅游时间
	private String tourNote; // 经历记录
	public Tour() {
	}
	public Tour(String tourCity, String tourPlace, String tourTime,
			String tourNote) {
		super();
		this.tourCity = tourCity;
		this.tourPlace = tourPlace;
		this.tourTime = tourTime;
		this.tourNote = tourNote;
	}
	public int getTourid() {
		return tourid;
	}
	public void setTourid(int tourid) {
		this.tourid = tourid;
	}
	public String getTourCity() {
		return tourCity;
	}
	public void setTourCity(String tourCity) {
		this.tourCity = tourCity;
	}
	public String getTourPlace() {
		return tourPlace;
	}
	public void setTourPlace(String tourPlace) {
		this.tourPlace = tourPlace;
	}
	public String getTourTime() {
		return tourTime;
	}
	public void setTourTime(String tourTime) {
		this.tourTime = tourTime;
	}
	public String getTourNote() {
		return tourNote;
	}
	public void setTourNote(String tourNote) {
		this.tourNote = tourNote;
	}
	@Override
	public String toString() {
		return "Tour [tourCity=" + tourCity + ", tourNote=" + tourNote
				+ ", tourPlace=" + tourPlace + ", tourTime=" + tourTime
				+ ", tourid=" + tourid + "]\n";
	}
	
}
