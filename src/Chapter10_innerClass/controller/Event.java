package Chapter10_innerClass.controller;

public abstract class Event {
    private long evenTime;
    protected final long delayTime;

    protected Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    public void start(){
        evenTime = System.nanoTime() + delayTime;
    }

    public boolean ready(){
        return System.nanoTime() >= evenTime;
    }

    public abstract void action();
}
