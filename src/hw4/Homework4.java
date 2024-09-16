package hw4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework4 {

	public static void countAvg() {

//		1. 有個一維陣列如下:
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素(提示:陣列,length屬性)

		int[] intArray = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		Arrays.sort(intArray);
		int sum = 0;
		int avg = 0;

		for (int i = 0; i < intArray.length; i++) {
			sum = sum + intArray[i];
			avg = sum / intArray.length;
		}
		System.out.print("所有元素的平均值為 " + avg + "\n" + "大於平均值的元素有 ");
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > avg) {
				System.out.print(intArray[i] + " ");
			}
		}
		System.out.println();
	}

	public static void reverseString() {

//		2. 請建立一個字串,經過程式執行後,輸入結果是反過來的
//		例如String s = “Hello World”,執行結果即為dlroW olleH (提示:String方法,陣列)

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入欲返轉的文字");

		String s = sc.nextLine();
		String rs = ""; // 準備一個空字串
		for (int i = s.length() - 1; i >= 0; i--) { // 取得輸入文字的字元
			rs = rs + s.charAt(i); // 做字串串接
		}
		System.out.println("反轉結果為 " + rs);
		sc.close();
	}

	public static void countVowels1() {

//		3. 有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) (提示:字元比對,String方法)

		String[] planet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int count = 0;

		// 方法 1
		for (int i = 0; i < planet.length; i++)
			for (int j = 0; j < planet[i].length(); j++)
				if (planet[i].charAt(j) == 'a' | planet[i].charAt(j) == 'e' | planet[i].charAt(j) == 'i'
						| planet[i].charAt(j) == 'o' | planet[i].charAt(j) == 'u')
					count++;

		System.out.println("共有 " + count + " 個母音");
	}

	public static void countVowels2() {

		String[] planet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int count = 0;

		// 方法 2
		for (int i = 0; i < planet.length; i++) {
			for (int j = 0; j < planet[i].length(); j++) {
				String string = planet[i].substring(j, j + 1); // 擷取字元
				if ("aeiou".contains(string)) { // 比對是否為母音
					count += 1;
				}
			}
		}

		System.out.println("共有 " + count + "個母音");

	}

	public static void borrowable() {

		// 4. 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;
		// 並且統計有錢可借的總人數:例如輸入1000 就顯示「有錢可借的員工編號: 25 19 27 共3 人!」

		int[][] Borrowlist = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		int counts = 0;
		Scanner sc = new Scanner(System.in);
		int price = 0;

		// 檢查輸入金額
		try {
			System.out.println("請輸入預借金額");
			price = sc.nextInt();
		} catch (InputMismatchException ime) { //避免輸入到非數字的文字 ex, abc
			System.out.println("輸入錯誤，程式結束");
			ime.printStackTrace();
			return; //程式結束
		} finally { // 確保所有情況下Scanner都會關閉
			sc.close();
		}

		// 找出可借錢的員工
		for (int i = 0; i < Borrowlist.length; i++) {
			if (Borrowlist[i][1] >= price) {
				if (counts == 0) { //若沒有可藉員工及不顯示println內容
					System.out.println("有錢可借的員工的員工編號為 ");
				}
				System.out.print(Borrowlist[i][0] + "  ");
				counts++;
			}
		}

		if (counts == 0) {
			System.out.println("無符合條件的員工");
		} else {
			System.out.println("共 " + counts + " 人");
		}

//		sc.close();
	}

	public static void dayth() {
		// 5. 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
		// 例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
		// (提示1：Scanner，陣列)
		// (提示2：需將閏年條件加入)
		// (提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)

		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入西元幾年");
		int year = sc.nextInt();

		boolean leapyear = false;

		// 閏年條件：(一)可被4整除且不被100整除；(二)可被4整除且可被400整除
		if (year >= 1 && year <= 9999) {
			if (year % 4 == 0)
				if (year % 100 != 0 || year % 400 == 0)
					leapyear = true;
		} else {
			System.out.println("請重新輸入正確年份(YYYY)");
			year = sc.nextInt();	//重新拿到鍵盤輸入的數字
//			return;	//若用return，輸入錯誤時則程式結束
		}

		// 輸入月份條件
		System.out.println("請輸入月份");
		int month = sc.nextInt();
		if (month < 1 || month > 12) {
			System.out.println("請輸入正確月份");
			month = sc.nextInt();
		}

		// 列出每月最大天數陣列
		int[] dayMax = { 31, leapyear ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// 輸入日期條件
		System.out.println("請輸入日期");
		int day = sc.nextInt();
		while (day < 1 || day > dayMax[month - 1]) {
			System.out.println("請輸入正確的日期 ( 1 ~ " + dayMax[month - 1] + " )");
			day = sc.nextInt();
		}

		sc.close();

		// 計算該日期是該年的第幾天
		int dayofyear = 0;
		for (int i = 0; i < month - 1; i++) {
			dayofyear += dayMax[i];
		}
		dayofyear = dayofyear + day;

		System.out.println("輸入的日期為該年第 " + dayofyear + " 天");

	}

	public static void maxScoreTimes() {

		// 6. 班上有8位同學，他們進行了6次考試結果如圖，請算出每位同學考最高分的次數 (提示二維陣列)

		int[][] scores = { // 每次考試的成績，小陣列元素左至右分別是1~8號同學的成績
				{ 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 755, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		// 宣告一個陣列做為計算考最高分的次數，元素預設值為 0
		int[] countMax = new int[8];

		for (int i = 0; i < scores.length; i++) {

			// 預設小陣列中的最大值為第一位
			int maxValue = scores[i][0];

			for (int j = 0; j < scores[i].length; j++)
				if (scores[i][j] > maxValue)
					maxValue = scores[i][j];

			for (int j = 0; j < scores[i].length; j++)
				if (scores[i][j] == maxValue)
					countMax[j]++; // 索引值對應的同學考最高分的次數增加一
		}

		for (int i = 0; i < countMax.length; i++) {
			System.out.println((i + 1) + "號同學考了" + countMax[i] + "次最高分");
		}

	}

	public static void main(String[] args) {

//		countAvg();
//		reverseString();
//		countVowels1();
//		borrowable();
		dayth();
//		maxScoreTimes();
	}
}
