package  com.coreJava.collectionFarmwork;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(123);
		lhs.add(234);
		lhs.add(345);
		lhs.add(123); 	//No duplication.
		lhs.add(null);	//accepts null value.
		
		System.out.println(lhs);
		
		Iterator<Integer> itr=lhs.iterator();
		
		System.out.println("\nActual way of printing array:");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//does maintain sequential order.
		

		System.out.println("Size : "+lhs.size());
		
		System.out.println("Contains : "+lhs.contains("Messi"));
		
		System.out.println("Remove :"+lhs.remove(234));
		
		System.out.println(lhs);
		
		lhs.clear();
		
		System.out.println(lhs);
	}

}

/*
[123, 234, 345, null]

Actual way of printing array:
123
234
345
null
Size : 4
Contains : false
Remove :true
[123, 345, null]
[]*/
