import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String ROSTER_FILE = "roster.csv";

        Faculty instructor = new Faculty(7001, "Dr. John Doe", "Computer Science");

        Course activeCourse = new Course("TEMP-000", "Default Course Title", instructor);

        activeCourse.loadRoster(ROSTER_FILE);

        boolean running = true;
        while (running) {
            System.out.println("\n=== " + activeCourse.getCourseCode() + ": " + activeCourse.getTitle() + " ===");
            System.out.println("1. Register a New Student");
            System.out.println("2. View Standard Roster (Enrollment Order)");
            System.out.println("3. View Academic Leaderboard (Highest GPA First)");
            System.out.println("4. Drop Student by ID");
            System.out.println("5. Save Records and Exit System");
            System.out.print("Select menu option: ");

            int choice = 0;
            try {
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please input a valid option number.");
                input.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter Student ID: ");
                        int id = input.nextInt();
                        System.out.print("Enter Student Name: ");
                        String name = input.next();
                        System.out.print("Enter Baseline GPA: ");
                        double gpa = input.nextDouble();

                        Student newStudent = new Student(id, name, gpa);

                        activeCourse.registerStudent(newStudent);
                    } catch (InvalidGPAException e) {
                        System.out.println("Registration Terminated: " + e.getMessage());
                    } catch (InputMismatchException e) {
                        System.out.println("Formatting Error: Invalid numeric input type typed.");
                        input.nextLine();
                    }
                    break;

                case 2:
                    System.out.println("\n--- Live Class Roster Status ---");
                    activeCourse.displayClassRoster();
                    break;

                case 3:
                    System.out.println("\n--- GPA Performance Leaderboard ---");
                    activeCourse.displayGpaLeaderboard();
                    break;

                case 4:
                    System.out.print("Enter target Student ID to drop: ");
                    int dropId = input.nextInt();
                    boolean removed = activeCourse.dropStudent(dropId);
                    if (removed) {
                        System.out.println("Update: Student successfully removed from enrollment roster.");
                    }
                    break;

                case 5:
                    activeCourse.saveRoster(ROSTER_FILE);
                    running = false;
                    break;

                default:
                    System.out.println("Please choose a value from 1 to 5.");
            }
        }
        input.close();
    }
}