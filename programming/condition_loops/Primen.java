/*prime no till n no
 */
import java.util.Scanner;

public class Primen {

    public static void check(int n)
    {
        if(n==2)
        {
            System.out.println("It is a prime no.");
        }
        //int count=0;
        for(int i=2;i<=n-1;i++)
        {
            if(n%i!=0)
            {
                System.out.print("It is a prime no."+i);
              //  count++;
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int n=sc.nextInt();
        check(n);
        sc.close();
    }
    
}
