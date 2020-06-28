package JavaPrograms;

import java.util.Arrays;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		
		int numbers[] = {-10, 24, 50, -88, 8946};
		
		int largest = numbers[0];
		int smallest = numbers [0];
		
		for(int i = 1; i<numbers.length; i++) {
			
			if(numbers[i]>largest) {
				
				largest = numbers[i];
				
			}else if(numbers[i]<smallest) {
				
				smallest = numbers[i];
				
			}
		}
		
		System.out.println("Given Array :"+ Arrays.toString(numbers));
		System.out.println("Largest Number : "+ largest);
		System.out.println("Smallest Number : "+ smallest );

	}

}
