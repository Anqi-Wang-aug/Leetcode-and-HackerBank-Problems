class Solution {
    public int reverse(int x) {
            
        long result = 0;
        int ten = 10;
        while(x!=0)
        {
            int mod = x%ten;
            result = result*ten+mod;
            x -= mod;
            x = x/10;
            if(result>Integer.MAX_VALUE ||result<Integer.MIN_VALUE ) return 0;
        }
        return (int)result;
        
    }
}