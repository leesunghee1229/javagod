package e.thread;

public class VolatileSample extends Thread {
	private double instanceVariable = 0;
//	private volatile double instanceVariable = 0;

	void setDouble(double value) {
		this.instanceVariable = value;
	}

	public void run() {
		while (instanceVariable == 0);
		// try {
		// while (instanceVariable == 0) {
		// Thread.sleep(1);
		// }
		// } catch(Exception e) {
		//
		// }

		System.out.println(instanceVariable);
	}
}
