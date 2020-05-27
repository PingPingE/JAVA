package exam.operator;

public class CompareExample {
	public static void main(String[] args) {
		System.out.println(1==1);
		System.out.println('A' ==65);
		System.out.println('A' < 'B');
		System.out.println(3==3.0);
		System.out.println(0.1==0.1f);
		System.out.println(1.0==1.0f);
		
		String str1= "대구";
		String str2 = "대구";
		String str3 = new String("대구");
		String str4 = new String("대구");
		System.out.println(str1==str2);//같은 String개체의 번지(주소)값으로 가서 그안의 값을 비교
		System.out.println(str3 == str4); //주소를 가리키므로 다르다고 나옴
		System.out.println(str3.equals(str4)); //어느 객체건 상관없이 값 비교하고 싶다면 equals() 활용
	}
}
