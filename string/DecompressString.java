public class DecompressString {
    public static void main(String[] args) {
        String str = "4a4b4a4cdeft5i";
        String decompressed = decompress(str);

        System.out.println(decompressed);
        
    }
   
    public static String decompress(String str) {


    
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }

        String ans = "";

        for (int i = 0; i < str.length(); i++) {

            char curr = str.charAt(i);

            if (curr >= '0' && curr <= '9') {
                char next = str.charAt(i + 1);
                int num = (int) (curr - '0');
                while (num > 0) {
                    ans += next;
                    num--;
                }
                i++;
            } else {
                ans += curr;
            }
        }
        return ans;
    }
}

