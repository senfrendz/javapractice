
public class testie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "   Welcome to Java Club to program     ";
		
		System.out.println(str.replace('p', 'P')); // character Replacement
		
		System.out.println(str.replace("to", "2")); // word replacement
		
		System.out.println(str.replaceFirst("to", "2")); // replace the first
		
		System.out.println(str.replaceAll(str, "Welcome to Code")); //replace all words
		
		//System.out.println(str.trim());
		
	}

}
