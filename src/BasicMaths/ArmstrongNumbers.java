package BasicMaths;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        int N = 153;
        String res = isArmstrongNumber(N);
        System.out.println(res);
    }

    public static String isArmstrongNumber(int N) {
        int num = N;
        int res = 0;

        while(num > 0) {
            int mod = num % 10;
            num /= 10;
            res += (mod * mod * mod);
        }

        return (res == N) ? "Yes" : "No";
    }

}
