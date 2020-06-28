package JavaPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=1234;
		int rem=0;
		int reverse=0;
		
		while(number!=0) {
			
			rem=number%10;
			reverse=(reverse*10)+rem;
			number=number/10;
		}
		
		System.out.println("Reverse of a number:"+reverse);

	}

}
