import java.util.ArrayList;

/**
 * When retrieving items from an arraylist, sometimes you get an error.
 *
 * Full proof way of accessing list items
 * 1. Create a ModArrayList class
 * 2. Add a getUsingMod method that takes in an index and retrieves an item
 *    from the list at the index
 * 3. If the index is invalid, then the mod and absolute value operations should be
 *    used to make the index positive and mod the index based on the length of the list
 *
 * Mod Operation:
 * 1. Similar to division, but returns the remainder when given two numbers of
 *    the same sign as input. Example: 4%3 = 1
 *
 * ModArrayList
 * 1. All the functionality of an Arraylist
 * 2. Additional getUsingMod method
 *
 */

public class Main {
    public static void main(String[] args) {

        OddArrayList oddListy = new OddArrayList(1,2,3,4,7,9,-13);

        System.out.println(oddListy.add(2));

        ArrayList<Integer> listy = new ArrayList<>();

        listy.add(1);
        listy.add(2);
        listy.add(3);
        listy.add(4);
        listy.add(7);
        listy.add(9);
        listy.add(-13);

        System.out.println(listy);

    }
}