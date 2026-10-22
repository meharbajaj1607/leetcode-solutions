class Solution {
public:
    int findMinArrowShots(vector<vector<int>>& points) {
        int n=points.size();
        sort(points.begin(), points.end(),
             [](const auto& a, const auto& b) {
                 return a[0] < b[0];
             });

        int j=0;int count=1; //min 1 group
        for(int i=1;i<n;i++){
            if(points[i][0]>points[j][1]){
                count++;
                j=i;
            }else points[j][1] = min(points[j][1], points[i][1]);
        } 
        return count;
    }
};