import java.util.Scanner;

public class Diamond
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a side length: ");
       int input = in.nextInt(); 
      
       for (int count=0;count<input+1;count++) 
       { 
           System.out.println("");
           for (int count2=0;count2<count;count2++)
           {
           System.out.print("*");
        }
    }
       for (int count=0;count<input+1;count++) 
       { 
           System.out.println("");
           for (int count2=input-count-1;count2>0;count2--)
           {
               System.out.print("*");
        }
    }
}
}
