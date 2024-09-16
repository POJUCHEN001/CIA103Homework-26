package hw6;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("請輸入 x 的值：");
			int x = sc.nextInt();
			System.out.println("請輸入 y 的值：");
			int y = sc.nextInt();

			System.out.println(x + "的" + y + "次方等於" + cal.powerXY(x, y));
		} catch (CalException ce) { //自訂例外寫在前面，例外丟出時才會優先抓取
//			ce.printStackTrace();	//印出紅色例外藍色提示文字
			System.out.println(ce.getMessage());	//印出自訂的例外提示文字
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("輸入格式不正確");
		} finally {
			sc.close();
		}
	}

}
