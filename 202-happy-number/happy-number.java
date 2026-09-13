// class Solution {
//     public int findSum(int n){
//         int sum=0;
//         while(n>0){
//             int rem = n%10;
//             n/=10;
//             sum+=rem*rem;
//         }
//         return sum;
//     }
//     public boolean isHappy(int n) {
//         if(n==1||n==7)return true;
//         int sum=0;
//         while(n>=10){
//             sum = findSum(n);
//             n = sum;
//             if(n==1||n==7)return true;
//         }
//         return false;
//     }
// }

//better
class Solution {
    public int findSum(int n) {
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            sum += rem * rem;
        }

        return sum;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1) {
            if (seen.contains(n)) {
                return false;
            }

            seen.add(n);
            n = findSum(n);
        }

        return true;
    }
}
//An unhappy number eventually enters a repeating cycle. so return false when it happens