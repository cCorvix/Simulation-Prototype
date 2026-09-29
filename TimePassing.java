public class TimePassing {

    public static boolean isDay = true;

    public static int secondsPassed = 0;

    public void handleAllTime() {


        // Use a clean "true" condition for an infinite loop
        while (Safeguard.safeguardStop == false) {

            // Fixed: changed =+ to += so it increments correctly
            secondsPassed += 1;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Cleanly handle the thread interruption and exit the loop
                Thread.currentThread().interrupt();
                break;



            }

            IO.println(secondsPassed);

            if (secondsPassed == 43200 && isDay == true) {

                secondsPassed = 0;
                System.out.println("\n\nIt is now night\n\n");
                isDay = false;

            } else if (secondsPassed == 43200 && isDay == false) {

                secondsPassed = 0;
                System.out.println("\n\nIt is now day\n\n");
                isDay = true;

            }

        }

    }

}
