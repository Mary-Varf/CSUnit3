class TimeUpdater extends Thread {
    private final Clock clock;

    public TimeUpdater(Clock clock, String name) {
        super (name);
        this.clock = clock;
    }

    @Override
    public void run() {
        clock.printTime();
    }
}
