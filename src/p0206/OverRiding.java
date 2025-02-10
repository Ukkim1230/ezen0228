package p0206;


class Father {
	
			static void work(int n1){
		System.out.println("아빠가 일합니다");
	}
}

public class OverRiding extends Father{

	public static void main(String[] args) {
		OverRiding o = new OverRiding();
		Father f = new Father();
		 f = new OverRiding();
		
		

	}
}
