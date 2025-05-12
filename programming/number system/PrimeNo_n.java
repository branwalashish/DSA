/*
 * prime number till n
 * I/p-->10
 * O/p--> 2 3 5 7
 */
import java.util.Scanner;
public class PrimeNo_n //(prime number till n)
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        printNPrime(n);

        sc.close();
    }
    public static boolean checkPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        if(n==2)
        return true;
    
        for(int i=2;i<=n/2;i++)
        {
        if(n%i==0)
        {
            return false;
        }   
        }
        return true;
    }
    
    

    static void printNPrime(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(checkPrime(i) == true)
            {
            System.out.print(i+" ");
            } 
        }
    }

    
}
