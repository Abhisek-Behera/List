package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxAndMinNum {
	
	
	public static Integer findMin(List<Integer> list) {
		if(list == null || list.size() == 0) {
			return Integer.MAX_VALUE;
		}
		return Collections.min(list);
	}
	public static Integer findMax(List<Integer> list) {
		if(list == null || list.size()==0) {
			return Integer.MIN_VALUE;
		}
		return Collections.max(list);
	}


	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(678);
		list.add(6300);
		list.add(999);

		System.out.println("List Elements :"+list);
		System.out.println("Minimumvalue  :"+findMin(list));
		System.out.println("MaximumValue  :"+findMax(list));
		
		

	}

}
