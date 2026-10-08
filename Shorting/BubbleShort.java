import java.sql.Array;
import java.util.Arrays;

public class BubbleShort {
    public static void main(String[]args){
        int arr [] = {7,8,2,4,3,1,0};

        for(int i =0; i<arr.length-1;i++){
            for(int j = 0; j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int k =arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= k;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
