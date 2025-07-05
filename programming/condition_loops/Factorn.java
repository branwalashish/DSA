import java.util.Scanner;
class Factorn
{
	public static void print(int n)
	{
        // int sum=0;
	for(int i=1 ; i<=n ; i++)
	{
		if(n%i==0)
		{
		System.out.print(i+" ");
        // sum++;
      }
	}
    // System.out.println("\nno. of count (which are factor of except 1 & itself) "+n+" is "+sum);
}
public static void main(String [] args)
{	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter an Integer : ");
    int n=sc.nextInt();
    print(n);
    sc.close();
}
    
}		