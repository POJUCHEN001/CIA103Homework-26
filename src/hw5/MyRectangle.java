package hw5;

public class MyRectangle {
	private double width;
	private double depth;
	
	//不寫public，預設：同套件(hw5)裡的類別皆可存取
	void setWidth(double width) {
		this.width = width;
	}
	
	void setDepth(double depth) {
		this.depth = depth;
	}
	
	double getArea() {
		return width * depth;
	}
	
	
	//無參數建構子
	
	public MyRectangle() {
		super();
	}
	
	//有參數建構子
	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}

}
