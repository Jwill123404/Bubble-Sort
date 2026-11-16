package meh;
import java.util.Scanner;
/**Creator: Jack Willis, November 2026
 * This program creates a fully randomized array of unique numbers,
 * which are sorted with the use of a bubble sort algorithm. The
 * program prints the numbers and a graph to visualize each step,
 * highlighting the numbers being compared in red text. When
 * finished, it prints the sorted array and the total number of checks.
 */
public class Search{
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Choose how many numbers to be sorted, ideally between 3 and 15: ");
		int n = in.nextInt();
		in.nextLine();
		
		int[] nums = new int[n];
		ArrayRandomizer.randomize(nums);
		
		boolean isSorted = false;
		
		while(!isSorted){
			isSorted = SequentialSort.sortOne(nums);
		}//breaks if it starts sorted, otherwise works fine
		
		ArrayPrinter.printArray(nums, -2, false);
		System.out.println("\n\nTotal number of checks: " + SequentialSort.totalChecks);
		in.close();
	}
}
