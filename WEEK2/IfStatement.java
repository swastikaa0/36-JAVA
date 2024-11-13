package WEEK2;

public class IfStatement {
    public static void main (String[] args){
        //IF statement , decision making 
        int num1 =10;
        if (num1 > 10){
            System.out.println("Greater than 10");
            // more statement 
        }
        // if - else statement 
        if (num1 >20){
            system.out.println("greater than 20");
        }else{
            system.out.println("lesser than 20");
        }
        // if - else - if 
        if (num1 == 10){
            system.out.println("Num is 10 ");
            
        }else if (num1 ==9){
            system.out.println("Num is unlnown");

        }
        //if - else - if ladder // multiple else if  
        String bevarage ="Coke";
        if (beverage == "Fanta"){
            system.out.println("Orange drink ");

        }else if (beverage == "coke "){
            system.out.println("Black drink");

        }else if (beverage == "Sprite"){
            system.out.println(" clear drink");

        }else {
            system.out.println("Unknown drink ");
        }
        // nested if 
        if (beverage == "coke"){
            if (num1 == 10){
                system.out.println("coke and 10");
            }else{
                system.out.println("only coke ");

            }else{
                if (num1 == 10){
                    system.out.println("only 10");
                }else{
                    system.out.println("no coke and 10");
                }
            }
        }
    }
    
}
