package hw5;

public class MyRectangleMain {
	
	public static void main(String[] args) {
		
//	1.  使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
		MyRectangle myRect = new MyRectangle();
		myRect.setWidth(10);
		myRect.setDepth(20);
		System.out.println(myRect.getArea());
		
		
//	2.  使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
		MyRectangle myRect2 = new MyRectangle(10, 20);
		System.out.println(myRect2.getArea());
	}

}
