package com.yb.vo;

public class Myorder {
	private String  pcngs_name;
	private String  pcni_order_number;
	private int pcni_transaction_status;
	private String pcni_time;
	private int pcnpt_order_amount;
	private String pcnpct_theme_name;
	private int pcnpt_quantity;
	private int pcnpt_id;
	private int pcngsv_value;
	private int pcni_id;
	@Override
	public String toString() {
		return "Myorder [pcngs_name=" + pcngs_name + ", pcngsv_value="
				+ pcngsv_value + ", pcni_id=" + pcni_id
				+ ", pcni_order_number=" + pcni_order_number + ", pcni_time="
				+ pcni_time + ", pcni_transaction_status="
				+ pcni_transaction_status + ", pcnpct_theme_name="
				+ pcnpct_theme_name + ", pcnpt_id=" + pcnpt_id
				+ ", pcnpt_order_amount=" + pcnpt_order_amount
				+ ", pcnpt_quantity=" + pcnpt_quantity + "]";
	}
	public String getPcngs_name() {
		return pcngs_name;
	}
	public void setPcngs_name(String pcngsName) {
		pcngs_name = pcngsName;
	}
	public String getPcni_order_number() {
		return pcni_order_number;
	}
	public void setPcni_order_number(String pcniOrderNumber) {
		pcni_order_number = pcniOrderNumber;
	}
	public int getPcni_transaction_status() {
		return pcni_transaction_status;
	}
	public void setPcni_transaction_status(int pcniTransactionStatus) {
		pcni_transaction_status = pcniTransactionStatus;
	}
	public String getPcni_time() {
		return pcni_time;
	}
	public void setPcni_time(String pcniTime) {
		pcni_time = pcniTime;
	}
	public int getPcnpt_order_amount() {
		return pcnpt_order_amount;
	}
	public void setPcnpt_order_amount(int pcnptOrderAmount) {
		pcnpt_order_amount = pcnptOrderAmount;
	}
	public String getPcnpct_theme_name() {
		return pcnpct_theme_name;
	}
	public void setPcnpct_theme_name(String pcnpctThemeName) {
		pcnpct_theme_name = pcnpctThemeName;
	}
	public int getPcnpt_quantity() {
		return pcnpt_quantity;
	}
	public void setPcnpt_quantity(int pcnptQuantity) {
		pcnpt_quantity = pcnptQuantity;
	}
	public int getPcnpt_id() {
		return pcnpt_id;
	}
	public void setPcnpt_id(int pcnptId) {
		pcnpt_id = pcnptId;
	}
	public int getPcngsv_value() {
		return pcngsv_value;
	}
	public void setPcngsv_value(int pcngsvValue) {
		pcngsv_value = pcngsvValue;
	}
	public int getPcni_id() {
		return pcni_id;
	}
	public void setPcni_id(int pcniId) {
		pcni_id = pcniId;
	}
	public Myorder(String pcngsName, String pcniOrderNumber,
			int pcniTransactionStatus, String pcniTime, int pcnptOrderAmount,
			String pcnpctThemeName, int pcnptQuantity, int pcnptId,
			int pcngsvValue, int pcniId) {
		super();
		pcngs_name = pcngsName;
		pcni_order_number = pcniOrderNumber;
		pcni_transaction_status = pcniTransactionStatus;
		pcni_time = pcniTime;
		pcnpt_order_amount = pcnptOrderAmount;
		pcnpct_theme_name = pcnpctThemeName;
		pcnpt_quantity = pcnptQuantity;
		pcnpt_id = pcnptId;
		pcngsv_value = pcngsvValue;
		pcni_id = pcniId;
	}
	public Myorder() {
		super();
		
	}
	
}
