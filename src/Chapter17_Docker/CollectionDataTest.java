package Chapter17_Docker;

import util.Generator;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionDataTest{
    public static void main(String[] args)
    {
        Set<String> set = new LinkedHashSet<>(
                new CollectionData<>(new Goverment(),10)
        );
        set.addAll(CollectionData.list(new Goverment(),10));
        System.out.println(set);
    }
}

class Goverment implements Generator<String>{
    String[] foundation = ("strange women lying in ponds" +
            "distributing swords is no basis for a system of" +
            "government").split(" ");
    private int index;
    public String next(){
        return foundation[index++];
    }
}