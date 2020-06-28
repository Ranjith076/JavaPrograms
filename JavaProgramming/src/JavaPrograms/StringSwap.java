package JavaPrograms;

public class StringSwap {

	public static void main(String[] args) {
		
		String a = "Hello";
		String b = "World";
		
		System.out.println("********Before Swapping*********");
		System.out.println("The Value of a : "+ a);
		System.out.println("The Value of b : "+ b);
		
		a=a+b;
		
		System.out.println(a);
		
		b = a.substring(0, a.length()-b.length());
		
		a = a.substring(b.length());
		
		System.out.println("********After Swapping*********");
		System.out.println("The Value of a : "+ a);
		System.out.println("The Value of b : "+ b);

	}

}
