package JavaPrograms;

public class StartsWithVowel {

	public static void main(String[] args) {
		
		String str = "This is an interview And U have to clear at Any cost";
		String[] strArray = str.split(" ");
		
		for(int i =0;i<strArray.length;i++) {
			
			char ch=strArray[i].charAt(0);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
			   ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				
				System.out.println(strArray[i]);
			}
		}

	}

}
