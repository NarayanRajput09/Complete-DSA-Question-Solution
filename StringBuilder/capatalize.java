public class capatalize {

    public static void main(String[] args) { 
        String str = "saurabh sir is my Fav teacher"; 
        System.out.println(ConvertFirstLatterIntoUpperCase(str)); 
 
    } 
    public static String ConvertFirstLatterIntoUpperCase(String str) { 
 
        str = str.trim();   
        StringBuilder sb =  new StringBuilder(); 
 
        // fc = first character 
        char fc = str.charAt(0); 
        if (fc >= 'a' && fc <= 'z') {   
            fc = (char) (fc - 'a' + 'A'); 
        } 
         sb.append(fc); 
 
        // baaki character 
        for (int i = 1; i < str.length(); i++) { 
            char curr = str.charAt(i); 
            char pre = str.charAt(i - 1); 
 
            if (pre == ' ' && curr != ' ' && curr >= 'a' && curr <= 'z') { 
                curr = (char) (curr - 'a' + 'A'); 
 
            } 
             sb.append(curr); 
        } 
        return sb.toString(); 
    }
}

