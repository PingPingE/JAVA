package chap01;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; //byte -> int
		System.out.println(intValue);
		
		char charValue = '��';
		intValue = charValue;
		System.out.println("���� �����ڵ�="+intValue); // char -> int
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
	}

}
