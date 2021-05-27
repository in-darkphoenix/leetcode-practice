package part1;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int msa = nums[0];
        int lmsa = nums[0];
        for (int i = 1; i < nums.length; i++) {
            lmsa = Math.max(nums[i], lmsa + nums[i]);
            if (msa < lmsa) {
                msa = lmsa;
            }
        }
        return msa;
    }
}
