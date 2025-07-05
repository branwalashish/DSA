import java.util.Scanner;

public class FactorSum 
{
 public static void check(int n)
 {
    int sum=0;
    {
        for (int i = 1; i<=n; i++) 
        {
          if(n%i==0)
          {
            System.out.print(i+" ");
            sum=sum+i;
          }  
        } 
    }
    System.out.println("\nSum of the factors of the given no. is : "+sum);
}
public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer:");
    int n=sc.nextInt();
    check(n);
    sc.close();
}
}
