class Solution {
    public static int dp [][][];
    public static int findMaxForm(String[] strs, int m, int n) {
		dp = new int [m+1][n+1][strs.length+1];
		for (int matrix [][] : dp) {
            for (int row [] : matrix)
                Arrays.fill (row, -1);
        }
       ArrayList<ArrayList<Integer>> list = new ArrayList<>();
       list = makeList(strs);
       int ans = findmax(list, m, n, list.size());
       return ans;
       
   }
   public static int findmax(ArrayList<ArrayList<Integer>> lst, int m, int n, int len ){
       if(len==0 || (m==0 && n==0)){
           return 0;
       }
       if (dp [m][n][len] != -1) {
    	   return dp [m][n][len];
       }
          
       if(lst.get(len-1).get(0)<=m && lst.get(len-1).get(1)<=n ){
           return dp [m][n][len] = Math.max(1 + findmax(lst, m-lst.get(len-1).get(0), n-lst.get(len-1).get(1), len-1 ) , findmax(lst, m, n, len-1) );
       }else{
           return dp [m][n][len] = findmax(lst, m, n, len-1);
       }
   }
   public static ArrayList<ArrayList<Integer>> makeList(String[] str){
       ArrayList<ArrayList<Integer>>  list = new ArrayList<>();
       for(int i=0; i<str.length; i++){
           ArrayList<Integer> arr = new ArrayList<Integer>();
           String s = str[i];
           
           int[] count = new int[2];
           count = countZeroOne(s);
           arr.add(count[0]);
           arr.add(count[1]);
           list.add(arr);
       }
       return list;
   }
   public static int[] countZeroOne(String s){
       int zero = 0, one = 0, len = s.length();
       int[] out = new int[2];
       for(int i=0; i<len; i++){
           if(s.charAt(i)=='0'){
               zero++;
           }else{
               one++;
           } 
       }
       out[0] = zero;
       out[1] = one;
       return out;
   }
}