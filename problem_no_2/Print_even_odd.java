package problem_no_2;

public class Print_even_odd {

    public static void main(String[] args)
    {
        System.out.println("Print odd number");

        for(int i=1;i<=20;i+=2)
        {
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("Print even number");

        for(int i=2;i<=20;i+=2)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }


}
