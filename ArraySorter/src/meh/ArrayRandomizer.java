package meh;

public class ArrayRandomizer{
	/**
	 * When called, this function sets every variable in an integer array to
	 * a random unique integer value, from 1 to the length of the array.
	 * @param nums
	 */
	public static void randomize(int[] nums){
		nums[0] = (int)(Math.random() * nums.length)+ 1;//sets the first value randomly
		
		for(int i1 = 1; i1 < nums.length; i1++){
			nums[i1] = (int)(Math.random() * nums.length)+ 1;//sets the rest of the values randomly
			for(int i2 = 0; i2 < i1; i2++){//cycles through the assigned variables to ensure there are no repeats
				if(nums[i1] == nums[i2]){//if there is a repeat, assigns the variable to a new random number until there are no repeats
					nums[i1] = (int)(Math.random() * nums.length)+ 1;
					i2 = -1;
				}
			}
		}
	}
}
