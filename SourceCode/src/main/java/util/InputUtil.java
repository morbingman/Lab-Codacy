package util;

import java.util.Scanner;

public class InputUtil {
    private Scanner scanner = new Scanner(System.in);

    public int getIntInput(String prompt) {
        while(true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    public String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    public double getDblInput(String prompt) {
        while(true) {
            try {
                double value = Double.parseDouble(getStringInput(prompt));
                if(value >= 0.0) {
                    return value;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        }
    }
}
