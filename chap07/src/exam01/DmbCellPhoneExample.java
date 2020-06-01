package exam01;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		CellPhone cp = new CellPhone("hyundai" , "black");
		DmbCellPhone dcp = new DmbCellPhone();
		cp.powerOn();
		dcp.powerOn();
		System.out.println(cp.toString());
		System.out.println(dcp.toString());
		System.out.println(cp);
		System.out.println(dcp);
	}
}
