/*
 * Square of no till n(i.e given by the user)
 * I/P-->5
 * O/P-->1 4 9 16 25 
 */

import java.util.Scanner;
public class Square_N // GIVE SQUARE TILL GIVEN NO. BY THE USER
{
    public static void main(String[] args) 
    {
        System.out.println("Enter an integer : ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        check(n);
        sc.close();

    }
    static void check(int n)
    {
        for (int i = 1;i<=n; i++) 
        {
            System.out.print(i*i+" ");
            
        }
    }


}
