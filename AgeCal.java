import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCal {
//This prompts the user for the info, to give his age and tell him when his birthday is
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate bday;
        LocalDate today = LocalDate.now();

//Asks the user for birthday
        System.out.println("Enter your birthday year");
        int year = sc.nextInt();
        System.out.println("Enter your birthday month");
        int month = sc.nextInt();
        System.out.println("Enter your birthday day");
        int day = sc.nextInt();

        bday = LocalDate.of(year, month, day);
//This is the period between the birthday and todays date
        Period p = Period.between(bday, today);

        System.out.println(" ");
        System.out.println("You're " + p.getYears() + " years old"); 

        System.out.println(" ");
//This is to either say if his birthday is coming up or it past, depending on the bday and today
        if(bday.getDayOfYear()>= today.getDayOfYear()){
            int diff = ((bday.getDayOfYear()-today.getDayOfYear())+1);
            System.out.println(diff + " days until your birthday");
        }else{
            int diff1 = ((today.getDayOfYear()-bday.getDayOfYear())-1);
            System.out.println("Your birthday was " + diff1 + " day(s) ago");
        }
        
    }
    
}
