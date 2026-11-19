// Last updated: 11/19/2026, 5:46:21 PM
1class Solution {
2    public List<String> subdomainVisits(String[] cpdomains) {
3        HashMap<String, Integer> mp = new HashMap<>();
4
5        for (String cpdomain : cpdomains) {
6            String[] parts = cpdomain.split(" ");
7            int num = Integer.parseInt(parts[0]);
8            String domain = parts[1];
9            while (true) {
10                mp.put(domain, mp.getOrDefault(domain, 0)+num);
11                int index = domain.indexOf('.');
12                if (index == -1) break;
13                domain = domain.substring(index+1);
14            }
15           
16        }
17        List<String> res = new ArrayList<>();
18        for (String domain : mp.keySet()) {
19            res.add(mp.get(domain) + " " + domain);
20        }
21        return res;
22    }
23}