package cscie71.jpincus.hw1;

/**
 * Hello world!
 *
 */
public class Sum 
{
    public static void main( String[] args )
    {
        if (args.length != 2) {
        	//System.err.println("Usage: input 2 integers");
        	//return;
        	throw new NumberFormatException();
        }
        try {
        	int num1 = Integer.valueOf(args[0]);
        	int num2 = Integer.valueOf(args[1]);
        	Calculator calc = new Calculator(num1, num2);
        	System.out.println(calc.sum());
        }
        catch (NumberFormatException e) {
        	System.err.println("Usage: input 2 integers");
        }
    }
}
