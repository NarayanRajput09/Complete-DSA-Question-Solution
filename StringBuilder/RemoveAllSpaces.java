    public class  RemoveAllSpaces{ 
    public static void main(String[]args){ 
        String str = "my name is balmiki"; 
        System.out.println(RemoveAllSpaces(str)); 
 
    } 
    public static String RemoveAllSpaces(String str){ 
        StringBuilder sb = new StringBuilder(); 
        for(int i=0; i<str.length(); i++){ 
            char ch = str.charAt(i); 
            if(ch != ' '){ 
                sb.append(ch); 
            } 
        } 
        return sb.toString(); 
 
    } 
} 
 


