//Introduction to String

package strings_stringbuilders_arraylists;

import java.util.Arrays;
import java.util.Scanner;

public class IntroToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
		//string is not just an character array. it has some more information too. 
		
		//declaring and assigning a string
		//internally Hello is stored in heap and its memory address is stored in stack 		 
		String s = "Hello World";
		System.out.println(s);			//Hello World
	

		
 		//user input		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		
		//next() reads upto first spacebar		 
		String s1 = sc.next();	
		System.out.println(s1);
	
		
		
		//user input		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		
		//two next() reads upto second spacebar
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(s1);
		System.out.println(s2);
	
		
 		//user input		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		
		//nextLine() reads the whole line
		String s3 = sc.nextLine();
		System.out.println(s3);
	
		//user input		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");	
		
  		//reads two whole lines
		System.out.println("Enter a string: ");
		String s3 = sc.nextLine();
		System.out.println("Enter another string: ");
		String s4 = sc.nextLine();
		System.out.println(s3);
		System.out.println(s4);	
		
		//length of string
		String s = "Hello World";
		System.out.println(s);
		System.out.println("Length: " + s.length());		//11
	
		//pick one character
		String s = "Hello World";
		System.out.println(s.charAt(6));		//W
	
		//accessing each character of the string 
		String s = "Hello World";
		for(int i = 0; i < s.length(); i++)
			System.out.println(s.charAt(i));
			
		//There is no way to set the character of the string by using String class.If we want to change one character in the string for eg: Hello to Cello, 
		//we cannot do it by s.charAt(0) = 'C'; we will do it using StringBuilder class 
*/
		
		//use of substring - returns part of the string substring(i,j) returns the string from index i to j-1
		//where i is start index and j is end index
/*
		String s = "abcde";
		System.out.println(s.substring(0, 3));	//abc
		System.out.println(s.substring(0, 5));	//abcde
		System.out.println(s.substring(2, 4));	//cd
		System.out.println(s.substring(1, 1));	//blank space
		//System.out.println(s.substring(0, 6));	// java.lang.StringIndexOutOfBoundsException
		//System.out.println(s.substring(2, 1));	// java.lang.StringIndexOutOfBoundsException
		//if we do not provide end index, it will print all the characters from mentioned start index
		System.out.println(s.substring(0));	//abcde
		System.out.println(s.substring(1));	//bcde
		System.out.println(s.substring(4));	//e
	
		//printing all substrings of "abcde"
		String s = "abcde";
		for(int i = 0; i < s.length(); i++)			// <= s.length()-1
		{
			for(int j = i+1; j <= s.length(); j++)
			{
				System.out.println(s.substring(i, j));
			}
			System.out.println();
		}

		//string concatenation or string add
		//adding a word 
		String s1 = "Hello";
		String s2 = "World";
		String s3 = s1 + " " + s2;
		System.out.println(s3);
		
		//adding a single character and a number
		String s4 = "Hello";
		s4 += " ";
		s4 += "M";
		s4 += "r.";	
		s4 += 10;					//Hello Mr.10
		//s4 += 007;				//Hello Mr.7, starting 0 ignored 
		System.out.println(s4);	
		
		//first, Hello with 10 makes a string Hello10, then Hello10 adds with 20 makes Hello1020
		String s5 = "Hello";
		System.out.println(s5 + 10 + 20);	//Hello1020	not Hello30
		
		//first 10 and 20 are added as integer addition then added with Hello
		String s6 = "Hello";
		System.out.println(10 + 20 + s6);	//Hello30 not 1020Hello

		//split() method divides the string at the specified separator and returns an array of substrings.
	
		String s7 = "abc def ghi jkl mno";
		String[] parts = s7.split(" ");
		for(int i = 0; i < parts.length; i++)
			System.out.println(parts[i]);
		System.out.print(Arrays.toString(parts));	
*/	
		String s8 = "abc,def,ghi,jkl mno";
		String[] parts2 = s8.split(",");
		for(int i = 0; i < parts2.length; i++)
		{
			System.out.println(parts2[i]);
		}
		System.out.print(Arrays.toString(parts2)); //[abc, def, ghi, jkl mno]
			
	}

}
