class Solution {
    
    public static void Sub(int i, int[] ar1, int t,List<List<Integer>> ar2,List<Integer> ds)
    {
        if(i== ar1.length)
        {
            if(t ==0){
                ar2.add(new ArrayList<>(ds));
            }
            return;
        }
        if(ar1[i]<= t)
        {
            ds.add(ar1[i]);
            Sub(i, ar1, t-ar1[i], ar2, ds);
            ds.remove(ds.size()-1);
        }
            Sub(i+1,ar1, t, ar2, ds);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Sub(0,candidates,target,ans,new ArrayList<>());
    return ans;
    }
}