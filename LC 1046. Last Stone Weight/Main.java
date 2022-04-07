class Solution {
    public int lastStoneWeight(int[] stones) {
        
        List<Integer> arr = new ArrayList<>();
        
        for(int ele : stones){
            arr.add(ele);
        }
        
        while(arr.size() > 1){
            Collections.sort(arr);
            int i = arr.size()-1;
            int  j = i - 1;
            
            int var = Math.abs(arr.get(i)-arr.get(j));
            
            arr.set(i,var);
            arr.remove(j);
        }
        
        return(arr.get(0));
    }
}