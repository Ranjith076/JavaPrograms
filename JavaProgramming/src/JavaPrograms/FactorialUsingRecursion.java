package JavaPrograms;

public class FactorialUsingRecursion {
	
	public static int fact(int num) {
		
		if(num==0)
			return 1;
		else
			return (num*fact(num-1));
	}

	public static void main(String[] args) {
		
		System.out.println(fact(4));
		System.out.println(fact(3));
		System.out.println(fact(1));
		System.out.println(fact(0));
		
	}

}
