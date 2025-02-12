package p0203;

public class Array {
	public static void main(String[]args) {
		//배열
		int[] nums = new int[5]; //배열의 방은 0에서 4로 끝남
		System.out.println(nums[0]); //int 함수는 값을 넣지 않으면 0으로 초기화됨
		
		String[] strs = new String[5];
		System.out.println(strs[0]); //참조형은 값을 넣지 않으면 null로 자동 초기화됨
	}
}
