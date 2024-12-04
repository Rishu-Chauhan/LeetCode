class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() !=goal.length()){
            return false;
        }
        String cont=s+s;
        return cont.contains(goal);
    }
}