package JavaPrograms;

public class StringSplit {

	public static void main(String[] args) {
		
		String str = "Welcome to India";
		String[] strrArray=str.split(" ");
		
		System.out.println(strrArray[0]);
		System.out.println(strrArray[1]);
		System.out.println(strrArray[2]);
		
		String rev1="";
		String rev2="";
		String rev3="";
		
		for(int i=strrArray[0].length()-1;i>=0;i--) {
			
			rev1=rev1+strrArray[0].charAt(i);
		}
		for(int i=strrArray[1].length()-1;i>=0;i--) {
			
			rev2=rev2+strrArray[1].charAt(i);
		}
		for(int i=strrArray[2].length()-1;i>=0;i--) {
			
			rev3=rev3+strrArray[2].charAt(i);
		}
		
		System.out.println(rev1);
		System.out.println(rev2);
		System.out.println(rev3);
		
		System.out.println(str);
		System.out.println(rev1+" "+rev2+" "+rev3);
		

	}

}
