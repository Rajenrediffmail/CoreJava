package com.coreJava.overloadingConcept;

class Class_For_Test_Constructor
{
    Class_For_Test_Constructor()
    {
        this(20,58);// Rule 1 Initialization is first must ither Compile time Error gives.
        System.out.print("\n =====================================");
        System.out.print("\n I am Default Constructor ");
        System.out.print("\n null");
        System.out.print("\n =====================================");

    }
    Class_For_Test_Constructor(int x)
    {
        System.out.print("\n =====================================");
        System.out.print("\n I am One Integer parametrized constructor ");
        System.out.print("\n int x = "+x);
        System.out.print("\n =====================================");

    }
    Class_For_Test_Constructor(int a, int b)
    {

        this(400);
        // "this();" you can't call this Because he come from there  and again go there infinite loop cycle follow second rule this. avoid this.
        System.out.print("\n =====================================");
        System.out.print("\n I am Two Parametrized constructor ");
        System.out.print("\nint x = "+a +" int y = "+b);
        System.out.print("\n =====================================");
    }



}
public class Overloading_Constructor_Level
{
    public static void main(String[] args)
    {

        Class_For_Test_Constructor o = new Class_For_Test_Constructor();
        //Only call Default Constructor here but using "this" you call all constructors.
        // 1. go to Defult
        // 2. using "this(20,58);" you go to two Parametrized constructor.
        // 3. but there also"this(400);" keyword that means prog. go to one integer parametized constructer.
        // 4. and go back one by one step after execution.

    }


}
