class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> mp=new HashMap<>();
        for(String s:cpdomains){
            String splt[]=s.split(" ");
            int cnt=Integer.parseInt(splt[0]);
            mp.put(splt[1],mp.getOrDefault(splt[1],0)+cnt);
            for(int i=1;i<splt[1].length();i++){
                if(splt[1].charAt(i)=='.'){
                    String tmp=splt[1].substring(i+1);
                    mp.put(tmp,mp.getOrDefault(tmp,0)+cnt);
                }
            }
        }
        List<String> ans=new ArrayList<>();
        for(String s:mp.keySet()){
            StringBuilder sb=new StringBuilder();
            sb.append(mp.get(s));
            sb.append(" ");
            sb.append(s);
            ans.add(sb.toString());
        }
        return ans;
    }
}