package ��18���쳣��ҵ1_6;

import java.util.Scanner;

import org.apache.log4j.Logger;

import ��18���쳣��ҵ1_3.Test;
public class OutOfBounds {
	static Logger log =Logger.getLogger(OutOfBounds.class);
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int[] arr=new int[3];
		try{
			for(int i=0;i<=arr.length;i++){
				System.out.println("�������"+(i+1)+"������");
				arr[i]=input.nextInt();
		}
		}catch(ArrayIndexOutOfBoundsException e){
			log.warn("����Խ���쳣");
			log.warn(e.getStackTrace());
		}
	}
}
