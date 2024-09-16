package hw8;



import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Homework8 {
	
	public static void main(String[] args) {
//		請建立一個Collection物件並將以下資料加入：
//		Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、Object物件、“Snoopy”、BigInteger(“1000”)
		List<Object> list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Double (3.14));
		list.add(new Long (21L));
		list.add(new Short ("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object ());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		
		System.out.println("toString()= " + list);
		System.out.println("元素個數=" + list.size());
		
		System.out.println("方法一：使用Iterator取得元素");
//		印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
		//方法一：Iterator
		Iterator<Object> iterator = list.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		System.out.println("方法二：傳統for");
		
		//方法二：傳統for
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
		
		System.out.println("移除不是java.lang.Number相關的物件");
		System.out.println("移除前 = " + list);
		//removeIf()方法：條件設置，取"Number相關物件"的相反!
		list.removeIf(element -> !(element instanceof Number));
		System.out.println("移除後 = " + list);
	}

	
}
