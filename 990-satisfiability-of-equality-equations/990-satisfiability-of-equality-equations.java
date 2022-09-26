class Solution {
    public boolean equationsPossible(String[] equations) {
        List<Integer>[] graph = new ArrayList[26];
        for(int i=0; i<26; i++){
            graph[i] = new ArrayList<>();
        }
        for(String eqn: equations){
            if(eqn.charAt(1) == '='){
                int x = eqn.charAt(0) - 'a';
                int y = eqn.charAt(3) - 'a';
                graph[x].add(y);
                graph[y].add(x);
            }
        }
        
        int[] colors = new int[26];
        Arrays.fill(colors, -1);
        for(int i=0; i<26; i++){
            if(colors[i] == -1){
                dfs(i, i, colors, graph);
            }
        }
        
        for(String eqn: equations){
            if(eqn.charAt(1) == '!'){
                int x = eqn.charAt(0) - 'a';
                int y = eqn.charAt(3) - 'a';
                if(colors[x] == colors[y]) return false;
            }
        }
        return true;
    }
    public void dfs(int node, int c, int[] color, List<Integer>[] graph){
        if(color[node] == -1){
            color[node] = c;
            for(int nei: graph[node])
                dfs(nei, c, color, graph);
        }
    }
}