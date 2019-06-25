package com.yb.dao;

import com.yb.entity.ExpenseStandard;

public interface ExpenseStandardDao {
	//查询收费标准信息
	ExpenseStandard expenseStandard(Integer pctid);
}
