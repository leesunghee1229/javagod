public class ControlOfFlow {
	public static void main(String[] args) {
		ControlOfFlow sample = new ControlOfFlow();
		sample.ifStatement();
		// sample.ifStatement2();
		// sample.ifStatement3();
		// sample.ifStatement4(90);
		// sample.switchStatement(1);
		// sample.switchStatement2(10);
		// sample.whileLoop();
		// sample.whileLoop2();
		// sample.forLoop(10);
	}

	public void ifStatement() {
		if (true)
			;
		if (true)
			System.out.println("It's true");
		if (true)
			System.out.println("It's also true.");
		if (false)
			System.out.println("It's false");
	}

	public void ifStatement2() {
		int intValue = 10;
		// intValue=5;
		if (intValue > 5)
			System.out.println("It's bigger than 5.");
		else
			System.out.println("It's smaller or equal than 5.");

		if (intValue <= 5)
			System.out.println("It's smaller or equal than 5.");
		else
			System.out.println("It's bigger than 5.");
	}

	public void ifStatement3() {
		int age = 25;
		boolean isMarried = true;

		if (age > 25 && isMarried) {
			System.out.println("Age is over 25 & Married");
		}
		if (age > 25 || isMarried) {
			System.out.println("Age is over 25 or Married");
		}

		double height = 180;
		if (age > 25 || isMarried && height >= 180) {
			System.out
					.println("Age is over 25 or Married and height is over 180");
		}
	}

	public void ifStatement4(int point) {
		if (point > 90) { // 90 점 이상일 경우
			System.out.println("A");
		} else if (point > 80) { // 90점 이상은 아니지만 80점 이상인 경우
			System.out.println("B");
		} else if (point > 70) { // 80점 이상은 아니지만 70점 이상인 경우
			System.out.println("C");
		} else if (point > 60) { // 70점 이상은 아니지만 60점 이상인 경우
			System.out.println("D");
		} else { // 60점 이상이 아닌 모든 경우
			System.out.println("F");
		}
	}

	public void switchStatement(int numberOfWheel) {
		switch (numberOfWheel) {
		case 1:
			System.out.println("It is one foot bicycle.");
			break;
		case 2:
			System.out.println("It is a motor cycle or bicycle.");
			break;
		case 3:
			System.out.println("It is a three wheel car.");
			break;
		case 4:
			System.out.println("It is a car.");
			break;
		default:
			System.out.println("It is an expensive car.");
			break;
		}
	}

	public void switchStatement2(int month) {
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + " has 31 days.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + " has 30 days.");
			break;
		case 2:
			System.out.println(month + " has 28 or 29 days.");
			break;
		default:
			System.out.println(month + " is not a month.");
			break;
		}
	}

	public void whileLoop() {
		int loop = 0;
		while (loop < 12) {
			loop++;
			// if(loop==6) continue;
			switchStatement2(loop);
			// if(loop==6) loop=100;
			// if(loop==6) break;
		}
	}

	public void whileLoop2() {
		int loop = 0;
		do {
			loop++;
			switchStatement2(loop);
		} while (loop < 12);
	}

	public void forLoop(int until) {
		int sum = 0;
		for (int loop = 1; loop <= until; loop++) {
			sum += loop;
		}
		System.out.println("1 to " + until + "=" + sum);
	}

}