
import java.util.Scanner;
import java.util.Random;
public class Main {


    public static void main(String[] args) {
        int[] winningNumbers = new int[3];
        int[][] userNumbers = new int[3][3];
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);



        for (int i = 0; i < 3; i++) {
            winningNumbers[i] = rand.nextInt(50) + 1;
        }



        for (int i = 0; i < 3; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.println("Input " + (j + 1) + "number: ");
                userNumbers[i][j] = scanner.nextInt();
            }
        }



        boolean[] won = new boolean[3];
        for (int i = 0; i < 3; i++) {
            won[i] = true;
            for (int j = 0; j < 3; j++) {
                if (winningNumbers[j] != userNumbers[i][j]) {
                    won[i] = false;
                }
            }
        }
    }
}