package com.company;
public class Main {

	public static void main(String[] args) {
		int temp = 0;
		int w1 = 1; //предыдущее число
		int w2 = 2; //след. число
		while (w1 <= 4000000) {
			if (w1 % 2 == 0) // без остатка
				temp += w1;
			int x = w1 + w2;
			w1 = w2;
			w2 = x;
			System.out.println("Сумма всех элементов ряда Фибоначчи "+temp);
		}
	}
}
