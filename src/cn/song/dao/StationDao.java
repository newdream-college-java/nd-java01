package cn.song.dao;

import java.util.List;

import cn.song.entity.Station;

public interface StationDao {
	public List<Station> getStation();

	Station station(int id);
}
