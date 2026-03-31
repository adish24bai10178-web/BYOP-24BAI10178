import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scheduler scheduler = new Scheduler();
        PomodoroTimer timer = new PomodoroTimer();

        System.out.println("🎯 Smart Study Planner");

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. Generate Schedule");
            System.out.println("3. Start Pomodoro");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter priority (1-5): ");
                    int priority = sc.nextInt();

                    System.out.print("Enter duration (minutes): ");
                    int duration = sc.nextInt();

                    scheduler.addTask(new Task(name, priority, duration));
                    break;

                case 2:
                    scheduler.generateSchedule();
                    break;

                case 3:
                    System.out.print("Enter session time: ");
                    int time = sc.nextInt();
                    timer.startSession(time);
                    break;

                case 4:
                    System.out.println("Good luck with your studies!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}