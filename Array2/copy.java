
	// 11. How do you copy an array in Java?

   public class copy {
    public static void main(String[] args) {
        int[]arr={1,5,6,4,8,};
        MakeCopy(arr);
    }
    public static int[]MakeCopy(int[]arr){
        int[]res =new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            res[i]=arr[i];
            System.out.print(arr[i]);
        }
        return res;
    }

}
    

