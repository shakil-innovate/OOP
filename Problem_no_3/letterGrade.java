package Problem_no_3;

import java.util.Scanner;

public class letterGrade {
    public static void main(String[] args)
    {
        float grade;
        Scanner sc=new Scanner(System.in);
        grade=sc.nextFloat();

        if(grade>=3.5)
        {
            System.out.println("Enable to get a medel");
        }
        else
            System.out.println("Inable to get a medal");
    }
}
