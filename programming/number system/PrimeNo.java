
/*
 *      Check the given input by the user is prime or not
 *      I/p-->7                             I/p-->6
 *      O/p-->7 is a prime no.              O/p-->6 is not a prime no.
 */
import java.util.Scanner;
public class PrimeNo // (Check wheather the given no. is prime or not)
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                count++;
            }
            
            
        }
        if(count==0)
            {
                System.out.println(n+" is a Prime no.");
            }
            else
            {
            System.out.println(n+" is not a prime no.");
            }
        sc.close();
    }
    
}
