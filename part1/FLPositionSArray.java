package part1;

public class FLPositionSArray {

    public int[] searchRangeN(int[] nums, int target) {
        int hi = nums.length - 1;
        int low = 0;
        int[] rs = new int[2];
        // base case
        if (nums == null || nums.length == 0)
            return new int[] { -1, -1 };

        // left side
        while (low < hi) {
            int mid = low + (hi - low) / 2;
            if (target > nums[mid]) {
                low = mid + 1;
            } else {
                hi = mid;
            }
        }
        if (target == nums[low]) {
            rs[0] = low;
        } else {
            rs[0] = -1;
        }

        // right side
        hi = nums.length - 1;
        while (low < hi) {
            int mid = (low + (hi - low) / 2) + 1;

            if (target < nums[mid]) {
                hi = mid - 1;
            } else {
                low = mid;
            }
        }
        if (target == nums[hi]) {
            rs[1] = hi;
        } else {
            rs[1] = -1;
        }

        return rs;
    }

    public int[] searchRange(int[] nums, int target) {
        int lo = nums[0];
        int hi = nums[nums.length];
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            while (lo < hi) {
                if (nums[mid] == target)
                    return foo(mid, target, nums);
                else if (nums[mid] <= target) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return new int[] { -1, -1 };
    }

    private int[] foo(int mid, int target, int[] nums) {
        int[] arr = new int[2];
        int i = mid - 1, j = mid + 1;
        while (i >= 0 || j < nums.length) {

            if (i >= 0 && nums[i] == target) {
                i--;
            }
            if (j < nums.length && nums[j] == target) {
                j++;
            }

        }
        arr[0] = i + 1;
        arr[1] = j - 1;
        return arr;
    }
}
