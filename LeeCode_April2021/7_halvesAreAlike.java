class Solution {
    public boolean halvesAreAlike(String s) {
        if(s.length()==0) return true;
        int count1 =0, count2 =0;
        for(int i=0; i<s.length(); i++){
            char c = Character.toLowerCase(s.charAt(i));
            if(i>=s.length()/2){
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    count2++;
                }
            }
            else{
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    count1++;
                }
            }
        }
        return (count1==count2);
    }
}