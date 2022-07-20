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

        ModArrayList listy = new ModArrayList();
        listy.add(0);
        listy.add(10);
        listy.add(20);
        listy.add(30);

        System.out.println(listy.getUsingMod(1));
        System.out.println(listy.getUsingMod(-2));
        System.out.println(listy.getUsingMod(40));


    }
}