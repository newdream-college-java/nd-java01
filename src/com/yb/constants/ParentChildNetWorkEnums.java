package com.yb.constants;

public class ParentChildNetWorkEnums{
    public enum  tripMode{
    	SELF_DRIVING (1,"�Լ�"),PACKAGE_TOUR(2,"����");
        private int code;
        private String desc;
        private tripMode(int code, String desc) {
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

    public enum playWay{
    	ONE_DAY(1,"һ����"),TWO_DAY(2,"������"),AREA_TOURS(3,"�ܱ���"), DOMESTIC_TOURISM(4,"������"),FOREIGN_TOURISM(5,"������");
        private int code;
        private String desc;
        private playWay(int code, String desc) {
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