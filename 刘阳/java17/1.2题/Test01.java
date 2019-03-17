
public class Test01 {
	public static void main(String[] args) {
		AddFunction phone=new Sony();
		System.out.println("这是一款型号为G502c的索尼爱立信手机：");
		phone.music();
		TraditionPhone phone1=new Sony();
		phone1.message();
		phone1.tp();
		System.out.println("这是一款型号为红米NOTE的小米手机：");
		AddFunction note=new Note();
		TraditionPhone note1=new Note();
		note.internat();
		note.video();
		note.photo();
		note1.tp();
	}
}
