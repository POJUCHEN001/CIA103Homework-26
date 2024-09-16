package hw7;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;

public class Homework7 implements Serializable {
	private static final long serialVersionUID = 1L;

	public void readTxt() throws IOException {
//		請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//		Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
		int i = 0;
		File file = new File(".\\src\\hw7\\Sample.txt");
		// 讀取位元數
		long bytes = file.length();

		// 讀取字元數、列數
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		int countChar = 0;
		int countLine = 0;
		String line;

		while ((line = br.readLine()) != null) {
			countLine++;
			countChar += line.length();
		}
		//輸出檔案資訊
		System.out.println(file.getName() + "檔案共有 " + bytes + "個位元組，" + countChar + "個字元，" + countLine + "列資料");

		//讀取檔案內容
		FileReader fr2 = new FileReader(file);
		BufferedReader br2 = new BufferedReader(fr2);

		System.out.println("Sample.txt檔案內容為以下；");
		while ((i = br2.read()) != -1)	// read()回傳的是數字，若為負數即檔案結束
			System.out.print((char) i);

		//關閉資聊流：越晚建立，越先關閉
		br2.close();
		fr2.close();
		br.close();
		fr.close();
	}

	public void writeData() throws IOException {
//		請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡(請使用append功能讓每次執行結果都能被保存起來)
		File file = new File("src//hw7//Data.txt");
		
		FileOutputStream fos = new FileOutputStream(file, true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		PrintStream ps = new PrintStream(bos);	//不會覆寫檔，會把得到的內容在接續加在檔案裡；若是用printWrite就會被覆蓋過去
		
		for (int i = 0; i < 10; i++) {
			ps.print((int) ((Math.random() * 1000) + 1) + "\t"); // 對"存在的檔案"做printStream，會完全覆寫檔案裡所有資料(不管幾行)
		}
		ps.println();
		
		//關閉資聊流
		ps.close();
		bos.close();
		fos.close();

	}

	public void copyFile(File getFile, File copiedFile) throws IOException {
//		請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所代表的檔案會複製到第二個參數代表的檔案
		
		FileReader in = new FileReader(getFile);		//能處理Unicode字元的資料流
		FileWriter out = new FileWriter(copiedFile);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		int c;
		
		while ((c = in.read()) != -1) { // 讀到檔案的尾端時,read()會回傳-1
			out.write(c);
		}
		bw.flush();
		
		System.out.println("檔案複製成功!");
		
		bw.close();
		br.close();
		in.close();
		out.close();
	
	}

	public void writeIn() throws IOException {
//		請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。
//		注意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾	
		Dog dog1 = new Dog("Snoopy");
		Dog dog2 = new Dog("Scoopy");
		Cat cat1 = new Cat("Kitty");
		Cat cat2 = new Cat("Tom");
		
		File dir = new File("C:\\data");
		if(!dir.exists())
			dir.mkdir();
		
		File file = new File("C:\\data\\Object.ser");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(dog1);
		oos.writeObject(dog2);
		oos.writeObject(cat1);
		oos.writeObject(cat2);
		
		System.out.println("檔案輸出完成!");
		
		oos.close();
		fos.close();
		
	}

	public void readObject() throws IOException, ClassNotFoundException {
//		承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何(請利用多型簡化本題的程式設計)	
		
		File file = new File("C:\\data\\Object.ser");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try {
			while (true) {
				((Animal)ois.readObject()).speak(); //將讀取回來的物件
			}
		} catch (EOFException ee) {	//檔案讀取完畢
			System.out.println("資料讀取完畢!");
		}
		
		ois.close();
		fis.close();

	}


	public static void main(String[] args) throws IOException, Exception {
		
		
		Homework7 q1 = new Homework7();
		q1.readTxt();

		Homework7 q2 = new Homework7();
		q2.writeData();
		
		Homework7 q3 = new Homework7();
		//輸入欲修改的檔案的檔案路徑
		File a = new File(".\\src\\hw7\\Sample.txt");
		File b = new File("src\\hw7\\copyTest.txt");
		q3.copyFile(a, b);
		
		Homework7 q4of1 = new Homework7();
		q4of1.writeIn();
		
		Homework7 q4of2 = new Homework7();
		q4of2.readObject();
		

	}

}
