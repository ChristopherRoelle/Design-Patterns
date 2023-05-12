import java.util.Scanner;

public class InterpreterDriver {
    
    //Class variables
    public Conversion originatingContent = null;
    public Expression theExpression = null;

    public InterpreterDriver(Conversion content){
        originatingContent = content;
    }

    public void Interpret(String tString){

        Scanner in = new Scanner(System.in);
        theExpression = new MapIntToCharacters(tString);
        theExpression.Interpret(originatingContent);
        in.close();

    }

    public static void main(String[] args) {
        System.out.println("\n\nCODE INTERPRETER\n");
        System.out.println("Enter your code: ");
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();
        in.close();
        System.out.println("Your code: " + userInput);
        Conversion conversion = new Conversion(userInput);
        InterpreterDriver userCode = new InterpreterDriver(conversion);
        userCode.Interpret(userInput);
        System.out.println("\n\n");
    }

}
