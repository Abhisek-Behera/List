package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExp {

	public static void main(String[] args) {
		 
		List<String> list = new ArrayList<>();
		
		list.add("Ball");
		list.add("Zebra");
		list.add("Isha");
				
		list.set(1, "Abhi");  //Set an list with index
		
		Collections.sort(list);  // Sorting
				
		for(String str:list)
		System.out.println(str);

	}

}
