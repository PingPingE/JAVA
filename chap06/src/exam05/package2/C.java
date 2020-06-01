package exam05.package2;
import exam05.package1.A;

//A와 패키지가 다른 경우: public만 접근 가능
public class C {
	public C()
	{
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1;
//		a.field3 = 1;
		
		a.method1();
//		a.method2();
//		a.method3();
	}
}
