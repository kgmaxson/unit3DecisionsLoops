import java.util.Scanner;
public class LeapYear
{
     public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a year: ");
        Double year1 = scan.nextDouble();
        if(year1%400==0)
        {
            System.out.println("It is a leap year!");
        }
        else if(year1%100==0)
        {
            System.out.println("It is NOT leap year!");
        }
        else if(year1%4==0)
        {
            System.out.println("It is a leap year!");
        }
        else
        {
            System.out.println("It is NOT leap year!");
        }
}
}
