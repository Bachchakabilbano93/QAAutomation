
public class TryCatch {

	public static void main(String[] args) {
		try {
//			int i=10/1:
			int i=10/0;
			System.err.println(i);
		}
		catch(ArithmeticException ex) {
			System.err.println("Error : " + ex.getMessage());
		}

	}

}
