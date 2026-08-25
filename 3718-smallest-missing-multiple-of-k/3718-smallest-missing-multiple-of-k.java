class Solution {
    public int missingMultiple(int[] nums, int k) {

        int i = 1;

        while (true) {

            int n = k * i;
            boolean found = false;

            for (int j = 0; j < nums.length; j++) {

                if (nums[j] == n) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return n;
            }

            i++;
        }
    }
}