class Solution {
public:
    int eraseOverlapIntervals(vector<vector<int>>& intervals) {
        int n=intervals.size();
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-1;j++){
        //         if(intervals[j][1]>intervals[j+1][1]){
        //             //swap
        //             vector<int>temp = intervals[j];
        //             intervals[j]=intervals[j+1];
        //             intervals[j+1]=temp;
        //         }
        //     }
        // }
        sort(intervals.begin(), intervals.end(),
            [](vector<int>& a, vector<int>& b) {
                return a[1] < b[1];
            });
        for(int i=0;i<n;i++){
            cout<<intervals[i][0]<<" "<<intervals[i][1]<<endl;
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(intervals[i][1]<=intervals[j][0]){
                    count++;
                    i=j;
                }
            }
        }
        return n-count-1;
    }
};