
	// 12. How do you find the index of an element in an array in     Java?

public class FindIndex {
   public static void main(String[] args) {
        int[]arr={4,2,1,0,3,9,7,2};
                int ele=9;

       int idx=FindIndex(arr,ele);
       System.out.print(idx);
    }
    public static int FindIndex(int[]arr,int target){

       for(int i=0;i<arr.length;i++){
       int ele =arr[i];
       
      if(ele==target){
        return i;
      }
    }
     return -1;
    }
  }

