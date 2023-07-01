import java.io.*;
import java.util.*;

public class Solution {

    static void Spare(int [][] matrix) {
        int StartRow=0;
        int EndRow=matrix.length-1;
        int StartColumn=0;
        int EndColumn=matrix[0].length-1;

        while(StartRow<=EndRow && StartColumn<=EndColumn){
            for(int i=StartColumn;i<=EndColumn;i++){
                System.out.print(matrix[StartRow][i]+" ");
            }

            for (int j=StartRow+1;j<=EndRow;j++){
                System.out.print(matrix[j][EndColumn]+" ");
            }
            for(int i=EndColumn-1;i>=StartColumn;i--){
                if(StartRow==EndRow){
                    break;
                }
                System.out.print(matrix[EndRow][i]+" ");
            }
            for(int j=EndRow-1;j>=StartRow+1;j--){
                if(StartColumn==EndColumn){
                    break;
                }
                System.out.print(matrix[j][StartColumn]+" ");
            }
            StartRow++;
            EndRow--;
            StartColumn++;
            EndColumn--;
        }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
              int n=sc.nextInt();
              int [][] arr=new int [n][n];
              for(int i=0;i<n;i++){
                  for(int j=0;j<n;j++){
                      arr[i][j]=sc.nextInt();
                  }
              }
              Spare(arr);
            System.out.println();
            
        }
        

    }
}
