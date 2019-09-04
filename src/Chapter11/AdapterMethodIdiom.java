package Chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

class ReversibleArratKist <T> extends ArrayList{
    public ReversibleArratKist(Collection<T> c)
    {
        super(c);
    }

    public Iterable<T> reversed(){
        return new Iterable<T>() {
            public Iterator<T> iterator(){
                return new Iterator<T>() {
                    int current = size() - 1;

                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public T next() {
                        return (T) get(current);
                    }

                    public void remove(){
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

}

public class AdapterMethodIdiom {
    public static void main(String[] args)
    {
        ReversibleArratKist<String> ral = new ReversibleArratKist<>(
                Arrays.asList("To be or not to be".split(" "))
        );

        for (Object s:ral
             ) {
            System.out.println(s + " ");
        }
        System.out.println();
        for (String s:ral.reversed()
             ) {
            System.out.println(s + " ");
        }
    }
}
