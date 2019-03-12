class Other {
	public int i;
}

class Something{
	public static void main(String[] args) {
		Other o=new Other();
		new Something().addOne(o);
	}
	public void addOne(final Other o) {//public void addOne(Other o)
		o.i++;
		o=new Other();
	}
}
