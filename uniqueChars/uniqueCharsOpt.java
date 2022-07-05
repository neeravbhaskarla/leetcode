public class Practise {
    public static boolean checkUnique(String str){
        int checker = 0;
        for(char ch: str.toCharArray()){
            int val = ch - 'a';
            if((checker&(1<<val))>0){
                return false;
            }
            checker|=(1<<val);
        }
        return true;
    }
    public static void main(String args[]){
        String str = "Aa";
        System.out.println(checkUnique(str));
//        System.out.print(1<<0);
    }
}
