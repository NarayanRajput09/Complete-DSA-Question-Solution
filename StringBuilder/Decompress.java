public class Decompress {
     public static void main(String[] args) { 
        String str = "4a3c5feg3i"; 
        System.out.println(decompress(str)); 
 
    } 
 
    public static String decompress(String str) { 
        if (str.length() == 0 || str.length() == 1) { 
            return str; 
        } 
        StringBuilder sb = new StringBuilder(); 
 
        for (int i = 0; i < str.length(); i++) { 
            char curr = str.charAt(i); 
            if (curr >= '0' && curr <= '9') { 
                char next = str.charAt(i + 1); 
                int num = (int) (curr - '0'); 
                while (num > 0) { 
                    sb.append(next); 
                    num--; 
                } 
                i++; 
            } else { 
                sb.append(curr); 
            } 
        } 
        return sb.toString(); 
    } 
} 
 


