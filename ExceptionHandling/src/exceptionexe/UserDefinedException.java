package exceptionexe;

import java.util.Scanner;

public class UserDefinedException {

	static int bank_balance, withdraw_amount, withdarw_limit;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		bank_balance = getBankBalance();
		int withdarw_limit = 25000;
		System.out.println("withdraw amount in mutiples of 100");
		Scanner sc = new Scanner(System.in);
		withdraw_amount = sc.nextInt();
		if (withdraw_amount % 100 == 0) {

			if (bank_balance > withdraw_amount) {
				if (withdraw_amount < withdarw_limit) {
					System.out.println("money dis");
				} else {
					throw new ArithmeticException("please enter a amount less than " + withdarw_limit);
				}

			} else {
				throw new Exception("Insuff funds");
			}
		} else {
			throw new Exception("enter the amount in mul of 100");
		}
	}
	private static int getBankBalance() {
		// TODO Auto-generated method stub
		return 100;
	}

}
