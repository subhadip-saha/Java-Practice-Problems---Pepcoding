/*
1. You are given a string that contains only lowercase and uppercase alphabets. 
2. You have to toggle the case of every character of the given string.
Sample Input - pepCODinG
Sample Output - PEPcodINg
 */

package strings_stringbuilders_arraylists;

import java.util.Scanner;

public class ToggleCase {

//In ASCII, 'e', 'a' theke joto ta durey, 'e' o 'A' theke tototai durey, because 'a' - 'z' and 'A' - 'Z' aksathe thake, majhe ar kono character thake na
//'a' to 'z' = 97 to 122 and 'A' to 'Z' = 65 to 90	
//So, 'e' - 'a' = 'E' - 'A'  	
// => 'e'	= 'a' + 'E' - 'A' i.e. 'lc' =  'a' + 'uc' - 'A' where lc- lower case character uc - upper case character
// => 'E'	= 'A' + 'e' - 'a'	i.e. 'uc' =  'A' + 'lc' - 'a'
		public static String toggleCase(String str){

			//Now we need to change the characters of the string, So, it won't happen with String class
			//use StringBuilder class.
			
			StringBuilder sb = new StringBuilder(str);
			
			for(int i = 0; i < str.length(); i++)
			{
				char ch = str.charAt(i);
			
				if(ch >= 'a' && ch <= 'z')
				{
					char UC = (char)('A' + ch - 'a');
					sb.setCharAt(i, UC);
				}
				if(ch >= 'A' && ch <= 'Z')
				{
					char lc = (char)('a' + ch - 'A');
					sb.setCharAt(i, lc);
				}
			}
			
			return sb.toString();
		}
		public static void main(String[] args) {
			
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter string: ");
			String str = scn.next();
			System.out.println(toggleCase(str));
		}
		
	}


