package hackerrank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

	/**
	 * Input: 12324.134
	 * 
	 * Output:
	 * US: $12,324.13
	 * India: Rs.12,324.13
	 * China: ￥12,324.13
	 * France: 12 324,13 €
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US); 
		String us = nf.format(payment);
		
		nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
		String china = nf.format(payment);
		
		nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String france = nf.format(payment);

		Locale indiaLocale = new Locale("en","in"); //as_IN
		nf = NumberFormat.getCurrencyInstance(indiaLocale);
		String india = nf.format(payment);
		
		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}

}
