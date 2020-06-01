package exam03.class_access1;
import exam03.class_access.B;

public class C {
	//A a; //A가 default 접근 제한을 가지므로 다른 패키지에선 사용할 수 없다.(아예 import 불가능)
	B b; //B는 import하면 사용 가능
}
