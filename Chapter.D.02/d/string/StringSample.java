package d.string;

public class StringSample {
	public static void main(String[] args) {
		StringSample sample = new StringSample();
		sample.constructors();
		// sample.nullCheck(null);
		// sample.compareCheck();
		// sample.equalCheck();
		// sample.compareToCheck();
		// sample.addressCheck();
		// sample.matchCheck();
		// sample.indexOfCheck();
		// sample.lastIndexOfCheck();
		// sample.substringCheck1();
		// sample.splitCheck();
		// sample.trimCheck();
		// sample.replaceCheck();
		// sample.formatCheck();
	}

	public void constructors() {
		try {
			String a = "�ѱ�";

			byte[] array1 = a.getBytes();
			for (byte data : array1) {
				System.out.print(data + " ");
			}
			System.out.println();
			// printByteArray(array1);
			String a1 = new String(array1);
			System.out.println(a1);

			// byte[] array2=a.getBytes();
			// printByteArray(array2);
			// String a2=new String(array2,"EUC-KR");
			// System.out.println(a2);

			// byte[] array2=a.getBytes();
			// printByteArray(array2);
			// String a2=new String(array2,"UTF-8");
			// System.out.println(a2);

			// byte[] array3=a.getBytes("UTF-16");
			// printByteArray(array3);
			// String a3=new String(array3,"UTF-16");
			// System.out.println(a3);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void printByteArray(byte[] array) {
		for (byte data : array) {
			System.out.print(data + " ");
		}
		System.out.println();
	}

	public boolean nullCheck(String text) {
		int textLength = text.length();
		System.out.println(textLength);
		if (text == null)
			return true;
		else
			return false;
	}

	public void compareCheck() {
		String text = "You must know String class.";
		System.out.println("text.length()=" + text.length());
		System.out.println("text.isEmpty()=" + text.isEmpty());
	}

	public void equalCheck() {
		String text = "Check value";
		// String text2 = "Check value";
		String text2 = new String("Check value");
		if (text == text2) {
			System.out.println("text==text2 result is same.");
		} else {
			System.out.println("text==text2 result is different.");
		}
		if (text.equals("Check value")) {
			System.out.println("text.equals(text2) result is same.");
		}

		String text3 = "check value";
		if (text.equalsIgnoreCase(text3)) {
			System.out.println("text.equalsIgnoreCase(text3) result is same.");
		}
	}

	public void compareToCheck() {
		String text = "a";
		String text2 = "b";
		String text3 = "c";
		System.out.println(text2.compareTo(text));
		System.out.println(text2.compareTo(text3));
		System.out.println(text.compareTo(text3));
	}

	public void addressCheck() {
		String addresses[] = new String[] { "����� ���α� �ŵ�����",
				"��⵵ ������ �д籸 ���ڵ� ���� ����", "����� ���α� ������", };
		int startCount = 0, endCount = 0;
		int containCount = 0;
		String startText = "�����";
		String endText = "��";
		String containText = "����";
		for (String address : addresses) {
			if (address.startsWith(startText)) {
				startCount++;
			}
			if (address.endsWith(endText)) {
				endCount++;
			}
			if (address.contains(containText)) {
				containCount++;
			}

		}
		System.out.println("Starts with " + startText + " count is "
				+ startCount);
		System.out.println("Ends with " + endText + " count is " + endCount);
		System.out.println("Contains " + containText + " count is "
				+ containCount);
	}

	public void matchCheck() {
		String text = "This is a text";
		String compare1 = "is";
		String compare2 = "this";
		System.out.println(text.regionMatches(2, compare1, 0, 1));
		System.out.println(text.regionMatches(5, compare1, 0, 2));
		System.out.println(text.regionMatches(true, 0, compare2, 0, 4));
	}

	public void indexOfCheck() {
		String text = "Java technology is both a programming language and a platform.";
		System.out.println(text.indexOf('a'));
		System.out.println(text.indexOf("a "));
		System.out.println(text.indexOf('a', 20));
		System.out.println(text.indexOf("a ", 20));
		System.out.println(text.indexOf('z'));
	}

	public void lastIndexOfCheck() {
		String text = "Java technology is both a programming language and a platform.";
		System.out.println(text.lastIndexOf('a'));
		System.out.println(text.lastIndexOf("a "));
		System.out.println(text.lastIndexOf('a', 20));
		System.out.println(text.lastIndexOf("a ", 20));
		System.out.println(text.lastIndexOf('z'));
	}

	public void substringCheck1() {
		String text = "Java technology";
		String technology = text.substring(5);
		System.out.println(technology);
		// String tech=text.substring(5, 4);
		// String tech=text.substring(5, 9);
		// System.out.println(tech);

	}

	public void splitCheck() {
		String text = "Java technology is both a programming language and a platform.";
		String[] splitArray = text.split(" ");
		for (String temp : splitArray) {
			System.out.println(temp);
		}
	}

	public void trimCheck() {
		String strings[] = new String[] { " a", " b ", "    c", "d    ",
				"e   f", "   " };
		for (String string : strings) {
			System.out.println("[" + string + "] ");
			System.out.println("[" + string.trim() + "] ");
		}
	}

	public void replaceCheck() {
		String text = "The String class represents character strings.";
		System.out.println(text.replace('s', 'z'));
		System.out.println(text);
		System.out.println(text.replace("tring", "trike"));
		System.out.println(text.replaceAll(" ", "|"));
		System.out.println(text.replaceFirst(" ", "|"));
	}

	public void formatCheck() {
		String text = "�� �̸��� %s�Դϴ�. ���ݱ��� %d ���� å�� ���, "
				+ "�Ϸ翡 %f %%�� �ð��� å�� ���µ� �Ҿ��ϰ� �ֽ��ϴ�.";
		String realText = String.format(text, "�̻��", 3, 10.5);
		// String realText=String.format(text, "�̻��",3);
		System.out.println(realText);
	}

	public void internCheck() {
		String text1 = "Java Basic";
		String text2 = "Java Basic";
		String text3 = new String("Java Basic");
		text3 = text3.intern();
		System.out.println(text1 == text2);
		System.out.println(text1 == text3);
		System.out.println(text1.equals(text3));
	}

}
