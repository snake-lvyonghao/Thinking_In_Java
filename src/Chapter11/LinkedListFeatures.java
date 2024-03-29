package Chapter11;

import Chapter14.Pets.Hamster;
import Chapter14.Pets.Pet;
import Chapter14.Pets.Pets;
import Chapter14.Pets.Rat;

import java.util.LinkedList;

public class LinkedListFeatures {
    public static void main(String[] args)
    {
        LinkedList<Pet> pets =
                new LinkedList<>(Pets.arrayList(5));
        System.out.print(pets);
        System.out.print("pets.getFirst():" + pets.getFirst());
        System.out.println("pets.element():" + pets.element());
        System.out.println("pets.peel():" + pets.peek());
        System.out.println("pets.remove():" + pets.remove());
        System.out.println("pets.removefirst" + pets.removeFirst());
        System.out.println("pets.poll():" + pets.poll());
        System.out.println(pets);
        pets.addFirst(new Rat());
        System.out.println("After addFirst" + pets);
        pets.offer(Pets.randomPet());
        System.out.println("After offer():" + pets);
        pets.add(Pets.randomPet());
        System.out.println("After add():" + pets);
        pets.addLast(new Hamster());
        System.out.println("After addLast():" + pets);
        System.out.println("pets.ramoveLast():" + pets.removeLast());
    }
}
