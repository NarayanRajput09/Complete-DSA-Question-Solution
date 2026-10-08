public class TogalString {
    public static void main(String[] args) {
        String str ="naRaYan RajPoot";
        String result ="";

        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
          
            if(ch>='A'&&ch<='Z'){
              result =result+(char)(ch+32);
            }else if(ch>='a'&&ch<='z'){
                result =result+(char)(ch-32);
            }
             else{
                result=result+ch;
             }
        }System.out.println("String:"+str);
       System.out.println("Toggle:"+result);

        }
    }

