package JavaPrograms;

public class CharacterCounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Apple";
		char chr='p';
		int count=0;
		
		for(int i=0;i<str.length();i++) 
		{
			if(str.charAt(i)==chr) {
				
				count++;
			}
		}
		
		System.out.println(count);
	}

}
