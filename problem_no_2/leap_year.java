package problem_no_2;

import java.util.Scanner;

public class leap_year {
    static boolean leapYear(int year)
    {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) return true;
        else return false;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int year;
        year=sc.nextInt();

        if(leapYear(year))System.out.println(year + " is a leap year");
        else System.out.println(year + " is not a leap year");
    }
}
