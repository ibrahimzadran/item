package collectionApi.items;

import java.util.Scanner;

public class UserInput {
    private static final Scanner sc = new Scanner(System.in);

    public static int getIntInput(String message){
        System.out.println(message);
        while (true){
            try {
                int input = Integer.parseInt(sc.nextLine());
                return input;

            }catch (Exception e){
                System.out.println("Error reading input "+ e.getMessage());
                return 0;

            }
        }
    }
    public static String getStringInput(String message){
        System.out.println(message);
        try {
            return sc.nextLine();

        }catch (Exception e){
            System.out.println("Error reading input "+ e.getMessage());
            return "";
        }
    }
    public static double getDoubleInput(String message) {
        System.out.println(message);
        while (true) {
            try {
                double input = Double.parseDouble(sc.nextLine());
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a double value.");
            } catch (Exception e) {
                System.out.println("Error reading input " + e.getMessage());
                return 0;
            }
        }
    }
    }


