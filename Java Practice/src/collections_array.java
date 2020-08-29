import java.util.ArrayList;

public class collections_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> newlist = new ArrayList<String>();
		
		newlist.add("Sachin");
		newlist.add("Tendulkar");
		newlist.add("tendahar");
		newlist.add("tendahar suchin");
		
		System.out.println(newlist);
		newlist.set(3, "tendalhar");
		
		for(String iter:newlist) {
			System.out.println("The value is "+iter);
		}
		
		for(int i=0;i<newlist.size();i++) {
			System.out.println("The Value of i is "+newlist.get(i));
		}

	}

}
