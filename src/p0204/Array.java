package p0204;

public class Array {
	public static void main(String[]args) {
		//배열의 단점 관계수를 지정해야만 함
		int[] nums = new int[3];
		
		nums[0] =10;
		nums[1] =10;
		nums[2] =10;
		//관계수의 사이즈를 늘리거나 줄일수가 없다
		int[] tmps = nums;
		nums = new int[4];
		for(int i=0;i<tmps.length;i++) {
			nums[i] = tmps[i];
		}
		System.out.println(nums[3]);
		tmps= nums;
		nums = new int[3];
		for(int i=0;i<nums.length;i++) {
			nums[i] = tmps[i];
		}
	}
}
