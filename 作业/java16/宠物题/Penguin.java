package ��16�¶�̬��ҵ;

public class Penguin extends Pet{
	public void play(){
		setLove(getLove()+5);
		System.out.println("���˺����"+getName()+"������Ӿ"+"�佡��ֵ����10������ֵ����5������ֵ��Ϊ:"+getHealth()+"����ֵ��Ϊ:"+getLove());
		setHealth(getHealth()-10);
		setLove(getLove()+5);
	}
	public void eat(){
		setHealth(getHealth()+5);
		System.out.println("�������˽���ֵ+5���ڵĽ���ֵΪ��"+getHealth());
		chiBaoLe();
	}
	public void chiBaoLe(){
		if(getHealth()>=100){
			System.out.println("���Ա��ˣ������ٳ���");
			setHealth(100);
		}
	}

}
