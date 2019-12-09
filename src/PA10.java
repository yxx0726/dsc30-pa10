/**
 * Name: Xin Yu
 * PID: A14494949
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class PA10 {
    /**
     * takes two sorted linked lists and returns a new linked list that
     * contains all the elements from the input lists and is also sorted.
     * @param list1 linked list 1
     * @param list2 linked list 2
     * @return
     */
    public static LinkedList<Integer> mergeLists(LinkedList <Integer> list1, LinkedList <Integer> list2){
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        LinkedList<Integer> out = new LinkedList<>();
        int size1 = 0;
        int size2 = 0;

        while (size1 < list1.size() && size2 < list2.size()) {
            if (list1.get(size1).compareTo(list2.get(size2)) <= 0) {
                out.addLast(list1.get(size1));
                size1++;
            } else {
                out.addLast(list2.get(size2));
                size2++;
            }
        }

        if (size1 < list1.size()) {
            for (int i = size1; i < list1.size(); i++) {
                out.addLast(list1.get(i));
            }
        } else {
            for (int i = size2; i < list2.size(); i++) {
                out.addLast(list2.get(i));
            }
        }
        return out;

    }

    /**
     * takes a string and returns false if
     * there is parenthesis mismatch and true otherwise.
     * @param exp input string
     * @return if the paran in the str is complete
     */
    public static boolean paranChecker(String exp) {
        int numleft = 0;
        int numright = 0;
        String[] expnew = exp.split("");
        for (int i = 0 ; i < exp.length(); i++) {
            if (expnew[i].equals("(")) {
                numleft++;
            }
            if (expnew[i].equals(")")) {
                numright++;
            }
        }
        if (numleft == numright) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     *  takes a stack, finds and removes maximum element in it.
     *  The rest of the elements should stay unchanged after the function is done.
     * @param stack input stack
     * @return max in the stack
     */
    public static int stackMax(Stack<Integer> stack) {
        Stack<Integer> newstack = new Stack<>();
        int max = 0;
        for (int i = 0; i < stack.size(); i++) {
            if (stack.peek() > max) {
                max = stack.peek();
            }
            newstack.push(stack.pop());
        }
        for (int i = 0; i < newstack.size(); i++) {
            if (newstack.peek() == max) {
                newstack.pop();
            }
            stack.push(newstack.pop());
        }
        return max;
    }

    /**
     * returns the number of elements
     * in a min heap strictly less than a given number.
     * @param minHeap input min heap
     * @param val number of elements smaller than the given value
     * @return
     */
    public static int elemNumHeap(PriorityQueue<Integer> minHeap, int val) {
        int count = 0;
        while (minHeap.peek()!= null) {
            if (minHeap.peek() < val) {
                count++;
            }
            minHeap.poll();
            System.out.println(minHeap.peek());
        }
        return count;
    }

    /**
     *takes an array of integers. Every item in the array
     * is in the range 1 to n (inclusively),
     * where n is the size of the array.
     * Some elements appear twice and others appear once.
     * @param input An arraylist
     * @return the missing element in the array list
     */
    public static ArrayList<Integer> findMissing(int [] input) {

        int[] should = new int[input.length];
        ArrayList<Integer> out = new ArrayList<>();
        if (input.length == 0) {
            out.add(0);
            return out;
        }
        for (int i = 0; i < input.length; i++) {
            should[i] = 0;
        }

        for (int i = 0; i < input.length; i++) {
            should[input[i] - 1]++;

        }
        for (int i = 0; i < input.length; i++) {
            should[input[i] - 1]++;
            System.out.println(should[i]);
        }
        for (int i = 0; i < input.length; i++) {
            if (should[i] == 0) {
                out.add(i + 1);
            }
        }
        if (out.size() == 0) {
            out.add(0);
        }
        return out;
    }

}
