package  com.coreJava.collectionFarmwork;

import java.util.ArrayList;

public class GenericsAndNonGenerics
{

	public static void main(String[] args)
	{
		//Non generic

		ArrayList l1=new ArrayList(); 
		// always use generic concept because we are dealing with warraper class
		// at the time of converting warrper to premmative(call unboxing) erroer occer in this secution
		l1.add("abc");
		l1.add(102);
		l1.add("PQR");
		l1.add(102);
		l1.add(104);

		System.out.println("Non generics "+l1);

		// generic	-	String
		ArrayList<String> l2=new ArrayList<String>();
		l2.add("abc");
		l2.add("xyz");
		l2.add("PQR");
		l2.add("efg");

		System.out.println("Generics  "+l2);

		//generic	-	Integer
		ArrayList<Integer> l3=new ArrayList<Integer>();
		l3.add(234);
		l3.add(121);
		l3.add(313);
		l3.add(587);

		System.out.println("Generics "+l3);
	}

}
/*
Non generics [abc, 102, PQR, 102, 104]
Generics  [abc, xyz, PQR, efg]
Generics [234, 121, 313, 587]*/
