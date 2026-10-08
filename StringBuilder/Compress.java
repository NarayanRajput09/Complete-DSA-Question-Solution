public class Compress {
     public static void main(String[] args) { 
        String str = "aaabbbbfffffeegiiiii"; 
        System.out.println(compress(str)); 
    } 
    public static String compress(String str) { 
        if (str.length() == 0 || str.length() == 1) { 
            return str; 
        } 
        StringBuilder sb = new StringBuilder(); 
        int count = 1; 
 
        for (int i = 1; i < str.length(); i++) { 
            char pre = str.charAt(i - 1); 
            char curr = str.charAt(i); 
 
            if (pre != curr) { 
                if (count > 1) { 
                    sb.append(count); 
                } 
                 sb.append(pre); 
                count = 1; 
            } else { 
                count++; 
            } 
        } 
        if (count > 1) { 
            sb.append(count); 
        } 
        sb.append(str.charAt(str.length() - 1)); 
        return sb.toString(); 
    } 
} 
 
 
 