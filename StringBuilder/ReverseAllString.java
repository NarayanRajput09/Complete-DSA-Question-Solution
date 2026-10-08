public class ReverseAllString {
  
    public static void main(String[] args) { 
        String str = "hey i love java"; 
 
        System.out.println(ReverseEachWords(str)); 
    } 
    public static String ReverseEachWords(String str){ 
 
        StringBuilder word = new StringBuilder(); 
        StringBuilder ans = new StringBuilder(); 
 
        for(int i=0; i<str.length(); i++){ 
            char ch = str.charAt(i); 
 
            if(ch!=' '){ 
                word.append(ch); 
 
            }else{ 
                ans.append(word.reverse().append(" ")); // .append(" ") 

                word.setLength(0); // word reset 
            } 
        } 
        // last word reverse 
        if(word.length() > 0){ 
            ans.append(word.reverse()); 
        } 
        return ans.toString(); 
    }
}
