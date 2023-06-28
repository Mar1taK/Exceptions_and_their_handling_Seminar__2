package Task4;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();
        logger.info(getStringConsole("Введите значение: "));

    }

    public static String getStringConsole(String message) {
        String stringValue = "";
        Scanner scanner = new Scanner(System.in);

        while (stringValue.isEmpty()) {
            try {
                System.out.println(message);
                stringValue = scanner.nextLine();
                if (stringValue.isEmpty()) {
                    throw new RuntimeException("Строка не может быть пустой!");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return stringValue;
    }
}
