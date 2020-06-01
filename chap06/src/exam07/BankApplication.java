package exam07;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	static int account_ind = 0;
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4.출금 | 5. 종료");
			System.out.println("--------------------------------------------------------");
			System.out.print("선택>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}else if (selectNo ==2) {
				accountList();
			}else if(selectNo ==3) {
				deposit();
			}else if(selectNo ==4) {
				withdraw();
			}else if(selectNo ==5) {
				run = false;
			}
					
			}
			System.out.println("프로그램 종료");
		}
		//계좌 생성
		private static void createAccount()
		{
			System.out.println("---------------");
			System.out.println("   계좌생성");
			System.out.println("---------------");
			
			String st[] = new String[2];
			int init_money;
			
			System.out.print("계좌번호: ");
			st[0] = scanner.next();
			
			System.out.print("계좌주: ");
			st[1] = scanner.next();
			
			System.out.print("초기입금액: ");
			init_money = scanner.nextInt();
			
			accountArray[account_ind++] = new Account(st[0], st[1], init_money);
			System.out.println("결과: 계좌가 생성되었습니다.");
		}
		
		//계좌목록보기
		private static void accountList()
		{
			System.out.println("----------------");
			System.out.println(" 계 좌 목 록 ");
			System.out.println("---------------");
			
			for (int i=0; i<account_ind ; i++) {
				System.out.println(accountArray[i].getAno() + " \t "+ accountArray[i].getOwner() + " \t " + accountArray[i].getBalance());
			}
		}
		
		//예금하기
		private static void deposit()
		{
			
			System.out.println("----------------");
			System.out.println("   예      금 ");
			System.out.println("---------------");
			System.out.print("계좌번호: ");
			Account target = findAccount(scanner.next());
			System.out.print("예금액: ");
			int money = scanner.nextInt();
			target.setBalance(target.getBalance()+money);
			System.out.println("결과: 예금이 성공되었습니다.");
		}
		
		//출금하기
		private static void withdraw()
		{
			System.out.println("------------------");
			System.out.println("   출          금 ");
			System.out.println("------------------");
			
			scanner.nextLine();
			System.out.print("계좌번호: ");
			Account target = findAccount(scanner.next());
			System.out.print("출금액: ");
			int money = scanner.nextInt();
			target.setBalance(target.getBalance()-money);
			System.out.println("결과: 출금이 성공되었습니다.");
			
		}
		
		//ano와 동일한 Account객체 찾기
		private static Account findAccount(String ano)
		{
			while(true)
				{
					for(int i=0; i<account_ind; i++) {
						if (accountArray[i].getAno().equals(ano))
							return accountArray[i];
					}
					System.out.println("잘못 입력 됐습니다.");
					System.out.print("계좌 번호 재입력: ");
					ano = scanner.next();
				}
		}
}

