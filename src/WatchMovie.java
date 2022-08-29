import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the movie ticket price \n");
        int price = in.nextInt();
        System.out.println("Enter the movie rating");
        int rating = in.nextInt();

        if (price >= 12 && rating == 5) {
            System.out.println("I am interested in watching this movie");
        } else {
            System.out.println("I am not interested in watching this movie");
        }

    }
}
