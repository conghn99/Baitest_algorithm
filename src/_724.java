public class _724 {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                sum = 0;
            } else {
                sum += nums[i-1];
            }

            if (sum * 2 == total - nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
