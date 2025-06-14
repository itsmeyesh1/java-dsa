class Solution {
     public int longestConsecutive(int[] nums){
        int n=nums.length;
        if(n==0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int longest=0;
        
        for(int it : set)//it -> iterating over the elemnt present in set.. 
        {
            if(!set.contains(it-1)){
                 int count=1;
                int x=it; //it means element bro.
                while(set.contains(x+1)) {
                    x=x+1;
                    count=count+1;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
     }
}