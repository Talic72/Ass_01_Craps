import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        String play = "Y";

        while (play.equalsIgnoreCase("Y")) {
            int dice1 = rnd.nextInt(6) + 1;
            int dice2 = rnd.nextInt(6) + 1;
            int totaldie = dice1 + dice2;
            int point = 0;

            System.out.println("First dice: " + dice1);
            System.out.println("Second dice: " + dice2);
            System.out.println("Total dice roll: " + totaldie);

            if (totaldie == 2 || totaldie == 3 || totaldie == 12) {
                System.out.println(totaldie + " is a craps number. You lose!");
            } else if (totaldie == 7 || totaldie == 11) {
                System.out.println(totaldie + " is a natural number. You Win!");
            } else {
                point = totaldie;
                System.out.println(totaldie + " is now the point number.");

                boolean over = false;
                while (!over) {
                    dice1 = rnd.nextInt(6) + 1;
                    dice2 = rnd.nextInt(6) + 1;
                    totaldie = dice1 + dice2;

                    System.out.println("First dice: " + dice1);
                    System.out.println("Second dice: " + dice2);
                    System.out.println("Total dice roll: " + totaldie);
                    System.out.println("Trying for point...");

                    if (totaldie == point) {
                        System.out.println("You made the point! You Win!");
                        over = true;
                    } else if (totaldie == 7) {
                        System.out.println("You rolled a 7! You lose.");
                        over = true;
                    }
                }
            }

            System.out.print("Do you want to play again? (Y/N): ");
            play = in.nextLine();
        }

        System.out.println("Thanks for playing!");
    }
}
