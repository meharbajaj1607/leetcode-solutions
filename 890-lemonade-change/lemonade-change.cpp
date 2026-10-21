class Solution {
public:
    bool findChange(vector<int>& change,int amt){
        int note=0;
        for(int i=0;i<3;i++){
            if(i==0)note=20;
            else if(i==1)note=10;
            else note=5;
            while(change[i]!=0){
                if(amt==0) return true;
                if(note>amt) break;
                else{
                    change[i]-=1;
                    amt-=note;
                }
            }
        }
        return amt==0;
    }
    bool lemonadeChange(vector<int>& v) {
        vector<int> change = {0,0,0}; //20,10,5
        for(int i=0;i<v.size();i++){
            if(v[i]==5){
                change[2]++; //5
            }
            else{
                if(!findChange(change,v[i]-5))return false;
                if(v[i]==10) change[1]++; //10
                else change[0]++;     //20
            }
        }
        return true;
    }
};