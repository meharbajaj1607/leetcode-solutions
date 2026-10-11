#include <algorithm>
class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        if(s.size()==0||g.size()==0)return 0;
        int count=0;
        int j=0;int i=0;
        sort(g.begin(), g.end());
        sort(s.begin(), s.end());
        while(i<g.size() && j<s.size()){
            if(g[i]<=s[j]){
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
};