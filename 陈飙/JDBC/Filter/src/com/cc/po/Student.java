package com.cc.po;

public class Student {
        private String name;
        private int age;
        public Student() {
            System.out.println("Student对象产生了...");
        }
        static {
            System.out.println("我是Student的静态块");
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        
}
