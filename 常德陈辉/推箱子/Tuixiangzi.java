import java.util.Random;
import java.util.Scanner;


public class Tuixiangzi {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Random rd=new Random();
		String[][] bk=new String[11][11];
		//�߿�
		for (int i = 0; i < bk.length; i++) {
			for (int j = 0; j < bk[0].length; j++) {
				bk[i][j]="��";
			}
		}
		//�յ�λ��
		int zx=bk.length/2;
		int zy=bk[0].length/2;
		bk[zx][zy]="��";
		//�˿�ʼ��λ��
		int rx=zx;
		int ry=zy;
		while(rx==zx&&ry==zy){
			rx=rd.nextInt(10);
			ry=rd.nextInt(10);
		}
		bk[rx][ry]="��";
		//���ӿ�ʼ��λ��
		int xx=zx;
		int xy=zy;
		while(xx==zx&&xy==zy||xx==rx&&xy==ry){
			xx=rd.nextInt(8)+1;
			xy=rd.nextInt(8)+1;
		}
		bk[xx][xy]="��";
		//�������
		for (int i = 0; i < bk.length; i++) {
			for (int j = 0; j < bk[0].length; j++) {
				System.out.print(bk[i][j]+"   "); 
			}
			System.out.println();
		}
		while(true){
			System.out.print("��������ǰ��������w:���ϣ�s:���£�a:����d:���ң���");
			String fy=input.next();
			if(fy.equals("w")){
				System.out.println("����");
				if(rx-1==xx&&ry==xy){//������������
//					if(xx==0){//���ӿ����߽�
//						System.out.println("���Ѿ��������֣�");
//					}else{
						bk[xx-1][xy]="��";
						bk[rx-1][ry]="��";
						bk[rx][ry]="��";
						xx=xx-1;
						rx=rx-1;
						if(xx==0){//�����ڱ߽�
							bk[xx][xy]="��";
							bk[rx][ry]="��";
							for (int i = 0; i < bk.length; i++) {
								for (int j = 0; j < bk[0].length; j++) {
									System.out.print(bk[i][j]+"   "); 
								}
								System.out.println();
							}
							System.out.println("���Ѿ��������֣�������ֹ");
							System.exit(1);
						}
						if(xx==zx&&xy==zy){//�����յ�
							bk[xx][xy]="��";
							for (int i = 0; i < bk.length; i++) {
								for (int j = 0; j < bk[0].length; j++) {
									System.out.print(bk[i][j]+"   "); 
								}
								System.out.println();
							}
							System.out.println("��ϲ���ɹ����أ�");
							System.exit(1);
						}
					//}
				}else if(rx-1==zx&&ry==zy){//�������߽����յ�
					if(xx+1==zx&&xy==zy){
						bk[xx-1][xy]="��";
						xx=xx-1;
					}
					bk[rx-2][ry]="��";
					bk[rx][ry]="��";
					rx=rx-2;
				}else{//��������û��û���κ�����
					if(rx==0){
						System.out.println("�����ڱ߽��˲����������ˣ�");
					}else{
						bk[rx-1][ry]="��";
						bk[rx][ry]="��";
						rx=rx-1;
					}
				}
			}else if(fy.equals("s")){
				System.out.println("����");
				if(rx+1==xx&&ry==xy){//������������
						bk[xx+1][xy]="��";
						bk[rx+1][ry]="��";
						bk[rx][ry]="��";
						xx=xx+1;
						rx=rx+1;
						if(xx==bk.length-1){//�����ڱ߽���
							bk[xx][xy]="��";
							bk[rx][ry]="��";
							for (int i = 0; i < bk.length; i++) {
								for (int j = 0; j < bk[0].length; j++) {
									System.out.print(bk[i][j]+"   "); 
								}
								System.out.println();
							}
							System.out.println("���Ѿ��������֣�������ֹ");
							System.exit(1);
						}
						if(xx==zx&&xy==zy){//�����յ�
							bk[xx][xy]="��";
							for (int i = 0; i < bk.length; i++) {
								for (int j = 0; j < bk[0].length; j++) {
									System.out.print(bk[i][j]+"   "); 
								}
								System.out.println();
							}
							System.out.println("��ϲ���ɹ����أ�");
							System.exit(1);
						}
				}else if(rx+1==zx&&ry==zy){//�������߽����յ�
					if(xx-1==zx&&xy==zy){
						bk[xx+1][xy]="��";
						xx=xx+1;
					}
					bk[rx+2][ry]="��";
					bk[rx][ry]="��";
					rx=rx+2;
				}else{//��������û��û���κ�����
					if(rx==bk.length-1){
						System.out.println("�����ڱ߽��˲����������ˣ�");
					}else{
						bk[rx+1][ry]="��";
						bk[rx][ry]="��";
						rx=rx+1;
					}
				}
			}else if(fy.equals("a")){
				System.out.println("����");
				if(rx==xx&&ry-1==xy){//������������
						bk[xx][xy-1]="��";
						bk[rx][ry-1]="��";
						bk[rx][ry]="��";
						xy=xy-1;
						ry=ry-1;
						if(xy==0){//���ӽ���߽�
							bk[xx][xy]="��";
							bk[rx][ry]="��";
							for (int i = 0; i < bk.length; i++) {
								for (int j = 0; j < bk[0].length; j++) {
									System.out.print(bk[i][j]+"   "); 
								}
								System.out.println();
							}
							System.out.println("���Ѿ��������֣�������ֹ");
							System.exit(1);
						}
						if(xx==zx&&xy==zy){//�����յ�
							bk[xx][xy]="��";
							for (int i = 0; i < bk.length; i++) {
								for (int j = 0; j < bk[0].length; j++) {
									System.out.print(bk[i][j]+"   "); 
								}
								System.out.println();
							}
							System.out.println("��ϲ���ɹ����أ�");
							System.exit(1);
						}
				}else if(rx==zx&&ry-1==zy){//�������߽����յ�
					if(xx==zx&&xy+1==zy){
						bk[xx][xy-1]="��";
						xy=xy-1;
					}
					bk[rx][ry-2]="��";
					bk[rx][ry]="��";
					ry=ry-2;
				}else{//��������û��û���κ�����
					if(ry==0){
						System.out.println("�����ڱ߽��˲����������ˣ�");
					}else{
						bk[rx][ry-1]="��";
						bk[rx][ry]="��";
						ry=ry-1;
					}
				}
			}else if(fy.equals("d")){
				System.out.println("����");
				if(rx==xx&&ry+1==xy){//������������
						bk[xx][xy+1]="��";
						bk[rx][ry+1]="��";
						bk[rx][ry]="��";
						xy=xy+1;
						ry=ry+1;
						if(xy==bk[0].length-1){//���ӽ���߽�
							bk[xx][xy]="��";
							bk[rx][ry]="��";
							for (int i = 0; i < bk.length; i++) {
								for (int j = 0; j < bk[0].length; j++) {
									System.out.print(bk[i][j]+"   "); 
								}
								System.out.println();
							}
							System.out.println("���Ѿ��������֣�������ֹ");
							System.exit(1);
						}
						if(xx==zx&&xy==zy){//�����յ�
							bk[xx][xy]="��";
							for (int i = 0; i < bk.length; i++) {
								for (int j = 0; j < bk[0].length; j++) {
									System.out.print(bk[i][j]+"   "); 
								}
								System.out.println();
							}
							System.out.println("��ϲ���ɹ����أ�");
							System.exit(1);
						}
				}else if(rx==zx&&ry+1==zy){//�������߽����յ�
					if(xx==zx&&xy-1==zy){
						bk[xx][xy+1]="��";
						xy=xy+1;
					}
					bk[rx][ry+2]="��";
					bk[rx][ry]="��";
					ry=ry+2;
				}else{//��������û��û���κ�����
					if(ry==bk[0].length-1){
						System.out.println("�����ڱ߽��˲����������ˣ�");
					}else{
						bk[rx][ry+1]="��";
						bk[rx][ry]="��";
						ry=ry+1;
					}
				}
			}else{
				System.out.println("���������󣡣���");
			}
			//�ػ�����
			for (int i = 0; i < bk.length; i++) {
				for (int j = 0; j < bk[0].length; j++) {
					System.out.print(bk[i][j]+"   "); 
				}
				System.out.println();
			}
		}
	}
}
