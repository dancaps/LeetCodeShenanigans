// Sadly the challenge wanted me to use their singly linked list class which is annoying, so I'll do both.

package OneToTwenty;

import java.util.LinkedList;

public class MergeTwoSortedLists1 {
    public static void main(String[] args) {
        // Creating the 2 lists to merge
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list1.add(-100);
        list1.add(-25);
        list1.add(1);
        list1.add(4);
        list1.add(5);
        list1.add(9);
        list1.add(11);
        list1.add(12);
        list1.add(32);
        list1.add(51);
        list2.add(0);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(7);
        list2.add(8);
        list2.add(10);
        list2.add(33);
        list2.add(34);
        list2.add(49);
        list2.add(50);
        list2.add(52);
        list2.add(60);
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        // Creating a new list to hold the merged values
        LinkedList<Integer> list3 = new LinkedList<>();

        // While they both have values move the lowest value to the new list
        while (list1.size() > 0 && list2.size() > 0) {
            if (list1.peekFirst() <= list2.peekFirst()) {
                list3.add(list1.pop());
            } else {
                list3.add(list2.pop());
            }
        }

        // While the list 1 contains values add them to the end of the new list
        while (!list1.isEmpty()) {
            list3.add(list1.pop());
        }

        // While the list 2 contains values add them to the end of the new list
        while (!list2.isEmpty()) {
            list3.add(list2.pop());
        }

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("List 3: " + list3);
    }
}
