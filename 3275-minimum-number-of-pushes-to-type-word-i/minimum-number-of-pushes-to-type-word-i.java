class Solution {
    public int minimumPushes(String word) {
        int len=word.length();

        int count=0;
        if (len<=8) count=len;
        else if (len<=16) count=8+(len-8)*2;
        else if (len<=24) count=24+(len-16)*3;
        else count=48+(len-24)*4;
        return count;
    }
    
}