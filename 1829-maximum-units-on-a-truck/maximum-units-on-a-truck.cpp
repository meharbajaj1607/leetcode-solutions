class Solution {
public:
    int maximumUnits(vector<vector<int>>& boxTypes, int truckSize) {
        int n=boxTypes.size();
        int units=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(boxTypes[j][1]<boxTypes[j+1][1]){
                    //swap
                    vector<int> temp = boxTypes[j];
                    boxTypes[j] = boxTypes[j+1];
                    boxTypes[j+1] = temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            std::cout<<boxTypes[i][0]<<" "<<boxTypes[i][1]<<endl;
        }
        for(int i=0;i<n;i++){
            //int num = boxTypes[i][0];
            while(truckSize>0 && boxTypes[i][0]>0){
                units+=boxTypes[i][1];
                boxTypes[i][0]-=1;
                truckSize--;
            }
        }
        return units;
    }
};