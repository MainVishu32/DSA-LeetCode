class Solution {
    void F(int i,int[] num, List<List<Integer>> a1, ArrayList<Integer> a2)
    {
        if(i == num.length){
            a1.add(new ArrayList<>(a2));
            return;
        }
        a2.add(num[i]);
        F(i+1,num,a1,a2);
        a2.remove(a2.size() -1);
        F(i+1,num,a1,a2);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ar1 = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        F(0,nums,ar1,arr);
        return ar1;
    }
}