// here this is tending to efficent solution on finding the next greater elements
// i used hash map here for storing the number as key nad next greater number as value
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap();//decearation of hashmap 
        Stack<Integer> stack=new Stack();
        for(int num:nums2)// iterate over the nums2 array
        {
            while(!stack.isEmpty() && stack.peek()<num)//for finding the value next greater to the required num
            {
                map.put(stack.pop(),num);//if found then pop the item from stack and add it to hashmap with its value
            }
            stack.push(num);// adding the nums2 array value
        }
        
        for(int i=0;i<nums1.length;i++)// finally storing the values according to the index of required number
        {
            nums1[i]=map.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }
}