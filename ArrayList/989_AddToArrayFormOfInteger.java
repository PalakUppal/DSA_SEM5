class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        int n = num.length;
        List<Integer> ans = new ArrayList<>();
        int i = n-1;
        int sum = 0;
        // num = 9,9,9  and k=1
        // num = 1200, k = 34
        while (i>=00 || k>0) {
            if (i>=0) {
                k += num[i];  //9+1 = 10,    //34+0=34, 3+0=3, 0+2=2
            }

            ans.add(k % 10); //10%10 = 0     //34%10=4, 3%10=3, 2%10=2
            k /= 10;  //k=1           //k=3, 0, 0
            i--;
        }
// 0001
// 4321
        Collections.reverse(ans);
        return ans;
    }
}