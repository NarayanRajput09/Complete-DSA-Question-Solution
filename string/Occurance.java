public class Occurance {

    public static void main (String[]args){ 
        String str = "narayan"; // occureence means ak specific character 
        char specificChar = 'a'; 
        
        int res = Occureence(str, specificChar); 
        System.out.println("Specific character in a string = "+res); 
 
    } 
    public static int  Occureence(String str , char terget){ 
        int count = 0; 
        for(int i=0; i<str.length(); i++){ 
            char ch = str.charAt(i); 
            if(ch == terget ){ 
                count++; 
            }
       }
 return count; 
    }
}