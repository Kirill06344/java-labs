package tasks.animals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Mammal> mammals = new ArrayList<>();
        mammals.add(new Lynx("A", 12));
        mammals.add(new Manul("B", 23));
        mammals.add(new SimpleHedgehog("C", 12));


        List<Hedgehog> col1 = new ArrayList<>();
        List<Felidae> col2 = new ArrayList<>();
        List<Predator> col3 = new ArrayList<>();

        segregate(mammals, col1, col2, col3);

        for (Hedgehog hg : col1) {
            System.out.println(hg);
            hg.voice();
        }

        for (Felidae hg : col2) {
            System.out.println(hg);
            hg.voice();
        }

        for (Predator hg : col3) {
            System.out.println(hg);
            hg.voice();
        }
    }

    static <T, U, V, Y> void segregate(Collection<T> srcCollection, Collection<U> col1, Collection<V> col2, Collection<Y> col3) {
        for (T animal : srcCollection) {
            if (animal instanceof SimpleHedgehog) {
                col1.add((U) animal);
            } else if (animal instanceof Manul) {
                col2.add((V) animal);
            } else {
                col3.add((Y)animal);
            }
        }
    }

}


