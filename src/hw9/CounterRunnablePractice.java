package hw9;

public class CounterRunnablePractice implements Runnable {
	private String name; //用來區分參賽者的名字
	int rice = 0;

	public CounterRunnablePractice() {
	}
	
	public String getName() {
		return name;
	}

	public CounterRunnablePractice(String name) {
		this.name = name;
	}

	// 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的競賽過程。
	// 每個動作都以Thread.sleep()暫停一下,以達到顯示效果。
	// Sleep時間由亂數產生500～3000之間的毫秒數
	public void run() {
		for (rice = 1; rice <= 10; rice ++) {
			System.out.println(name + "吃第"+ rice + "碗飯");
			
			int sleepTime = 500 + (int) (Math.random() * 2500);
			try {
				Thread.sleep(sleepTime); // 暫停500~3000毫秒
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(rice == 10 ) {
				System.out.println(name + "吃完了!");
			}
		}
		System.out.println("-----大胃王快食比賽結束!");

	}

	public static void main(String[] args) {
		CounterRunnablePractice r1 = new CounterRunnablePractice("饅頭人");
		Thread t1 = new Thread(r1);
		CounterRunnablePractice r2 = new CounterRunnablePractice("詹姆士");
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}

	

}
