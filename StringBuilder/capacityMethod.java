public class capacityMethod {
        public static void main(String[] args) {
        StringBuilder sb  = new StringBuilder("Narayan");
        System.out.println("Initial: "+ sb);

        sb.capacity();
        System.out.println(" After capacity : "+ sb.capacity() );
         System.out.println(" After length : "+ sb.length() );

    }
}
