package hw3;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {

//		1.請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入三個整數：");
		

//		for(int i = 1; i < 4; i++) {
//			if(sc.hasNextInt()) {
//				i = sc.nextInt();
//			}
//		}

		//方法一
		int i1 = 0, i2 = 0, i3 = 0;
		if (sc.hasNextInt()) {
			i1 = sc.nextInt();
		}

		if (sc.hasNextInt()) {
			i2 = sc.nextInt();
		}

		if (sc.hasNextInt()) {
			i3 = sc.nextInt();
		}

		if (i1 + i2 > i3 && i1 + i3 > i2 && i2 + i3 > i1) {
			if (i1 == i2 && i2 == i3) {
				System.out.println("正三角形");
			} else if (i1 == i2 || i1 == i3 || i2 == i3) {
				System.out.println("等腰三角形");
			} else if ((i1 * i1 + i2 * i2) == (i3 * i3) || (i1 * i1 + i3 * i3) == (i2 * i2)
					|| (i2 * i2 + i3 * i3) == (i1 * i1)) {
				System.out.println("直角三角形");
			} else {
				System.out.println("其他三角形");
			}
		} else {
			System.out.println("不是三角形");
		}
		
		sc.close();

//		if(sc.hasNextDouble()) {
//			d = sc.nextDouble();
//		}

// 提示：Scanner，三角形成立條件，判斷式if else
// 任兩邊相加大於第三邊

// 進階功能：加入直角三角形的判斷
// a平方 + b平方 = c平方

		
// 2.請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息
		Scanner sc2 = new Scanner(System.in);
		System.out.println("猜一個0~9的數字");
		int i4 = 0;
		if (sc2.hasNextInt()) {
			i4 = sc2.nextInt();
		}
		int n =(int)(Math.random() * 9) + 1;
		if (n==i4) {
			System.out.println("猜對囉");
		}else {
			System.out.println("猜錯囉");
		}
		
		sc2.close();
	

// 提示：Scanner，亂數方法，無窮迴圈
// 進階功能：產生 0 ~ 100 亂數，每次猜就會提示你是大於還是小於正確答案
//		System.out.println(Math.random());
//GuestNumber.java
		Scanner sc3 = new Scanner(System.in);
		System.out.println("猜一個0~100的數字");
		int i = 0;
		if (sc3.hasNextInt()) {
			i = sc3.nextInt();
		}
		int m = (int) (Math.random() * 100) + 1;
		if (i < m) {
			System.out.println("答案比他大喔");
		}else if(i > m) {
			System.out.println("答案比他小喔");
		}else {
			System.out.println("答對囉!");
		}
		sc3.close();

// 3.阿文很喜歡簽大樂透(1～49)，請設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇的號碼與總數
		
// 提示：Scanner
		
		Scanner sc4 = new Scanner(System.in);
		System.out.println("請從0~9選一個不想要出現的數字");
		int j = 0;
		if (sc.hasNextInt()) {
			j = sc.nextInt();
		}
		int b, c; // b表示十位數, c表示個位數
		int numb;
		int count = 0;
		for (b = 0; b <= 4 && b != j; b++) {
			for (c = 0; c < 10 && c != j; c++) {
				if (b != j && c != j) {
					numb = b * 10 + c;
					if (numb != 0) {
						System.out.printf(numb + " ");
						count = count + 1;
					}
				}
			}

		}
		System.out.println();
		System.out.println("總共有:" + count + "個");
		
		sc4.close();
	
// 進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複
	}
}
