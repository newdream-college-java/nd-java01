package ��16�¶�̬��ҵ;

public class Dog extends Pet{
	public void play(){
		setLove(getLove()+5);
		System.out.println("���˺͹���"+getName()+"���ڽӷ���"+"�佡��ֵ����10������ֵ����5������ֵ��Ϊ:"+getHealth()+"����ֵ��Ϊ:"+getLove());
		setHealth(getHealth()-10);
		setLove(getLove()+5);
		
		
	}
	public void eat(){
		setHealth(getHealth()+3);
		System.out.println("���Թ����˽���ֵ+3���ڵĽ���ֵΪ��"+getHealth());
		chiBaoLe();
	}
	public void chiBaoLe(){
		if(getHealth()>=100){
			System.out.println("���Ա��ˣ������ٳ���");
			setHealth(100);
		}
	}
//	public void play(){
//		System.out.println("���˺͹����˽ӷ���,����ֵ"+getHealth()-10);
//	}
}
