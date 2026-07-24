class Solution {
    private static void F(int ind,int[] a1, int target,List<List<Integer>> a2,ArrayList<Integer> a3){
        if(target ==0)
        {
            a2.add(new ArrayList(a3));
            return;
        }
        for(int i = ind; i < a1.length;i++)
        {
            if(i> ind && a1[i] == a1[i-1]) continue;
            if(target< a1[i]) break;
            a3.add(a1[i]);
            F(i+1,a1,target - a1[i] , a2,a3);
            a3.remove(a3.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<List<Integer>> arr = new ArrayList<>();
       Arrays.sort(candidates);
       F(0,candidates,target,arr,new ArrayList<>());
       return arr; 
    }
}