class Solution {
    public int minOperations(int n) {
        if(n==1){
            return 0;
        }
        int lnum = (n*2)-1;
        int target = (lnum/2)+1;
        int count = 0;
        for(int i=0; i<n/2; i++){
            count += (target - ((i*2)+1) );
        }
        return count;
    }
}