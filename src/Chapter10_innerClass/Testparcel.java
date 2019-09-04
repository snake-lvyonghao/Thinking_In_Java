package Chapter10_innerClass;

public class Testparcel {
    public static void main(String[] args){
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("ABC");
    }
}

class Parcel4 {
    private class PContents implements Contents{

        private int i = 11;

        @Override
        public int value(){ return i;}
    }
    protected class PDesdtination implements Destination{

        private String label;

        private PDesdtination(String whereTo)
        {
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s)
    {
        return new PDesdtination(s);
    }

    public Contents contents(){
        return new PContents();
    }
}
