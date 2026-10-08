public class Toggle {

    public static void main(String[] args) { 
        String str = "Hey I Am balmiki"; 
 
        System.out.println(convert(str)); 
    } 
 
    public static String convert(String str) { 
        if (str.length() == 0) { 
            return str; 
        } 
        StringBuilder sb = new StringBuilder(); 
        for (int i = 0; i < str.length(); i++) { 
            char ch = str.charAt(i); 
            
            if (ch >= 'A' && ch <= 'Z') { 
                ch = (char) (ch - 'A' + 'a'); 
 
            } else if (ch >= 'a' && ch <= 'z') { 
                ch = (char) (ch - 'a' + 'A');   
            }
            sb.append(ch); 
} 
return sb.toString(); 
}
     }
    
