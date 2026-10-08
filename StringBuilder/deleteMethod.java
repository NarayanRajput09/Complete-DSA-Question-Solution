public class deleteMethod {
        public static void main(String[] args) {
        StringBuilder sb  = new StringBuilder("Narayan Rajpoot");
        System.out.println("Initial: "+ sb);

        sb.delete(0,7);
        System.out.println(" After delete : "+ sb );
    }
}
