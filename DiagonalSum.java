import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
              int n=sc.nextInt();
              int m=sc.nextInt();
              int [][] arr=new int [n][m];
              int [][] arr1=new int [n][m];
              for(int i=0;i<n;i++){
                  for(int j=0;j<m;j++){
                      arr[i][j]=sc.nextInt();
                  }
              }
              int Rsum=0;
              int Lsum=0;
              for(int i=0;i<n;i++){
                  for(int j=0;j<n;j++){
                      if(i==j){
                          Rsum+=arr[i][j];
                      }
                      if((i+j)==n-1){
                          Lsum+=arr[i][j];
                      }
                  }
              }
              System.out.println(Rsum+" "+Lsum);
            
        }
        

    }
}
