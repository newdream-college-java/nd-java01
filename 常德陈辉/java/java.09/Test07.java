/*������һ������Ϊ5������int [] array=new int[]{1,3��-1,5��-2}�ִ���һ��������newArray[]��Ҫ����������Ԫ�صĴ��˳����ԭ�����Ԫ�����򣬲������ԭ�����Ԫ��ֵС��0���������鰴0�洢������������������*/
public class Test07{
	public static void main(String[] args){
		int[] array={1,3,-1,5,-2};
		for(int i=array.length-1;i>=0;i--){
			if(array[i]<0){
				array[i]=0;
			}
			System.out.print(array[i]+"\t");
		}
	}
}