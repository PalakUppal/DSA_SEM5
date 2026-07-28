// Last updated: 7/28/2026, 11:26:29 AM
1class Solution {
2    public String[] sortPeople(String[] names, int[] heights) {
3        int n = heights.length;
4
5        for (int i=0; i<n-1; i++) {
6            int min = i;
7            for (int j=i+1; j<n; j++) {
8                if (heights[j] > heights[min]) {
9                    min = j;
10                }
11            }
12            String temp = names[i];
13            names[i] = names[min];
14            names[min] = temp;
15            int tempHeight = heights[i];
16            heights[i] = heights[min];
17            heights[min] = tempHeight;
18        }
19        return names;
20    }
21}