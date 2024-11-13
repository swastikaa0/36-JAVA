package WEEK2;

public class UserinputUsingArgs {
    public static void main(String[] args) {
        // the parameter String[] args take array of input 
        // when running from command line 
        //You can compile java file with
        //java FileName .java
        // java FileName args1 args2
        //or
        //Java FileName.java args1 args2 
        System.out.println("First Args "+ args[0]);
        System.out.println("Second Args "+ args[1]);
        
        //the args in datatype string to convert or parse any args
        int argsParse1 = Integer.parseInt(args[0]);
        int argsParse2 = Integer.parseInt(args[1]);
        System.out.println("Sum of  args "+ (argsParse1 + argsParse2));


    }
    
}
//Task
//Create a new file ResultInput
//create Scanner object to ask user for input
// op -> int
// database -> int
// architecture -> int
// resit -> boolean 
// calculate the avg
// if resit is true cap the avg to 40 is the value is more than 40
//using printf




