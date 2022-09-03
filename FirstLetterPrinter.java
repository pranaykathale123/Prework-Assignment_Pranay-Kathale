package firstLetterPrinter;
import java.util.*;

public class FirstLetterPrinter {
	 
	private static String firstLetterPrinter(String input) {
		String ans ="";
		ans+=input.charAt(0);
		for(int i=0; i<input.length()-1; i++){
			if(input.charAt(i)==' '){
				ans+=input.charAt(i+1);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in); 
		 String input = in .nextLine(); 
		 System.out.println(firstLetterPrinter(input)); 
	}

	

}
