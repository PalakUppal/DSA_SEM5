// Last updated: 11/19/2026, 5:00:53 PM
1class Solution {
2    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
3        // int ans = 0;
4        // int sum = 0;
5        // for (int i=0; i<nums1.length; i++) {
6        //     for (int j=0; j<nums2.length; j++) {
7        //         for (int k=0; k<nums3.length; k++) {
8        //             for (int l=0; l<nums4.length; l++) {
9        //                 if (nums1[i]+nums2[j]+nums3[k]+nums4[l] == 0) ans++;
10        //             }
11        //         }
12        //     }
13        // }
14        // return ans;
15
16        HashMap<Integer, Integer> mp1 = new HashMap<>();
17
18        for (int i=0; i<nums1.length; i++) {
19            for (int j=0; j<nums2.length; j++) {
20                int val = nums1[i]+nums2[j];
21                mp1.put(val, mp1.getOrDefault(val, 0)+1);
22            }
23        }
24        int count = 0;
25
26        for (int i=0; i<nums1.length; i++) {
27            for (int j=0; j<nums1.length; j++) {
28                int val = nums3[i]+nums4[j];
29                int tar = -val;
30                count += mp1.getOrDefault(tar, 0);
31            }
32        }
33
34        return count;
35
36
37
38
39
40
41
42
43    }
44}