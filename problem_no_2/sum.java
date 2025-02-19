package problem_no_2;

public class sum {

    public static void main(String[] args)
    {
       // System.out.println("Print odd number");

        int total=0;
        for(int i=1;i<=20;i+=2)
        {
            System.out.print(i+" ");
            total+=i;
        }
        System.out.println();
        System.out.println("Sum is "+ total);
        total=0;

        //System.out.println("Print even number");

        for(int i=2;i<=20;i+=2)
        {
            System.out.print(i+" ");
            total+=i;
        }
        System.out.println();
        System.out.println("Sum is "+ total);
    }

}
