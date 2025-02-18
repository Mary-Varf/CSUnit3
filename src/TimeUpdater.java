class TimeUpdater extends Thread {
    private final Clock clock;

    public TimeUpdater(Clock clock) {
        this.clock = clock;
    }

    @Override
    public void run() {
        clock.printTime();
    }
}
