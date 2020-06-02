package exam03;

public class AccountMain {
	public static void main(String[] args) {
		Account a = new Account();
		a.deposit(10000);
		try {
			a.withdraw(30000000);
		}
		catch(BalanceInsufficientException e)
		{
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
