import java.util.Scanner;
public class Nth_evenFibo 
{
    public static void main(String[] args) 
    {
       
       System.out.println("Enter a no.--> ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ntheven(n);
        sc.close();

    }
    static void ntheven(int n)
    {
        int n1=0;
        int n2=1;
        int n3=0;
        for(int i=1 ; i < 3*n ; i++)
        {
            if(n3%2==0 && i==3*(n-1)) 
            {
                System.out.println(n3+" ");
            }
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }

    }
    
}
