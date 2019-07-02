package com.cogzy.programs;

import java.util.Scanner;

public class Inwords {

	public void pw(int n, String ch) {
		String one[] = { " ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
				" Eleven", " Twelve", " Thirteen", " Fourteen", "Fifteen", " Sixteen", " Seventeen", " Eighteen",
				" Nineteen" };

		String ten[] = { " ", " ", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", "Seventy", " Eighty",
				" Ninety" };

		if (n > 19) {
			System.out.print(ten[n / 10] + " " + one[n % 10]);
		} else {
			System.out.print(one[n]);
		}
		if (n > 0)
			System.out.print(ch);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter number");
		int n = sc.nextInt();
		
		System.out.print(n);
		if (n <= 0) {
			System.out.println("Enter numbers greater than 0");
		} else {
			Inwords a = new Inwords();
			a.pw((n / 1000000000), " Hundred");
			a.pw((n / 10000000) % 100, " crore");
			a.pw(((n / 100000) % 100), " lakh");
			a.pw(((n / 1000) % 100), " thousand");
			a.pw(((n / 100) % 10), " hundred");
			a.pw((n % 100), " ");
		}
	}
}
