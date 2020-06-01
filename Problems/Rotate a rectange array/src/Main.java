import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner =new Scanner (System.in);
        byte n = scanner.nextByte ();
        byte m = scanner.nextByte ();

        int[][] ints = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ints[i][j] = scanner.nextInt ( );
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ints[n - j - 1][i] + " ");
            }
            System.out.println();
        }

    }
}