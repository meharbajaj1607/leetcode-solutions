class Solution {
    public int longestMountain(int[] arr) {
        int maxLen = 0;

        for (int max = 1; max < arr.length - 1; max++) {

            // Check if max is a peak
            if (arr[max] <= arr[max - 1] || arr[max] <= arr[max + 1]) {
                continue;
            }

            int len = 0;

            // Go left
            for (int i = max - 1; i >= 0; i--) {
                if (arr[i] < arr[i + 1]) {
                    len++;
                } else {
                    break;
                }
            }

            // Go right
            for (int i = max + 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    len++;
                } else {
                    break;
                }
            }

            maxLen = Math.max(maxLen, len + 1);
        }

        return maxLen;
    }
}
