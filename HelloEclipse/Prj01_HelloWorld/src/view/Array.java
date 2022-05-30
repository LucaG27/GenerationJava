package view;

public class Array {

	public static void main(String[] args) {
		//Array nums = new Array();
		
		int[] nums = { 4, 9, 3, 7 };
		
		//System.out.println(nums);

		if (nums.length > 1) {
			int ultimo = nums[nums.length - 1];

			for (int i = nums.length - 1; i > 1; i--) {
				nums[i] = nums[i-1];
			}
			nums[0] = ultimo;
			
			for(int i = 0; i < nums.length - 1; i++) {
				System.out.println(nums[i]);
			}
			
//			System.out.println(nums);
		}
	}
}