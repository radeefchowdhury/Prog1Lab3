import java.util.*;

public class Celsius {
   public static void main(String[] args) {
       
      //This displays two difference messages depending on the temperature
       String output;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the current temeperature");
       double temperature = sc.nextDouble();
       output = temperature>=0 ? "The temperature isn't cold" : "The temperature is cold";
       System.out.println(output);
    }
    
}
