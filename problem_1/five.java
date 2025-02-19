import java.util.Scanner;

public class five {

    public static void main(String[] argc)
    {
        Scanner s=new Scanner(System.in);

        float arm=s.nextFloat();

        float area=(float)(Math.sqrt(3)/4.0f)*arm*arm;

        System.out.println("Area of the triangle is : "+ area);
    }
}