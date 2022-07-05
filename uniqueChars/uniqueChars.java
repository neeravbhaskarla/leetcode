public class Practise {
    public static boolean checkUnique(String str){
        boolean[] charset = new boolean[128];
        for(char ch: str.toCharArray()) {
            int val = ch - 'a';
            if (charset[val]) {
                return false;
            }
            charset[val] = true;
        }
        return true;
    }
    public static void main(String args[]){
        String str = "abcc";
        System.out.println(checkUnique(str));
    }
}

