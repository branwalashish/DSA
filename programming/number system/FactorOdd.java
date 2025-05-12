
/*
 *     even factors of given no.
 *      I/p-->10
 *      O/p--> 1 5  (2,10 is not Odd)
 */

import java.util.Scanner;
public class FactorOdd { 

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
                if(i%2==1)
                {
                System.out.print(i+" ");
                }
            }
        }
    }
    
}

    

