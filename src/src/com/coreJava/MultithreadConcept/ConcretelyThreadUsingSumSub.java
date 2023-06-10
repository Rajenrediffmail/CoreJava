package com.coreJava.MultithreadConcept;

class  Sum extends Thread
{
    int a,b,t;

    public void set(int a,int y)
    {
        this.a = a;   // this used here to differncate local method varialbe to class variable
        b = y;
    }
    public void run()
    {
        t = a+b;
        System.out.println("\nSum = "+t);
    }
}
class  Sub extends Thread
{
    int a,b,t;
    public void set(int q,int y)
    {
        a = q;
        b = y;
    }
    public void run()
    {
        t = a-b;
        System.out.println("\nSum = "+t);
    }
}

public class ConcretelyThreadUsingSumSub 
{
        public static void main(String args[]) throws Exception
        {
        Sum o1 = new Sum();
        Sub o2 = new Sub();
        o1.set(20,5);
        o2.set(20,5);
        o1.start();
        o2.start();
        
        o1.join();   // its main thread wait to complete the process of thread o1
        o2.join();   // its main thread wait to complete the process of thread o2
      
        System.out.println("Bye");
        //    Thread t1 = new Thread(o1);  using At implement Runnable the casting is required.
        }
}
