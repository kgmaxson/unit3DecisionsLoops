import java.util.Scanner;
public class RewriteLoops
{

    public static void main2(String[]args)
    {
        int n = in.nextInt();
        double x = 0;
        double s;
        
        while(s>.01)
        {
            s = 1.0/(1+n*n);
            n++;
            x = x+s;
        }
    }

}
