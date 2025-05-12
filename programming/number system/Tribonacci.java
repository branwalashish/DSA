public class Tribonacci 
{

    public static void main(String[] args) {
        
        displaySeries(15);
    }

    static void displaySeries(int n)
    {
        int n1=0;
        int n2=1;
        int n3=1;
        int n4;
        // System.out.print(n1+" "+n2);
        for(int i=1;i<=n;i++)
        {
            // n3=n1+n2+n3;
            System.out.print(" "+n1);
            n4=n1+n2+n3;
            n1=n2;
            n2=n3;
            n3=n4;
            
        }
    }

}
