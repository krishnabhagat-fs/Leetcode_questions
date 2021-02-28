
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();//creating a 2d arraylist for returning the result
        HashMap<String,List<String>> map=new HashMap<>();// hashmap for compairing and storing the values
        for(int i=0;i<strs.length;i++)// iterate over the array of strings
        {
            char arr[]=strs[i].toCharArray();//converting to sort characters in lixographic
            Arrays.sort(arr);//sorting
            String s1=new String(arr);//converting back to string
            if(!map.containsKey(s1))//check if the hashmap contains this key or not
            {
                map.put(s1,new ArrayList<>());//if not the add it and then intialize an arraylist for values corresponding to keys
            }       
                map.get(s1).add(strs[i]);//adding the value to hashmap
        }
        res.addAll(map.values());//converting all the hashmap values to arraylist
        return res;//returning of values
    }
}