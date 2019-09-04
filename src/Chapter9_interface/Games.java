package Chapter9_interface;

interface Game{
    boolean move();
}

interface Gamefactory{
    Game getGame();
}

class Checkers implements Game{
    private int moves = 0;
    private static final int MOVES = 3;

    @Override
    public boolean move() {
        System.out.println("Checkers move" + moves);
        return ++moves != MOVES;
    }
}

class CheckersFactory implements Gamefactory{
    @Override
    public Game getGame() {
        return new Checkers();
    }
}

class Chess implements Game{
    private int moves = 0;
    private static final int MOVES = 4;

    @Override
    public boolean move() {
        System.out.println("Chess movr" + moves);
        return ++moves != MOVES;
    }
}

class ChessFactory implements Gamefactory{
    @Override
    public Game getGame() {
        return new Chess();
    }
}
public class Games {
    public static void playGame(Gamefactory gamefactory)
    {
       Game s = gamefactory.getGame();
       while(s.move());
    }

    public static void main(String[] args){
        playGame(new CheckersFactory());
        playGame(new ChessFactory());
    }
}
