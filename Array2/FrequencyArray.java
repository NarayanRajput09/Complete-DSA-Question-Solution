
    // 14. Write a Java program to find the frequency of an element in an    array.


public class FrequencyArray {
    public static void main(String[] args) {
        int[]arr={1,5,1,9,1,9,1};
        int n=1;
        int count=0;
        for(int i=0;i<arr.length;++i){
            if(arr[i]==n){
                count++;
            }
        }
        System.out.print(count);
    }
}
