package exam.condition;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		int req;
		int stat;
		do {
			System.out.println("=======================KFQ은행======================");
			System.out.println("          1. 예금| 2. 출금| 3. 잔고| 4. 이체| 5. 종료");
			System.out.println("=====================================================");
			req = sc.nextInt();
			if(req == 1) 
			{
				System.out.println("-------------------------------");
				System.out.println("      예금하시겠습니까?");
				System.out.println("    금액을 입력해주십시오 ");
				System.out.println("-------------------------------");
				int deposit = sc.nextInt();
				
				//확인
				System.out.println("----------------------------------");
				System.out.println(deposit+"원을 입력하셨습니다. \n 계속 진행:0 되돌아가기:1");
				System.out.println("----------------------------------");
				stat = sc.nextInt();
				if (stat == 1)
					continue;
	
				balance += deposit;
				System.out.println("현재 잔액: "+balance);
			}
			else if(req == 2)
			{
				int withdraw;
				System.out.println("-------------------------------");
				System.out.println("      출금하시겠습니까?");
				System.out.println("    금액을 입력해주십시오 ");
				System.out.println("--------------------------------");
				while(true)
				{
					withdraw= sc.nextInt();
					if(balance< withdraw)
						{
						System.out.println("----------------------------------------------------");
						System.out.println("     잔액이 부족합니다. 다시 입력해주십시오.");
						System.out.println("----------------------------------------------------");
						continue;
						}
					break;
				}								
				//확인
				System.out.println("------------------------------------");
				System.out.println(withdraw+"원을 입력하셨습니다. \n 계속 진행:0 되돌아가기:1");
				System.out.println("------------------------------------");
				stat = sc.nextInt();
				
				if(stat == 1)
					continue;
				
				balance  -= withdraw;
				System.out.println("현재 잔액: "+balance );
			}
			else if(req == 3)
			{
				System.out.println("-------------------------------");
 				System.out.println("현재 잔액: " + balance );
 				System.out.println("-------------------------------");
			}
			else if (req==4)
			{
				int sendMoney;
				System.out.println("------------------------------------------");
				System.out.println("    이체하실 계좌를 입력해주십시오");
				System.out.println("------------------------------------------");
				sc.nextLine();
				String s = sc.nextLine();
				
				while(true)
				{
					System.out.println("--------------------------------");
					System.out.println("    금액을 입력해주십시오 ");
					System.out.println("--------------------------------");
					sendMoney = sc.nextInt();
					if(balance < sendMoney)
					{
						System.out.println("----------------------------------------------------");
						System.out.println("     잔액이 부족합니다. 다시 입력해주십시오.");
						System.out.println("----------------------------------------------------");
						continue;
					}
					break;
				}
				balance  -= sendMoney;
				System.out.println(s+"계좌에 "+sendMoney+"원을 이체했습니다." );
				System.out.println("현재 잔액: "+balance );
			}
			
		}
		while(req != 5);
		
		System.out.println("^_^ 이용해주셔서 감사합니다. ^_^");
	}
}
