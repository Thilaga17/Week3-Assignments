// Use SET interface to remove duplicates 

package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesCharArray 
{
	public static void main(String[] args)
	{
		char[] input = {'P','a','y','P','a','l','I','n','d','i','a'};
		
		Set<Character> values = new LinkedHashSet<Character>();
		
		for (Character eachVal : input)
		{
			System.out.println(values.add(eachVal));// Gives boolean value if it is duplicate / unique
		}
		System.out.println(values);					// This print the values as an array
		
		for (Character e : values)
		{
			System.out.println(e);					// This print the values as a character.
		}
	}

}
