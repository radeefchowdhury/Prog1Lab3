import java.util.*;
public class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in feet");
        double heightfeet = sc.nextDouble();
         final double meters = 0.3048 *  heightfeet;
        
        System.out.println("Enter your weight in pounds");
        double weightpounds = sc.nextDouble();
         final double kilograms = weightpounds *0.453592;
        
        double bmi = kilograms/ (Math.pow(meters,2)); 
        System.out.println("Your BMI is:" + bmi);
        if(bmi<18.5){
           System.out.println("You are underweight");
        }
        else if (bmi>=18.5 && bmi<=24.9){
            System.out.println("You are healthy");
            
        }
        else if(bmi>=25 && bmi<=29.9){
        System.out.println("You are overweight");
        }
        else if (bmi>=30){
        System.out.println("You are obese");
    }
        
        
    }
    
}
