//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Clock clock1 = new Clock(1000);
        Thread displayThread1 = new TimeUpdater(clock1, "Height priority thread");
        displayThread1.setPriority(Thread.MAX_PRIORITY);

        Clock clock2 = new Clock(3000);
        Thread displayThread2 = new TimeUpdater(clock2, "Low priority thread");
        displayThread1.setPriority(Thread.MIN_PRIORITY);

        displayThread1.start();
        displayThread2.start();
    }
}
