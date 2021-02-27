class Solution {
    public int compareVersion(String version1, String version2) {
    String[] levels1 = version1.split("\\.");// split the strings by means where the '.' appears it splits to a new string
    String[] levels2 = version2.split("\\.");// split the strings by means where the '.' appears it splits to a new string
    
    int length = Math.max(levels1.length, levels2.length);
    for (int i=0; i<length; i++) {
    	Integer v1 = i < levels1.length ? Integer.parseInt(levels1[i]) : 0;//converting the string to integer and store it 
    	Integer v2 = i < levels2.length ? Integer.parseInt(levels2[i]) : 0;
    	int compare = v1.compareTo(v2);
    	if (compare != 0) {//return the value retured by v1 and v2 means v1 > v2 it returs +1 and 
    		return compare;//v1 < v2 return -1 and v1 = v2 return 0 follow up for further conversion
    	}
    }
    
    return 0;
}
}