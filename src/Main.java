import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;
        do {
            System.out.println("Welcome to game. Please make your choice and press Enter:");
            System.out.println("1. Start a new game:");
            System.out.println("2. Options:");
            System.out.println("3. Credits:");
            System.out.println("4. Exit");

            command = scanner.nextLine();
            switch (command){
                case "1":
                    startNewGame();
                    break;
                case "2":
                    openOptionalMenu();
                    break;
                case  "3":
                    showInformation();
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Command not recognized. Press a new command.");

            }
        }
        while (!command.equals("4"));
    }

    private static void showInformation() {
    }

    private static void openOptionalMenu() {
    }

    private static void startNewGame() {
    }
}
