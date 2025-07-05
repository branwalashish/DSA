public class Checkprime 
{
    
       public static boolean checkPrime(int n)
        {
            int c=0;
            for (int i = 1; i <=n; i++) 
            {
              if(n%i==0)
              {
                    c++;
              } 
            }
            if(c==2)
            {
                return true;
            }else
            return false;  
            
        }
    
    public static void main(String[] args) 
    {
        System.out.println(checkPrime(8));
    }
}
