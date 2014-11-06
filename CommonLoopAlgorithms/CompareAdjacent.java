import java.util.Scanner;

public class CompareAdjacent
{
    /**
     * An example of a method- replace this comment with your own
     */
    public static void main(String[] args)
    {
        final double EPSILON = 1e-7;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a series of numbers (type 'q' to exit): ");
        
        double prevValue;
        double currentValue = in.nextDouble();
        while (in.hasNextDouble())
        {
            prevValue = currentValue;
            currentValue = in.nextDouble();
            
            if(Math.abs(currentValue - prevValue)<EPSILON)
            {
                System.out.println("Duplicate numbers.");
            }
        }
    }

}