package aula59;

public class Main {

	public static void main(String[] args) {
		
	String original = "abcde FGHIJ ABC abc DEFG     ";	
	
	String s01 = original.toLowerCase();
	String s02 = original.toUpperCase();
	
	System.out.println("ORIGINAL: - " + original + "-");
	System.out.println("toLowerCase:  - " + s01 + "-");
	System.out.println("toUpperCase: - " + s02 + "-");

	}

}
