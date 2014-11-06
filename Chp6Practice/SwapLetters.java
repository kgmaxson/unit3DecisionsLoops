import java.util.Scanner;
import java.util.Random;

public class SwapLetters
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word: ");
        
        String word = in.next();
        int input=0;
        Random generator = new Random();
        while (input<=word.length())
        {
        int j = generator.nextInt(word.length()-2);
        while (j<3)
        {
            j = generator.nextInt(word.length()-2);
        }
        System.out.println(j);
        int i = generator.nextInt(j-2);
        System.out.println(i);
        String first = word.substring(0,i);
        String second = word.substring(i+i,j);
        String third = word.substring(j+1,word.length());
            
        String newWord = first+word.charAt(j)+second+word.charAt(i)+third;

        System.out.println(newWord);
        j = generator.nextInt(word.length()-1);

        input++;
    
    }
    }
    
}

