package p0206;

public class StringTest6 {

	public static void main(String[]args) {
		String str = "korea";
		System.out.println(str.length()); //5
		str = str.toUpperCase(); 
		System.out.println(str); // KOREA
		str = str.toLowerCase(); 
		System.out.println(str); // korea
		
		boolean startK = str.startsWith("K");
		System.out.println(startK);
		
		boolean endA  = str.endsWith("a");
		System.out.println(endA);
		
		str = "k,o,r,e,a";
		String[] strs = str.split(",");
		
		for(int i = 0;i<strs.length;i++) {
			System.out.println("strs["+i+"]:"+strs[i]+",");
		}
		
		str = "k.o.r.e.a";
		strs = str.split("\\."); // | . * 는 문자 앞에 \\ 써야함
		
		str = "";
		boolean isBlank = str.isBlank();
		System.out.println(isBlank);
		boolean isEmpty= str.isEmpty(); // 똑같음
		System.out.println(isEmpty);
		
	}
}
