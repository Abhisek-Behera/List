package list;

import java.util.ArrayList;
import java.util.List;

public class FindTheFirstAndLastElement {

	
	public static void getElements(List<Integer> list) {
		
		if(list != null && !list.isEmpty()) {
			
			System.out.println("First Element :"+list.get(0));
			System.out.println("Last Element  :"+list.get(list.size()-1));
			
			return;
			
		}
	}
		
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(25);
		list.add(45);
		list.add(87);
		
		
		System.out.println("List elements :" + list);
       
		getElements(list);
	}

}
