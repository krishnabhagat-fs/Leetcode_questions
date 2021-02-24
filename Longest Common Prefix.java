class Solution {
    public String longestCommonPrefix(String[] strs) {
        String temp="";
        if(strs.length==0 || strs==null)
            return temp;//for string array length equals 0 and null
        int l=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++)
            l=Math.min(l,strs[i].length());//finding the minimum length of the string frm arrays of strings
        for(int i=0;i<l;i++)
        {
            String str=strs[0].substring(0,l-i);// find the maximum common string from arrays so first we try for the maximum value
            boolean flag=false;// a tempoary variable to track that the common string is collide or not
            for(int j=0;j<strs.length;j++)//check in each an every string in array
            {
                if(((strs[j].substring(0,l-i)).indexOf(str)) == -1)
                {
                    flag=false;//if not found then out from the loop
                    break;
                }
                flag=true;
            }
            if(flag==true)
                return str;// if collide then we return the common prefix in array
        }
        return temp;// if not found return empty string
    }
}