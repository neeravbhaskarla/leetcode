class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> counts = new HashMap<>();
        for(String domain: cpdomains){
            String[] cpinfo = domain.split("\\s+");
            String[] frags = cpinfo[1].split("\\.");
            int count = Integer.valueOf(cpinfo[0]);
            String curr = "";
            for(int i=frags.length-1; i>=0; --i){
                curr = frags[i] + (i<frags.length - 1 ? "." : "") + curr;
                counts.put(curr, counts.getOrDefault(curr, 0)+count);
            }
        }
        
        List<String> ans = new ArrayList();
        for(String dom: counts.keySet()){
            ans.add(""+counts.get(dom)+" "+dom);
        }
        return ans;
    }
}