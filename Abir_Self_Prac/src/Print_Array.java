import java.util.Scanner;
public class Print_Array {

		public static void main(String[] args) {
			int n,x, flag=1, loc=0;
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter no. of elements you want in the array");
			n=s.nextInt();
			int a[] = new int[n];
			System.out.println("Enter all the elements");
			for (int i = 0; i < n; i++) {
				a[i]=s.nextInt();
			}
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
		}
}
