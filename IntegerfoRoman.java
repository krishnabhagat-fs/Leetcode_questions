class Solution {
    public String intToRoman(int num) {
         Map<String, Integer> mp = new LinkedHashMap<>();// i used linkedhashmap in order to maintain the order 
        mp.put("M", 1000);
        mp.put("CM",900);
        mp.put("D", 500);
        mp.put("CD", 400);
        mp.put("C", 100);
        mp.put("XC", 90);
        mp.put("L", 50);
        mp.put("XL", 40);
        mp.put("X", 10);      
        mp.put("IX", 9);
        mp.put("V", 5);
        mp.put("IV", 4);
        mp.put("I", 1);
 
        StringBuilder sb = new StringBuilder();//string builder for not allocating value in stringpool every time
        
       for(Map.Entry<String, Integer> entry : mp.entrySet()) { //traversing through map set
      
          while(num >= entry.getValue()) {
            num = num - entry.getValue();
            sb.append(entry.getKey());
          }
       }
 
       return sb.toString();
    }
}