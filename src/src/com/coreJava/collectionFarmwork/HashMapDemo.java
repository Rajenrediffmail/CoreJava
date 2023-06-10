package  com.coreJava.collectionFarmwork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args)
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(100,"Messi"); // contains unique index
		hm.put(108,"Messi");
		hm.put(104,"Vijay");
		hm.put(102,"Rahul");
		hm.put(103,"Amit");	//Duplication is allowed
		hm.put(null,"Kaustubh");
		hm.put(null,"Raj");
		//hm.put(null,"Satish");
		hm.put(105,null);
		hm.put(106,null);

		// can accept one null key
		// Can have multiple null values
		System.out.println(hm);

		System.out.println(hm.size());

		System.out.println("Get Value 103:"+hm.get(103));

		System.out.println(hm.remove(null));

		System.out.println(hm);
		
		System.out.println("--------------------- featching data from Map ---------------------");
		Set<Integer> strobj= hm.keySet();
		Iterator itrobj = strobj.iterator();

		while (itrobj.hasNext())
		{
			int key = Integer.parseInt(itrobj.next().toString());
			System.out.println("Key : "+key +" Value : "+hm.get(key));
			
		}
		System.out.println("--------------------- featching data from Map ---------------------");
			
			
		hm.clear();

		System.out.println(hm);
	}

}

/*{null=Raj, 100=Messi, 102=Rahul, 103=Amit, 104=Vijay, 105=null, 106=null, 108=Messi}
8
Get Value 103:Amit
Raj
{100=Messi, 102=Rahul, 103=Amit, 104=Vijay, 105=null, 106=null, 108=Messi}
--------------------- featching data from Map ---------------------
Key : 100 Value : Messi
Key : 102 Value : Rahul
Key : 103 Value : Amit
Key : 104 Value : Vijay
Key : 105 Value : null
Key : 106 Value : null
Key : 108 Value : Messi
--------------------- featching data from Map ---------------------
{}
*/