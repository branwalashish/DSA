/*h
 * Fibbonacci series i. starts from 0 1 1 2 3 5 8 13 21 34
 * if(user) will give input 10 
 */
import java.util.Scanner;
public class FibbonacciN // range till n
{
   
    static void  check(int n){
    //     if(n==0|| n==1){
    //         return n;
    //     }
    //     return check(n-1) + check(n-2);

    // }
    // {
        int n1=0, n2=1;
        if(n==0 || n==1)System.out.println(n);

        
        System.out.print(n1+" "+n2+" ");
        
        for (int i = 2; i <n; i++)
        {
            int n3=n1+n2;
            // if(n%2==0)           // this will use for even values under the range of input 
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
            }
        }

        public static void main(String [] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a no.");
            int n=sc.nextInt();
            // System.out.println(check(n));
            check(n);
            sc.close();
    
        }
}
