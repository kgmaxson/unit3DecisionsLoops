import java.util.Scanner;
public class Spectrum
{
     public static void main(String[] args)
     {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a wavelength value: ");
        Double wave1 = scan.nextDouble();
        if(wave1>1e-1)
        {
            System.out.println("Radio Wave Rider");
        }
        else if(wave1>1e-3)
        {
            System.out.println("Microwave oven");
        }
        else if(wave1>7e-7)
        {
            System.out.println("Infrared lobster");
        }
        else if(wave1>4e-7)
        {
            System.out.println("Visible");
        }
        else if(wave1>1e-8)
        {
            System.out.println("Ultraviolets are blue");
        }
        else if(wave1>1e-11)
        {
            System.out.println("X-rays, parent supervision needed");
        }
        else
        {
            System.out.println("Gamma Ray Rice");
        }
    }
}
