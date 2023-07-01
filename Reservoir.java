import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        
        for (int t = 0; t < testCases; t++) {
            int n1 = scanner.nextInt();
            int m = scanner.nextInt();
            char[][] matrix = new char[n1][m];
            
            for (int i = 0; i < n1; i++) {
                String row = scanner.next();
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = row.charAt(j);
                }
            }
            
            if (checkPattern(n1, m, matrix)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        
        scanner.close();
    }
    
    public static boolean checkPattern(int n1, int m, char[][] matrix) {
        boolean flag = true;
        char[][] extendedMatrix = new char[n1 + 1][m];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m; j++) {
                extendedMatrix[i][j] = matrix[i][j];
            }
        }
        
        for (int j = 0; j < m; j++) {
            extendedMatrix[n1][j] = '0';
        }
        
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 'B') {
                    if (extendedMatrix[i + 1][j] == 'A' || extendedMatrix[i + 1][j] == 'W') {
                        flag = false;
                    }
                } else if (matrix[i][j] == 'W') {
                    if (j == 0 || j == m - 1) {
                        flag = false;
                    } else {
                        if (extendedMatrix[i + 1][j] == 'A') {
                            flag = false;
                        }
                        if (extendedMatrix[i][j - 1] == 'A' || extendedMatrix[i][j + 1] == 'A') {
                            flag = false;
                        }
                    }
                }
                
                if (!flag) {
                    break;
                }
            }
            if (!flag) {
                break;
            }
        }
        
        return flag;
    }
}
