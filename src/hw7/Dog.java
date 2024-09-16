package hw7;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {
	private static final long serialVersionUID = 1L;	//序列化的版本控制
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	//實作父類別的抽象方法
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
