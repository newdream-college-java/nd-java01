package cn.song.dao;

import java.util.List;

import cn.song.entity.Station;

public interface StationDao {
	Station station(int id);
	public List<Station> getStation();
}
