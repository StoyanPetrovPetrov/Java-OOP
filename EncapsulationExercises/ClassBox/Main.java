package EncapsulationExercises.ClassBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double length = Double.parseDouble(scanner.nextLine());
        Double width = Double.parseDouble(scanner.nextLine());
        Double height = Double.parseDouble(scanner.nextLine());

        try {
            Box box = new Box(length,width,height);
            System.out.printf("Surface Area - %.2f%n",box.calculateSurfaceArea());
            System.out.printf("Lateral Surface Area - %.2f%n",box.calculateLateralSurfaceArea());
            System.out.printf("Volume – %.2f",box.calculateVolume());

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
