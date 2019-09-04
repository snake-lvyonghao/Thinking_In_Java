package Chapter10_innerClass.controller;

public class GreenhouseControls extends Controller {
    private boolean light = false;

    public class LightOn extends Event{
        public LightOn(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            light = true;
        }

        public String toString(){
            return "Light is on\n";
        }
    }

    public class LightOff extends Event{
        public LightOff(long delayTime)
        {
            super(delayTime);
        }

        @Override
        public void action() {
            light = false;
        }

        public String toString(){
            return "Light is off\n";
        }
    }

    private boolean water = false;

    public class WaterOn extends Event{
        public WaterOn(long delaytime){
            super(delaytime);
        }

        @Override
        public void action() {
            water = true;
        }

        public String toString(){
            return "Greenhouse water is on\n";
        }
    }

    public class WaterOff extends Event{
        public WaterOff(long delaytime){
            super(delaytime);
        }

        @Override
        public void action() {
            water = false;
        }

        public String toString(){
            return "Greenhouse water is off\n";
        }
    }

    private String thermostat = "Day";

    public class ThermostNight extends Event{
        public ThermostNight(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Night";
        }

        @Override
        public String toString() {
            return "Thermostat on night setting\n";
        }
    }

    public class ThermostDay extends Event{
        public ThermostDay(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Day";
        }

        @Override
        public String toString() {
            return "Thermostat on day setting\n";
        }
    }

    public class Bell extends Event{
        public Bell(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }

        public String toString()
        {
            return "Being!\n";
        }
    }

    public class Restart extends Event{
        private Event[] eventlist;
        public Restart(long delayTime,Event[] eventlist)
        {
            super(delayTime);
            this.eventlist = eventlist;
            for (Event e :
                    eventlist) {
                addEvent(e);
            }
        }

        @Override
        public void action() {
            for (Event e :
                    eventlist) {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }

        public String toString(){
            return "Restarting system\n";
        }
    }

    public static class Terminate extends Event{
        public Terminate(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }

        public String toString()
        {
            return "Terminating\n";
        }
    }
}
