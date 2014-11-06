import java.util.Scanner;

public class Diamond2
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a side length: ");
       int input = in.nextInt(); 
      
       for (int count=0;count<input+1;count++) 
       { 
           System.out.println("");
           for (int count2=input-count;count2>0;count2--)
           {
           System.out.print(" ");
        }
           for (int count3=0;count3<count;count3++)
           {
           System.out.print("*");
        }
           for (int count4=-1;count4<count;count4++)
           {
           System.out.print("*");
        }
    }
       for (int count=0;count<input+1;count++) 
       { 
           System.out.println("");
           for (int count2=1;count2<count+2;count2++)
           {
           System.out.print(" ");
        }
           for (int count3=input-count-1;count3>0;count3--)
           {
               System.out.print("*");
        }
           for (int count4=input-count;count4>0;count4--)
           {
               System.out.print("*");
        }
    }
}
}
