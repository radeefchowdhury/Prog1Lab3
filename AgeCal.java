import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate bday;
        LocalDate today = LocalDate.now();


        System.out.println("Enter your birthday year");
        int year = sc.nextInt();
        System.out.println("Enter your birthday month");
        int month = sc.nextInt();
        System.out.println("Enter your birthday day");
        int day = sc.nextInt();

        bday = LocalDate.of(year, month, day);

        Period p = Period.between(bday, today);

        System.out.println(" ");
        System.out.println("You're " + p.getYears() + " years old"); 

        System.out.println(" ");

        if(bday.getDayOfYear()>= today.getDayOfYear()){
            int diff = ((bday.getDayOfYear()-today.getDayOfYear())+1);
            System.out.println(diff + " days until your birthday");
        }else{
            int diff1 = ((today.getDayOfYear()-bday.getDayOfYear())-1);
            System.out.println("Your birthday was " + diff1 + " day(s) ago");
        }
        
    }
    
}
