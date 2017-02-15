public class PrimitiveTypes {
	public static void main(String[] args) {
		PrimitiveTypes types = new PrimitiveTypes();
		// types.checkByte();
		// types.checkIntegers();
		// types.checkChar();
		// types.checkBoolean();
	}

	public void checkByte() {
		byte byteMin = -128;
		byte byteMax = 127;
		System.out.println("byteMin=" + byteMin);
		System.out.println("byteMax=" + byteMax);
		// byteMin--;
		// byteMax++;
		// System.out.println("byteMin--="+byteMin);
		// System.out.println("byteMax++="+byteMax);
	}

	public void checkIntegers() {
		short shortMax = 32767;
		int intMax = 2147483647;
		// long longMax=9223372036854775807;//Compile Error
	}

	public void checkChar() {
		char charMin='\u0000';
		char charMax='\uffff';
		System.out.println("charMin=["+charMin+"]");
		System.out.println("charMax=["+charMax+"]");
		int intValue='a';
		System.out.println("intValue=["+intValue+"]");

		char a='a';
		char b='ab';// Compile Error
		char c='°¡';
		char d='\u97';// Compile Error
		char e='\u1188';
		char f=-1;// Compile Error
		char g=999;
	}

	public void checkBoolean() {
		boolean flag = true;
		System.out.println(flag);
		flag = false;
		System.out.println(flag);
	}

	int intDefault1;

	byte byteDefault;
	short shortDefault;
	long longDefault;
	float floatDefault;
	double doubleDefault;
	char charDefault;
	boolean booleanDefault;

	public void defaultValues() {
		int intDefault2;
		System.out.println(intDefault1);
		System.out.println(intDefault2);// Compile Error

		System.out.println("byteDefault=" + byteDefault);
		System.out.println("shortDefault=" + shortDefault);
		System.out.println("intDefault1=" + intDefault1);
		System.out.println("longDefault=" + longDefault);
		System.out.println("floatDefault=" + floatDefault);
		System.out.println("doubleDefault=" + doubleDefault);
		System.out.println("charDefault=" + charDefault);
		System.out.println("booleanDefault=" + booleanDefault);
	}

}
