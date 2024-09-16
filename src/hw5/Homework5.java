package hw5;

import java.util.Scanner;

public class Homework5 {

//	1. 請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形
	public void starsquare() {
		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入寬 : ");
		int w = sc.nextInt();

		System.out.println("請輸入高 : ");
		int h = sc.nextInt();

		for (int i = 1; i <= h; i++)
			for (int j = 1; j <= w; j++)
				System.out.print("*");
		System.out.println();
		sc.close();
	}

	// 2. 請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
	public void randAvg() {
		int[] number = new int[10];
		int sum = 0;
		double avg = 0.0;

		// 產生10個隨機的整數亂數
		System.out.print("隨機亂數為：");
		for (int i = 0; i < 10; i++) {
			number[i] = (int) (Math.random() * 101);
			sum += number[i];
			System.out.print(number[i] + " ");
		}
		System.out.println();

		// 計算亂數平均值
		avg = (double) sum / 10;
		System.out.println("平均值為 " + avg);
	}

	// 3. 利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，可以找出二維陣列的最大值並回傳

	// 設計方法：找出二維陣列最大值
	public int maxElement(int x[][]) {
		// 預設陣列第一行第一個元素為最大值
		int maxElement = x[0][0];

		for (int i = 0; i < x.length; i++)
			for (int j = 0; j < x[i].length; j++)
				if (maxElement < x[i][j])
					maxElement = x[i][j];
		return maxElement;
	}

	// Ovreloading機制：方法名稱相同，但傳入參數型別不同
	public double maxElement(double x[][]) {
		double maxElement = x[0][0];

		for (int i = 0; i < x.length; i++)
			for (int j = 0; j < x[i].length; j++)
				if (maxElement < x[i][j])
					maxElement = x[i][j];
		return maxElement;
	}

	public static void main(String[] args) {
		Homework5 hw1 = new Homework5();
		hw1.starsquare();

		Homework5 hw2 = new Homework5();
		hw2.randAvg();

		Homework5 hw3 = new Homework5();
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		// 印出陣列裡元素最大值
		System.out.println(hw3.maxElement(intArray));
		System.out.println(hw3.maxElement(doubleArray));

	}
}
