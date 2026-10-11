class Solution {
public:
    void merge(vector<int>& v,int low,int high,int mid){
        vector<int> t;
        int i=low;int j=mid+1;
        while(i<=mid && j<=high){
            if(v[i]>v[j]){
                t.push_back(v[j]);
                j++;
            }else{
                t.push_back(v[i]);
                i++;
            }
        }
        while(i<=mid){
            t.push_back(v[i++]);
        }
        while(j<=high){
            t.push_back(v[j++]);
        }
        for(int k=low;k<=high;k++){
            v[k] = t[k-low];
        }
    }
    void mergeSort(vector<int>& v,int low,int high){
        if(high<=low)return;
        int mid=low+(high-low)/2;
        mergeSort(v,low,mid);
        mergeSort(v,1+mid,high);
        merge(v,low,high,mid);
    }
    vector<int> sortArray(vector<int>& nums) {
        mergeSort(nums,0,nums.size()-1);
        return nums;
    }
};