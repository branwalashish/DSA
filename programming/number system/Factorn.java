/*
 *      factor of give no
 *      i/p=10
 *      output=1 2 5 10
 */

import java.util.Scanner;
public class Factorn 
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
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
