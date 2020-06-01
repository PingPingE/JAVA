package exam05.package1;

//A와 같은 패키지인 경우: public, default 접근 가능
public class B {
	public B()
	{
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1;
		
		a.method1();
		a.method2();
//		a.method3();
	}
}
