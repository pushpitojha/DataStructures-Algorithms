// Recursive Solution 


class Solution {
    public int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}


// Iterative Solution

class Solution {
    public int fib(int n) {
        
        if(n == 0 || n == 1)
        {
            return n;
        }       
        int storage[] = new int[n+1];
        storage[0] = 0;
        storage[1] = 1;
        for(int i = 2; i <= n; i++){
            storage[i] = storage[i-1] + storage[i-2];
        }
        return storage[n];
    }
}