package p0207;

public class Array {
	static void PrintArray(int[] nums) {
		for(int i = 0 ; i< nums.length;i++) {
		System.out.println(nums[i]);
		}
	}
	
	public static void main(String[]args) {
		//배열 
		//여러개의 변수를 한개로 가지고 다닐수 있다 
		
		//배열 단점
		//한 번 정한 크리를 바꿀 수 없다.
		
		int[] nums = new int[] {10,4,2,3};
		PrintArray(nums);
		int[] tmpNums = nums;
				
		nums = new int[5]; //{0,0,0,0,0};
		for(int i=0;i<tmpNums.length;i++) {
			nums[i] = tmpNums[i];
		}
		PrintArray(nums);
		//swap
		int a = 1;
		int b = 2;
		int tmp = a;
		a = b;
		b = tmp;
		
	}
}
