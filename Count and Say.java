// in this question in the midlle i use string builder because native string class always allocate memory or
//create a new object on string pool
class Solution {
    public String countAndSay(int n) {
        if(n<=0)
            return "";
        String str="1";// default value of string
        for(int i=0;i<n-1;i++)
        {
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<str.length();j++)
            {
                int count=1;
                while(j+1 < str.length() && str.charAt(j) == str.charAt(j+1))// if the next element is same as the current value then 
                {//                                                                      increase the counter and j value
                    count++;
                    j++;
                }
                sb=sb.append(count).append(str.charAt(j));// append the counter and value
            }
            str=sb.toString();// convert to string
        }
        return str;// return the string
    }
}