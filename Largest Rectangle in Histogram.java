//this is O(N)^2 solution
class Solution {
    public int largestRectangleArea(int[] heights) {
        int res=0;
        int l=heights.length;//lemgth of array
        for(int i=0;i<l;i++)//pointer to element to search in adjacent element for the pair
        {
            int curr=heights[i];
            for(int j=i-1;j>=0;j--)//searching on left
            {
                if(heights[j]>=heights[i]) 
                    curr+=heights[i];//it's about similar to multiplying the no of pairs it forms
                else
                    break;
            }
            for(int j=i+1;j<l;j++)//searching on right
            {
                if(heights[j]>=heights[i])
                    curr+=heights[i];//it's about similar to multiplying the no of pairs it forms
                else
                    break;
            }
            res=Math.max(res,curr);
        }
        return res;
    }
}