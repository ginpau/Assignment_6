public class AllLess {

    public static void lessThanX(String[] s, int x){

        for(int i = 0; i < s.length; i++){
            if(s[i] != null && s[i].length() < x){
                System.out.println(s[i]);
            }
        }
    }

    public static void main(String[] args){
        AllLess obj = new AllLess();
        String[] s = {"zero", "size", "nutella", "jojo", "luna",
                "isse", "astor", "as", "entretien", "", "cal"};
        int x = 3;
//
        obj.lessThanX(s, x);
    }
}
