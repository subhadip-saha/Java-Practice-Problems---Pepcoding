//comparing String class and StringBuilder class in terms of time and space

package strings_stringbuilders_arraylists;

public class StringBuilderPerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//As string instance is immutable, so each updation will result a new string in new location every time.		
		System.out.println("------------using String class-------------");
		//although it seems only one character is added with hello, so one operation is done. But that is not correct.
		//In another location hello is copied and then g is added to it, so total 6 characters went to the new location, so 6 operations
		//which makes the whole operation very slow.
		String str = "hello";
		str += 'g';
		System.out.println(str); //hellog
		
		int n = 10000;		//So, of for n = 10^5 = 100000, 10^10 operations are done, not 10^5
		long start1 = System.currentTimeMillis(); 	//start time before work starts
		
		String s = "";
		for(int i = 0; i <= n; i++)		//it is of n^2 order of time
		{
			s += i;		
		}
		
		long end1 = System.currentTimeMillis();  //end time after work done
		long duration1 = end1 - start1;   //it takes 211 ms
		
		System.out.println(duration1);		//this will not give the result quickly
		//for more value of n, you may get Time Limit Exceeded
 	
		System.out.println();
		System.out.println("------------using StringBuilder class-------------");
		
		//Same work is done in using StringBuilder class
		
		//here in the same memory location where hello is present, g is added with it. So, it is much faster. For adding one character, we need only one operation
		StringBuilder sb = new StringBuilder("hello");
		sb.append('g');				
		System.out.println(sb);		//hellog
		
		int n2 = 10000;		
		long start2 = System.currentTimeMillis(); 	
		
		StringBuilder sb2 = new StringBuilder("");
		for(int i = 0; i <= n2; i++)		//it is not of n^2 order of time
		{
			sb2.append('i');	
		}
		
		long end2 = System.currentTimeMillis();  
		long duration2 = end2 - start2;		//it takes only 2 ms
		
		System.out.println(duration2);
		//now it will easily do n = 10^5 or ^6 or ^7 ... , you rarely get TLE error, you might get Memory Exceeded as your system h/w is limited. 
	}

}
