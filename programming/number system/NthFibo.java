import java.util.Scanner;
public class NthFibo 
{
    public static void main(String[] args) {
       
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        printFibo(n);
        sc.close();
    }
    static void printFibo(int n)
    {
        int n1=0; int n2=1;
        int n3=0;
        if(n<=2)
        {
            if(n<1)
            {
            System.out.println("Invalid Input");
            }else if(n==1)
            {
                System.out.println(n1+" ");
            }else
            {
                System.out.println(n2+" ");
            }
        }else
        {
            for(int i=3;i<=n;i++)
            {
                n3=n1+n2;
                n1=n2;
                n2=n3;
            }
            System.out.println(n3);
        }

    }
    
}
