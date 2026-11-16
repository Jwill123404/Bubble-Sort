package meh;

public class SequentialSort{
	
	public static int totalChecks = 0;//required for printing the total number of checks
	/**
	 * Sorts the array one cycle per call, only stops when the cycle is over or when fully sorted.
	 * @param nums
	 * @return
	 */
	public static boolean sortOne(int[] nums){
		boolean sorted = true;
		for(int i2 = 0; i2 < nums.length - 1; i2++){//checks the array to see if they're all sorted
			if(nums[i2] > nums[i2 + 1]){//if there's a single unsorted position in the array, the loop breaks
				sorted = false;
				break;
			}
		}
		if(sorted){//if the previous check never breaks, then this returns the fully sorted loop and states that it's sorted
			return true;
		}
		
		for(int i = 0; i < nums.length - 1; i++){//cycles through the array
			totalChecks++;//increments totalChecks
			ArrayPrinter.printArray(nums, i, true);//prints the values of the array and a functioning text-based vertical graph of the array
			
			if(nums[i] > nums[i + 1]){//if the value after nums[i] is less than nums[i], swaps them
				int temp = nums[i];
				nums[i] = nums[i + 1];
				nums[i + 1] = temp;
				sorted = true;
				
				for(int i2 = 0; i2 < nums.length - 1; i2++){//checks the array to see if they're all sorted
					if(nums[i2] > nums[i2 + 1]){//if there's a single unsorted position in the array, the loop breaks
						sorted = false;
						break;
					}
				}
				
				if(sorted){//if the previous check never breaks, then this returns the fully sorted loop and states that it's sorted
					return true;
				}
			}
			ArrayPrinter.printArray(nums, i, false);
			System.out.println("\n\n");
		}
		return false;
	}
}