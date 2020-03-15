import java.util.*;
import java.lang.Math;
public class AreaOfCircle {
    
    //This calculates the area of circle, saying  it can't calculate if radius is less or equal to 0
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter radius of the circle");
       double radius = sc.nextDouble();
      
        //This declares PI as a variable and uses math to calculate it
        final double PI = 3.1416;
        double area = PI * Math.pow(radius,2);
         
        //This prints out the radius if radius is 0 or less, otherwise it shows the area. 
        if (radius<=0) {
           System.out.println("Your area can't be calculated");
            } else {
           System.out.println("Your area is: " + area);
              }
    }
    }


