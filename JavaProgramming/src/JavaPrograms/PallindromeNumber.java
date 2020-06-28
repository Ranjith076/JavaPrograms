package JavaPrograms;

public class PallindromeNumber {
	
	public static void isPallindrome(int num) {
		
		int sum=0;
		int rem=0;
		int temp=num;
		
		while(num!=0) {
			
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		
		if(temp==sum) {
			
			System.out.println("Pallindrome number");
		}else {
			
			System.out.println("Not a pallindrome number");
		}
	}

	public static void main(String[] args) {
		
		isPallindrome(893465);

	}

}
