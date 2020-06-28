package JavaPrograms;

public class StringManipulations {

	public static void main(String[] args) {
		
		String str = "The rains have started here";
		String str1 = "The rains Have started here";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf('s')); // First occurance of s
		
		System.out.println(str.indexOf('s', str.indexOf('s')+1)); // Second occurance of s
		
		System.out.println(str.indexOf("have"));
		
		System.out.println(str.indexOf("Hello"));
		
		// string Comparison
		
		System.out.println(str.equals(str1));
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		// SubString
		
		System.out.println(str.substring(0, 9));
		
		// trim
		String s = "    Hello World     ";
		System.out.println(s.trim());
		
		// replace
		System.out.println(s.replace(" ", ""));
		
		String date = "07/02/1991";
		System.out.println(date.replace("/", "-"));
		
		// split
		String test = "Hello_World_Test_Selenium";
		String testVal[]=test.split("_");
		for(int i=0;i<testVal.length;i++) {
			
			System.out.println(testVal[i]);
		}
		
		// Concatination
		
		String s2 = "Ranjit";
		System.out.println(s2.concat("h"));
		
		String x = "Hello";
		String y = "World";
		
		int a=100;
		int b=200;
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));

	}

}
