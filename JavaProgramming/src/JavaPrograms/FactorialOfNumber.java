package JavaPrograms;

public class FactorialOfNumber {
	
	// 3! = 3*2*1=6
	// 4! = 4*3*2*1 = 24
	// 1! = 1
	// 0! = 1

	public static int factorial(int num) {
		
		int fact=1;
		for(int i =1;i<=num;i++) {
			
			fact=fact*i;
		}
		
		return fact;
	}
	
	public static void main(String[] args) {
		
		System.out.println(factorial(4));
		System.out.println(factorial(3));
		System.out.println(factorial(1));
		System.out.println(factorial(0));

	}

}
