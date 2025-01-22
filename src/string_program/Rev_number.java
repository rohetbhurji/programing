package string_program;

public class Rev_number {

	public static void main(String[] args) {


			int n=1234;
			int rev=0;
			int n1=1234;
			while (n!=0) {
				rev= rev*10+n%10;
				n=n/10;
				
			}
			System.out.println(rev);
			
			System.out.println("@@@@@@@@@@@@");
			// 2nd way.......................
			 StringBuffer sb = new StringBuffer(String.valueOf(n1));
		        System.out.println("Reversed using StringBuffer: " + sb.reverse());
			
		}
	}

