#include <algorithm>
class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        if(s.size()==0||g.size()==0)return 0;
        int count=0;
        int j=0;
        sort(g.begin(), g.end());
        sort(s.begin(), s.end());
        for(int i=0;i<g.size();i++){
            for(;j<s.size();j++){
                if(g[i]<=s[j]){
                    count++;
                    j++;
                    break;
                }
            }
        }
        return count;
    }
};