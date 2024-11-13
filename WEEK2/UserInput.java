

package WEEK2;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // to take input import Scanner class at the top of the file 
        // import java.util.scanner;
        //Make an object of the scanner and take input from object 
        Scanner scan =new Scanner (System.in);
        System.out.println("Your age:");
        int ageInput = scan.nextInt();
        System.out.println("You are"+ ageInput);

        System.out.println("Over 18?");
        boolean over18Input = scan.nextBoolean();

        System.out.println("Your weight:");
        double weightInput=scan.nextDouble();

        //After using scanner for the primitive data and want input for String
        //you need to clear the enter input
        scan.nextLine();
        System.out.println("You name?");
        String name = scan.nextLine();
        scan.close();//must close scanner boject to avoid input locks

    }
    
}
