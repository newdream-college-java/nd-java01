package ��ҵ;
public class Penguin  extends Object {
	 private String name;
	 private String sex;
	 private String bh; 
	    public Penguin(String name, String sex) {
	        this.sex = sex;
	        this.name = name;
	    }
	    public Penguin() {
			// TODO Auto-generated constructor stub
		}
		//��д
	    @Override
	    public int hashCode() {
	        return 1;
	    }
	    //��д----������Ϊ����������ȵ�ԭ������ֵ�����
	    @Override
	    public boolean equals(Object obj) {
	        //�Լ����Լ���
	        if(obj==this) {
	            return true;
	        }
	        ////�Լ������˱�
	        if(obj instanceof Penguin) {
	        	Penguin p = (Penguin) obj;
	            if(p.name.equals(this.name)&&p.sex==this.sex) {
	                return true;
	            }else {
	                return false;
	            }
	        }else {
	            return false;
	        }
	    }
		public String toString() {
	        return name+"\t"+sex;
	    }

		public void eat() {
			System.out.println(toString());
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getBh() {
			return bh;
		}
		public void setBh(String bh) {
			this.bh = bh;
		}
		
}
