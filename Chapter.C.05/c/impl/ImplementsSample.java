package c.impl;

public class ImplementsSample {

	public static void main(String[] args) {
		MemberManagerInterface manager =
				//new MemberManagerInterface();// Compile Error
				new MemberManager();
	}

}
