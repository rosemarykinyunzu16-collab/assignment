import java.util.Scanner;

public class assigns {
    public static void main(String[] args) {
        final String correctUsername = "admin";
        final String correctPassword = "12345";

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        boolean loggedIn = false;

        while (attempts < 3) {
            System.out.print("Enter Username: ");
            String username = scanner.nextLine();

            // Simulate password masking
            System.out.print("Enter Password: ");
            String password = readPassword(scanner);

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("✅ Login successful. Welcome " + username + "!");
                loggedIn = true;
                break;
            } else {
                System.out.println("❌ Invalid username or password. Try again.");
                attempts++;
            }
        }

        if (!loggedIn) {
            System.out.println("🚫 Too many failed attempts. Access denied!");
        }

        scanner.close();
    }

    // Method to simulate password masking (prints * for each char)
    private static String readPassword(Scanner scanner) {
        String input = scanner.nextLine();
        StringBuilder masked = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            masked.append("*");
        }
        System.out.println(masked.toString()); // Show masked password
        return input; // Return actual password for checking
    }
}


