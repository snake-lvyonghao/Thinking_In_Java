package Chapter11;

import Chapter14.Pets.Pet;
import Chapter14.Pets.Pets;

import java.util.*;

public class CrossContainerIteration {
    public static void display(Iterator<Pet> it)
    {
        while(it.hasNext())
        {
            Pet p = it.next();
            System.out.println(p.id() + ":" + p + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        ArrayList<Pet> pets = Pets.arrayList(8);
        LinkedList<Pet> petsLL = new LinkedList<>(pets);
        HashSet<Pet> petHashSet = new HashSet<>(pets);
        TreeSet<Pet> petTreeSet = new TreeSet<>(pets);
        display(pets.iterator());
        display(petsLL.iterator());
        display(petHashSet.iterator());
        display(petTreeSet.iterator());
    }
}
