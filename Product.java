import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws Exception {

    final Scanner sc = new Scanner(System.in);

    int testcases = sc.nextInt();

    for(int x = 0;x<testcases;x++){
      final int rowsA = sc.nextInt(), colsA = sc.nextInt();
      final int A[][] = new int[rowsA][colsA];

      for(int i = 0; i < rowsA; i++) {
        for(int j = 0; j < colsA; j++) {
          A[i][j] = sc.nextInt();
        }
      }

      int rowsB = sc.nextInt();
      int colsB = sc.nextInt();
      int B[][] = new int[rowsB][colsB];

      if(colsA != rowsB) {
        System.out.println("IMPOSSIBLE");
        continue;
      }

      for(int i = 0; i < rowsB; i++) {
        for(int j = 0; j < colsB; j++) {
          B[i][j] = sc.nextInt();
        }
      }

      int C[][] = solve(A, B, rowsA, colsA, rowsB, colsB);

      print(C);


    }
  }

  public static int[][] solve(int[][] A, int[][] B, int rowsA, int colsA, int rowsB, int colsB) {
    int C[][] = new int[rowsA][colsB];

    for(int i = 0; i < rowsA; i++) {
      for(int j = 0; j < colsB; j++) {

        for(int k = 0; k < rowsB; k++) {
          C[i][j] += (A[i][k] * B[k][j]);
        }
      }
    }
    return C;
  }

  public static void print(int[][] a) {
    for(int i = 0; i < a.length; i++) {
      for(int j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j] + " ");
      }
        System.out.println();
    }
    
  }
}
