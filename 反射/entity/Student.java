package com.cc.Student;
/*
 * 
 * �������������������ȥ�����࣡����
 * classpath: jdkĿ¼/lib/rt.jar;jdkĿ¼/lib/tools.jar
 * 
 * .   ����ǰĿ¼�¼�����
 * 
 * jdkĿ¼/lib/rt.jar;jdkĿ¼/lib/tools.jar�� ����jdk����
 * 
 * 
 */
/**
 * 
 * ���Ǵ�� �������
 * ֧��֧��֧�����ִ�֮
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
            System.out.println("Student���������...");
        }
        static {
            System.out.println("����Student�ľ�̬�� ������static����");
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
