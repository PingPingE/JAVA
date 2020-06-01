package exam02.package2;
import exam02.package1.A;

//D는 A의 자식클래스이므로 사용가능
public class D extends A{
	public D() {
		super();
		this.field = "value";
		this.method();
	}
}
