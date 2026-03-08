package Code.C2;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Collect user input
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        input.nextLine(); // clear buffer

        System.out.print("Enter your favourite programming language: ");
        String language = input.nextLine();

        System.out.print("Enter your study hours per week: ");
        double studyHours = input.nextDouble();

        // Boolean variable
        boolean isAdult = age >= 18;

        // Call greeting method
        greetStudent(name);

        // Print student profile
        System.out.println("\n--- Student Profile ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Favourite Language: " + language);
        System.out.println("Study Hours Per Week: " + studyHours);
        System.out.println("Adult: " + isAdult);

        // Decision making
        if (age >= 18) {
            System.out.println("You are an adult learner.");
        } else {
            System.out.println("You are a young learner.");
        }

        if (studyHours >= 10) {
            System.out.println("Great study habit!");
        } else {
            System.out.println("Try to spend more time practising.");
        }

        // Loop example
        for (int i = 1; i <= 5; i++) {
            System.out.println("Keep learning Java!");
        }

        input.close();
    }

    // Method
    public static void greetStudent(String name) {
        System.out.println("\nWelcome, " + name + "!");
    }
}
