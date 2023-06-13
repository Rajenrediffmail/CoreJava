package com.coreJava.pakageConcept.package1package2;


import com.coreJava.pakageConcept.package2.Access_Modifier_Same_package_Derived_Class;
import com.coreJava.pakageConcept.package1.Access_Modifier_Other_Package_Derived_Class;


public class Access_Modifier_Other_Package_Execution_Logic
{
    public static void main(String  args[])
    {
        Access_Modifier_Same_package_Derived_Class o1 = new Access_Modifier_Same_package_Derived_Class();

            o1.display_Derived();

//-----------------------------------------------------------------------------------------------
        Access_Modifier_Other_Package_Derived_Class o2 = new Access_Modifier_Other_Package_Derived_Class();

            o2.display_Derived_Importing_Extends();

//-------------------------------------------------------------------------------------------------

            // NOTE =====> HERE ONLY PUBLIC ACCESS MODIFIER IS ALLOWED.

    }


}
/*
* -----------------------------------------------------------
-----------------------------------------------------------
 I am default Form Same_package_Derived class n2 = 20
-----------------------------------------------------------
 I am protected Form Same_package_Derived class n3 = 30
-----------------------------------------------------------
 I am public Form Same_package_Derived class n4 = 40
-----------------------------------------------------------
-------------------------------------------------------------------
------------------------------------------------------------------
-------------------------------------------------------------------
 I am protected Form Derived_Importing_Extends class n3 = 30
-------------------------------------------------------------------
 I am public Form Derived_Importing_Extends class n4 = 40
-------------------------------------------------------------------

* */