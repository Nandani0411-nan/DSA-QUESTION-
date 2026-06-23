class Solution {
    public int reverse(int x) {
        int temp=x;
        long rev=0;
        while(temp!=0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        return (rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE)?0:(int)rev;
    }
}