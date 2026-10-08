public class ContenateTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {4,5,6,7,8,9};
        int[] arr2 = {8,9,7,5,6,2};

        int l1=arr1.length;
        int l2=arr2.length;

        int resLength=l1+l2;
        int res[]=new int[resLength];
         System.out.print(res);

        // int arrlength = arr1.length + arr2.length;
        // int[] arr = new int[arrlength];

        // // // Copy arr1 into arr
        // for(int i=0; i<arr1.length; i++){
        //     arr[i] = arr1[i];
        // }

        // // Copy arr2 into arr
        // for(int j=0; j<arr2.length; j++){
        //     arr[arr1.length + j] = arr2[j];
        // }

        // System.out.print("Concatenated Array: ");
        // for(int a=0; a<length; a++){
        //     System.out.print(arr[a] + " ");
       // }
       for(int i=0;i<resLength;i++){
        int ele=0;
        if(i<l1){
            ele=arr1[i];
        }else{
         ele=arr2[i-l1];
         }
        res[i]=ele;

        
       }
       System.out.println(" ");
    }
}
