package exam01;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.method1();
		anony.method2(new Person() {
			void study()
			{
				System.out.println("공부");
			}

			@Override
			void wake() {
				// TODO Auto-generated method stub
				super.wake();
				study();
			}
			
		});
	}
}
