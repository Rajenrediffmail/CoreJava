package com.coreJava.MultithreadConcept;


public class UseRunnableInterfaceUsingLambdaExperation
{

	public static void main(String args[]) throws Exception
	{
		System.out.println("I am starting main");

/*		
 * One way 
 * 
	Runnable theradObj = () -> {
			for(int i=0; i<=5;i++)
			{
				for (int j = 0; j < i; j++) 
				{
					
					System.out.print(" * ");
				}
				
			System.out.println();
			}
			};
		
			Thread obj = new Thread(theradObj , "Pattern Thread");

			obj.start();
			
			*/
		
			Thread obj = new Thread(() -> {
				
												for(int i=0; i<=5;i++)
												{
													for (int j = 0; j < i; j++) 
													{
														
														System.out.print(" * ");
													}
													
												System.out.println();
												}
											}
										, "Pattern Thread"); //it's buty of lambda expression using anonymous interface


			obj.start();
			
	}	
}
