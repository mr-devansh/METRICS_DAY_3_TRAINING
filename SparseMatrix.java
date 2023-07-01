import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ar[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        int sparse=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(ar[i][j]==0){
                    sparse++;
                }
            }
        }
        if(sparse>(n*m)/2){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
