package JavaPrograms;

public class RemoveJunksInString {

	public static void main(String[] args) {
		
		// Regular Expression [^a-zA-Z0-9]
		
		String s = "@#%$%^$%#$%@#Ranjith076^&*$%#$%@#$%#@%";
		s=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);

	}

}
