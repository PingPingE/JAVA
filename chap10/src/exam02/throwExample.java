package exam02;

public class throwExample {
		public void method1()
		{
			try {
				method2();
			}
			catch(ClassNotFoundException e)
			{
				System.out.println("클래스 없음");
			}
			finally {
				System.out.println("finally 블록");
			}
		}
		
		public void method2() throws ClassNotFoundException {
			Class c1 = Class.forName("java.lang.Strings");
		}
}
