import java.util.Scanner;
import java.util.Random;

public abstract class Main {
    static Random rd = new Random();
    static boolean dice = rd.nextBoolean();
    public static String operatorDisplay;
    static int operatorSelector(int x, int y) {
        int z = 0;

        if (dice) {
            z = x + y;
        } else if (!(dice)) {
            z = x - y;
        }
        return z;
    }

    static String operator() {
        if (dice) {
            operatorDisplay = "+";
        } else if (!(dice)) {
            operatorDisplay = "-";
        }
        return operatorDisplay;
    };




    public static void main(String[] args) {

        int wins = 0;
        int loses = 0;
        int i = 0;
        while (i < 10) {




            int randomInt = (int) (Math.random() * 100);
            int randomInt2 = (int) (Math.random() * 100);
            int operation = operatorSelector(randomInt, randomInt2);

            System.out.println(randomInt + operator() + randomInt2);
            Scanner input = new Scanner(System.in);
            int result = input.nextInt();


            if (result == operation) {
                System.out.println("Correct!");
                wins = wins + 1;
                i++;
            } else {
                System.out.println("Nope");
                loses = loses + 1;
                i++;
            }

        }
        System.out.println("Wins:" + wins);
        System.out.println("Loses:" + loses);
    }
}
