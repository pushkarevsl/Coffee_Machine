import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ( );
        int m = sc.nextInt ( );
        int[][] ar = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ar[i][j] = sc.nextInt ( );
            }
        }

        int k = sc.nextInt ( );
        int count=0;

        sc.close ( );

        for (int i = 0; i < n; i++) {
            count=0;
            for (int j = 0; j < m; j++) {
                if (ar[i][j] == 0) {
                    count++;
                    if (count == k) {
                        System.out.println (i+1);
                        System.exit (0);
                    }
                } else if (ar[i][j] != 0) {
                    count = 0;
                }
            }
        }
        if(count!=k){
            System.out.println (0);
        }
    }
}