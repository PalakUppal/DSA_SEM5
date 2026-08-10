// Last updated: 8/10/2026, 5:41:34 PM
1class Solution {
2    
3    public List<String> readBinaryWatch(int turnedOn) {
4        List<String> answer = new ArrayList<>();
5        
6        for (int h=0; h<12; h++) {
7            for (int m=0; m<60; m++) {
8                int hrB = Integer.bitCount(h);
9                int minB = Integer.bitCount(m);
10
11                if (hrB + minB == turnedOn) {
12                    answer.add(h + ":" + String.format("%02d", m));
13                }
14            }
15        }
16        return answer;
17    }
18}