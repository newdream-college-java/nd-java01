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
         			aa.a[i][j]="��";       		
         	}
         }
        
        int ty=(0+aa.a.length)/2-1;
        int tx=(0+aa.a[0].length)/2-1;
        aa.a[ty][tx]="??";
        //2.2�˵�λ���������
        int px=tx;
        int py=ty;
        while (tx==px&&py==ty) {
        	px=rd.nextInt(10);	
        	py=rd.nextInt(10);
		}
        //���Ƴ���
       aa. a[py][px]="��";
        //���ӵ�λ�÷�Χ1-8
        int bx=px;
        int by=py;
        while (bx==px&&py==by) {
        	bx=rd.nextInt(8)+1;	
        	by=rd.nextInt(8)+1;
		}
        aa.a[by][bx]="��";
        aa.tu();
        while (true) {
        	System.out.println("�������ƶ�������:w ��:s��:a ��:d��");
        	String sr=input.next();
        	
			if(sr.equals("w")){
				System.out.println("����");		
				if(py>0&&by>0){	//��Χ
					if(by==py-1&&px==bx){//������
						by=by-1;
						aa.a[by][bx]="��";
						if (by==0||by==9||bx==0||bx==9) {
							System.out.println("������");
						}
					}if (py-1==ty&&px==tx) {//��������
						aa.a[py][px]="��";
						py=py-2;
						aa.a[py][px]="��";				
						aa.a[ty][tx]="??";
						aa.tu();
					}else{
					aa.a[py][px]="��";
					py=py-1;
					aa.a[py][px]="��";				
					aa.tu();
					}
				}else{
					aa.tu();
				}
				if (by==0||by==9||bx==0||bx==9) {
					System.out.println("������");
					break;
				}
			}else 
			if(sr.equals("s")){
				System.out.println("����");				
				if(py<9&&by<9){
					if(by==py+1&&px==bx){
						by=by+1;
						aa.a[by][bx]="��";
						if (by==9) {
							System.out.println("������");
						}
					}
					if (py+1==ty&&px==tx) {
						aa.a[py][px]="��";
						py=py+2;
						aa.a[py][px]="��";				
						aa.a[ty][tx]="??";
						aa.tu();
					}else{
					aa.a[py][px]="��";
					py=py+1;
					aa.a[py][px]="��";				
					aa.tu();
					}
				}else{
					aa.tu();
				}
				if (by==0||by==9||bx==0||bx==9) {
					System.out.println("������");
					break;
				}
			}else
			if(sr.equals("a")){
				System.out.println("����");
				if(px>0&&bx>0){
					if(bx==px-1&&py==by){
						bx=bx-1;
						aa.a[by][bx]="��";
						if (bx==0) {
							System.out.println("������");
						}
					}
					if (px-1==tx&&py==ty) {
						aa.a[py][px]="��";
						px=px-2;
						aa.a[py][px]="��";				
						aa.a[ty][tx]="??";
						aa.tu();
					}else{
					aa.a[py][px]="��";
					px=px-1;
					aa.a[py][px]="��";				
					aa.tu();
					}
				}else{
					aa.tu();
				}
				if (by==0||by==9||bx==0||bx==9) {
					System.out.println("������");
					break;
				}
			}else
			if(sr.equals("d")){
				System.out.println("����");
				if(px<9&&bx<9){
					if(bx==px+1&&py==by){					
						bx=bx+1;						
						aa.a[by][bx]="��";
					}
					if (px+1==tx&&py==ty) {
						aa.a[py][px]="��";
						px=px+2;
						aa.a[py][px]="��";				
						aa.a[ty][tx]="??";
						aa.tu();
					}else{
					aa.a[py][px]="��";
					px=px+1;
					aa.a[py][px]="��";				
					aa.tu();
					}				
				}else{
					aa.tu();
				}	
				if (by==0||by==9||bx==0||bx==9) {
					System.out.println("������");
					break;
				}
			}else {
				System.out.println("��������");
			}
			if(ty==by&&tx==bx){
				System.out.println("��Ӯ��");
				break;
			}
		}
        
    }
    
}
