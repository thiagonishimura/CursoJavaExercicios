package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two integer numbers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int begin = x, end = y;
		
		if (y < x) {
			begin = y;
			end = x;
		}
		int sum = 0;
		for (int i = begin; i <= end; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		
		System.out.println("Sum of odd numbers = " + sum);

		sc.close();
	}

}
