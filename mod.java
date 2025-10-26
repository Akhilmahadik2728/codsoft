import java.util.*;
public class mod  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chances = 10;
        int finals = 0;
        boolean oncemore = true;
        System.out.println("Welcome to number game");
        System.out.println("Hey man, you have " + chances + " chances to win the game");
        while (oncemore) {
            int ran = getrandN(1, 100);
            boolean guess = false;
            for (int i = 0; i < chances; i++) {
                System.out.println("Chance " + (i + 1) + ": Enter your guess: ");
                int user = sc.nextInt();
                if (user == ran) {
                    guess = true;
                    finals += 1;
                    System.out.println("Congratulations! You won");
                    break;
                } else if (user > ran) {
                    System.out.println("Too High");
                } else {
                    System.out.println("Too Low");
                }
            }
            if (!guess) {
                System.out.println("Sorry man. You lost a chance. The number was " + ran);
            }
            System.out.println("Restart? (Y/N)");
            String AC = sc.next();
            oncemore = AC.equalsIgnoreCase("Y");
        }
        System.out.println("Game over");
        System.out.println("Your score: " + finals);
        sc.close();
    }

    public static int getrandN(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
    }
}
    

