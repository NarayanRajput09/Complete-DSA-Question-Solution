public class Camel {
    public static void main(String[] args) { 
        String str = "Hey i Love Java"; 
 
        String ans = convertToCamelCaseSb2(str); 
 
        System.out.println(ans); 
    } 
    public static String convertToCamelCaseSb(String str) { 
        if (str.length() == 0) { 
            return str; 
        } 
        StringBuilder sb = new StringBuilder(str.trim()); 
 
        boolean isSpaceDeleted = false; 
 
        for (int i = 0; i < sb.length(); i++) { 
            char ch = sb.charAt(i); 
            System.out.println(i + " " + ch); 
            if (i == 0 && ch >= 'A' && ch <= 'Z') { 
                sb.setCharAt(i, (char) (ch - 'A' + 'a')); 
            } else if (ch == ' ') { 
                sb.deleteCharAt(i); 
                i--; 
                isSpaceDeleted = true; 
            } else if (isSpaceDeleted) { 
                if (ch >= 'a' && ch <= 'z') { 
                    sb.setCharAt(i, (char) (ch - 'a' + 'A')); 
                } 
                isSpaceDeleted= false; 

       } 
        } 
 
        return sb.toString(); 
        } 
       
       public static String convertToCamelCaseSb2(String str) { 
        if (str.length() == 0) { 
            return str; 
        } 
 
        StringBuilder sb = new StringBuilder(); 
 
        char fc = str.charAt(0); 
        if (fc >= 'A' && fc <= 'Z') { 
            fc = (char) (fc - 'A' + 'a'); 
        } 
        sb.append(fc); 
 
        for (int i = 1; i < str.length(); i++) { 
            char curr = str.charAt(i); 
            char pre = str.charAt(i - 1); 
 
            if (pre == ' ' && curr >= 'a' && curr <= 'z') { 
                curr = (char) (curr - 'a' + 'A'); 
            } 
            if (curr != ' ') { 
                sb.append(curr); 
            } 
        } 
        return sb.toString(); 
    } 
} 
 
