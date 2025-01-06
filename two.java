import java.util.Scanner;

public class two {
    public static void main(String[] argc)
    {
        Scanner s=new Scanner(System.in);

        float radius=s.nextFloat();

        float volume=(4f/3f)*3.1416f*(radius*radius*radius);

        System.out.println("Volume of the ball is : " + volume);
    }
}