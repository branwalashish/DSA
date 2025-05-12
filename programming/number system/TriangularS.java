public class TriangularS 
{
    public static void main(String[] args) {
        
        displaySeries(15);
    }
    static void displaySeries(int n)
    {
        int n1=1;
        // int n2=0;
        for (int i = 2; i <= n+1; i++)
         {
            System.out.print(n1+" ");
            n1=n1+i;

        }
    }
}
