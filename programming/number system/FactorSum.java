/*
 *      factor of give no
 *      i/p=10
 *      output=1 2 5 10
 *      sum= 18
 */

import java.util.Scanner;

public class FactorSum 
{
        public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an integer");
        int n=sc.nextInt();
        display(n);
        sc.close();


    }
    public static void display(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
                sum+=i; // sum=sum+i;
            }
        }
        System.out.println("\nSum of factors of given no."+sum);
    }
}
