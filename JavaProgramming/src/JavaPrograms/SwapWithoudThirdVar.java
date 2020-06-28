package JavaPrograms;

public class SwapWithoudThirdVar {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 10;
		
		// 1. Using 3rd variable
		
//		int t;
//		t=x;
//		x=y;
//		y=t;
		
		// 2. Without using 3rd variable Using + operator
		
//		x = x+y;
//		y = x-y;
//		x = x-y;
		
		// 3. Without using 3rd variable Using + operator
		
//		x = x*y;
//		y = x/y;
//		x = x/y;
		
		// 4. using XOR '^'
		
		x = x^y;
		y = x^y;
		x = x^y;

		System.out.println("x is :"+x);
		System.out.println("y is :"+y);

	}

}
