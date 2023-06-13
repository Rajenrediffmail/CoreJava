package com.coreJava.InnerClassAndInterfaces;


//anonymous is the call created at the time of object creation
//anonymous interface is also same we have define method at time of obj creation as below


interface LambdaExpressionTest{
	
	void testLmadaExp();
}

class HelpInnerCreating
{

    void m1()
    {
        System.out.print("\nI am Inner Helper ");
    }

}

class Outer3 extends HelpInnerCreating
{
    int a=10;
            void m2()
            {
                System.out.print("\n Hello");
            }
//-----------------------------------------------------------------
  HelpInnerCreating inner = new HelpInnerCreating()
{
      public void m1()  // Anonymous must be Overridden Method used.
        {
            System.out.print("\nI am Inner "+a);
        }
      
      
    };
            
            // using lambda expression only must be used for functional interface
            
            LambdaExpressionTest lambda_ExpressionUse = () -> { System.out.print("\nusing lambda expression only must be used for functional interface "+a);};

                
//----------------------------------------------------------------

}

public class AnonymousClass
{
    public static void main(String args[])
    {
        Outer3 obj1 = new Outer3();
        obj1.inner.m1();

        obj1.lambda_ExpressionUse.testLmadaExp();  // calling lambda expression
        
        
    }
}


// I am Inner 10