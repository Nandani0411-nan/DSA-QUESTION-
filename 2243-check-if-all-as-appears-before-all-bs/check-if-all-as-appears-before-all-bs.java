class Solution {
    public boolean checkString(String s) {
        boolean seenB=false;
        for(int i=0;i< s.length();i++){
            if(s.charAt(i)=='b'){
                seenB = true;
            }
        
        if(seenB && s.charAt(i)=='a'){
            return false;
        }
    }
    return true;
    }
}