class Solution {
public:
    void merge(vector<int>& v,int low,int high,int mid){
        int i=low;int j=mid+1;
        vector<int> temp;
        while(i<=mid && j<=high){
            if(v[i]>=v[j]){
                temp.push_back(v[j++]);
            }else temp.push_back(v[i++]);
        }
        while(i<=mid){
            temp.push_back(v[i++]);
        }
        while(j<=high){
            temp.push_back(v[j++]);
        }
        for(int k=low;k<=high;k++){
            v[k]=temp[k-low];
        }
    }
    void mergeSort(vector<int>& v,int low,int high){
        if(low>=high)return ;
        int mid = low+(high-low)/2;
        mergeSort(v,low,mid);
        mergeSort(v,mid+1,high);
        merge(v,low,high,mid);
    }
    int findKthLargest(vector<int>& nums, int k) {
        mergeSort(nums,0,nums.size()-1);
        return nums[nums.size()-k];
    }
};