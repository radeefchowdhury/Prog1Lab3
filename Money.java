import java.util.*;

public class Money {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose one of the following: ");
        System.out.println("Meters to feet conversion ");
        System.out.println("CAD TO USD conversion ");
        System.out.println("Celsius to Fahrenheit conversion ");
        System.out.println("Pounds to Kilogram conversion ");
        System.out.println("USD to EURO conversion ");
        
         String conversionChosen = sc.nextLine();
         
         switch(conversionChosen){
             case ("Meters to feet conversion"):
                 System.out.println("Enter amount of meters");
                 double meters = sc.nextDouble();
                 double feet = meters * 3.281;
                 System.out.println(meters + "meters is equal to: " + feet);
                    break;
                 
             case ("CAD TO USD conversion"):
                 System.out.println("Enter amount of CAD");
                 double cad = sc.nextDouble();
                 double usd = cad * 0.756152;
                 System.out.println(cad + "is equal to" + usd);
                    break;
            
             case("Celsius to Fahrenheit conversion"):
                System.out.println("Enter temperature in celsius");
                double celsius = sc.nextDouble();
                double fahrenheit = (celsius*(9/5) +32);
                System.out.println( celsius + "is equal to" + fahrenheit);
                 break;
            
             case("Pounds to Kilogram conversion"):
                 System.out.println("Enter weight in pounds");
                 double pounds = sc.nextDouble();
                 double kilograms = pounds/2.205;
                 System.out.println(pounds + "is equal to " + kilograms);
                 break;
            
             case("USD to EURO conversion"):
                 System.out.println("Enter amount of USD you wish to convert");
                 double usa = sc.nextDouble();
                 double euro = usa * 0.89;
                 System.out.println(usa +"is equal to" + euro);
                    break;
                         
         }}
        
    
}
