public class ReverseOrderString {
    public static void main(String[] args) {
        String str ="Hii i am a chikku";
        System.out.println(reverse(str));
    }
    public static String reverse(String str) {
        String ans ="";

        for(int i=str.length()-1; i>=0;i--){
            char ch =str.charAt(i);
            ans +=ch;
        }
        return ans;
    }
}
