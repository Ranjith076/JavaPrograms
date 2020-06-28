package JavaPrograms;

public class StringLength {

	public static void main(String[] args) {
		
		  // Finding the length of the string without using function
		
		  String str = "sampleString";
	      int i = 0;
	      for(char c: str.toCharArray()) {
	         i++;
	      }
	      System.out.println("Length of the given string ::"+i);

	}

}
