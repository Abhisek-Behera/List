package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExp {

	

	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<>();
		
		list.add(15);
		list.add(16);
		list.add(21);
		
		ListIterator<Integer> ltr = list.listIterator();
		
		while(ltr.hasNext()) {
			System.out.println("Index:   "+ltr.nextIndex()+" Value: "+ltr.next());
		}
		System.out.println("After Reversing");
		while(ltr.hasPrevious()) {
			System.out.println("Index:   "+ltr.previousIndex()+" Value: "+ltr.previous());
		}
		
	}

}
