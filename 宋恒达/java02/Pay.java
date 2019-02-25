public class Pay{
	public static void main(String[] args){
		int a=245;
		int b=570;
		int c=320;
		System.out.println("购物物品\t单价\t个数\t金额");
		System.out.println("T恤\t￥"+a+"\t2\t￥"+(a*2));
		System.out.println("网球鞋\t￥"+b+"\t1\t￥"+b);
		System.out.println("网球拍\t￥"+c+"\t1\t￥"+c);
		System.out.println("折扣：\t8折");
		System.out.println("消费总金额：\t￥"+(a*2+b+c)*0.8);
		System.out.println("实际交费\t￥1500");
		System.out.println("找钱\t￥"+(1500-(a*2+b+c)*0.8));
		System.out.println("本次购物积分为"+(int)((a*2+b+c)*0.8/100*3));
	}
}