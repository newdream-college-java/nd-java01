package 汽车租借系统;

public class Freight extends MotoVehicle{
	private String   weight;

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}
	public void calcRent(int days){
		if(this.weight.equals("载重30吨的东风日产")) {
            System.out.println("您租的车为："+getWeight()+"天数为："+days+"天；费用为："+(days*30*50));
        }else if(this.weight.equals("载重70吨的福田")) {
            System.out.println("您租的车为："+getWeight()+" 16座以上的车,天数为："+days+"天；费用为："+(days*70*50));
        }
	}
}
