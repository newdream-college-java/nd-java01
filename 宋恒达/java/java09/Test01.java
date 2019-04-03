/**
**定义特价商品数组,存储5件商品名称,控制台显示特价商品名称
**/
public class Test01{
	public static void main(String[] args){
		System.out.println("本次活动特价商品有:");
		String[] shops={"Nike背包","Adidas运动衫","李宁运动鞋","Kappa外套","361°腰包"};
		for (int i=0;i<5 ;i++ ) {
			System.out.println(shops[i]);
		}
	}
}