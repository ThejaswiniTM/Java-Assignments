package com.cogzy.programs;

public class FibonacciSeries {

	public static int fibonacci(int index) {

		if (index <= 1)
			return index;
		return fibonacci(index - 1) + fibonacci(index - 2);
	}

	public static void main(String[] args) {

        int index=8;
		for (int i = 0; i < index; i++) {
			System.out.println(fibonacci(i));

		}

	}
}
