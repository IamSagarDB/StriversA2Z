package BasicMaths;

public class ReverseInteger {
    public static void main(String[] args) {
        int N = 123;
        int res = reverseInteger(N);
        System.out.println(res);
    }

    /**
     *  TC : O ( log10(N) )
     *  SC : O (1)
     */
    private static int reverseInteger(int N){
        int n = N;
        N = N > 0 ? N : (-1 * N);
        long rev = 0;

        while(N > 0) {
            int rem = N % 10;
            N = N / 10;
            rev = (rev * 10) + rem;
        }

        if (Integer.MAX_VALUE < rev || Integer.MIN_VALUE > rev){
            return 0;
        }
        return (int) (n < 0 ? (-1 * rev) : rev);
    }

}
