package 作业;
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
		//重写
	    @Override
	    public int hashCode() {
	        return 1;
	    }
	    //重写----我们认为两个对象相等的原则：属性值都相等
	    @Override
	    public boolean equals(Object obj) {
	        //自己跟自己比
	        if(obj==this) {
	            return true;
	        }
	        ////自己跟别人比
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
