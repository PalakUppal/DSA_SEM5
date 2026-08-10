// Last updated: 8/10/2026, 5:34:48 PM
1class Solution {
2    List<List<Integer>> answer = new ArrayList<>();
3
4    public void backTrack(int start, int n, int k, List<Integer> list) {
5        if (list.size() == k) {
6            answer.add(new ArrayList<>(list));
7            return;
8        }
9        for (int i=start; i<=n; i++) {
10            list.add(i);
11            backTrack(i+1, n, k, list);
12            list.remove(list.size()-1);
13        }
14    }
15
16    public List<List<Integer>> combine(int n, int k) {
17        List<Integer> list = new ArrayList<>();
18        backTrack(1, n, k, list);
19        return answer;
20    }
21}