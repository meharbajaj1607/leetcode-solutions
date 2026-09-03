class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double[] num = new double[nums1.length + nums2.length];

        int i = 0;

        for (int x : nums1) {
            num[i++] = x;
        }

        for (int x : nums2) {
            num[i++] = x;
        }

        int n = num.length;

        Arrays.sort(num);

        if (n % 2 == 0) {
            return (num[n / 2] + num[(n / 2) - 1]) / 2.0;
        }

        return num[n / 2];
    }
}
