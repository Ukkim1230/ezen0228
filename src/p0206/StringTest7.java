package p0206;

public class StringTest7 {
	public static void main(String[]args) {
		String str = "1,2,3,4,5,6,7,8,9,10";
		
		//","를 기준으로 str을 분리하여 int[num]에 저장후 nums 출력
		String strings[] = str.split(",");
		
		for (int i=0;i<strings.length;i++) {
			int nums[] = new int[strings.length];
			nums[i] = Integer.parseInt(strings[i]);
			System.out.println(nums[i]);
			}
		
	}
}
