public class PomodoroTimer {

    public void startSession(int minutes) {
        System.out.println("\n⏳ Starting Pomodoro Session for " + minutes + " minutes...");

        try {
            for (int i = minutes; i > 0; i--) {
                System.out.println("Time left: " + i + " minutes");
                Thread.sleep(1000); // simulate (1 sec = 1 min)
            }
        } catch (InterruptedException e) {
            System.out.println("Timer interrupted!");
        }

        System.out.println("✅ Session Complete! Take a break.");
    }
}