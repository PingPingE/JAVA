package exam03;

public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String> product = new Product<Tv, String>();
		product.setKind(new Tv());
		product.setModel("스마트tv");
		product.getKind();
	}
}
