class Solution {
    public String removeDuplicates(String s, int k) {
        if(s.length()<k) return s;
        String str = "";
        LinkedList<Pair> list = new LinkedList<>();
        for(char c : s.toCharArray()){
            if(!list.isEmpty() && list.peek().ch==c){
                list.peek().fq++;
            }   
            else{
                list.push(new Pair(c,1));
            }
            if(list.peek().fq == k){
                list.pop();
            }
        }
        while(!list.isEmpty()){
            Pair curr = list.removeLast();
            for(int i=0; i<curr.fq; i++){
                str += curr.ch;
            }
        }
        return str;
    }
}
class Pair{
    char ch;
    int fq;
    
    public Pair(char ch, int fq){
        this.ch = ch;
        this.fq = fq;
    }
}