package list;

import java.util.ArrayList;
import java.util.List;

public class LargestNumberInList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1785);
		list.add(2534);
		list.add(1000);
		
		for(Integer i :list)
			System.out.println(i);
		
		int maxValue = 0;
		
		for(Integer i : list) {
			if(i>maxValue)
				maxValue=i;
		}
		
		System.out.println("Max Value--"+maxValue);

	}

}
