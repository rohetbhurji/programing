package string_program;

public class Revev_String {

	public static void main(String[] args) {
		String s="ROHET";
		String rev="";
		for (int i=s.length()-1;i>=0;i--) {
			s.charAt(i);
			rev= rev+s.charAt(i);
		}
		System.out.println(rev);
		
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		
	}

}
