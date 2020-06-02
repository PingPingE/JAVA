package exam01;

public class Anonymous {
	Person field = new Person() {
		
		@Override
		void wake() {	super.wake();}
		
		void walk() {System.out.println("출근합니다.");}
	};
	void method1()
	{
		Person localVar = new Person() {
			void walk()
			{
				System.out.println("산책");
			}
			@Override
			void wake() {
				super.wake();
				walk();
			}
			
		};
	}
	
	void method2(Person person)
	{
		person.wake();
	}
}
