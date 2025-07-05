
    import java.util.Scanner;
public class N_primeno2 {

    public static boolean checkPrime(int num)
{
	if(num<=1)
	{
		return false;
	}
	for(int i=2;i<=num/2;i++)
	{
		if(num%i==0)
		{
		return false;
		}
	}
	return true;
}
    public static void printNprime(int n)
    {
        int count=0;
        int result = 0;
        for(int i=1; ;i++)
        {
            if(pCheck(i)==1)
            {
                count++;
               // System.out.print(i+" ");
               result=i;

            } 
            if(count==n)
            {
                break;
            }

        }
    }
    static int pCheck(int n)
    {
        int c=0;
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Range : ");
        int a= sc.nextInt();
        printNprime(a);
        sc.close();

    }
}


