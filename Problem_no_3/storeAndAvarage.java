package Problem_no_3;

import java.util.Scanner;

public class storeAndAvarage {
    public static void main(String[] args) {
      int n;
      Scanner sc=new Scanner(System.in);

      n=sc.nextInt();

      int[] array=new int[n];

      int total=0;

      for(int i=0;i<n;i++)
      {
          array[i]=sc.nextInt();
          total+=array[i];
      }

      float av=(float)total/n;

      System.out.println("Average of "+total+" is "+av);
    }
}
