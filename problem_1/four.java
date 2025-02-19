import java.util.Scanner;

public class four
{
    public  static void main(String[] argc)
    {
        Scanner s=new Scanner(System.in);

        float celcius= s.nextFloat();

        float fahrenheight=(((celcius/5.0f)*9)+32);

        System.out.println("Tempareture as Fahrenheight:  " + fahrenheight);
    }
}