import java.text.SimpleDateFormat;
import java.util.Date;

class Clock {
    final int SEC = 1000;
    final String FORMAT = "HH:mm:ss dd-MM-yyyy";

    public void printTime() {
        SimpleDateFormat formatter = new SimpleDateFormat(FORMAT);
        while (true) {
            System.out.println(formatter.format(new Date()));
            try {
                Thread.sleep(SEC);
            } catch (InterruptedException e) {
                System.out.println("Error occurred: " + e.getMessage());
            }
        }
    }
}
