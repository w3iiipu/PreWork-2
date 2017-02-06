import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int year1, year2, month1, month2, day1, day2;
        scan = new Scanner(System.in);

        System.out.println("Please enter two dates to calculate the difference between them.\n");


        System.out.println("Enter the year of Date A: ");
        year1 = scan.nextInt();
        System.out.println("Enter the month of Date A: ");
        month1 = scan.nextInt();
        System.out.println("Enter the day of Date A: ");
        day1 = scan.nextInt();


        System.out.println("Enter the year of Date B: ");
        year2 = scan.nextInt();
        System.out.println("Enter the month of Date B: ");
        month2 = scan.nextInt();
        System.out.println("Enter the day of Date B: ");
        day2 = scan.nextInt();

        LocalDate date1 = LocalDate.of(year1, month1, day1);

        LocalDate date2 = LocalDate.of(year2, month2, day2);

        Period period = Period.between(date1, date2);

        System.out.println("The difference between the two dates is " + period.getYears() + " Years, " + period.getMonths() + " Months, " + period.getDays() + " Days!");


    }


}