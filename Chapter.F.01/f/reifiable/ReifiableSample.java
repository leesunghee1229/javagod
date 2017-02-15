package f.reifiable;

import java.util.ArrayList;
import java.util.Collections;

public class ReifiableSample {
	public void addData() {
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		ArrayList<String> newDataList = new ArrayList<String>();
		newDataList.add("a");
		Collections.addAll(list, newDataList);
		System.out.println(list);
	}
}
