//Usages of different functions of StringBuilder

package strings_stringbuilders_arraylists;

public class StringBuilderUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instance of String is immutable and hence its performance is degraded
		//to remove those problems in String,  StringBuilder class is used.It improves the performance.
		StringBuilder sb = new StringBuilder("hello");
		
		//print
		System.out.println(sb);			//hello
		
		//we can take out/access a character in a String class but cannot set or change any character in existing string.
		//but in StringBuilder class we can do both of them.		
		
		//get character
		char ch = sb.charAt(0);
		System.out.println(ch);			//h
		
		//update/set character
		sb.setCharAt(0, 'c');			//the character at 0th index changed with c
		System.out.println(sb);			//hello is changed to cello
		
		//insert character
		sb.insert(2, 'y');			//the character y is inserted at 2nd index
		System.out.println(sb);		//cello is changed to ceyllo
		
		//delete character
		sb.deleteCharAt(2);			//the character at 2nd index is deleted
		System.out.println(sb);		//ceyllo is changed to cello
		
		//append character
		sb.append('g');				//add g at last position of the string
		System.out.println(sb);		//cellog
		
		//length
		System.out.println(sb.length());	//6
	}	

}
