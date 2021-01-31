// here we are doing linear search using Ex-or operator
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            res=res^nums[i]; //Ex-or with same number is 0 ex-: 2^2=0 
        }
        return res;
    }
}

// using binary search

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=nums.length-1;
        if(l==0)
            return nums[0];
        else if(nums[0]!=nums[1] && l>=2)
            return nums[0];
        else if(nums[l]!=nums[l-1] && l>=2)
            return nums[l];
        int start=0;
        while(start<=l)
        {
            int mid=(start+l)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1])
                return nums[mid];
            else if((mid%2==0) && nums[mid]==nums[mid-1] || // odd even ratio
                    (mid%2==1) && nums[mid]==nums[mid+1])
                l=mid-1;
            else
                start=mid+1;
        }
        return 0;
    }
}