package com.cogzy.programs;

import java.util.Scanner;

public class Primenor {

 static boolean isPrimeNumber(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;

		}
		return true;
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an integer number");
		num = sc.nextInt();

		if (isPrimeNumber(num))
			System.out.println(num + " " + "is a Primr Number");
		else
			System.out.println(num + " " + " is not a Prime Number");
	}

}
