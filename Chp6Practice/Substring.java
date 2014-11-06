import java.util.Scanner;
public class Substring
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a word: ");
       String input = in.next(); 
      
       for (int count=0;count<input.length();count++) 
       {
           for (int count2=1;count2<input.length()-count+1;count2++)
           {
           String substring1 = input.substring(count, count+count2);
           System.out.println(substring1);
        }
    }
}
}

