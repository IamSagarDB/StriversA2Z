package BasicMaths;

public class GCDHCF {
    public static void main(String[] args) {
        int[]  nums = {2,5,6,9,10};
        int res = findGCD(nums);
        System.out.println(res);
    }

    /**
     * TC : O ( N )
     * SC : O ( 1 )
     */
    public static int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > max) {
                max = nums[i];
            }

            if(nums[i] < min) {
                min = nums[i];
            }
        }
        // Find GCD
        for(int i = min ; i > 0; i--){
            if ((min % i == 0) && (max % i == 0)){
                return i;
            }
        }
        return 1;
    }
}
