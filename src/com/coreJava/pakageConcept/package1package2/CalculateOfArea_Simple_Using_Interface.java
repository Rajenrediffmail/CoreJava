package com.coreJava.pakageConcept.package1package2;

import com.coreJava.pakageConcept.package1.Display;
import com.coreJava.pakageConcept.package2.CalculateOfArea_Simple_Using_Interface;


/**
 * Created by raju on 27/1/17.
 */
class CalculateOfArea_Simple_Using_Interface1
{
    public static void main (String arg [])
    {
        Display o0 = new Display();
        o0.dispMySelf1();
        //---------------------------------------------------------------------------------
        CalculateOfArea_Simple_Using_Interface o1 = new CalculateOfArea_Simple_Using_Interface();
        o1.areaOfCircle();
        o1.areaOfSquare();
        o1.areaOfRectangle();
        //----------------------------------------------------------
        o0.dispMySelf2();
    }
}
