public class NthPrime{
    static void printNprime(int n){
        int cnt = 0;
        for(int i = 1;;i++){
            if(pCheck(i) == 1){
                cnt++;
                // System.out.print(i+ " ");  // N prime no.s
                if(cnt == n){
                    System.out.print(i+ " ");  // Nth prime no.
                    break;
                }
            }
        }
    }

    static int pCheck(int n){
        int count = 0;
        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
       return count;
    }

    public static void main(String[] args) {
        printNprime(5);
    }
}