import java.util.Scanner;

public class six {

    public static void main(String[] argc)
    {
        Scanner w=new Scanner(System.in);

        float a,b,c;
        a=w.nextFloat();
        b=w.nextFloat();
        c=w.nextFloat();

        float s=(a+b+c)/2.0f;

        float area=(float)(Math.sqrt(s*(s-a)*(s-b)*(s-c)));

        System.out.println("Area of the triangle (2) is : "+ area);
    }
}