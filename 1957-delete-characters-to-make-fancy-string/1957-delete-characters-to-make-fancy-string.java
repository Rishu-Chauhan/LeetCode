class Solution {
    public String makeFancyString(String s) {
        int count=1;
        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==sb.charAt(sb.length()-1)){
                count++;
                if(count<3){
                    sb.append(s.charAt(i));
                }
            }
            else{
                count=1;
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}