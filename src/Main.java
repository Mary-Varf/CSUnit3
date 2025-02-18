//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static final int THREE_SEC = 3000;
    public static void main(String[] args) {
        Clock clock = new Clock();

        Thread displayThread = new TimeUpdater(clock);
        displayThread.setPriority(Thread.MAX_PRIORITY);

        Thread backgroundThread = new Thread(() -> {
            while (true) {
                System.out.println("Background task with low priority");
                try {
                    Thread.sleep(THREE_SEC);
                } catch (InterruptedException e) {
                    System.out.println("Background thread error: " + e.getMessage());
                }
            }
        });
        backgroundThread.setPriority(Thread.MIN_PRIORITY);

        displayThread.start();
        backgroundThread.start();
    }
}
