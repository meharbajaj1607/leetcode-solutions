class Solution {
public:
    int crossSum(vector<int>& v,int low,int mid,int high){
        int sum=0;
        int lsum=-1e9;
        for(int i=mid;i>=low;i--){
            sum += v[i];
            lsum = max(sum,lsum);
        }
        sum=0;
        int rsum=-1e9;
        for(int i=mid+1;i<=high;i++){
            sum += v[i];
            rsum = max(sum,rsum);
        }
        return lsum+rsum;
    }
    int maxSumSubarray(vector<int>& v,int low,int high){
        if(low==high)return v[low];
        int mid = low + (high - low) / 2;
        int lsum = maxSumSubarray(v,low,mid);
        int rsum = maxSumSubarray(v,mid+1,high);
        int cross = crossSum(v,low,mid,high);
        return max(max(lsum,rsum),cross);
    }
    int maxSubArray(vector<int>& nums) {
        return maxSumSubarray(nums,0,nums.size()-1);
    }
};