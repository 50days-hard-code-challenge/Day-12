class Solution {
public:
    int maxScore(vector<int>& cardPoints, int k) 
    {
        int sum = 0;
        int maxi = INT_MIN;
        int n = cardPoints.size();
        int back = n - 1;
        for(int i=0;i<k;i++)
        {
            sum += cardPoints[i];
            maxi = max(sum,maxi);
        }
        if(k==n)
        {
            return maxi;
        }
        while(k--)
        {
            sum -= cardPoints[k];
            sum += cardPoints[back];
            maxi = max(sum,maxi);
            back--;
        }
        return maxi;    
    }
};
