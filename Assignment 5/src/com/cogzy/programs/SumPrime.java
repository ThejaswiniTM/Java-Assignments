package com.cogzy.programs;

public class SumPrime {


static	boolean isPrime(int num) {

		if (num <= 1) {

			return false;

		}

		for (int i = 2, j = num / 2; i <= j; i++) {

			if (num % i == 0) {

				return false;

			}

		}

		return true;

	}

public static	int sumOfPrimes(int from, int to) {


		int sum = 0;

		if (from > to) {

			int temp = from;

			from = to;

			to = temp;

		}

		for (int i = from; i <= to; i++) {

			if (isPrime(i)) {

				sum += i;

			}

		}

		return sum;

	}



	public static void main(String[] args) {

		System.out.println(sumOfPrimes(2,3));

		System.out.println(sumOfPrimes(3,5));

		}
		

	
}