package findMissingNumber;
import java.util.*;

public class MissingNumberFinder {
	private static int missingNumberFinder(int[] arr, int size) {
		for(int i=0; i<arr.length; i++){
			
			if(arr[i]==i+1){
				continue;
			}else{
				return i+1;
			}
		}
		return size;
	} 
	 public static void main(String[] args) { 
		 Scanner in = new Scanner(System.in); 
		 int size = in .nextInt(); 
		 int[] arr = new int[size - 1]; 
		 for (int i = 0; i < size -1; i++) arr[i] = in .nextInt(); 
		 System.out.println(missingNumberFinder(arr, size)); 
		 }

	
}
