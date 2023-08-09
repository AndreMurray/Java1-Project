package grades;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        students.put("rickRolled", new Student("Rick", 100, 90, 80));
        students.put("mortyMcFly", new Student("Morty", 100, 70, 85));
        students.put("summerPaulWalker", new Student("Summer", 70, 75, 100));
        students.put("jerryMcguare", new Student("Jerry", 90, 75, 55));
        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students:\n");
        for (String username : students.keySet()) {
            System.out.print("|" + username + "| ");
        }
        System.out.println("\n\nWhat student would you like to see more information on?");
System.out.print("> ");
        Console console = System.console();
        if (console == null) {
            System.err.println("No console available.");
            System.exit(1);
        }
        String name = console.readLine("\n\nWhat student would you like to see more information on?");

        if (students.containsKey(name)) {
            System.out.println("\nName: " + students.get(name).getName() + " - GitHub Username: " + name);
            System.out.println("Current Average: " + students.get(name).getGradeAverage());
        } else {
            System.out.println("Sorry, no student found with the GitHub username of \"" + name + "\".");
        }

    }
}
