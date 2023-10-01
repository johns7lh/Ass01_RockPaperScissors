import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String playA = " ";
        String playB = " ";
        boolean done = false;
        Scanner in = new Scanner(System.in);


            System.out.println("Player A Enter RPS move [R P S]: ");
            if (in.hasNextLine()) {
                playA = in.nextLine();
            }
            if (playA.equalsIgnoreCase("R")) {
                do {
                    System.out.println("You played Rock!");
                    done = true;

                } while (!done);

            } else if (playA.equalsIgnoreCase("P")) {
                do {
                    System.out.println("You played Paper!");
                    done = true;

                } while (!done);

            } else if (playA.equalsIgnoreCase("S")) {
                do {
                    System.out.println("You played Scissors!");
                    done = true;

                } while (!done);

            } else {
                System.out.println("You told me " + playA);
                System.out.println("Run the program again and do the input correctly");

            }

            System.out.println("Player B Enter RPS move [R P S]: ");
            if (in.hasNextLine()) {
                playB = in.nextLine();
            }

            if (playB.equalsIgnoreCase("R")) {
                do {
                    System.out.println("You played Rock!");
                    done = true;

                } while (!done);

            } else if (playB.equalsIgnoreCase("P")) {
                do {
                    System.out.println("You played Paper!");
                    done = true;

                } while (!done);

            } else if (playB.equalsIgnoreCase("S")) {
                do {
                    System.out.println("You played Scissors!");
                    done = true;

                } while (!done);

            } else {
                System.out.println("You told me " + playB);
                System.out.println("Run the program again and do the input correctly");

            }

            if (playA.equalsIgnoreCase("R")) {
                if (playB.equalsIgnoreCase("R")) {
                    System.out.println("Rock Vs. Rock, it's a tie!");
                } else if (playB.equalsIgnoreCase("P")) {
                    System.out.println("Rock Vs. Paper, paper wins!");
                } else if (playB.equalsIgnoreCase("S")) {
                    System.out.println("Rock VS. Scissors, rock wins!");
                }
            }
            if (playA.equalsIgnoreCase("P")) {
                if (playB.equalsIgnoreCase("R")) {
                    System.out.println("Rock Vs. Paper, paper wins!");
                } else if (playB.equalsIgnoreCase("P")) {
                    System.out.println("Paper Vs. Paper, it's a tie!");
                } else if (playB.equalsIgnoreCase("S")) {
                    System.out.println("Paper VS. Scissors, scissors wins!");
                }
            }
            if (playA.equalsIgnoreCase("S")) {
                if (playB.equalsIgnoreCase("R")) {
                    System.out.println("Rock Vs. Scissors, rock wins!");
                } else if (playB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors Vs. Paper, scissors wins!");
                } else if (playB.equalsIgnoreCase("S")) {
                    System.out.println("Scissors VS. Scissors, it's a tie!");
                }
            }

    }
}
