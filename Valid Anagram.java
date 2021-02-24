//In this solution we simply checking the counting of character of both the strings are equal or not
class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length() || s==null || t==null)
            return false;
        int s1[]=new int[256];// declearing a temporary array for stroring the count of characters
        for(int i=0;i<s.length();i++)
        {
            s1[s.charAt(i)]++;//incrementing the index equivlent acschi value for first string
            s1[t.charAt(i)]--;//decrementing the index equivlent acschi value for second string
        }
        for(int i=0;i<256;i++)//traversing the whole array
        {
            if(s1[i]!=0)//if any value is greater or less than the zero then return false because we have nutralizes the array
                return false;//                                                                           in previous iteration
        }
        return true;
    }
}