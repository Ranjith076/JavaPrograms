package JavaPrograms;

public class FetchingNumbersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="sdfvsdf68fsdfsf8999fsdf09";
		String numberOnly= str.replaceAll("[^0-9]", "");
		System.out.println(numberOnly);
	}

}
