class Solution {
    public boolean checkRecord(String s) {
        int absence =0;
        int late=0;
        for(int i=0; i < s.length();i++){
            if(s.charAt(i) =='A'){
                absence++;
                late=0;

                if(absence>=2){
                    return false;
                }
            }
            else if (s.charAt(i)=='L'){
                late++;

                if(late>=3){
                    return false;
                    }
                }
                else{
                    late=0;
                    }
                }
                return true;
            }
        }
    