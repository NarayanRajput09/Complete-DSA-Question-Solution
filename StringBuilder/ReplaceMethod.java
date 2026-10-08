public class ReplaceMethod {
    public static void main(String[] args) {
        StringBuilder sb  = new StringBuilder("Narayan");
        System.out.println("Initial: "+ sb);

        sb.replace(0,7,"welcome To");
        System.out.println(" After replace : "+ sb );
    }
}
