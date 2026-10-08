public class RemoveAllTheSpace2 {
    public static void main(String[] args) {
        String str ="This is narayan rajpoot";
 
        System.out.println(removespaces(str));
        
    }
    public static String removespaces(String str){
        String  ans ="";
        for(int i=0;i<str.length();i++){
        char ch =str.charAt(i);
        if(ch!=' '){
            ans =ans+ch;
        }

        }
        return ans;
    }
}
