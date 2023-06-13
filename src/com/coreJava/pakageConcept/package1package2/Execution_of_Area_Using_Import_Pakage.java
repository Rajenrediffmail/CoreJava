package com.coreJava.pakageConcept.package1package2;

// Import package
import com.coreJava.pakageConcept.package1.Display;
import com.coreJava.pakageConcept.package1.AreaOfCircleImportPakDemo2;
import com.coreJava.pakageConcept.package1.AreaOfSquareImportPakDemo;
import com.coreJava.pakageConcept.package1.AreaOfRectangleImportPakDemo2;



public class Execution_of_Area_Using_Import_Pakage
{
    public static void main(String args [])
    {
            Display o0 = new Display();
            o0.dispMySelf1();

        AreaOfCircleImportPakDemo2 o1 = new AreaOfCircleImportPakDemo2();

                    o1.areaOfCircle();  //call this method From Different package.
        //-----------------------------------------------------------------

        AreaOfSquareImportPakDemo o2 = new AreaOfSquareImportPakDemo();

                    o2.areaOfSquare();  //call this method From Different package.
        //---------------------------------------------------------------------------
        AreaOfRectangleImportPakDemo2 o3 = new AreaOfRectangleImportPakDemo2();

                    o3.areaOfRectangle();   //call this method From Different package.
        //---------------------------------------------------------------------------
            o0.dispMySelf2();
    }
}
