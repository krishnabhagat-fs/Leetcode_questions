class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split("\\s+");//this is to split it for one or more empty spaces
        String str="";
        for(int i=arr.length-1;i>=0;i--)
        {
        str=str+arr[i]+" ";//concatination of string
        }
        return str.trim();// to remove blank spaces
    }
}

//we can optimize the solution using string builders
// using scanner (less optimal)

public String reverseWords(String s) {
    Scanner parts = new Scanner(s);
    
    String result = "";
    
    while(parts.hasNext()){
        result = parts.next() + " " + result;
    }
    
    return result.trim();
}
