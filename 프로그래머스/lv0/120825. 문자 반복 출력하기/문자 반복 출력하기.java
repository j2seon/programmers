class Solution {
    public String solution(String my_string, int n) {
        
        StringBuilder sb = new StringBuilder();
        String[] str = my_string.split("");
        
        for(String s : str){
            for (int i = 0; i < n; i++) {
                sb.append(s);
            }
        }
        return sb.toString();
    }
}