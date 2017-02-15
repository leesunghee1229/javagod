package e.thread.sync;

public class CommonCalculate {
	private int amount;
	public CommonCalculate() {
		amount=0;
	}
	public void plus(int value) {
		amount+=value;
	}
	public void minus(int value) {
		amount-=value;
	}
	public synchronized void plus2(int value) {
		amount+=value;
	}
	public synchronized void minus2(int value) {
		amount-=value;
	}
	
	public void plus3(int value) {
		synchronized(this) {
			amount+=value;
		}
	}
	public void minus3(int value) {
		synchronized(this) {
			amount-=value;
		}
	}


	public int getAmount() {
		return amount;
	}
}
