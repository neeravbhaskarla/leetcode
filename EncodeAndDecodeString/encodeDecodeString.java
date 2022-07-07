public class Solution {
    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public String encode(List<String> strs) {
        // write your code here
        StringBuilder sb = new StringBuilder();
        for(String st: strs){
            sb.append(st);
            sb.append(":;");
        }
        return sb.toString();
    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        // write your code here
        String[] result = str.split(":;");
        List<String> res = new ArrayList<>();
        for(String st: result){
            res.add(st);
        }
        return res;
    }
