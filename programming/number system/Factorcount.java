/*
 *      factor of given number with countof number 
 *      I/p=16
 *      O/p=1 2 4 8 16
 *      no. of factor of given no.
 */


import java.util.Scanner;
public class Factorcount 
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
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("\nNo. of factors of given no."+count);
    }
}
