package patternprinter;
import java.util.*;

public class Pattern_printer {
	 public static void main(String[] args) { 
		 Scanner in = new Scanner(System.in); 
		 int n = in .nextInt(); 
		 patternPrinter(n); 
		 }

	private static void patternPrinter(int n) {
		for(int i=0; i<n; i++){
		for(int j=0; j<n; j++){
			for(int k=0; k<n-i; k++){
				System.out.print(n-j+" ");
			}
		}
		System.out.println();
		}
		
	} 

}
