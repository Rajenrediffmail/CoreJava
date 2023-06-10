package com.coreJava.InnerClassAndInterfaces;

/**
 * Created by WrajendraG on 3/11/2017.
 */

class Outer
{
  static   int a=10;

    void m1()
    {
        System.out.print("I am Outer ");
    }

    static class Inner    // we can't create static outer class inner class purpose always only help to outer class
    {
        void m2()
        {
            System.out.print("I am Inner "+a);
        }
    }

}
public class StaticInnerClass
{
    public static void main(String args[])
    {


        Outer.Inner obj =new Outer.Inner();

            obj.m2();
    }
}
/*
I am Inner 10
*/