package BasicMaths;

public class CountDigits {
    public static void main(String[] args) {
        int N = 12;
        int res = countDigitBF(N);
        System.out.println(res);
    }

    /**
     * TC : O ( Log10(N) )
     * SC : O (1)
     */
    private static int countDigitBF(int N){
        int count = 0;
        int num = N;
        while(N > 0){
            int rem = N % 10;
            N = N / 10;

            if(num % rem == 0) count++;
        }
        return count;
    }

}
