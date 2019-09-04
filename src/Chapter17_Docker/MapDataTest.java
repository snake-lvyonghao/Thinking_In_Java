package Chapter17_Docker;

import util.Generator;
import util.MapData;
import util.Pair;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

class Letters implements Generator<Pair<Integer,String>>,Iterable<Integer>
{
    private int size = 9;
    private int number = 1;
    private char letter = 'A';

    public Pair<Integer,String> next(){
        return new Pair<Integer, String>(number++,"" + letter++);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return number < size;
            }

            @Override
            public Integer next() {
                return number++;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

}
public class MapDataTest {
    public static void main(String[] args)
    {
        System.out.println(MapData.map(new Letters(),11));
        System.out.println(MapData.map(new Letters(),"Pop"));
    }
}

