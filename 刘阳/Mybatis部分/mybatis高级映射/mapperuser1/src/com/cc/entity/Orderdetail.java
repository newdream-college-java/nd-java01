package com.cc.entity;

import java.util.List;

public class Orderdetail {
    private Integer id;

    private Integer ordersId;

    private Integer itemsId;

    private Integer itemsNum;
    
    private Items items;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrdersId() {
		return ordersId;
	}

	public void setOrdersId(Integer ordersId) {
		this.ordersId = ordersId;
	}

	public Integer getItemsId() {
		return itemsId;
	}

	public void setItemsId(Integer itemsId) {
		this.itemsId = itemsId;
	}

	public Integer getItemsNum() {
		return itemsNum;
	}

	public void setItemsNum(Integer itemsNum) {
		this.itemsNum = itemsNum;
	}

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Orderdetail [id=" + id + ", items=" + items + ", itemsId="
				+ itemsId + ", itemsNum=" + itemsNum + ", ordersId=" + ordersId
				+ "]";
	}

	
	

   
    
}