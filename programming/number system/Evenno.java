import java.util.Scanner;

public class Evenno
{
    public static void main(String [] args)
    {
        System.out.println("Enter a no.:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        check(n);
        sc.close();
 
    }
    public static void check(int n)
    {
        if(n%2==0)
        {
            System.out.println("Even no.");
        }
        else
        {
        System.out.println("Odd number");
        }
    }


}