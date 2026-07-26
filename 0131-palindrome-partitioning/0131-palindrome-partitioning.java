class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> arr = new ArrayList<>();
        List<String> ar = new ArrayList<>();
        int n = s.length();
        F(0,s,n,arr,ar);
        return arr;
    }
    void F(int ind, String s1, int j, List<List<String>> a1, List<String> a2)
    {
        if(ind == j){
            a1.add(new ArrayList<>(a2));
            return;
        }
        for(int i = ind; i<j;i++)
        {
            if(P(s1,ind,i)){
                a2.add(s1.substring(ind,i+1));
                F(i+1,s1,j,a1,a2);
                a2.remove(a2.size()-1);
            }
        }
    }
    boolean P(String ss, int start,int end)
    {
        while(start<= end)
        {
            if(ss.charAt(start++) != ss.charAt(end--)) return false;

        }
        return true;
    }
}