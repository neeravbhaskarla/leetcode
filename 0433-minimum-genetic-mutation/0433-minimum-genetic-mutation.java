class Solution {
    public boolean isNewGene(String gene, String newGene){
        int count = 0;
        for(int i=0; i<gene.length(); i++){
            if(gene.charAt(i)!=newGene.charAt(i))
                count++;
            if(count>1) return false;
        }
        return true;
    }
    public int minMutation(String start, String end, String[] bank) {
        Queue<Pair<String, List<String>>> queue = new LinkedList<>();
        List<String> bankList = Arrays.asList(bank);
        queue.add(new Pair<String, List<String>>(start, bankList));
        int mutations = 0;
        while(!queue.isEmpty()){
            Queue<Pair<String, List<String>>> dupQueue = new ArrayDeque();
            mutations++;
            while(!queue.isEmpty()){
                Pair<String, List<String>> mutation = queue.poll();
                String cmpMutation = mutation.getKey();
                List<String> nextMutations = mutation.getValue();
                for(int nextMutation = 0; nextMutation<nextMutations.size(); nextMutation++){
                    String currMutation = nextMutations.get(nextMutation);
                    if(isNewGene(currMutation, cmpMutation)){
                        if(end.equals(currMutation)) return mutations;
                        List<String> mut = new ArrayList<>();
                        int j = 0;
                        while(j<nextMutations.size()){
                            if(nextMutations.get(j).equals(nextMutations.get(nextMutation))){
                                j++;
                                continue;
                            }
                            mut.add(nextMutations.get(j++));
                        }
                        dupQueue.add(new Pair<String, List<String>>(currMutation, mut));
                    }
                }
            }
            queue = dupQueue;
        }
        return -1;
    }
}
