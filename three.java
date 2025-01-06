import java.util.Scanner;

public class three
{
    public  static void main(String[] argc)
    {
        Scanner s=new Scanner(System.in);

        float radius= s.nextFloat();

        float area=3.1416f*radius*radius;

        System.out.println("Area is of the Circle is:  " + area);
    }
}