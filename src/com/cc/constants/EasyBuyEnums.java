package com.cc.constants;

public class EasyBuyEnums {
    public enum PaidType{
        RECIEVED_PAID(1,"货到付款"),ONBLINE(2,"网上支付");
        private int code;
        private String desc;
        private PaidType(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }
        public int getCode() {
            return code;
        }
        public void setCode(int code) {
            this.code = code;
        }
        public String getDesc() {
            return desc;
        }
        public void setDesc(String desc) {
            this.desc = desc;
        }
        
    }
    
    
    public enum OrderStatus2{
       ORDER(1,"下单"),AUDITING(2,"审核中"),DISTRBUTION(3,"配货"), SENDING(4,"送货中"),RECIEVED(5,"收货 并确定");
        private int code;
        private String desc;
        private OrderStatus2(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }
        public int getCode() {
            return code;
        }
        public void setCode(int code) {
            this.code = code;
        }
        public String getDesc() {
            return desc;
        }
        public void setDesc(String desc) {
            this.desc = desc;
        }
        
        
    }
}
