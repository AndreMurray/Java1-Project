package movie;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {


    public static void main(String[] args) {

        do {
            System.out.println("\nWhat would you like to do?\n");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");

            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();

            if (choice == 0) {
                System.out.println("Goodbye!");
                break;
            }

            Movie[] movies = MoviesArray.findAll();

            switch (choice) {
                case 1:
                    displayMovies(movies);
                    break;
                case 2:
                    displayMoviesByCategory(movies, "animated");
                    break;
                case 3:
                    displayMoviesByCategory(movies, "drama");
                    break;
                case 4:
                    displayMoviesByCategory(movies, "horror");
                    break;
                case 5:
                    displayMoviesByCategory(movies, "scifi");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (true);
    }

    private static void displayMovies(Movie[] movies) {
        System.out.println("\nAll Movies:\n");
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }

    private static void displayMoviesByCategory(Movie[] movies, String category) {
        System.out.println("\nMovies in the " + category + " category:\n");
        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

}
