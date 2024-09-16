package hw8;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TrainTest {
//	在main方法裡透過建構子產生以下7個Train的物件，放到每小題需使用的集合裡
//	- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
//	- (1254, “區間”, “屏東”, “基隆”, 700)
//	- (118, “自強”, “高雄”, “台北”, 500)
//	- (1288, “區間”, “新竹”, “基隆”, 400)
//	- (122, “自強”, “台中”, “花蓮”, 600)
//	- (1222, “區間”, “樹林”, 七堵, 300)
//	- (1254, “區間”, “屏東”, “基隆”, 700)
	
	public static void main(String[] args) {
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 700);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(112, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
		
		
//		• 請寫一隻程式，能印出不重複的Train物件
		System.out.println("***印出不重複的Train物件***");
		
		//HashSet方法，使加入元素不重複
		Set<Train> set = new HashSet<Train>();
		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		set.add(t5);
		set.add(t6);
		set.add(t7);
		
		for(Train train : set) {
			train.showInfo();
		}
		System.out.println("=============================================");
		
//		• 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
		System.out.println("***讓Train物件印出時，能以班次編號由大到小印出***");
		
		Set<Train> sortedSet = new TreeSet<Train>();
		sortedSet.add(t1);
		sortedSet.add(t2);
		sortedSet.add(t3);
		sortedSet.add(t4);
		sortedSet.add(t5);
		sortedSet.add(t6);
		sortedSet.add(t7);
		
		for(Train train : sortedSet) {
			train.showInfo();
		}
		System.out.println("=============================================");
//		• 承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件
		
		System.out.println("***班次編號由大排到小印出， 且不重複印出Train物件***");
		Set<Train> set3 = new TreeSet<Train>();
		set3.add(t1);
		set3.add(t2);
		set3.add(t3);
		set3.add(t4);
		set3.add(t5);
		set3.add(t6);
		set3.add(t7);
		
		for(Train train : set3) {
			train.showInfo();
		}
		
	}

}
