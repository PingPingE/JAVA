package exam03;

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		A ab = b;
		A ac = c;
		A ad = d;
		A ae = e;
		
		B ba =  (B) ab; //B가 더 작은 범위(자식클래스)이므로 캐스팅 해줘야함(A ab -> B ab)
		B bd = d;
		C ce = e;
		
		//오버라이딩이 돼있으면 자식의 메소드를 호출함
		ab.method();
		ac.method();
		
//		//상속 관계에 있지않으므로 에러
//		B be = e;
//		C cd = d;
		
		if(ac instanceof B)// 객체  instanceof 타입 : 객체가 우항 타입으로 객체가 생성되었냐
		{
			System.out.println("B");
		}
		else
		{
			System.out.println("아님");
		}
	}
}
