class Solution {
    public int[] solution(String[] strlist) {
        int num = strlist.length;
        int[] answer = new int[num];
        for(int i = 0; i < strlist.length; i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}