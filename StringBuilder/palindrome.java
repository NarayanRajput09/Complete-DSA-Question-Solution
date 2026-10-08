public class palindrome {
     public static void main(String[] args) { 
        String str = "RADAR";  // ye sirf upper ya lower word le liye kam 
 
        System.out.println(checkpalindrome(str));   
 
    } 
    
    public static boolean checkpalindrome(String str) { 
        String ans = ""; 
        for (int i = str.length() - 1; i >= 0; i--) { 
            char ch = str.charAt(i); 
            ans = ans + ch; 
        } 
        if (str.equals(ans)) { 
            return true; 
        } else { 
            return false; 
        } 
    } 
} 
 


