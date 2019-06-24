package com.cc.Student;
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
 * 我是大哥 大哥是我
 * 支持支持支持中兄次之
 */
public class Student {
        private String name;
        private int age;
        public String birthday;
        public String getBirthday() {
			return birthday;
		}
		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}
		public Student() {
            System.out.println("Student对象产生了...");
        }
        static {
            System.out.println("我是Student的静态块 调用了static方法");
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
        
        
        public static void main(String[] args) {
            new Student();
        }
}
