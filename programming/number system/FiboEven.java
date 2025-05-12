
import java.util.Scanner;
public class FiboEven 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter an integer");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        display(n);
        sc.close();
    }
    static void display(int n)
{
    int n1=0;int n2=1;
    int n3=2;
    for (int i = 1; i < 3*n; i++) 
    {
        if(n3%2==0)
        {
            System.out.println(n3+" ");

        }
        n3=n1+n2;
        n1=n2;
        n2=n3;
    }
}

}
