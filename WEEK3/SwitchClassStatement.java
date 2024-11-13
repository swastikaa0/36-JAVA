package WEEK3;

public class SwitchClassStatement {
    public static void main (String[] args){
        int day =5;
        switch (day){
            //day ==0
            case 0:
              System.out.println("Sunday");
              break;
            case 1:
              System.out.println("Monday");
            case 2:
              System.out.println("Tuesday");
              break;
            default:
               system.out.println("Unknown day");
               break;

            
            
        }
        //nested switch statement 
        String beverage ="coke";
        char gender ='M';
        switch (beverage ){
            case"coke":
              switch (gender ){
                //Coke and M
                case 'M':
                   System.out.println("Male");
                   break;
                case 'F':
                   System.out.println("Female");
                   break;

              }
              System.out.println("Black");
              break;
            default:
                 System.out.println("Unknown beverages");
                 break;
        }
        //Switch case or 
        int status = 404;
        switch (status){
            // staus ==200|| status == 201|| status == 202
            case 200:
            case 201:
            case 202:
               System.out.println("success");
               break;
            //status == 401|| status ==404
            case 401:
            case 404:
                System.out.println("Not found");
                break;
            default:
                System.out.println("Unknown status");
                break;
        }
    }
}

//task 1
//make an int month and assign value 
//int month =4;
//using switch case check the month and print the following 
//0-> jan 
//1-> Feb
//2->mar
//3-> jun
//.. continue  each month till 11
//11-> Dec
//else -> Unkown month

//task 2
//make a variable string local and assign "np"
//String local ="np"
//using switch case check the and print the following
//"en  "or "en/uk" --> "Selected english"
//"in" -> "selected indian "
//"jp"-> selected japnese"
//"np"-> "selected nepali"
//"else"-> "unknown local"
