class Solution {
    public boolean isIdealPermutation(int[] A) {
        for(int i=0; i<A.length; i++){
            if(i==0){
                if(A[i]==0 || A[i+1]==0 ){
                    continue;
                }else{
                    return false;
                }
            }
            else if(i>0 && i<A.length-1){
                if(A[i]==i || A[i-1]==i || A[i+1]==i ){
                    continue;
                }else{
                    return false;
                }
            }
            else{
                if(A[i]==i || A[i-1]==i ){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}