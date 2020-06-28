package JavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		String names[]= {"Java", "JavaScripts", "Ruby", "Python", "Java"};
		
		//1. Compare each element: o(n*n)----- Worst Solution
		for(int i=0;i<names.length;i++) {
			
			for(int j=i+1;j<names.length;j++) {
				
				if(names[i].equals(names[j])) {
					
					System.out.println("Duplicate Element is::"+names[i]);
				}
			}
		}
		
		System.out.println("*****************************************************");
		
		//2. using HashSet : Java Collection : it stores unique values: o(n)
		Set<String> store = new HashSet<String>();
		for(String name: names) {
			
			if(store.add(name)== false) {
				
				System.out.println("Duplicate Element is::"+name);
			}
		}
		
		
		
		

	}

}
