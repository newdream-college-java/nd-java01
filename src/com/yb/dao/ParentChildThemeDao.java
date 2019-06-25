package com.yb.dao;

import java.util.List;
import java.util.Map;

import com.yb.entity.ParentChildTheme;
import com.yb.vo.ParentChildThemeVo;

public interface ParentChildThemeDao {
	//亲子活动条件分页查询
	List<ParentChildTheme> parentChildThemeList(Integer themeType,Integer page,Integer pageSize,String city,Integer activity,Integer day,String name);
	//查询亲子活动总数据和总页数
	Map<String,Integer> numbers(Integer themeType,int pagesize,String city,Integer activity,Integer day,String name);
	//查询亲子主题单条数据
	ParentChildTheme parentChildThemeGet(Integer pctid);
	//活动推荐数查询
	List<ParentChildTheme> recommendList(Integer pcnttId);
	//显示亲子旅游的总个数和显示pcnpct_travel_days的总个数
	Integer getcount(int count,int pcnpct_travel_days,String name);
	//亲子旅游分页显示和条件分页显示
	List<ParentChildThemeVo> list(int curPage, int pageSize,int pcnpctTravelDays,String name);
	//模糊查询搜索数据
	ParentChildTheme parentChildThemeName(String name);
	//查询活动展示数据
	List<ParentChildTheme> activityDisplayList(Integer themeType,Integer page,Integer pageSize,Integer Show);
	//查询活动展示总页数
	Integer counts(int pageSize,Integer show,Integer themeType);
	//首页显示数据
	List<ParentChildTheme> parentChildThemeIndexList(Integer themeType,Integer pageSize);
	//查询首页活动展示数据
	List<ParentChildTheme> activityDisplayIndexList(Integer themeType,Integer pageSize,Integer show);
	
	
}
