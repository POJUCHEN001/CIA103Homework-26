package hw1;

public class Homeword1 {
	public static void main(String[] args) {
//		1.請設計一隻Java程式，計算12，6這兩個數值的和與積
		int a = 12, b = 6;
		int sum = a + b; // 求和
		int product = a * b; // 求乘積
		System.out.println(sum);
		System.out.println(product);
		System.out.println("=============");

//		2.請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		int eggs = 200;
		int dozen = eggs / 12;
		int egg = eggs % 12;
		System.out.println("雞蛋共" + dozen + "打" + egg + "顆");
		System.out.println("=============");

//		3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int ttlsec = 256559;
		int day = ttlsec / (60 * 60 * 24);
		int sec = ttlsec / 60 / 60 % 24;
		int hr = (ttlsec - (day * 60 * 60 * 24)) / (60 * 60);
		int min = (ttlsec - (day * 60 * 60 * 24) - (hr * 60 * 60)) / 60;
		System.out.println(day + "天" + hr + "時" + min + "分" + sec + "秒");
		System.out.println("=============");

//		4.請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		int radius = 5;
		double pi = 3.14;
		double area = pi * radius * radius; // 圓面積公式:圓周率乘以半徑的二次方
		double length = 2 * pi * radius; // 圓周長公式:圓周率乘以兩倍的半徑
		System.out.printf("圓面積為%.2f%n", area);
		System.out.printf("圓周長為%.2f%n" , length);
		System.out.println("=============");

//		5.某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//		金加利息共有多少錢 (用複利計算，公式請自行google)
		int principal = 1500000; // 本金150萬
		float annualrate = 0.02f; // 年利率2%
		int years = 10;
		// 複利計算公式: 本利和 = ( 1 + 利率)期數次方
		double amount = principal * Math.pow(1 + annualrate, years);
//		System.out.println("本金加利息共有" + amount + "元");
		int chanAmount = (int) amount; //取整數
		System.out.println("本金加利息共有" + chanAmount + "元");
		System.out.println("=============");

//		6.請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//			5 + 5
//			5 + ‘5’
//			5 + “5”
//		  並請用註解各別說明答案的產生原因
		int x = 5;
		char y = '5';
		String z = "5";
		System.out.println(x + x);// 兩者為整數型別，加號作為加法運算，直接相加，結果為10
		System.out.println(x + y);// 前者為整數型別，後者為數字字元，不能直接相加，'5'字元在ASCII中對應的轉換數字為53，運算結果為5 + 53 = 58
		System.out.println(x + z);// 前者為整數型別5，後者為字串5，此時加號作為串接符號，結果為55 (並非二位數的五十五)

	}

}
