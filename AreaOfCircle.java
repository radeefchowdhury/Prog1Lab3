import java.util.*;
import java.lang.Math;
public class AreaOfCircle {
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter radius of the circle");
       double radius = sc.nextDouble();
       final double PI = 3.1416;
        double area = PI * Math.pow(radius,2);
         
        if (radius<=0) {
           System.out.println("Your area can't be calculated");
            } else {
           System.out.println("Your area is: " + area);
            
        }
     
        }
    }


