package util;

import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.print("Enter a string: ");
        String userString = input.getString();
        System.out.println("You entered: " + userString);

        System.out.print("Enter 'yes' or 'no': ");
        boolean userYesNo = input.yesNo();
        System.out.println("You entered: " + userYesNo);

        System.out.print("Enter an integer between 1 and 10: ");
        int userInt = input.getInt(1, 10);
        System.out.println("You entered: " + userInt);

        System.out.print("Enter an integer: ");
        int userInt2 = input.getInt();
        System.out.println("You entered: " + userInt2);

        System.out.print("Enter a decimal number between 0.5 and 1.5: ");
        double userDouble = input.getDouble(0.5, 2.5);
        System.out.println("You entered: " + userDouble);

        System.out.print("Enter a decimal number: ");
        double userDouble2 = input.getDouble();
        System.out.println("You entered: " + userDouble2);
    }
}
