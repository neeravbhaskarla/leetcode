class Solution {
    Set<String> visited = new HashSet<>();
    Map<String, List<String>> adjacent = new HashMap<>();
    
    public void DFS(List<String> mergedAccount, String email){
        mergedAccount.add(email);
        visited.add(email);
        
        if(!adjacent.containsKey(email)) return;
        
        for(String emailAccount: adjacent.get(email))
            if(!visited.contains(emailAccount))
                DFS(mergedAccount, emailAccount);
    }
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        for(List<String> account: accounts){
            String firstUserEmail = account.get(1);
            
            int accountSize = account.size();
            for(int i = 2; i<accountSize; i++){
                String currentEmail = account.get(i);
                
                if(!adjacent.containsKey(firstUserEmail)) adjacent.put(firstUserEmail, new ArrayList<String>());
                
                adjacent.get(firstUserEmail).add(currentEmail);
                
                if(!adjacent.containsKey(currentEmail)) adjacent.put(currentEmail, new ArrayList<String>());
                
                adjacent.get(currentEmail).add(firstUserEmail);
            }
        }
        
        List<List<String>> mergedAccounts = new ArrayList<>();
        for(List<String> account: accounts){
            String firstName = account.get(0);
            String accountFirstEmail = account.get(1);
            
            if(!visited.contains(accountFirstEmail)){
                List<String> mergedAccount = new ArrayList<>();
                mergedAccount.add(firstName);
                
                DFS(mergedAccount, accountFirstEmail);    
                Collections.sort(mergedAccount.subList(1, mergedAccount.size()));
                mergedAccounts.add(mergedAccount);
            }
        }
        
        
        return mergedAccounts;
    }
}