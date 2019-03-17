import java.util.Random;
import java.util.Scanner;
public class Txz {
	String[][] a=new  String[10][10];
    void tu() {
		// TODO Auto-generated method stub
   	
   	 for(int i=0;i<a.length;i++){
        	for(int j=0;j<a[0].length;j++){
        			System.out.print(a[i][j]+"\t");       		
        	}
        	System.out.println();
        }
	}
    public static void main(String[] args) {
    	  ArraysTest02 aa=new ArraysTest02();
        Random rd=new Random();
        Scanner input=new Scanner(System.in);
        aa.a=new String[10][10];
        for(int i=0;i<aa.a.length;i++){
         	for(int j=0;j<aa.a[0].length;j++){
         			aa.a[i][j]="口";       		
         	}
         }
        
        int ty=(0+aa.a.length)/2-1;
        int tx=(0+aa.a[0].length)/2-1;
        aa.a[ty][tx]="??";
        //2.2人的位置随机产生
        int px=tx;
        int py=ty;
        while (tx==px&&py==ty) {
        	px=rd.nextInt(10);	
        	py=rd.nextInt(10);
		}
        //绘制出人
       aa. a[py][px]="人";
        //箱子的位置范围1-8
        int bx=px;
        int by=py;
        while (bx==px&&py==by) {
        	bx=rd.nextInt(8)+1;	
        	by=rd.nextInt(8)+1;
		}
        aa.a[by][bx]="※";
        aa.tu();
        while (true) {
        	System.out.println("请输入移动方向【上:w 下:s左:a 右:d】");
        	String sr=input.next();
        	
			if(sr.equals("w")){
				System.out.println("向上");		
				if(py>0&&by>0){	//范围
					if(by==py-1&&px==bx){//有箱子
						by=by-1;
						aa.a[by][bx]="※";
						if (by==0||by==9||bx==0||bx==9) {
							System.out.println("你输了");
						}
					}if (py-1==ty&&px==tx) {//上面有星
						aa.a[py][px]="口";
						py=py-2;
						aa.a[py][px]="人";				
						aa.a[ty][tx]="??";
						aa.tu();
					}else{
					aa.a[py][px]="口";
					py=py-1;
					aa.a[py][px]="人";				
					aa.tu();
					}
				}else{
					aa.tu();
				}
				if (by==0||by==9||bx==0||bx==9) {
					System.out.println("你输了");
					break;
				}
			}else 
			if(sr.equals("s")){
				System.out.println("向下");				
				if(py<9&&by<9){
					if(by==py+1&&px==bx){
						by=by+1;
						aa.a[by][bx]="※";
						if (by==9) {
							System.out.println("你输了");
						}
					}
					if (py+1==ty&&px==tx) {
						aa.a[py][px]="口";
						py=py+2;
						aa.a[py][px]="人";				
						aa.a[ty][tx]="??";
						aa.tu();
					}else{
					aa.a[py][px]="口";
					py=py+1;
					aa.a[py][px]="人";				
					aa.tu();
					}
				}else{
					aa.tu();
				}
				if (by==0||by==9||bx==0||bx==9) {
					System.out.println("你输了");
					break;
				}
			}else
			if(sr.equals("a")){
				System.out.println("向左");
				if(px>0&&bx>0){
					if(bx==px-1&&py==by){
						bx=bx-1;
						aa.a[by][bx]="※";
						if (bx==0) {
							System.out.println("你输了");
						}
					}
					if (px-1==tx&&py==ty) {
						aa.a[py][px]="口";
						px=px-2;
						aa.a[py][px]="人";				
						aa.a[ty][tx]="??";
						aa.tu();
					}else{
					aa.a[py][px]="口";
					px=px-1;
					aa.a[py][px]="人";				
					aa.tu();
					}
				}else{
					aa.tu();
				}
				if (by==0||by==9||bx==0||bx==9) {
					System.out.println("你输了");
					break;
				}
			}else
			if(sr.equals("d")){
				System.out.println("向右");
				if(px<9&&bx<9){
					if(bx==px+1&&py==by){					
						bx=bx+1;						
						aa.a[by][bx]="※";
					}
					if (px+1==tx&&py==ty) {
						aa.a[py][px]="口";
						px=px+2;
						aa.a[py][px]="人";				
						aa.a[ty][tx]="??";
						aa.tu();
					}else{
					aa.a[py][px]="口";
					px=px+1;
					aa.a[py][px]="人";				
					aa.tu();
					}				
				}else{
					aa.tu();
				}	
				if (by==0||by==9||bx==0||bx==9) {
					System.out.println("你输了");
					break;
				}
			}else {
				System.out.println("输入有误");
			}
			if(ty==by&&tx==bx){
				System.out.println("你赢了");
				break;
			}
		}
        
    }
    
}
