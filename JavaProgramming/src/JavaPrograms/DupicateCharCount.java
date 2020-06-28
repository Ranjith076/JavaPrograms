package JavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class DupicateCharCount {

	public static void main(String[] args) {
		
		String str = "Silly Spider";
		
		Set<Character> data = new HashSet<Character>();
		
		for(char s:str.toCharArray()) {
			
			if(data.add(s)==false) {
				
				System.out.println(s);
			}
		}
		
		//System.out.println(data);

	}

}
