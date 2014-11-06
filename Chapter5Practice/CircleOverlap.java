import java.util.Scanner;
public class CircleOverlap
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input the radius of the first circle: ");
      double radius1 = in.nextDouble();
      double xcenter1 = 0;
      double ycenter1 = 0;
      System.out.print("Input the radius of the second circle: ");
      double radius2 = in.nextDouble(); 
      double ycenter2 = 0;
      System.out.print("How far apart are the circle's centers: ");
      double xcenter2 = in.nextDouble();

      if (radius1+radius2<xcenter2)
      { 
          System.out.println("These circles are disjointed");
        }
      else if (radius1>=radius2+xcenter2)
      { 
          System.out.println("These circles are mutually contained");
        }
      else if (radius2>=radius1+xcenter2)
      { 
          System.out.println("These circles are mutually contained");
        }
      else
      {
          System.out.println("These circles are overlapping");
        }
   }
}