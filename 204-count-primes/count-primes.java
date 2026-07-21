class Solution {
       private static boolean[] isNotPrime = new boolean[5000001];
    private static int[] primeCount = new int[5000001];
    private static int maxProcessed = 1;

    public int countPrimes(int n) {
        if (n <= 2)
            return 0;

        if (n <= maxProcessed) {
            return primeCount[n];
        }

        if (n > maxProcessed) {
            if (maxProcessed == 1) {
                isNotPrime[0] = isNotPrime[1] = true;
                maxProcessed = 2;
            }

            for (int i = 2; i * i < n; i++) {
                if (!isNotPrime[i]) {
                    int start = Math.max(i * i, ((maxProcessed + i - 1) / i) * i);

                    for (int j = start; j < n; j += i) {
                        isNotPrime[j] = true;
                    }
                }
            }

            for (int i = maxProcessed; i < n; i++) {
                primeCount[i + 1] = primeCount[i] + (isNotPrime[i] ? 0 : 1);
            }
            maxProcessed = n;
        }

        return primeCount[n];
    }
}