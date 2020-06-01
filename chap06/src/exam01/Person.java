package exam01;

public class Person {
		//fianl필드 초기화 방법1 : 선언과 동시에 초기화
		final String nation = "Korea";
		final String ssn;
		String name;
		
		public Person(String ssn, String name)
		{
			//final필드 초기화 방법2 : 생성자에서 초기화
			this.ssn = ssn;
			this.name = name;
		}
}
