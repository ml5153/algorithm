class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long me = 0;
        
        for(int i=0; i<n; i++) {
            me += x;
            answer[i] = me;
        }
        return answer;
    }
}