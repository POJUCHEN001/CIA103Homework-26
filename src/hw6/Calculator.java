package hw6;

public class Calculator {
//	在Calculator.java裡有個自訂方法為powerXY(int x, int y),功能是會計算x的y次方並回傳結果。 
//	CalTest.java執行後,使用者可以輸入x與y的值,請加入例外處理機制,讓程式能解決以下狀況:
//	1. x與y同時為0,(產生自訂的CalException例外物件)
//	2. y為負值,而導致x的y次方結果不為整數
//	3. x與y皆正確情況下,會顯示運算後結果
	private int x;
	private int y;

	//無參數建構子
	public Calculator() {
		super();
	}

	public int getIntX() {
		return x;
	}
	
	public void setIntX(int x) {
		this.x = x;
	}

	public int getIntY() {
		return y;
	}

	public void setIntY(int y) {
		this.y = y;
	}

	public int powerXY(int x, int y) throws CalException{
		if ( x == 0 && y == 0)
			throw new CalException("0 的 0 次方沒有意義");
		
		if ( y < 0 )
			throw new CalException("次方數為負，結果回傳不為整數!");
		
		return (int) (Math.pow(x, y));
	}
}
