package com.cb.entity;

import java.util.Date;

public class OrderdetailCustom extends Orderdetail {
	 private String number;

	 private Date createtime;

	@Override
	public String toString() {
		return "OrderdetailCustom [createtime=" + createtime + ", number="
				+ number + "]\n";
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
}
