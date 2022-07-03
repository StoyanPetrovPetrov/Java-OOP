package WorkingWithAbstractionExecises.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readPositions(scanner.nextLine());
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] galaxy = new int[rows][cols];

        fillInGalaxy(rows, cols, galaxy);

        String command = scanner.nextLine();
        long starsCollected = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] jediPosition = readPositions(command);
            int[] evilPosition = readPositions(scanner.nextLine());
            int currentRowEvil = evilPosition[0];
            int currentColEvil = evilPosition[1];

            while (currentRowEvil >= 0 && currentColEvil >= 0) {
                if (isInBounds(galaxy,currentRowEvil,currentColEvil)) {
                    galaxy[currentRowEvil][currentColEvil] = 0;
                }
                currentRowEvil--;
                currentColEvil--;
            }

            int currentRowJedi = jediPosition[0];
            int currentColJedi = jediPosition[1];

            while (currentRowJedi >= 0 && currentColJedi < galaxy[1].length) {
                if (isInBounds(galaxy,currentRowJedi,currentColJedi)) {
                    starsCollected += galaxy[currentRowJedi][currentColJedi];
                }

                currentColJedi++;
                currentRowJedi--;
            }

            command = scanner.nextLine();
        }

        System.out.println(starsCollected);


    }
    private static boolean isInBounds(int[][]galaxy,int row,int col){
        return row >= 0 && col >= 0 && row < galaxy.length && col < galaxy[row].length;
    }

    private static int[] readPositions(String command) {
        return Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    private static void fillInGalaxy(int rows, int cols, int[][] galaxy) {
        int value = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                galaxy[row][col] = value++;
            }
        }
    }
}
