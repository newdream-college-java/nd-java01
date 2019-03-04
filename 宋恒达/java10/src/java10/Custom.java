package java10;

public class Custom {
		String style;
		double integral;
		public void show() {
			System.out.println("积分:"+integral+",卡类型:"+style);
			if((this.style.equals("金卡")&&(integral>1000))||(
					style.equals("普卡")&&(integral>5000))) {
				System.out.println("回馈积分500");
			}else {
				System.out.println("没有达到回馈积分要求");
			}
		}
}
