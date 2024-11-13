package WEEK2;

public class UserOutput {
    public static void main(String[] args) {
        // Standard output / terminal output 
        //continuous printing 
        System.out.print("This ");
        System.out.print("is ");
        System.out.print("Java\n ");

        //line break after print
        System.out.println("Next print will stsrt from next line ");

        //Print using formatting 
        //%f floating point , %d intregal %s string (any)
        System.out.printf("temperature %f degree celsius",30.22);
        //can use multiple placeholder
        System.out.printf("Name %s ,Age %d, Weight %f","Mero nam",30,75.44);
        //the arrangement of the placeholder and value given after string must match
        //eg: 1 %s String,2 %d integer,3 %f float 

    }
    
}
