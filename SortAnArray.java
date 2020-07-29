// If input is as a string,cannot use addAll directly

package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAnArray
{
	public static void main(String[] args)
	{
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		List<String> values = new ArrayList<String>();
		
		
		for(String element:input)
		{
			values.add(element);
		}
		System.out.println(values);
		//To get single value
		System.out.println("2nd index value" + values.get(2));
		System.out.println("Before sorting" + values);
		Collections.sort(values);
		System.out.println("After sorting"+ values);
	}
}
