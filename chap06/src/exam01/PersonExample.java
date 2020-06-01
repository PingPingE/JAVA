package exam01;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-7891011", "계백");
		System.out.println(p1.nation);
		System.out.println(p1.name);
		System.out.println(p1.ssn);
		
		p1.name = "을지문덕";
		System.out.println(p1.name);
		//p1.nation = "usa"; //final필드이므로 변경 불가
	} 
}
