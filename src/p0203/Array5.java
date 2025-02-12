package p0203;

public class Array5 {
	public static void main(String[]args) {
	int[] nums = new int[10];
	//nums의 반복문을 이용해서 2,4,6,8,10,12,14,16,18,20
	for (int i=1;i<=nums.length-1;i++) {	
			nums[i] = i*2;
			System.out.println(nums[i]);
			
		}
	}
}