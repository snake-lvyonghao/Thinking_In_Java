package Chapter10_innerClass;

public class Parcel6 {
    private void internalTracking(boolean b)
    {
        if (b) {
            class TrackingSlip{
                private String id;

                public TrackingSlip(String s){
                    id = s;
                }

                String getSlip(){ return id;}
            }
            TrackingSlip ts = new TrackingSlip("silp");
            String s = ts.getSlip();
        }
    }

    public void track() {
        internalTracking(true);
    }

    public static void main(String[] args){
        Parcel6 p = new Parcel6();
        p.track();
    }
}
