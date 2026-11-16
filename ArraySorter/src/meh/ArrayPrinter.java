package meh;

public class ArrayPrinter{
	/**
	 * Prints the array in a graph and a list of numbers
	 * @param nums
	 * @param a
	 * @param pause
	 */
	public static void printArray(int[] nums, int a, boolean pause){
		final String red = "\u001B[31m";//for printing the highlighted text
		final String black = "\u001B[30m";//for printing basic text
		if(pause){//if the pause variable is true, it will wait 1.5 seconds before printing, otherwise it will print instantly
			try{
				Thread.sleep(1500);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
		for(int i1 = 0; i1 < nums.length; i1++){//used for the vertical iteration of the graph
			
			for(int i2 = 0; i2 < nums.length; i2++){//used for the horizontal iteration of the graph
				
				if(nums[i2] >= nums.length - i1){//checks if nums[i2] is greater than or equal to the vertical position
					
					if(i2 == a || i2 == a + 1){//checks if nums[i2] is being compared
						System.out.print(red + "|  ");
					}else{
						System.out.print(black + "|  ");
					}
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
		for(int i = 0; i < nums.length; i++){//used to print the list of the numbers
			if(i == a || i == a + 1){
				if(nums[i] >= 10){//if nums[i] is 2 digits, prints with one less space (will only work for 10-99)
					System.out.print(red + nums[i] + " ");
				}else{
					System.out.print(red + nums[i] + "  ");
				}
			}else{
				if(nums[i] / 10 >= 1){
					System.out.print(black + nums[i] + " ");
				}else{
					System.out.print(black + nums[i] + "  ");
				}
			}
			
		}
		System.out.println();//adds a new line at the end for when class is called twice in a row
	}
}
