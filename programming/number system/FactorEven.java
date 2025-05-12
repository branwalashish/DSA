/*
 *     even factors of given no.
 *      I/p-->10
 *      O/p--> 2 10  (1,5 is not even)
 */

import java.util.Scanner;

public class FactorEven 
{
     public static void main(String[] args) {
        System.out.println("Enter a no:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        display(n);
        sc.close();

    }
    public static void display(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(n%i==0&&i%2==0)
            {
                System.out.print(i+" ");
            }
        }
    }
    
}
