import java.util.Random;

public class Runner {

    public static void printArray(int[][] chessboard) {
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
                System.out.print(chessboard[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int N = 8;
        int[][] chessboard = new int[N][N];
        Random random = new Random();

        int towerCount = 0;
        while (towerCount < N) {
            int j = random.nextInt(8);
            int k = random.nextInt(8);
            if (chessboard[j][k] == 0) {
                chessboard[j][k] = 1;
                towerCount++;
            }
        }

        printArray(chessboard);

        for (int i = 0; i < chessboard.length; i++) {
            int sum = 0;
            for (int j = 0; j < chessboard[i].length; j++) {
                sum += chessboard[i][j];
            }

            if (sum >= 2) {
                System.out.println("Jest bicie! " + i);
                break;
            } else {
                System.out.println("Nie ma bicia" );

            }

        }

    }

}

