public class Safeguard {

    public static boolean safeguardStop = false;

    public void stopProgramOnMaxInteger() {

        if (TimePassing.secondsPassed == Integer.MAX_VALUE) {

            safeguardStop = true;
            IO.println("This simulation session has been auto-terminated due to the fact that the time counter has reached the maximum integer limit supported by your computer.");

        }

    }
}
