import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args) {
        HashSet<Integer> my_hashset = new HashSet<>();
        my_hashset.add(1);
        my_hashset.add(4);
        my_hashset.add(212);
        my_hashset.add(120);

        System.out.println(my_hashset);

        my_hashset.remove(4);
        System.out.println(my_hashset);
    }
}
