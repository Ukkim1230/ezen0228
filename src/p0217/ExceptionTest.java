package p0217;

/*
 * Exception, RuntimeException
 */
class MyException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MyException(String str) {
		super(str);
	}
}

public class ExceptionTest {
	public static int parseInt(String str) throws MyException {
		try {
		Integer.parseInt(str);
		}catch(Exception e) {
			throw new MyException("숫자를 쓰세요");
		}
		return 0;
	}

	public static void main(String[] args) {
		String str = "삼십삼";
		try {
			int num = parseInt(str);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
