import java.text.SimpleDateFormat;
import java.util.Date;

class Clock {
    final String FORMAT = "HH:mm:ss dd-MM-yyyy";
    private final int repeatTime;

    public Clock(int repeatTime) {
        this.repeatTime = repeatTime;
    }

    public void printTime() {
        SimpleDateFormat formatter = new SimpleDateFormat(FORMAT);
        while (true) {
            System.out.println(Thread.currentThread().getName() + ": " + formatter.format(new Date()));
            try {
                Thread.sleep(repeatTime);
            } catch (InterruptedException e) {
                System.out.println("Error occurred: " + e.getMessage());
            }
        }
    }
}
