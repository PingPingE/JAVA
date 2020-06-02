package exam02;

public class TryWithResourceExample {
	public static void main(String[] args) throws Exception{
		try(FileInputStream fis  = new FileInputStream("file.txt"))
		{
			fis.read();
			throw new Exception();
		}
		catch(Exception e) {System.out.println("예외처리");}
	}
}
