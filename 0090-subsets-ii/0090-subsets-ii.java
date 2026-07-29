class Solution {
    void F(int ind, int[] a, List<List<Integer>> a1, ArrayList<Integer> a2)
    {
        a1.add(new ArrayList<>(a2));
        for(int i = ind; i < a.length; i++)
        {
            if(i != ind && a[i] == a[i-1]) continue;
            a2.add(a[i]);
            F(i+1,a,a1,a2);
            a2.remove(a2.size() -1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> arr = new ArrayList<>();
        F(0,nums,arr,new ArrayList<>());
        return arr;
    }
}