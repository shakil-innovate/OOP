import java.util.Scanner;

public class one
{
    public  static void main(String[] argc)
    {
        Scanner s=new Scanner(System.in);

        int base,height;
        base=s.nextInt();
        height=s.nextInt();

        float area=base*height*.5f;

        System.out.println("Area is " + area);
    }
}