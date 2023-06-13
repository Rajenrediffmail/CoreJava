package com.coreJava.pakageConcept.package1package2;

import com.coreJava.pakageConcept.package1.Display;
import  com.coreJava.pakageConcept.package2.CalculateOfArea_Simple_Using_Interface2;
/**
 * Created by raju on 27/1/17.
 */
class CalculateOfArea_Simple_Using_Interface
{
    public static void main (String arg[])
    {
        Display o1 = new Display();
        o1.dispMySelf1();
        //-----------------------------------------

        CalculateOfArea_Simple_Using_Interface2 o2 =    new CalculateOfArea_Simple_Using_Interface2();
            o2.areaOfCircle2();
            o2.areaOfSquare2();
            o2.areaOfRectangle2();
    //---------------------------------------------------
        o1.dispMySelf2();


    }
}
