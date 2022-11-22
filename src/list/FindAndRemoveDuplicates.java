package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAndRemoveDuplicates {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Guddu");
		list.add("Sonu");
		list.add("Chitra");
		list.add("Sonu");
		list.add("Chitra");
		
		List<String> list1 = new ArrayList<>();
		
		list.add("Prashant");
		
		List<String> concat = new ArrayList<>();
		
		concat.addAll(list);
		concat.addAll(list1);
		
		Set<String> set = new HashSet<>(); //Set don't take null values 
		
		for(String s:concat) 
			if(set.add(s)==false)   // if(set.add(s)==true) It gives the normal records
			System.out.println(s);
	}

}
