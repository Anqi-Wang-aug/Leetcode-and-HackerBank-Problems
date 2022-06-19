//其实只是一个比较简单的 binary search 变形啦
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high)
        {
            int pos = (high+low)/2;
            if(nums[pos]==target) return pos;
            else if(nums[pos]<target) low=pos+1;
            else high=pos-1;
        }
        return low;

    }
}
