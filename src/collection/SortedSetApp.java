package collection;

import collection.data.Person;
import collection.data.PersonComparator;
import com.sun.source.tree.Tree;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());

        people.add(new Person("Dede"));
        people.add(new Person("Eka"));
        people.add(new Person("Deeva"));
        people.add(new Person("Runna"));
        people.add(new Person("Zeeta"));

        for (var person : people) {
            System.out.println(person.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people); // immutable SortedSet
        // sortedSet.add(new Person("Dede"));
    }
}
