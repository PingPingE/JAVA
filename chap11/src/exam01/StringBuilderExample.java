package exam01;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("abc");
		sb.append(" hi");
		System.out.println(sb.toString());
		System.out.println(sb.insert(0, "zzzzz").toString());
		System.out.println(sb.reverse().toString());
		System.out.println(sb.delete(0, 3).toString());
		System.out.println( sb.substring(0, 3));
	}
}
