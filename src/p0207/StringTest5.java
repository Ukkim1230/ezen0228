package p0207;

public class StringTest5 {
	public static void main(String[]args) {
		String str = "1,2,3,4,5,6,8";
		//replace를 사용하지 않고
		//","를 모두 제거 한 후에
		//str의 값을 출력해주세요		
		String[] numbers = str.split(",");
		for(int i=0;i<numbers.length;i++) {
			String tarNum = numbers[i];
			System.out.print(tarNum);
		}
	}
}
