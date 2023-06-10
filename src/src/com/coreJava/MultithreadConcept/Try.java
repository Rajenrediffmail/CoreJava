package com.coreJava.MultithreadConcept;


class  Logic
{
public synchronized void l() // after Synchronized here use this world this is method level syn..use at a time one thread other thread is wating
 {
     for(int i = 1 ; i<=10; i++)
         {
             try
             {
                 System.out.print("\n============  Table of :  "+i+"  ===================== ");
                 Thread.sleep(3000);

             }
             catch (InterruptedException e)
             {
                 e.printStackTrace();
             }
             for (int j=1 ; j<=10; j++)
             {
                 try
                 {
                     System.out.print("\n  ============  "+ i +" ==================>  "+(i*j));
                     Thread.sleep(1000);

                 }
                 catch (InterruptedException e)
                 {
                     e.printStackTrace();
                 }

             }
     }
 }

}
public class Try implements Runnable
{
    @Override
    public void run()
    {
        Logic l = new Logic();
        l.l();
    }
    public static void main(String args[])
    {
            Try obj = new Try();       // This boj usd to pass referances to Thread and gating all Thread Method in runnable implements

            Thread t1 = new Thread(obj,"Table Number");

                        t1.start();

        System.out.print("\n  Thread 1 name : "+t1.getName());
    }
}
/*

  Thread 1 name : Table Number
============  Table of :  1  =====================
  ============  1 ==================>  1
  ============  1 ==================>  2
  ============  1 ==================>  3
  ============  1 ==================>  4
  ============  1 ==================>  5
  ============  1 ==================>  6
  ============  1 ==================>  7
  ============  1 ==================>  8
  ============  1 ==================>  9
  ============  1 ==================>  10
============  Table of :  2  =====================
  ============  2 ==================>  2
  ============  2 ==================>  4
  ============  2 ==================>  6
  ============  2 ==================>  8
  ============  2 ==================>  10
  ============  2 ==================>  12
  ============  2 ==================>  14
  ============  2 ==================>  16
  ============  2 ==================>  18
  ============  2 ==================>  20
============  Table of :  3  =====================
  ============  3 ==================>  3
  ============  3 ==================>  6
  ============  3 ==================>  9
  ============  3 ==================>  12
  ============  3 ==================>  15
  ============  3 ==================>  18
  ============  3 ==================>  21
  ============  3 ==================>  24
  ============  3 ==================>  27
  ============  3 ==================>  30
============  Table of :  4  =====================
  ============  4 ==================>  4
  ============  4 ==================>  8
  ============  4 ==================>  12
  ============  4 ==================>  16
  ============  4 ==================>  20
  ============  4 ==================>  24
  ============  4 ==================>  28
  ============  4 ==================>  32
  ============  4 ==================>  36
  ============  4 ==================>  40
============  Table of :  5  =====================
  ============  5 ==================>  5
  ============  5 ==================>  10
  ============  5 ==================>  15
  ============  5 ==================>  20
  ============  5 ==================>  25
  ============  5 ==================>  30
  ============  5 ==================>  35
  ============  5 ==================>  40
  ============  5 ==================>  45
  ============  5 ==================>  50
============  Table of :  6  =====================
  ============  6 ==================>  6
  ============  6 ==================>  12
  ============  6 ==================>  18
  ============  6 ==================>  24
  ============  6 ==================>  30
  ============  6 ==================>  36
  ============  6 ==================>  42
  ============  6 ==================>  48
  ============  6 ==================>  54
  ============  6 ==================>  60
============  Table of :  7  =====================
  ============  7 ==================>  7
  ============  7 ==================>  14
  ============  7 ==================>  21
  ============  7 ==================>  28
  ============  7 ==================>  35
  ============  7 ==================>  42
  ============  7 ==================>  49
  ============  7 ==================>  56
  ============  7 ==================>  63
  ============  7 ==================>  70
============  Table of :  8  =====================
  ============  8 ==================>  8
  ============  8 ==================>  16
  ============  8 ==================>  24
  ============  8 ==================>  32
  ============  8 ==================>  40
  ============  8 ==================>  48
  ============  8 ==================>  56
  ============  8 ==================>  64
  ============  8 ==================>  72
  ============  8 ==================>  80
============  Table of :  9  =====================
  ============  9 ==================>  9
  ============  9 ==================>  18
  ============  9 ==================>  27
  ============  9 ==================>  36
  ============  9 ==================>  45
  ============  9 ==================>  54
  ============  9 ==================>  63
  ============  9 ==================>  72
  ============  9 ==================>  81
  ============  9 ==================>  90
============  Table of :  10  =====================
  ============  10 ==================>  10
  ============  10 ==================>  20
  ============  10 ==================>  30
  ============  10 ==================>  40
  ============  10 ==================>  50
  ============  10 ==================>  60
  ============  10 ==================>  70
  ============  10 ==================>  80
  ============  10 ==================>  90
  ============  10 ==================>  100
 */