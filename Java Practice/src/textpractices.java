
public class textpractices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input ="Happy-Friends-World"; // user input
		
		String output[];
		
		output = input.split("-");
		
		for(int i=0;i<output.length;i++)
		{
		System.out.println(output[i]);
		}
	}

}
