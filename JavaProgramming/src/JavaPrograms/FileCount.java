package JavaPrograms;

public class FileCount {

	public static void main(String[] args) {
		
		String str = "file1.html,file2.xml,file3.csv,file4.html";
		String[] strArray = str.split(",");
		int htmlCount=0;
		int xmlCount=0;
		int csvCount=0;
		
		for(int i=0;i<strArray.length;i++) {
			
			if(strArray[i].contains("html")) {
				htmlCount++;
				//System.out.println("htmlCount = " + htmlCount);
			}
			
			if(strArray[i].contains("xml")) {
				xmlCount++;
			}
			
			if(strArray[i].contains("csv")) {
				csvCount++;
			}
		}
		
		System.out.println(htmlCount);
		System.out.println(xmlCount);
		System.out.println(csvCount);

	}

}
