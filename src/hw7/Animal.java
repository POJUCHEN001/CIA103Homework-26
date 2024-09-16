package hw7;

import java.io.Serializable;
	//抽象父類別
public abstract class Animal implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	
	public Animal() {
		super();
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	//抽象方法
	public abstract void speak();

	

}
