package f.generic;

import java.util.Set;
import java.util.HashSet;

public class Diamond {
	public static void main(String args[]) {
		Diamond diamond = new Diamond();
		diamond.addToSet();
	}

	public void addToSet() {
		Set<String> set = new HashSet<>();
		set.add("basicjava");
		
//		set.addAll(new HashSet<>());//Compile Error
		
//		Set<String> addSet=new HashSet<>();
//	    set.addAll(addSet);

		System.out.println(set);
	}
}
