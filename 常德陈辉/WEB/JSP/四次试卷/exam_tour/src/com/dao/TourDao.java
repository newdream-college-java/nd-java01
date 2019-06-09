package com.dao;

import java.util.List;

import com.entity.Tour;

public interface TourDao {
	int insert(Tour tour);
	List<Tour> list();
	int delete(int tourid);
}
