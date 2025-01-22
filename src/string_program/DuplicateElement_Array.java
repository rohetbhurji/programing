package string_program;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement_Array {

	public static void main(String[] args) {

		String s[]= {"java","c","java","php","c#","C","c"};
		
		Set<String> st= new HashSet<String>();
		for (String s1:s) {
			if(st.add(s1)==false) {
				System.out.println(s1);
			}
		}
	}

}
