//O(N) solution
class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map=new HashMap();//used HashMap for storing the correspoding values of roman characters
            map.put('I',1);
            map.put('V',5); 
            map.put('X',10); 
            map.put('L',50); 
            map.put('C',100);
            map.put('D',500);
            map.put('M',1000);
         
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(i>0 && map.get(s.charAt(i)) > map.get(s.charAt(i-1))){
                sum+=map.get(s.charAt(i)) -2*map.get(s.charAt(i-1));// here i subtracting two times because in previous step i add the value to it
            }
            else{//this execute whenever the i>0 and current value is larger than previous value
                sum+=map.get(s.charAt(i));
            }
        }
        return sum;
    }
}