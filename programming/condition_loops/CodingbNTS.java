public class CodingbNTS 
{
    public static int noTeenSum(int a, int b, int c)
    {
        a=helper(a);
        b=helper(b);
        c=helper(c);
        return a+b+c;
    }
    public static int helper(int n)
    {
        if(n>=13 && n<=19 && n!=15 && n!=16)
        {
            return 0;
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.println(noTeenSum(15,6,7));

    }
}
