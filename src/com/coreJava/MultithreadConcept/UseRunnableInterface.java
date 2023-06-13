package com.coreJava.MultithreadConcept;


public class UseRunnableInterface implements Runnable
{

	@Override
	public void run() 
	{
		
		for(int i=0; i<=5;i++)
		{
			for (int j = 0; j < i; j++) {
				
				System.out.print(" * ");
			}
			
		System.out.println();
		}
	}

}


class ExecutionRunnable{

	public static void main(String args[]) throws Exception
	{
		System.out.println("I am starting main");
		UseRunnableInterface obj= new UseRunnableInterface();
		//obj.star // no start method in runnable but in thread has constructor for handdle this and get start method
		// start method only allowed to create multiple thread
	
	Thread theradObj = new Thread(obj,"Star pattern Thread");
	
	System.out.println("Thread alive before Start : "+theradObj.isAlive());
	System.out.println("-----------------------");
	theradObj.start(); // here create thread for the object  / one main thread is also going on it self
	System.out.println("Thread alive AfterStart : "+theradObj.isAlive());
	theradObj.join();  // this join hold main thread untill complete star pattern thread.
	System.out.println("-----------------------");
	
	
	System.out.println("Thread name  : "+theradObj.getName());
	System.out.println("Thread alive after complete  : "+theradObj.isAlive());
	
	}
}