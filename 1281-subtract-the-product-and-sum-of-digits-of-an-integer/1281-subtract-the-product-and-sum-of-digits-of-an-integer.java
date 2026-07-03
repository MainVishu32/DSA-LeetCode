class Solution {
    public int subtractProductAndSum(int n) {
        int a = n;
        int sum = 0;
        int pro = 1;
        while(a>0)
        {
            int rem = a % 10;
            sum = sum + rem;
            pro = pro* rem;
            a = a/10;
        }
        int result = pro - sum;
        return result;
    }
}