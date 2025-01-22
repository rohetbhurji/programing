package string_program;

public class FFF {

	public static void main(String[] args) {
		int ar []= {1,2,2,4,5,6,5,1};
		int count=1;
		// print the duplicates number 
		
		for(int i=0; i<ar.length;i++) {
			 boolean alreadyCounted = false;
			for(int j=i+1; j<ar.length;j++)
			{
			if(ar[i]==ar[j]) {
				 alreadyCounted = true;
				 break;
			}}
			if(!alreadyCounted) {
				for (int j = i + 1; j < ar.length; j++) {
                    if (ar[i] == ar[j]) {
                        count++;
                    }
                }
				
                System.out.println("Element " + ar[i] + " occurs " + count + " times.");
			}

		}
	}}