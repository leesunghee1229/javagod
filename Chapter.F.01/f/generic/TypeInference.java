package f.generic;

public class TypeInference {
	public static void main(String args[]) {
		TypeInference type = new TypeInference();
		type.makeObjects();

	}

	public void makeObjects() {
		GenericClass<Integer> generic1 = new GenericClass<>("String");
		generic1.setValue(999);
		
		GenericClass<Integer> generic2=new GenericClass("String"); 
		generic2.setValue(999);
		
		GenericClass<Integer> generic3=new <String> GenericClass<Integer>("String");
		generic3.setValue(999);
		
//		GenericClass<Integer> generic4=new <String> GenericClass<>("String"); //Compile Error
//		generic4.setValue(999);
	}
}
