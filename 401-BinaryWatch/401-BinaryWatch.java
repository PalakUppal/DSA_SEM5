// Last updated: 8/10/2026, 5:37:33 PM
1class Solution {
2    List<String> answer = new ArrayList<>();
3    void backTrack(int ind, int cnt, int turnedOn, int[] leds) {
4        
5        if (cnt == turnedOn) {
6            int hour = 0;
7            int minute = 0;
8
9            for (int i=0; i<4; i++) {
10                if (leds[i] == 1) {
11                    hour += (1<<i);
12                }
13            }
14
15            for (int i=4; i<10; i++) {
16                if (leds[i] == 1) {
17                    minute += (1<<(i-4));
18                }
19            }
20            if (hour <= 11 && minute <= 59) {
21                String time = hour+":"+String.format("%02d", minute);
22                answer.add(time);
23            }
24            return;
25        }
26        if (ind == 10) return;
27        leds[ind] = 1;
28        backTrack(ind+1, cnt+1, turnedOn, leds);
29        leds[ind] = 0;
30        backTrack(ind+1, cnt, turnedOn, leds);
31    }
32    public List<String> readBinaryWatch(int turnedOn) {
33        int[] leds = new int[10];
34        backTrack(0, 0, turnedOn, leds);
35        return answer;
36    }
37}