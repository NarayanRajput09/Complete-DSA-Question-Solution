import java.util.ArrayList;

public class NQueen {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>(); 
        
        ArrayList<Integer> curr = new ArrayList<>(); 
        
          if(n==1 ){
            curr.add(1); 
            ans.add(new ArrayList<>(curr)); 
            return  ans ; 
        }
        
        int[][] mat = new int[n][n]; 
        
        helper(mat , n , 0 , ans , curr ); 
        
        return ans ; 
        
    }
    
    public void helper(int[][] mat , int n , int row , ArrayList<ArrayList<Integer>> ans,  ArrayList<Integer> curr) {
        
      
        
        if(row == n ){
            ans.add(new ArrayList<>(curr));
            return ; 
        }
        
        
        for(int c=0 ; c<n;c++){
            if(isSafe(mat,row,c )){
            mat[row][c] =  1; 
            curr.add(c+1); 
            helper(mat , n , row+1 , ans , curr ); 
             mat[row][c] =  0; 
             curr.remove(curr.size()-1);
            }
        }
        
        
    }
    
    public boolean isSafe(int[][]  mat , int r ,int  c ){
        
        int tr = r-1 ; 
        int tc = c ; 
        while(tr>=0 ){
            if(mat[tr][tc] == 1){
                return false ; 
            }
            tr--; 
        }
        int ldr = r-1 ; 
        int ldc = c-1 ; 
        
        while(ldr>=0 && ldc >=0 ){
              if(mat[ldr][ldc] == 1){
                return false ; 
            }
            ldr--; 
            ldc--; 
        }
        
          int rdr = r-1 ; 
        int rdc = c+1 ; 
        
        while(rdr>=0 && rdc < mat.length ){
              if(mat[rdr][rdc] == 1){
                return false ; 
            }
            rdr--; 
            rdc++; 
        }
        
        return true ; 
    }
}
