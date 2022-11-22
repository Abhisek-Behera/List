package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddTwoList {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(14);
		list1.add(8);
		
		List<Integer> list2 = new ArrayList<>();
		
		list2.add(7);
		list2.add(19);
		
		List<Integer> concatelist =new ArrayList<>();
		
		concatelist.addAll(list1);
		concatelist.addAll(list2);
		
		Collections.sort(concatelist);
		
		for(Integer e : concatelist)
		System.out.println(e);
	}

}
