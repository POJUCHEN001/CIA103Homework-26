package hw2;

public class Homework2 {
//	1. 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
	public static void main(String[] args) {
		int n, sum;
		sum = 0;
		for (n = 1; n <= 1000; n++) {
			if (n % 2 == 0) {
				sum = sum + n;
			}
		}
		System.out.println("1~1000的偶數和 = " + sum);

//	2. 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int i;
		int product = 1;
		for (i = 1; i <= 10; i++) {
			product = product * i;
		}
		System.out.println(product);

//	3. 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int k = 1;
		int productk = 1;
		while (k <= 10) {
			productk = productk * k;
			k++;
		}
		System.out.println(productk);

//	4. 請設計一隻Java程式,輸出結果為以下:
//	1 4 9 16 25 36 49 64 81 100
		int x = 1, y;
		for (x = 1; x <= 10; x++) {
			y = (int) Math.pow(x, 2);
			System.out.printf(y + " ");
		}
		System.out.println();

//	5. 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。
		// 請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		int b, c; // b表示十位數, c表示個位數
		int numb;
		int count = 0;
		for (b = 0; b <= 4; b++) {
			for (c = 0; c < 10; c++) {
				if (b != 4 && c != 4) {
					numb = b * 10 + c;
					if (numb != 0) {
						System.out.printf(numb + " ");
						count = count + 1;
					}
				}
			}
			
		}System.out.println("總共有:" + count + "個");

//	6. 請設計一隻Java程式,輸出結果為以下:
//	1 2 3 4 5 6 7 8 9 10
//	1 2 3 4 5 6 7 8 9
//	1 2 3 4 5 6 7 8
//	1 2 3 4 5 6 7
//	1 2 3 4 5 6
//	1 2 3 4 5
//	1 2 3 4
//	1 2 3
//	1 2
//	1
		int s, q;
		for (s = 10; s >= 1; s--) {
			for (q = 1; q <= s; q++) {
				System.out.printf(q + " ");
			}
			System.out.println();
		}

	}
}
