package CapitalPay;

import java.util.Scanner;

public class InterestRate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Scheme no");
		int schemeNo = sc.nextInt();
		
		System.out.println("deposit Amount no");
		double depositAmt = sc.nextInt();
		
		System.out.println("Period");
		int period = sc.nextInt();
		
		
		FDScheme fd = new FDScheme(schemeNo,depositAmt,period);
		
		
		fd.calculateInterestRate();
		
		System.out.println("Interest rate for " + period + "days is" + fd.getRate());
		
	}

}
