import java.util.ArrayList;

public class ShortedAssending {

    public static void main(String[] args) {
        int arr []={12,20,30,40,45,55,65,76,82};
       
        ArrayList<Integer>list =new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
         
        }
        for(int i=1; i<list.size();i++){
                //  int pre =list.get(i);
            int pre =list.get(i-1);
            int curr=list.get(i);
            if(pre<curr){
            System.out.println("   assending shorted");
           }else{
              System.out.println(" not assending shorted");

           }
break;   
    }
}
}