package c.javapackage;

import c.javapackage.sub.Sub;

import static c.javapackage.sub.Sub.subClassStaticMethod;
import static c.javapackage.sub.Sub.CLASS_NAME;

public class Package {
	public static void main(String[] args) {
		System.out.println("Package class.");

		Sub sub = new Sub();
		sub.subClassMethod();

		subClassStaticMethod();
		System.out.println(CLASS_NAME);

		Sub sub2 = new Sub();
		sub2.publicMethod();
		sub2.protectedMethod();//Compile error
		sub2.packagePrivateMethod();//Compile error
		sub2.privateMethod();//Compile error

	}
	
}

