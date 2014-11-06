
public class NestedLoops
{
    public static void main(String[] args)
    {
        for(int i = 1;i < 3; i++)
        {
            for(int j = 1;j < 5; j++)
                {
                    System.out.println(i+" "+j);
                }
        }
        
        System.out.println();
        int i = 1;
        int j = 1;
        while (i<3)
        {
            while (j<5)
            {
                System.out.println(i+" "+j);
                j++;
            }
            j = 1;
            i++;
        }
        
        System.out.println();
        i=1;
        j=1;
        do
        {
            do
            {
            System.out.println(i+" "+j);
            j++;
        }
            while (j<5);
        i++;
        j=1;
        }
        while (i<3);
    }
}

