package Task_4;

public class printPattern {

    public static void print()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] arg)
    {
       printPattern.print();
    }

}
