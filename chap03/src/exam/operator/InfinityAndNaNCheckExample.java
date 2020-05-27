package exam.operator;
public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y= 0.0;
		System.out.println(x/y);
		System.out.println(x%y);
		
		//check
		System.out.println(Double.isInfinite(x/y));
		System.out.println(Double.isNaN(x%y));
		
		System.out.println(x%y+1);
	}
}
