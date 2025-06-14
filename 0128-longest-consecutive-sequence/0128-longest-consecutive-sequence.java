class Solution {
    // public static boolean linearsearch(int []nums,int x){
    //     int n = nums.length;
    //     for(int i=0;i<n;i++) {
    //         if(nums[i]==x){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    // public int longestConsecutive(int[] nums) {
    //     if(nums.length == 0) return 0;
    //     int n=nums.length;
    //     int longest=1;
    //     for(int i=0;i<n;i++) {
    //         int count=1;
    //         int x=nums[i];

    //         while(linearsearch(nums,x+1)==true) {
    //             x=x+1;
    //             count=count+1;
    //         }
    //         longest = Math.max(longest,count);
    //     }
    //     return longest;
    // }
     public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n==0) return 0;
        int count=0;
        int longest=1;
        int lastSmallest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            if(nums[i]-1 == lastSmallest) {
                count=count+1;
                lastSmallest = nums[i];
            }
            else if(nums[i] !=lastSmallest) {
                count =1;
                lastSmallest =nums[i];
            }
            longest = Math.max(longest,count);
        }
        return longest;
     }
}