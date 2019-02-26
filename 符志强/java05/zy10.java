import java.util.Scanner;
public class zy10{
	public static void main(String[] aegs){
		Scanner input=new Scanner(System.in);
		System.out.println("\t\t欢迎使用Shopping购物管理系统");
		System.out.println("*\t*\t*\t*\t*\t*\t*\t*\t*\t*");
		System.out.println("\t\t\t1、客户信息管理");
		System.out.println("\t\t\t2、购物结算");
		System.out.println("\t\t\t3、真情回馈");	
		System.out.println("\t\t\t4、注销");
		System.out.println("*\t*\t*\t*\t*\t*\t*\t*\t*\t*");
		System.out.println();
		System.out.print("请选择，输入数字：");
		int s=input.nextInt();
		if(s<=0&&s>=5){
			System.out.print("输入错误，请重新输入数字：");
			s=input.nextInt();
		}
		while(s>0&&s<5){
			if(s==1){
				System.out.println("这是秘密，你权限不够");
				System.out.println("是否继续输入：继续按1.结束按2");
				int js=input.nextInt();
				if(js==1){
					System.out.print("请选择，输入数字：");
					s=input.nextInt();
				}
				if(js==2){
					break;
				}
			}
			if(s==2){
				System.out.println("MyShopping管理系统>购物结算");
				System.out.println("************************************");
				System.out.println("请选项购买的商品编号："+"\n1.T恤"+"\t2.网球鞋"+"\t3.网球拍");
				System.out.println("************************************");
				System.out.print("请输入商品编号：");
				int bh=input.nextInt();
				System.out.print("请输入购买数量：");
				int sl=input.nextInt();
				double a=245.0,b=570.0,c=320.0,h=0;	
				switch(bh){
					case 0:
					case 1:
						System.out.println("T恤\t￥"+a);
						System.out.print("数量："+sl);
						h=a*sl;	
					
						System.out.println("合计：￥"+h);
						System.out.print("是否继续（y/n）");
						String yn=input.next();
						if(yn.equals("n")){
							System.out.println("折扣：\t0.8");
						
							System.out.println("应付金额："+h);
							System.out.println("请输入你实付的金额");
							System.out.print("实付金额：");
							double sf=input.nextDouble();
							double zq=sf-h;
							System.out.println("找钱："+zq);
							System.out.println("是否继续输入：继续按1.结束按2");
							int js=input.nextInt();
							switch(js){
								case 0:
								case 1:
									System.out.print("请选择，输入数字：");
									s=input.nextInt();
								case 2:	
									s=0;
									break;
								default :
									System.out.println("输入错误,请再次输入：继续按1.结束按2");
									js=input.nextInt();
									break;
							}
						}
						
						break;
						
					case 2:
						System.out.println("网球鞋\t￥"+b);
						System.out.print("数量："+sl);
						h=b*sl;
						
						System.out.println("合计：￥"+h);
						System.out.print("是否继续（y/n）");
						yn=input.next();
						if(yn.equals("n")){
							System.out.println("折扣：\t0.8");
						
							System.out.println("应付金额："+h);
							System.out.println("请输入你实付的金额");
							System.out.print("实付金额：");
							double sf=input.nextDouble();
							double zq=sf-h;
							System.out.println("找钱："+zq);
							System.out.println("是否继续输入：继续按1.结束按2");
							int js=input.nextInt();
							switch(js){
								case 0:
								case 1:
									System.out.print("请选择，输入数字：");
									s=input.nextInt();
								case 2:	
									s=0;
									break;
								default :
									System.out.println("输入错误,请再次输入：继续按1.结束按2");
									js=input.nextInt();
									break;
							}
						}
						
						break;
					
					case 3:
						System.out.println("网球拍\t￥"+c);
						System.out.print("数量："+sl);
						h=c*sl;
					
						System.out.print("合计：￥"+h);
						System.out.print("是否继续（y/n）");
						yn=input.next();
						if(yn.equals("n")){
							System.out.println("折扣：\t0.8");
					
							System.out.println("应付金额："+h);
							System.out.println("请输入你实付的金额");
							System.out.print("实付金额：");
							double sf=input.nextDouble();
							double zq=sf-h;
							System.out.println("找钱："+zq);
							System.out.println("是否继续输入：继续按1.结束按2");
							int js=input.nextInt();
					
							switch(js){
								case 0:
								case 1:
									System.out.print("请选择，输入数字：");
									s=input.nextInt();
								case 2:	
									s=0;
									break;
								default :
									System.out.println("输入错误,请再次输入：继续按1.结束按2");
									js=input.nextInt();
									break;
							}
							
						}
						
						break;
					default :
						System.out.println("输入错误");
						break;
				
				}
			
			}
			if(s==3){
				System.out.println("给你给棒棒糖");
				System.out.println("是否继续输入：继续按1.结束按2");
				int js=input.nextInt();
				if(js==1){
					System.out.print("请选择，输入数字：");
					s=input.nextInt();
				}
				if(js==2){
					break;
				}
			}
			if(s==4){
				System.out.println("这里没什么");
				System.out.println("是否继续输入：继续按1.结束按2");
				int js=input.nextInt();
				if(js==1){
					System.out.print("请选择，输入数字：");
					s=input.nextInt();
				}
				if(js==2){
					break;
				}
			}
		}
		
	}


}