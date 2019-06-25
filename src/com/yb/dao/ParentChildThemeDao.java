package com.yb.dao;

import java.util.List;
import java.util.Map;

import com.yb.entity.ParentChildTheme;
import com.yb.vo.ParentChildThemeVo;

public interface ParentChildThemeDao {
	//���ӻ������ҳ��ѯ
	List<ParentChildTheme> parentChildThemeList(Integer themeType,Integer page,Integer pageSize,String city,Integer activity,Integer day,String name);
	//��ѯ���ӻ�����ݺ���ҳ��
	Map<String,Integer> numbers(Integer themeType,int pagesize,String city,Integer activity,Integer day,String name);
	//��ѯ�������ⵥ������
	ParentChildTheme parentChildThemeGet(Integer pctid);
	//��Ƽ�����ѯ
	List<ParentChildTheme> recommendList(Integer pcnttId);
	//��ʾ�������ε��ܸ�������ʾpcnpct_travel_days���ܸ���
	Integer getcount(int count,int pcnpct_travel_days,String name);
	//�������η�ҳ��ʾ��������ҳ��ʾ
	List<ParentChildThemeVo> list(int curPage, int pageSize,int pcnpctTravelDays,String name);
	//ģ����ѯ��������
	ParentChildTheme parentChildThemeName(String name);
	//��ѯ�չʾ����
	List<ParentChildTheme> activityDisplayList(Integer themeType,Integer page,Integer pageSize,Integer Show);
	//��ѯ�չʾ��ҳ��
	Integer counts(int pageSize,Integer show,Integer themeType);
	//��ҳ��ʾ����
	List<ParentChildTheme> parentChildThemeIndexList(Integer themeType,Integer pageSize);
	//��ѯ��ҳ�չʾ����
	List<ParentChildTheme> activityDisplayIndexList(Integer themeType,Integer pageSize,Integer show);
	
	
}
