package  com.coreJava.collectionFarmwork;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo 
{

	public static void main(String[] args) 
	{
		TreeMap<String,String> hm=new TreeMap<>();
		hm.put("A","Amit");  
		hm.put("C","Vijay");  
		hm.put("B","Rahul"); 
		hm.put("E","Amit");
		//hm.put(null,"Kaustubh");
		//hm.put(null, "ashish");
		hm.put("D",null);
		
		hm.put("F",null);
		
		// cannot have null key.
		// can have multiple null values.
		
		System.out.println(hm);

		System.out.println("------ Size of List ---------- = \n"+hm.size());

		System.out.println("--------------------------------------------------------------");
		System.out.print("\n------- If Available contains return true otherwise false ----------\n");
		System.out.println("containsKey(M) "+hm.containsKey("M"));
		System.out.println("containsKey(E) "+hm.containsKey("E"));
		System.out.println("containsValue(null) " +hm.containsValue(null));

		System.out.print("\n--------------------------------------------------------------\n");
		System.out.println("entrySet "+hm.entrySet());
		System.out.println("firstKey "+hm.firstKey());
		System.out.println("firstEntry "+hm.firstEntry());
		System.out.println("lastKey "+hm.lastKey());
		System.out.println("lastEntry "+hm.lastEntry());
		System.out.print("\n--------------------------------------------------------------\n");

		System.out.println(hm.values());
		System.out.println(hm.keySet());

		System.out.println("Remove A = "+hm.remove("A"));
		System.out.println(" "+hm.keySet());
		System.out.println(" "+hm.values());
		System.out.println("Replace A key to Rajendra = "+hm.replace("A","Rajendra"));
		System.out.println("Replace B key to Rajendra = "+hm.replace("B","Rajendra"));
		System.out.println(" hm "+ hm);
		System.out.println("get Value B = "+hm.get("B"));

		System.out.print("\n--------------------------------------------------------------\n");

		System.out.println(hm);
		
		
		System.out.println("--------------------- featching data from Map ---------------------");
		Set<String> strobj= hm.keySet();
		Iterator itrobj = strobj.iterator();

		while (itrobj.hasNext())
		{
			String key = itrobj.next().toString();
			System.out.println("Key : "+key +" Value : "+hm.get(key));
			
			
		}
		System.out.println("--------------------- featching data from Map ---------------------");
			
	
		
		System.out.println("clear all list  = ");
		hm.clear();

		System.out.println(hm);
		hm.put("B","Bye ");
		System.out.println(hm);

		
	}

}

//It contains only unique key elements.
//It cannot have null key but can have multiple null values.
//Maintains ascending order w.r.t. key. 

/*{A=Amit, B=Rahul, C=Vijay, D=null, E=Amit, F=null}
------ Size of List ---------- = 
6
--------------------------------------------------------------

------- If Available contains return true otherwise false ----------
containsKey(M) false
containsKey(E) true
containsValue(null) true

--------------------------------------------------------------
entrySet [A=Amit, B=Rahul, C=Vijay, D=null, E=Amit, F=null]
firstKey A
firstEntry A=Amit
lastKey F
lastEntry F=null

--------------------------------------------------------------
[Amit, Rahul, Vijay, null, Amit, null]
[A, B, C, D, E, F]
Remove A = Amit
 [B, C, D, E, F]
 [Rahul, Vijay, null, Amit, null]
Replace A key to Rajendra = null
Replace B key to Rajendra = Rahul
 hm {B=Rajendra, C=Vijay, D=null, E=Amit, F=null}
get Value B = Rajendra

--------------------------------------------------------------
{B=Rajendra, C=Vijay, D=null, E=Amit, F=null}
--------------------- featching data from Map ---------------------
Key : B Value : Rajendra
Key : C Value : Vijay
Key : D Value : null
Key : E Value : Amit
Key : F Value : null
--------------------- featching data from Map ---------------------
clear all list  = 
{}
{B=Bye }
*/