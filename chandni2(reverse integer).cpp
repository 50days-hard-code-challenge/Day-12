class Solution {
public:
    int reverse(int x) {
        long reverse=0;
        while(x!=0){
        int rem =x%10;
        x=x/10;
        if(x>INT_MAX|| x<INT_MIN){
            return 0;
        }
        reverse=reverse*10+rem;
        }
        return reverse;
       
    }
};
