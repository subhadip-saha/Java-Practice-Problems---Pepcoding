//Print all Palindromic Substrings 

package problems_on_strings;

import java.util.Scanner;

public class PalindromicSubstrings {

	public static void solution(String str) 
	  {

		  for(int i = 0; i < str.length(); i++)
		  {
			  for(int j = i + 1; j <= str.length(); j++)
			  {
				  if(isPalindrome(str.substring(i, j)))
					{
					  System.out.println(str.substring(i, j));
					}
			  }
		  }
	  }
	
	public static boolean isPalindrome(String str)
	{
		int i = 0;
		int j = str.length() - 1;
		while(i <= j)
		{
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(j);
			
			if(ch1 != ch2)
			{
				return false;
			}
			else
			{
				i++;
				j--;
			}	
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}
}

/*
Enter a string: 
abccbc
a
b
bccb
c
cc
c
cbc
b
c
*/
