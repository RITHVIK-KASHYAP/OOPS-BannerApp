/*
OOPSBAnner App UC5 - OOPS Banner Display

this clas demonstrates a simple java application that displays the object
oriented programming system OOPS acronym to the console

@author Rithvik
@version 5.0

*/
public class OOPSBannerApp {
   
    public static void main(String[] args) {
        String names[]=
        {"    *****        *****     ************ **************",
        "  **     **    **     **   **        ** **            ",
        " **       **  **       **  **        ** **            ",
        " **       **  **       **  ************ **************",
        " **       **  **       **  **                       **",
        "  **     **    **     **   **                       **",
        "    *****        *****     **           **************"};

        for(String name:names)
        {
            System.out.println(name);
        }
    }
}


