//input: aaabbcccddaeef
//Exprected output1: abcdaef
//Exprected output2: a3b2c3d2ae2f

package strings_stringbuilders_arraylists;

import java.util.Scanner;

public class StringCompression {

	public static String compression1(String str){

		//String s = str.charAt(0);	//Type mismatch: cannot convert from char to String
		//either you can do using substring
		//String s = str.substring(0,1);	//0th character is added in the string in the beginning
		//or, convert the character into string by adding an empty string
		String s = str.charAt(0) + "";
		
		for(int i = 1; i < str.length(); i++)	//loop starts from first character
		{
			char curr = str.charAt(i);		//current character
			char prev = str.charAt(i-1);	//previous character
			
			if(curr != prev)		//if current character is different from previous character, then add it to the string
			{
				s += curr;
			}
		}
		return s;
	}

	public static String compression2(String str){

		String s = str.substring(0,1);
		int count = 1;
		for(int i = 1; i < str.length(); i++)
		{
			char curr = str.charAt(i);
			char prev = str.charAt(i-1);
			
			//if current character is same as previous character, then increase count
			if(curr == prev)
			{
				count++;
			}
			//if current character is not same as previous character, then atfirst add count to the existing string and reset the count to 1 
			else
			{
				//for same characters, count is printed but for different single character count is not printed eg: aaabcc - a3bc2 //for b, 1 is not printed
				
				if(count > 1)
				{
					 s = s + count;	//So, add count to the string when count > 1
					 count = 1;		//then reset count to 1
				}
				//if count is 1, then do not add 1 to the string, add only the character to the string
				s += curr;
			
			}
						
		}
		//when coming out of the loop, if there is any count present which is greater than 1, then add it
		if(count > 1)
		{
			 s = s + count;	//So, add count to the string when count > 1
			 count = 1;		//then reset count to 1
		}
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));

	}

}
