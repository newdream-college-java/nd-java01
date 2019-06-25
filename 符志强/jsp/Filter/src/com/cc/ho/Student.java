package com.cc.ho;



/*
 * 
 * 告诉类加载器，到哪里去加载类！！！
 * classpath: jdk目录/lib/rt.jar;jdk目录/lib/tools.jar
 * 
 * .   到当前目录下加载类
 * 
 * jdk目录/lib/rt.jar;jdk目录/lib/tools.jar： 加载jdk中类
 * 
 * 
 */
/**
 * 
    * @ClassName: Student  
    * @Description: 学生类  
    * @author 新梦想IT学院.陈超
    * @date 2019年6月21日  
    *    
 */
public class Student {
        /**
         * 属性名：name
         * 属性类型：String
         * 属性访问修饰符：private
         */
        private static  String name="";//静态常量 常量===必须定义时赋值或者构造方法赋值
        private int age;
        public String birthday;
        char sex;
        protected double weight;
        
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
        
        private void sleep() {
            System.out.println(name+"在睡觉......");
        }
        
        public Student(String name, int age, char sex, double weight) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
        }
        public static void main(String[] args) {
            new Student();
        }
        public String getBirthday() {
            return birthday;
        }
        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }
        public char getSex() {
            return sex;
        }
        public void setSex(char sex) {
            this.sex = sex;
        }
        public double getWeight() {
            return weight;
        }
        public void setWeight(double weight) {
            this.weight = weight;
        }
}
