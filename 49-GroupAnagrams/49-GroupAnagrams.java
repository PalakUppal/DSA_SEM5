// Last updated: 11/20/2026, 5:22:03 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        HashMap<String, List<String>> mp = new HashMap<>();
4
5        for (String str : strs) {
6            char[] arr = str.toCharArray();
7            Arrays.sort(arr);
8            String key = new String(arr);
9            mp.putIfAbsent(key, new ArrayList<>());
10            mp.get(key).add(str);
11        }
12        return new ArrayList<>(mp.values());
13    }
14}