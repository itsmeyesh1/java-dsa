class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int minLen = Math.min(nums1.length, nums2.length);
        int[] temp = new int[minLen];
        int index = 0;
        int i = 0;
        while (i < nums1.length) {
            int j = 0;
            while (j < nums2.length) {
                if (nums1[i] == nums2[j]) {
                    temp[index++] = nums1[i];
                    nums2[j] = Integer.MIN_VALUE; 
                    break;
                }
                j++;
            }
            i++;
        }
        int[] result = new int[index];
        int k = 0;
        while (k < index) {
            result[k] = temp[k];
            k++;
        }
        return result;
    }
}
